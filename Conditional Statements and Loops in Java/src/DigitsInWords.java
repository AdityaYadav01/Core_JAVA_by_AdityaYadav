import java.util.Scanner;

public class DigitsInWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to display in words: ");
        int num = in.nextInt();

        int revNum = 0;

        while(num>0){
            int rem = num%10;
            num /= 10;
            revNum = rem + revNum*10;

        }
        System.out.println("The Number in Reverse" + revNum);

        int digits = 0;

        while(revNum>10){
            int rem1 = revNum%10;
            revNum /= 10;



        }
    }
}
