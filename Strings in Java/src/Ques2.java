/* Ques 2. Let us take a string and copy some characters of the string into
a character array 'arr' using getchars() method.*/

public class Ques2 {
    public static void main(String[] args) {

        String str = "Java is a good programming language.";
        char[] arr = new char[25]; // Creating the character array to hold the copied characters.
        // '25' is the total number of character that can 'arr' hold.

        str.getChars(0,22, arr,0 );
        /* srcBegin: The index of the first character to copy from the string.
          srcEnd: The index after the last character to copy from the string.
          dst: The destination character array where the characters will be copied.
          dstBegin: The starting index in the destination array where the characters will be copied.*/

        System.out.println(arr);

    }
}
