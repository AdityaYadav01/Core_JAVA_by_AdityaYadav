// Count the number of digits in a number
import java.util.Scanner;

public class CountDigitsInNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        int count = 0;
        for (int i = 0; i < num ; i++) {
            num /= 10;
            count++;
        }
        System.out.println("Total number of Digits in is " + count);

    }
}
