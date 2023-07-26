// Printing the table of a given number take input from user.

import java.util.Scanner;

public class WhileLoop_Q2 {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter the number to get its table: ");
        int num = in.nextInt();

        int i = 1;
        while(i<=10){
            System.out.println(num + "*" + i + "=" + (num*i));
            i++;
        }
    }
}
