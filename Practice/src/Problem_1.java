// Calculate the Area of Triangle. Take base and height input form user.

import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the Triangle: ");
        int base = in.nextInt();

        System.out.print("Enter the height of the Triangle: ");
        int height = in.nextInt();

        int area = base*height/2;
        System.out.println("Area of Triangle is " + area);

    }
}
