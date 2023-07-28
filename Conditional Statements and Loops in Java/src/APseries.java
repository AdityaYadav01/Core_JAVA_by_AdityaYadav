// Display the A.P Series

import java.util.Scanner;

public class APseries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the First Term: ");
        int a = in.nextInt();

        System.out.print("Enter the nth term: ");
        int n = in.nextInt();

        System.out.print("Enter the common difference: ");
        int d = in.nextInt();

        int term = a;
        System.out.print("A.P Series is ");

        for (int i = 0; i < n; i++) {
            System.out.print(term + ",");
            term = term +d;
        }

        }
    }

