// Printing stars in triangular shape.

import java.util.Scanner;

public class PatternProblem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");
        int rows = in.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
