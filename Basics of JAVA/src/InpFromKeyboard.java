                       // Taking Two Numbers From Keyboard

import java.util.Scanner;  //Importing Scanner class from java.util package

public class InpFromKeyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* 1. Scanner - It is a class which is required to take input. it is present in java.util package
        *  2. in - It is an object that we are creating to take input.
        *  3. new - It is a keyword which will create new object.
        *  4. System.in - 'System' is a class and 'in' is the vairable that denotes we are taking input from standard input stream (i.e Keyboard).*/

        int n1, n2, sum;

        System.out.print("Enter the first number: ");
        n1 = in.nextInt();   //nextInt() is a method to take Integar input

        System.out.print("Enter the Second number: ");
        n2 = in.nextInt();

        sum = n1 + n2;
        System.out.println("The Sum of Two Number is " + sum);




    }
}
