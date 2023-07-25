// Display the name of a day based number

import java.util.Scanner;

public class CS_Ques8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to find a day: ");
        byte dayNum = in.nextByte();

        if (dayNum == 1) {
            System.out.println("It is a Monday");
        } else if (dayNum == 2) {
            System.out.println("It is a Tuesday");
        } else if (dayNum == 3) {
            System.out.println("It is a Wednesday");
        } else if (dayNum == 4) {
            System.out.println("It is a Thursday");
        } else if (dayNum == 5) {
            System.out.println("It is a Friday");
        } else if (dayNum == 6) {
            System.out.println("It is a Saturday");
        }else if (dayNum == 7) {
            System.out.println("It is a Sunday");
        }else{
            System.out.println("Invalid date");
        }
    }
}
