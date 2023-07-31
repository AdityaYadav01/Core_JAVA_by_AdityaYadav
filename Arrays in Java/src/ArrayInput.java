import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        //Taking the input of an Array
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 8;
        arr[4] = 10;
        System.out.println(Arrays.toString(arr));

        // Changing the value of specific index in the array.
        arr[3]=9;
        System.out.println(Arrays.toString(arr));

        // Taking input using for loop:
        System.out.println("Enter the elements of an array: ");

        for (int i = 0; i < arr.length; i++) {     //arr.length will take the length of an array
            arr[i] = in.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println("are the elements of an array");

        // Printing the array in reverse order
        System.out.print("Array in reverse order: ");
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}
