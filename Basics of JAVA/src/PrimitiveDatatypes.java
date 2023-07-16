public class PrimitiveDatatypes {

    // Primitive datatype are those datatype which are unbreakable.
    // Example - String is not a primitive datatype because we can break it into character.

    public static void main(String[] args) {

        // Integral - It is used to store integer values.
        byte b = 120;    //Size = 1 byte
        short s = 23412; //Size = 2 bytes
        int i = 944868850; //Size = 4 bytes
        long l = 394989383439939938L; //Size = 8 bytes

        // Floating point - It is used to store decimal numbers.
        float f = 4544.23f;      //Size = 4 bytes, and It gives less accurate value.
        double d = 892839.0223323; //Size = 8 bytes, Gives more accurate value.

        //To store characters
        char ch = 'r'; //Size = 2 bytes

        //To store boolean value
        boolean bl = true;  // JVM uses 1 bit to represent boolean value.

    }
}
