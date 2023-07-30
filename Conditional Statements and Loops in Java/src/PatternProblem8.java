/* Print this Pattern:
   Enter the number of rows: 5
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

public class PatternProblem8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }
        for (int i = 2; i <= rows; i++) {
            for (int j = 1; j <= rows - i+1 ; j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }

    }
}
