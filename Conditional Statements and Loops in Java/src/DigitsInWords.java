import java.util.Scanner;

public class DigitsInWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to display in words: ");
        int num = in.nextInt();   // Taking the Input of a number

        String digits = "";

        while(num>0){              // Reversing the given number
            int rem = num%10;
            num /= 10;
            digits = digits+rem;    // Storing the reversed number in String digits
        }
        System.out.println("The reverse of the digit is " + digits);

        for (int i = digits.length()-1; i >=0; i--) {
            char ch = digits.charAt(i);         // Printing each character from right to left.
            switch (ch){
                case '0' -> System.out.println("Zero");
                case '1' -> System.out.println("One");
                case '2' -> System.out.println("Two");
                case '3' -> System.out.println("Three");
                case '4' -> System.out.println("Four");
                case '5' -> System.out.println("Five");
                case '6' -> System.out.println("Six");
                case '7' -> System.out.println("Seven");
                case '8' -> System.out.println("Eight");
                case '9' -> System.out.println("Nine");
                default -> System.out.println("Invalid Number");
            }

        }


        }
    }

