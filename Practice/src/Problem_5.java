// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 == num2) {
            System.out.println("Both the Numbers are Equal");
        }else{
            System.out.println(num2 + " is greater than " + num1);
        }

    }
}
