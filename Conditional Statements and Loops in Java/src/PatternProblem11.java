/* Triangular Pyramid Pattern:       *
                                   * * *
                                 * * * * *
                               * * * * * * *
                             * * * * * * * * *

* */

import java.util.Scanner;

public class PatternProblem11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        for (int i = 1; i <=rows ; i++) {
            for (int j = i; j <= rows ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j < i ; j++) {
                System.out.print(" *");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
