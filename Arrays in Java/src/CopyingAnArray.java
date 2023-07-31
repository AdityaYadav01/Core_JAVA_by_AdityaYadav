import java.util.Arrays;

public class CopyingAnArray {
    public static void main(String[] args) {
        int[] arr1 = {13, 16, 34, 56, 33, 67, 54, 76, 90, 12};
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

        // Reversing a copied array
        for (int i = arr2.length-1; i >= 0; i--) {
            System.out.print(arr2[i] + " ");

        }

    }
}
