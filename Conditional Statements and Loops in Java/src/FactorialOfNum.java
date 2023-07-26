// Find the factorial of number

import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to find its factorial: ");
        long num = in.nextInt();    // We are providing long as a datatype because value of factorial are quite large sometimes.

        long fact = 1;
        for (int i = 0; i < num; i++) {
            long sub = num-i;
            fact = fact * sub;
        }
        System.out.println("The factorial value of " + num + " is " + fact);
    }
}
