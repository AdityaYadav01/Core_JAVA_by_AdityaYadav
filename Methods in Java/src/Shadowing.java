/* Shadowing - Shadowing in java is the practise of using variables in overlapping scopes
*  with the same name where variable in low-level scope overrides the variable of high-level scope.*/

// Here, the variable at highlevel scope is shadowed by low-level scope variable.

public class Shadowing {
    static int x = 10;    // This variable is declared at high scope.
    public static void main(String[] args) {
        System.out.println(x);  // Print 10

        int x = 5;       //Here, High-level scope is shadowed by low-level scope.
        System.out.println(x);   // Print 5

        fun(); // Print 10

    }

    static void fun(){
        System.out.println(x);  // taking 10 as an input
    }

}
