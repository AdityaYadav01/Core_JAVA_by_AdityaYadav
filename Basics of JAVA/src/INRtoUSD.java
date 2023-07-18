//// Ques1. Input currency in rupees and output in USD.

import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Amount of Rupees: ");
        float inr = in.nextFloat();

        float usd = (float)(inr/82.05);  //82.05 is the current value of dollars in rupees
        System.out.println("You have " + usd + " dollars in your account.");
    }
}
