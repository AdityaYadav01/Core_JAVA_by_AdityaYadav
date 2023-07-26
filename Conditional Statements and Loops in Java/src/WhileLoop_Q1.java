// Printing the number from 1 to nth term.

import java.util.Scanner;

public class WhileLoop_Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number till where you want to print number: ");
        int num = in.nextInt();

        int i = 1;
        while (i<num){
            System.out.print(i + " ");
            i++;
        }
    }
}
