                                // STRINGS

/* String - String is the collection or sequence of characters.
 *
 *  Ques1. Is String a class or datatype? - String is a class present in java.lang package.
 *        But in JAVA, All classes are considered as datatype. So, we can say that string is also a datatype.
 *
 * Ques2. Can we call a class as a datatype? - Yes, a class is also called 'user-defined' datatype.
 *         This is because a user can also create a class.  */

// There are three ways to create strings in java.

import java.lang.String;

public class StringsInJava {
    public static void main(String[] args) {

        // 1. By Assigning a group of character to string type variable

        String s = "Hello World"; // 's' is the reference variable.
        System.out.println(s);

        /* 2. We can create an object to String class by allocating memory using new operator.
              This is just like creating an object to any class. */

        String str = new String("Hello World");
        // 'new' is the keyword which will create String as an object in Heap memory.
        // The object is referenced by the variable 'str'.
        System.out.println(str);

        /* 3. The third way of creating a string is by converting character array into the string. */

        char[] arr = {'H', 'E', 'L', 'L', 'O'};
        String str3 = new String(arr, 1,3); // It will print characters from 1st position to 3rd position.
        System.out.println(str3);

    }
}

