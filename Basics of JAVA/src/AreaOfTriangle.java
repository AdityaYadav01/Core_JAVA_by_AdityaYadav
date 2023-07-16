                            // Calculating the area of Triangle
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Height of the triangle: ");
        float h = in.nextFloat();

        System.out.print("Enter the value of Base of the triangle: ");
        float b = in.nextFloat();

        float area = (b*h)/2;
        System.out.println("Area of Triangle is " + area);



        // Ques. Finding Area of Triangle using all sides of Triangle.

        System.out.print("Enter the value of side A: ");
        float A = in.nextFloat();

        System.out.print("Enter the value of side B: ");
        float B = in.nextFloat();

        System.out.print("Enter the value of side C: ");
        float C = in.nextFloat();

        double s = (A+B+C)/2;  // s is the semi-perimeter of the triangle
        double sqroot = s*(s-A)*(s-B)*(s-C);

        double Area = Math.sqrt(sqroot);
        System.out.println("Area of Triangle is " + Area);



    }

}
