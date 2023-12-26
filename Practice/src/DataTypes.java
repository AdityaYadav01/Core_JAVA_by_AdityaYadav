/* Primitive Datatype - Primitive datatype are those datatype which are unbreakable.
   Example - String is not a primitive datatype because it can be breakable into characters.
             i.e String str = "Aditya";
                 char ch = 'a','d','i';
*
*
* */

public class DataTypes {
    public static void main(String []args){
        // Integral Type - It is used to store numbers

        byte b = 5;   // Size: 1
        System.out.println(b); // Range - -128 to 127

        short sh = 89;  // Size: 2
        System.out.println(sh);

        int a = 554545; //Size: 4
        System.out.println(a);

        long l = 6464648766L; // Size: 8
        System.out.println(l);


        // Floating Type - It is used to store decimal numbers

        float f = 45.23F;      // Size: 4
        System.out.println(f); // Less Accurate

        double d = 89.265959646;  // Size: 8
        System.out.println(d);    // More Accurate

        char ch = 'a';            // Size: 2
        System.out.println(ch);  // It is used to store characters

        boolean bl = true;         // JVM uses 1 bit to represent boolean value
        System.out.println(bl);   // Only stores i.e True & False

        // Variables - Variables are the name given to the data or variables are used to store data.
        // Literals - A Literal represents a value that is stored into variable directly in the program.


        //Left Shift Operator
        int x = 10;
        int z = x<<1;   // These operators double the value if it is shifted by 1.
        System.out.println(z);

        // Right Shift Operator
        int y = 10;
        int u = y>>1;  // These operators half the value of operator if it is shifted by 1.
        System.out.println(u);

        /* Type Conversion - When one type of data is assigned to another type of variable
        *                    an automatic type conversion will take place under some condition.
        *
        * Condition:- 1. Both the type should be compatible.
        *             2. The Destination type should be greater than source type.
        *
        *  Type Casting - It is the process of converting one type of data into another type of data.
        **/

        // Example of Type Casting:

        int num = (int)(89.656f);  // Floating point number is converted to integer.
        System.out.println(num);


    }
}
