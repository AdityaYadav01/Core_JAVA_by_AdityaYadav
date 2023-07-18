                                                   // Type Casting

/* Type Conversion - When one type of data is assigned to another type of variable.
*  An Automatic type conversion will take place under some conditions:
*  1. Two Types Should be compatible
*  2. The Destination type should be larger than source type.
*
* Type Casting - It is the process of converting one type of data to another type of data.*/


public class TypeCasting {
    public static void main(String[] args) {

        //Example 1. Here, we have converted the floating point number to integer type data
         int num = (int)(78.9f);
         System.out.println(num);

    //Example 2. Storing the integer value in byte
        int a = 258;
        byte b = (byte)(a);  // It will perform 258 % 256 = 2.
        System.out.println(b);

    //Example 3. Automatic Type Conversion
        byte b1 = 127;
        byte b2 = 70;
        byte b3 = 100;

        int result = b1*b2/b3;
        // Hence, Automatic Type Conversion happened here because the destination type(int) is larger than source type(byte).
        System.out.println(result);

    //Example 3.1
        int number = 'a';
        System.out.println("The ASCII value of a is " + number);  // It will print the ASCII value of 'a'.


/* There are some rule for type conversion:-
* 1. Java will automatically convert byte, short and char operand to int type while evaluating any expressions.
* 2. If any one of the operand is float, double or long. Then, the whole expression is converted to float, double and long respectively. */

        byte by = 43;
        short sh = 789;
        char ch = 'T';
        float f = 93.5f;
        long l = 678354L;

        double d = l*f*ch/sh*by;
        double d1 = (sh-ch) + (f/by);

        System.out.println("The value of d is " + d + " and the value of d1 is " + d1);


    }
}
