// Find the roots of the quadratic equation.

import java.util.Scanner;

public class Problem_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the coefficient of x^2: ");
        int a = in.nextInt();

        System.out.print("Enter the coefficient of x: ");
        int b = in.nextInt();

        System.out.print("Enter the constant: ");
        int c = in.nextInt();

        double SqRoot = b*b-4*a*c;
        double r1 = (-b+Math.sqrt(SqRoot))/2*a;
        double r2 = (-b-Math.sqrt(SqRoot))/2*a;

        System.out.println("The value of 1st Square Root: " + r1);
        System.out.println("The Value of 2nd Square Root: " + r2);


    }
}
