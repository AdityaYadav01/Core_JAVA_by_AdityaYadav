/* 1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

Print the given above pattern*/

import java.util.Scanner;

public class PatternProblem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= rows-i+1 ; j++) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
