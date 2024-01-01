// Write a program to print whether a number is even or odd, also take
//input from the user.

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        // Importing the Scanner Class to Take input from user.
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();  // Inputing the value from the user.

        if(num % 2 == 0){
            System.out.println(num + " is Even Number");
        }
        else{
            System.out.println(num + " is Odd Number");
        }
    }
}
