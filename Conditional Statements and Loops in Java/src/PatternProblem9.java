/* Print the Below given pattern:

 *
 * *
 * * *
 * * * *
 * * * * *
 * * * *
 * * *
 * *
 *
                  */

import java.util.Scanner;

public class PatternProblem9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        for (int i = 1; i <=rows ; i++) {
            for (int j = 1; j <= rows ; j++) {
                if (i+j>rows){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }

        for (int i = 2; i <= rows ; i++) {
            for (int j = 1; j <= rows ; j++) {
                if (j>=i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
