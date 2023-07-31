// Find the sum of all the elements of an array

public class SumOfElements {
    public static void main(String[] args) {
        // Declaring an array
        int[] arr = {1, 5, 6, 8, 9};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            sum = element + sum;
        }
        System.out.println("Sum of all the elements of an array is " + sum);
    }
}
