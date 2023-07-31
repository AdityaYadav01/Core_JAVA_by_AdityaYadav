/* Arrays - Array is a data structure which is used to store collection of data.

 Ques. Why do we need Array?
 Let's Assume if you want to store 5000 integer numbers. Is it possible to use 5000 variables? NO
 To handle this situation, We have Arrays in almost all the programing languages.

*/

public class IntToArray {
    public static void main(String[] args) {

        /* Syntax of an array:

        datatype[] variableName = new datatype[size]; */

        int[] rollno = {1, 2, 3, 4, 5};
        System.out.println(rollno);
                 //Or
        int[] rollno1 = new int[5];
        System.out.println(rollno1);

        /* int[] rollno - It is the Declaration of an Array. It is getting defined in a stack.

           rollno = new int[5] - Intialization of an Array in memory. Object is being created in heap memory.
           Internally, the value of size array 5 will be [0,0,0,0,0]

           Index of an Array:-

           In Array, Indexing start from 0 which means if we take array from ref. variable rollno
           it will be arr[0] = 1, arr[1] = 2, arr[2] = 3. Let's print some array elements

            */
        System.out.print(rollno[0]);
    }
}
