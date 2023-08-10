// Check Whether the number is prime or not.

import java.util.Scanner;

public class Ques2PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();

        boolean res = Prime(n);
        System.out.println(res);
    }

    static boolean Prime(int number){
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
            return true;
    }
}
