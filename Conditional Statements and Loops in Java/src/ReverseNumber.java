// Reverse the number. Take number as an input from user.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = in.nextInt();

        int revNum = 0;
        while(num>0){
            int rem = num%10;
            num /= 10;

            revNum = rem + revNum*10;
        }
        System.out.println("The reverse of the number is " + revNum);



    }
}
