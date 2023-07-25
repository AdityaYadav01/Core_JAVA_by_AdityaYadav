// Find wheather the given year is leap year or not?

import java.util.Scanner;

public class CS_Ques7_Advance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = in.nextInt();

        if (year % 4 == 0){
            System.out.println("It is a leap year");
            if (year % 100 == 0){
                System.out.println("It is not a leap year");

                if (year % 400 == 0){
                    System.out.println("It is a leap year");
                }
                else{
                    System.out.println("It is not a leap year");
                }
            }
            else {
                System.out.println("It is a leap year");
            }
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}
