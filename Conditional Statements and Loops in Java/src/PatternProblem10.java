/*Print the below pattern:
 * * * * *
 *       *
 *       *
 *       *
 * * * * *

 * */

import java.util.Scanner;

public class PatternProblem10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows ; j++) {
                if (i>=2 && j>=2 && i<=4 && j<=4){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }
}
