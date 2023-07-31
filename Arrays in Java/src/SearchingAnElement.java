//Q. Search an element in an array. Note - There should be no duplicates

import java.util.Scanner;

public class SearchingAnElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Key which would you like to locate in an array: ");
        int key = in.nextInt();

        int[] arr = {89, 78, 96, 4, 5, 12, 13, 166, 61, 47, 89};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key){
                System.out.println("The index of an key is " + i);
                break;       // Braking the system after comparing the values
            }
        }
        System.out.println("The element is not present in an array");
    }
}
