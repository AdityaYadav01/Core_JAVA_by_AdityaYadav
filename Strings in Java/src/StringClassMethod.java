                                // Methods in String Class

import java.lang.String;


public class StringClassMethod {
    public static void main(String[] args) {

        // Let's Import 3 Strings using 3 Different methods
        String s1 = "Java Programming Language";
        String s2 = new String("Object Oriented");
        char[] arr = {'J', 'A', 'V', 'A'};
        String s3 = new String(arr);

        // Methods which are available in String class are:

        // 1. String concat() - This method will add two string together.
        String concat = s2.concat(s3);
        System.out.println(concat);

        // 2. int length() - This method will return the length or number of characters of string.
        int length = s1.length();
        System.out.println("The Length of the String is " + length);

        //3. String toLowerCase() - This method converts all characters of the string into Lower Case.
        String LowerCase = s1.toLowerCase();
        System.out.println(s1 + " in Lower Case is " + LowerCase);

        //4. String toUpperCase() - This method converts all characters of the String into Upper Case.
        String UpperCase = s2.toUpperCase();
        System.out.println(s2 + " in Upper Case is " + UpperCase);

        //5. String trim() - This method will remove the extra space from the beginning and the ending of the string.
        String name = "  Aditya Yadav  ".trim();
        System.out.println(name);

        //6. String substring(int begin) - This method will return substring from the main string from the provided beginning index position until end.
        String substring = s2.substring(7);
        System.out.println(substring);

        //7. String substring(int begin, int end) - This method will return substring starting from begin index to end index.
        String substring2 = s1.substring(5,16);
        System.out.println(substring2);

        //8. String replace(char c1, char c2) - This method replace all the occurences of character 'c1' by a new character 'c2'.
        String replace = s3.replace('A','E');
        System.out.println(replace);

        //9. boolean startWith(String s) - This method will return true if a string is starting with the sub string 's' else false.
        boolean start = s1.startsWith("Java");
        System.out.println("Is s1 starting with same sub string of s3? " + start);

        //10. boolean endWith(String s) - This method will return true if a string is ending with sub string 's' else false.
        boolean end = s1.endsWith("a");
        System.out.println("Is s1 end with same substring of s2? " + end);

        //11. char charAt(int i) - This method will return the character at the specified location.
        char ch = s1.charAt(8);
        System.out.println("Which character is at 8th position" + ch);

        //12. int indexof(String s) - This method will return the index of the sub string in the main string.
        int index = s1.indexOf('v');
        System.out.println("Index value of v in s1 is " + index);

        //13. int lastIndexOf(String s) - This method will return the index value of the last occurence of the sub string 's' in the main string.
        int index2 = s2.lastIndexOf('t');
        System.out.println("Last index value of t in s2 is " + index2);

        /* Note - 1. If the give character or string is not present in the given string. Then, it will return negative value.
                  2. We can also initialize starting index point in the method. */

        //14. boolean equals(String s) - This method returns true if two strings are same. This is case-sensitive.
        boolean value = s1.equals("Java");
        System.out.println(value);

        //15. boolean equalsIgnoreCase(String s) - This method will also compare two strings ,but it will also perform case-insensitive comparison.
        boolean value1 = s2.equalsIgnoreCase("OBJECT ORIENTED");
        System.out.println(value1);

        /*16. int compareTo(String s) - This method is useful to compare two string and to know which string is bigger or smaller in dictionary order.
              Conditions: 1. If both the strings are equal , it will return o.
                          2. If s1 is greater than s2, it will return a positive number.
                          3. If s1 is less than s2, it will return negative number.*/
        int n = s1.compareTo(s2);
        System.out.println(n);


















    }
}
