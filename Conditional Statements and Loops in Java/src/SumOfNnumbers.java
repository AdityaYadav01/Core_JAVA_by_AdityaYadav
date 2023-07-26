// Find the sum of n numbers. Take n as input from user

import java.util.Scanner;

public class SumOfNnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int sum = 0;

        for (int i = 0; i <= num ; i++) {
             sum = sum+i;
        }
        System.out.println("The sum of n number is " + sum);
    }
}
