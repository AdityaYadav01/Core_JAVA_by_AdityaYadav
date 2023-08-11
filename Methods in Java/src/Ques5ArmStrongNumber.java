// Create a method to check if the given number is armstrong or not.
// Armstrong number are the numbers where sum of each digit raised to the power of number of digits.

import java.util.Scanner;

public class Ques5ArmStrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();

        boolean res = ArmStrong(num);
        System.out.println(res);


    }

    static int count(int num){
        int count = 0;
        while(num>0){
            count++;              // Counting the number of digits
            num /= 10;
        }
        return count;
    }


    static boolean ArmStrong(int num){
        int sum = 0;
        int temp = num;
        int numberOfDigits = Ques5ArmStrongNumber.count(num);    // Taking the input of number of digits.
        while(num>0){
            int rem = num%10;

            sum +=  Math.pow(rem, numberOfDigits);
            num /= 10;
        }

        if (temp == sum){
            return true;
        }

        return false;

    }
}
