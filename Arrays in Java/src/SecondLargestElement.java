public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {89, 78, 96, 4, 5, 12, 13, 166, 61, 47, 866};
        int max1, max2;
        max1 = max2 = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i]) {
                max2 = max1;
                max1 = arr[i];

            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.print("Second largest number is " + max2);
    }
}
