// Display the GP Series

import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the First Term: ");
        int a = in.nextInt();

        System.out.print("Enter the nth term: ");
        int n = in.nextInt();

        System.out.print("Enter the common difference: ");
        int r = in.nextInt();

        int term = a;
        System.out.print("G.P Series is ");

        for (int i = 0; i < n; i++) {
            System.out.println(term + ",");
            term = term*r;


        }
    }
}
