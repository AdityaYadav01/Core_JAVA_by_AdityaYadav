                   // Finding the roots of quadratic equation

import java.util.Scanner;
public class RootsOfQuadEq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        float a = in.nextFloat();

        System.out.print("Enter the value of b: ");
        float b = in.nextFloat();

        System.out.print("Enter the value of c: ");
        float c = in.nextFloat();

        double RootValue = ((b*b)-4*a*c);

        double r1 = (-b + Math.sqrt(RootValue))/2*a;
        double r2 = (-b - Math.sqrt(RootValue))/2*a;

        System.out.println("Value of r1 and r2 is " + r1 + " " + r2);

    }
}
