// Write a method to check which number is greater.

import java.util.Scanner;

public class Ques1 {
    static int max(int x, int y){
        if(x>y){
            return x;                 // We can also use Math.max() to find the maximum between two numbers.
        }
        else{
            return y;
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);  // Taking the input of number from user.
        System.out.print("Enter the 1st number: ");
        int a = in.nextInt();

        System.out.print("Enter the 2nd number: ");
        int b = in.nextInt();

        int result = max(a,b);
        System.out.println("Maximum is " + result);

    }
}
