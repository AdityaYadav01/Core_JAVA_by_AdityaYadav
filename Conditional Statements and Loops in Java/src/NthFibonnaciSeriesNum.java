// Find the nth fibonnaci number

import java.util.Scanner;

public class NthFibonnaciSeriesNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the nth Number: ");
        int num = in.nextInt();

        int a = 0;
        int b = 1;

        if (num == a) {
            System.out.println("The first fibonnaci number is " + num);
        } else if (num == b) {
            System.out.println("The Second fibonnaci number is " + num);
        }

        for (int i = 2; i<=num ; i++) {
            int temp = b;
            b = a + b;
            a = temp;

        }
        System.out.println("The " + num + "th term is " + b  );
    }
}
