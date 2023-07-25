// Check whether the given number is positive or negative.

import java.util.Scanner;

public class CS_Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = in.nextInt();

        if (num >= 0){
            System.out.println(num + " is the positive number.");
        }
        else{
            System.out.println(num + " is the negative number.");
        }


    }
}
