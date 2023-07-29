// Printing the series of number in a row. Take Number of input as a row from user.

import java.util.Scanner;

public class PatternProblem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <= num ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
