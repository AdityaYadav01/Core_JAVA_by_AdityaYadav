// Finding the Maximum element in an array

public class MaximumElement {
    public static void main(String[] args) {

        int[] arr = {89, 78, 96, 4, 5, 12, 13, 166, 61, 47, 866};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The Largest element is" + max);
    }
}
