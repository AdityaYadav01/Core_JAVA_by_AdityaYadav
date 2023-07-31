public class OneDimArray {
    public static void main(String[] args) {
        // There are Three methods to initialize array.

        int[] arr = {1,5,8,9,7};
        int[] arr1 = new int[10];
        int[] arr2;
        arr2 = new int[10];

        // Displaying all the elements of an array using for loop

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Displaying all the elements of an array using for each loop
        for (int i: arr1) {
            System.out.print(i + " ");
        }

    }
}
