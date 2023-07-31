// Inserting a element in an array at index 2. Note:- There should be empty space in an array

import java.util.Arrays;

public class InsertingAnElement {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 91;
        arr[1] = 92;
        arr[2] = 91;
        arr[3] = 94;
        arr[4] = 95;
        arr[5] = 96;

        int n = 6; // n consist of an index which is empty
        int index = 2; // It is the index where new element gets filled

        for (int i = n; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = 93;
        System.out.println(Arrays.toString(arr) + " ");


    }
}
