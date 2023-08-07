// 2-D Array - It can be visualized as a matrix.

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        // Creating 2D Array

        int Arr[][] = new int[3][3];

        //OR

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));

        // Printing all the elements of 2D array using for loop
        System.out.println("Using For Loop: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

        // Printing all the elements of 2D array using for each loop
        System.out.println("Using For-each loop: ");
        for (int[] x :arr) {
            for (int y:x) {
                System.out.print(y + " ");
            }
            System.out.println();

        }
    }
}
