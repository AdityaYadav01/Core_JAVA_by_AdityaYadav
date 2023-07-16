                            // Operators in Java

import java.util.Scanner;
public class OperatorsInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = in.nextInt();

        System.out.print("Enter the value of b: ");
        int b = in.nextInt();

        // 1. Arithmetic Operators

        System.out.println("Result of Addition Operator: " + (a+b));
        System.out.println("Result of Subtraction Operator: " + (a-b));
        System.out.println("Result of Multiplication Operator: " + (a*b));
        System.out.println("Result of Division Operator: " + (b/a));
        System.out.println("Result of Modulo Operator: " + (b/a));

        // 2. Unary Operators - These operators acr on only one operator.


        //a. Unary minus operator - This will negative the given value
        System.out.println("The negative value of a is " + (-(a)));

        //b. Increment Operator - This will increment the give value by 1.
        System.out.println("Value of a by pre-incrementation: " + (++a));
        // Pre-Incrementation - This will increment the value first then perform other operations.
        System.out.println("Value of a by post-incrementation: " + (a++));
        // Post-Incrementation - This will perform the other operation first then increment the value.


        //c. Decrement Operator - This will decrement the given value by 1.
        System.out.println("Value of a by pre-decrementation: " + (--a));
        // Pre-Decrementation- This will decrement the value first then perform other operations.
        System.out.println("Value of a by post-decrementation: " + (a--));
        // Post-Decrementation - This will perform the other operation first then decrement the value.

        // 3. Relational Operator - These operators are used for the purpose of comparing the two values.

        if(a<=b){
            System.out.println("This is correct statement");
        }
        else{
            System.out.println("This is wrong Statement");
        }

        /* 4. Logical Operator - These operator is used to construct compound conditions.
              A compound condition is the combination of several simple conditions */

        if (a==b || a<b & b>a){
            System.out.println("The given condition is true");
        }
        else{
            System.out.println("The given condition is wrong");
        }

    }
}
