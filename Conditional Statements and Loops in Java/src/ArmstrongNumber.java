/* Find if the number is Armstrong or not.
 Some Armstrong numbers are 153, 370, 371, 407
  Armstrong numbers are equal to the sum of their digits raised to the power of total number of digits */

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to check if it is armstrong number or not: ");
        int num = in.nextInt();
        int check = num;  // Storing num value in check. so, we can use it later to compare the number.

        int armstrong = 0;
        while (num>0) {
            int rem = num%10;
            int cube = rem*rem*rem;

            armstrong += cube;
            num /= 10;
        }

        if (armstrong == check){
            System.out.println("It is a Armstrong Number");
        }else{
            System.out.println("It is not a Armstrong Number");
        }


    }
}
