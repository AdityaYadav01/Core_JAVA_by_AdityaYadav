// Printing counting from 1 to num in 2D matrix. Take num input from user.

import java.util.Scanner;

public class PatternProblem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the num: ");
        int num = in.nextInt();

        int count = 0;

        for (int i = 1; i <= num ; i++)
        {
            for (int j = 0; j <= num ; j++) {
                count++;
                System.out.format("%02d", count);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
