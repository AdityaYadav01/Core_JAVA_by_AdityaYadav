// Check if the number is palindrome or not.

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int temp = num;  // Storing the num value in temporary variable. So, that we can compare the palindrome.

        int palindrome = 0;
        while(num>0){
            int rem = num%10; // Will get the last digit of a number
            num /= 10;

            palindrome = rem + palindrome*10;
        }
        if (palindrome==temp){
            System.out.println("It is a palindrome number");
        }
        else{
            System.out.println("No It's not a palindrome");
        }


    }
}
