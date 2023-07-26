// Display the digits of a number

import java.util.Scanner;

public class DisplayDigitofNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        for (int i = 0; i < num; i++) {
            int rem = num%10;
            System.out.println("Digits of the numbers are: " + rem);

            num /= 10;
        }
    }
}
