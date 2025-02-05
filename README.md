# OBJECTIVES
In this assignment, you will implement the following tasks:  
- Read data from the keyboard.  
- Use arithmetic operators.  
- Display output in a user-friendly manner.  

# PROGRAM DESCRIPTION
Euclidean division is the process of division of two integers, which produces a quotient and a remainder smaller than the divisor. Its main property is that the quotient and remainder exist and are unique.  

Given two integers $a$ and $b$, with $b \neq 0$, there exist unique integers $q$ and $r$ such that:  

$$
a = bq + r
$$

and  

$$
0 \leq r < |b|
$$

where $|b|$ denotes the absolute value of $b$.  

The four integers that appear in this theorem have been given names:  
- $a$ is called the **dividend**.  
- $b$ is called the **divisor**.  
- $q$ is called the **quotient**.  
- $r$ is called the **remainder**.  

# PROGRAM SPECIFICATIONS
Create a new class called `EuclideanDivision`.  

Consider the example below:  

```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // Scanner object to receive keyboard input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        // Display the number
        System.out.println("The number is: " + num);
    }
}
```

Modify the example program to prompt the user to enter the **dividend** and **divisor** and perform **Euclidean division**.  

In the `main` method:  
- Declare four `int` variables with the following identifiers: `dividend`, `divisor`, `quotient`, and `remainder`.  
- Prompt the user to enter a value for `dividend` and `divisor`.  
- Use the **quotient** (`/`) and **modulo** (`%`) operators to find the values of `quotient` and `remainder`.  
- Display the quotient and remainder in the form $a = bq + r$.

# SAMPLE OUTPUT
```
Euclidean Division
Enter the dividend: 14
Enter the divisor: 5
14 = 2 * 5 + 4
```

# CODING STANDARDS
- Adhere to the program specifications.  
- Use meaningful variable names.  
- Remove any auto-generated comments.  
- Use [**JavaDoc**](https://en.wikipedia.org/wiki/Javadoc) to document your code. Include a program description and attribute yourself using the `@author` tag.  
- Your prompting and output should be **user-friendly**.  
