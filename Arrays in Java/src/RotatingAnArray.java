public class RotatingAnArray {
    public static void main(String[] args) {
        int[] arr = {89, 78, 96, 4, 5, 12, 13, 166, 61, 47, 866};

        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}
