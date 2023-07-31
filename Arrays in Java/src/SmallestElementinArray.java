// Finding the smallest element form an array

public class SmallestElementinArray {
    public static void main(String[] args) {
        int[] arr = {13, 16, 34, 56, 33, 67, 54, 76, 90, 12};

        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (small>arr[i]){
                small = arr[i];
            }
        }
        System.out.println(small);

    }
}
