/* Variable Length Argument - It is used to take variable number of arguments.
*  A method that takes a variable number of arguments is a varargs method. */

import java.util.Arrays;
public class VariableArguments {
    public static void main(String[] args) {
        varargs(4,5,6,5,5);       //We can input many number of arguments
    }
    static void varargs(int ...input){        // This is varargs method. It will take many number of inputs.
        System.out.println(Arrays.toString(input));  // result would be array of type []int parameter.
    }

}
