                                                  // Regular Expression

public class RegularExpression {
    public static void main(String[] args) {
        String str = "A";

        boolean match1 = str.matches(".");   // "." means any character from the keyboard.
        System.out.println("Does str matches with .? " + match1);

        boolean match2 = str.matches("[ABCD]"); // "A" matches the given string.
        System.out.println(match2);

        boolean match3 = str.matches("[^PQRST]");  // "^PQRST" means that "A" does not belong to it which is true
        System.out.println(match3);

        boolean match4 = str.matches("[A-Z0-9]"); // This is a way of defining a range. Does "A" belong to this range.
        System.out.println(match4);

        boolean match5 = str.matches("[A|B]");  // This is way of asking either one of the character belong to the given string.
        System.out.println(match5);

        /* Quantifiers - They determine the number of occurrences of a character or group that must be matched in the input string.*/

        String str2 = "abcdabcdab";
        System.out.println(str2.matches("[a-z]*")); // * means any character can come from a to z between any number of times.
        System.out.println(str2.matches("[a-z]+")); // + means any character from a to z should come at least one time.
        System.out.println(str2.matches("[a-z]?")); // ? means any character from a to z should come at least 0 or 1 time.
        System.out.println(str2.matches("[abcd]{10}")); // {X} Any character from abcd but it should have length of 10.

    }
}
