// Printing the counting Series in triangular form.


import java.util.Scanner;

public class PatternProblem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of rows you want: ");
        int rows = in.nextInt();
        int count = 1;

        for (int i = 1; i <= rows ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.printf("%02d",count);
                System.out.print(" ");
                count++;

            }
            System.out.println();

        }
    }
}
