// Nested Loop - Loop inside another Loop is called Nested Loop. They have 2D and 3D behaviour.

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        // This will print Two Dimensional Matrix

        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("("+i+","+j+")");
            }
            System.out.println(" ");


        }
    }
}
