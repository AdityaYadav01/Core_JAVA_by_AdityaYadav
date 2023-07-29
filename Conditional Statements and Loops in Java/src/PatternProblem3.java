/* Printing counting from 1 to num in 2D matrix. Take num input from user.
Pattern -
01 02 03 04 05
06 07 08 09 10
11 12 13 14 15
16 17 18 19 20 */


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
