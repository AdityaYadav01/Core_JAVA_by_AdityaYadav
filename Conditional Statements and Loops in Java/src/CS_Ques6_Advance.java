// Find the radix of a number given in a string.

import java.util.Scanner;

public class CS_Ques6_Advance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String num = in.nextLine();    // Taking the Input of a number



        if (num.matches("[01]+")){              // Checking if the number matches with binary number or not
            System.out.println("It is the binary number and the Radix is 2");
        }
        else if (num.matches("[0-7]+")) {
            System.out.println("It is the octal number and the Radix is 8");
        }
        else if (num.matches("[0-9A-F]+")){
            System.out.println("It is the Hexadecimal number and the Radix is 16");
        }
        else if (num.matches("[0-9]+")){
            System.out.println("It is the decimal number and the Radix is 10");

        }


    }
}
