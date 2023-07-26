// Check whether the alphabet is vowel or consonant using switch case.

import java.util.Scanner;

public class SS_Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your character: ");
        char ch = in.next().charAt(0);

        switch (ch){
            case 'a', 'u', 'e', 'i', 'o', 'A', 'I', 'E', 'O', 'U' -> System.out.println("It is a vowel");
            default -> System.out.println("It is a consonant");
        }
    }
}
