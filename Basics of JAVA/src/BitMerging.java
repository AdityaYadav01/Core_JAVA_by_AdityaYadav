                          // Bit Merging and Masking


/* Bit Merging is the process of setting one of the bit as 1 in all zeros.(Using OR operation)*/


public class BitMerging {
    public static void main(String[] args) {

        byte a = 9, b = 12;  // Storing the Two values a and b in a variable c.
        byte c;

        c = (byte)(a<<4);
        c = (byte)(c|b);

        //Checking if the value of a store on the left hand side of the variable c.

        byte a_value = (byte) ((c & 0b11110000)>>4);
        System.out.println("The value of a: " + a_value);    // It will print the value of a=9.

        // Checking if the value of b stored in variable c or not.
        byte b_value = (byte)(c & 0b00001111);
        System.out.println("The value of b: " +b_value);









    }
}
