import java.util.Scanner;

public class TakingInputFromKeyboard {
    public static void main(String []args){

        Scanner in = new Scanner(System.in);
        /* 1. Scanner - It is the class used to take input from the user. It is present in java.util package
        *  2. in - It is an object that we are creating to take input.
        *  3. new - It is a keyword which will create an object. It is present in heap memory.
        *     Objects are created in heap memory by JVM, dynamically at Runtime.
        *  4. System.in - 'System' is the class & 'in' is the variable it denotes that we are taking input from standard stream. (i.e Keyboard)*/

        System.out.print("Enter the 1st number: ");
        int a = in.nextInt();  // It is a function used to take input of Integer type.

        System.out.print("Enter the 2nd Number: ");
        int b = in.nextInt();

        int sum = a+b;

        System.out.println("Sum of Two Numbers are: " + sum);
    }
}
