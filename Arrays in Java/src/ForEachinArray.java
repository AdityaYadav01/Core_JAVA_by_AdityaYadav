/* For Each Loop - This loop is specifically designed to handle the elements of a collection.
* Syntax: for(var: collection){
                     statement;
                    }                          */


public class ForEachinArray {
    public static void main(String[] args) {

        /* Write a program to see the use of for-each loop and retrieve the elements
           one by one from an array and display it.*/

        // Declare an array with 5 elements
        int[] arr = {1, 4, 76, 8, 9};

        // Use for each to retrieve elements from array
        for (int i: arr){
            System.out.print(i + " ");
        }



    }
}
