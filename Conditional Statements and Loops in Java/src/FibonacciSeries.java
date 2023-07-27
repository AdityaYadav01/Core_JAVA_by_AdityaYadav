// Display fibonacci series

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till where you want to print fibonacci series: ");
        int num = in.nextInt();

        int n1 = 0;
        int n2 = 1;

        System.out.print("The Fibonacci Series upto " + num + " is " + n1 + " " + n2 + " ");

        for (int i = 1; i < num; i++) {
            int sum = n1+n2;
            n1=n2;
            n2=sum;

            System.out.print(sum + " ");

        }

    }
}
