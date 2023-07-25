/*Ques 2. a)Remove special characters from the string.*/


import java.util.Scanner;

public class RegularExpressionQues2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the String with Special characters: ");
        String str = in.nextLine();

        String remove = str.replaceAll("[^a-zA-Z0-9]", "");  // Here, We are replacing all the special characters with empty value.
        System.out.println(remove);

        // b) Removing extra spaces from string.
        System.out.print("Enter the String from which you need to remove spaces: ");
        String str2 = in.nextLine();

        String space = str2.replaceAll("\\s +"," ");
        System.out.println("String after removing extra spaces: " + space);

        // c) Find the number of spaces in the string
        System.out.print("Enter your string to count its word: ");
        String str3 = in.nextLine();

        String[] count = str3.split("\\s");  // Split method will split the string based on spaces.
        int noOfWords = count.length;
        System.out.println("Total number of words in " + str3 + " is " + noOfWords);


    }
}
