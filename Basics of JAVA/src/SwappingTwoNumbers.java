                   // Swapping of Two Numbers

import java.util.Scanner;

public class SwappingTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = in.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = in.nextInt();

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("The Swapped Numbers are: " + num1 + " " + num2);

        // Swapping Two Numbers using XOR Operation.
        int a = 10;
        int b = 20;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("Two Swapped Numbers are: " + a + " " + b);

    }
}
