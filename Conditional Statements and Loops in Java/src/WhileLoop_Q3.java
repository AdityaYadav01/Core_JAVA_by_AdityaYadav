// Print Even and odd numbers using while loop. Take input from user.

import java.util.Scanner;

public class WhileLoop_Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till where you want to print odd and even numbers: ");
        int num = in.nextInt();

        //Program for odd numbers
        int i = 1;
        System.out.print("Odd numbers: ");
        while(i<=num){
            System.out.print(i + " ");
            i = i+2;
        }

        //Program for even numbers
        int ie = 2;
        System.out.println();
        System.out.print("Even numbers: ");
        while(ie<=num) {
            System.out.print(ie + " ");
            ie = ie + 2;
        }

    }
}
