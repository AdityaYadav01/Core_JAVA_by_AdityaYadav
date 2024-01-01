// Find the surface area and volume of a cuboid. Take input form user

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the cuboid: ");
        float length = in.nextFloat();

        System.out.print("Enter the height of the cuboid: ");
        float height = in.nextFloat();

        System.out.print("Enter the breadth of the cuboid: ");
        float breadth = in.nextFloat();

        float SurfaceArea = 2*(length*breadth + height*breadth + length*height);
        float LeastSurfaceArea = 2*height*(length+breadth);
        float Volume = length*breadth*height;

        System.out.println("Surface of the Cuboid: " + SurfaceArea);
        System.out.println("Least Surface Area: " + LeastSurfaceArea);
        System.out.println("Volume of the Cuboid: " + Volume);

    }
}
