import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class EuclideanDivisionTest {

    @Test
    void testClassExists() {
        try {
            Class.forName("EuclideanDivision");
        } catch (ClassNotFoundException e) {
            fail("Could not find a class named 'EuclideanDivision'.");
        }
    }

    @Test
    void testMainMethodExists() throws Exception {
        Class<?> euclideanDivisionClass = Class.forName("EuclideanDivision");

        try {
            euclideanDivisionClass.getMethod("main", String[].class);
        } catch (NoSuchMethodException e) {
            fail("The EuclideanDivision class must contain a main method.");
        }
    }

    @Test
    void testFinalOutputLine() throws Exception {
        int dividend = 14;
        int divisor = 5;
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        String input = dividend + System.lineSeparator()
                     + divisor + System.lineSeparator();

        String expectedFinalLine = dividend + " = "
                                 + divisor + " * "
                                 + quotient + " + "
                                 + remainder;

        String output = runMainWithInput(input);

        String[] lines = output.split("\\R");

        assertTrue(
            lines.length > 0,
            "The program did not print any output."
        );

        String actualFinalLine = lines[lines.length - 1];

        assertEquals(
            expectedFinalLine,
            actualFinalLine,
            "The final output line is incorrect."
        );
    }

    private String runMainWithInput(String input) throws Exception {
        Class<?> euclideanDivisionClass = Class.forName("EuclideanDivision");
        Method mainMethod = euclideanDivisionClass.getMethod("main", String[].class);

        ByteArrayInputStream testInput = new ByteArrayInputStream(input.getBytes());
        ByteArrayOutputStream testOutput = new ByteArrayOutputStream();

        PrintStream originalOut = System.out;
        var originalIn = System.in;

        try {
            System.setIn(testInput);
            System.setOut(new PrintStream(testOutput));

            mainMethod.invoke(null, (Object) new String[]{});

            return testOutput.toString();

        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }
}