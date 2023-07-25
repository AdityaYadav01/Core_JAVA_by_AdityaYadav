// Check whether the given number is even or odd.

import java.util.Scanner;

public class CS_Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        if(num%2==0){
            System.out.println(num + " is the Even Number.");
        }
        else{
            System.out.println(num + " is the Odd Number.");
        }
    }
}
