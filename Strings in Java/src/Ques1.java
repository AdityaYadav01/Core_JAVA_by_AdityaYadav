// Ques 1. Write a program which help us to understand how to create Strings
// and How to use some important methods of String Class.

public class Ques1 {
    public static void main(String[] args) {
        // There are 3 ways to create Strings

        String s1 = "Hello! World";
        String s2 = new String("Java is Object Oriented Programming Language");
        char[] arr = {'H', 'E', 'L', 'L', 'O'};
        String s3 = new String(arr);

        // Some important method of String Class

        //1. Finding Length of String
        System.out.println("The Length of s1 is " + s1.length());

        //2. Concatenate two strings
        System.out.println("Combination of s1 and s2 is " + s1.concat(s2));

        //3. Concatenate multiple strings using +
        System.out.println(s1 + s3);

        //4. Testing if String s1 starting with 'H'
        boolean x = s1.startsWith("H");
        System.out.println("s1 is starting with H");

        //5. Extracting Substring from s2
        String sub = s2.substring(0, 14);
        System.out.println(sub);

        //6. Converting s1 into uppercase and lowercase
        System.out.println("The uppercase of s1 is " + s1.toUpperCase());
        System.out.println("The lowercase of s1 is " + s1.toLowerCase());

    }
}
