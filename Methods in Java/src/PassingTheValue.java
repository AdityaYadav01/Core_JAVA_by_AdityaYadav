public class PassingTheValue {
    public static void main(String[] args) {
        int result = sum(10,10);
        System.out.println("Sum of two numbers: " + result);

        String message = Greet("Aditya");
        System.out.println(message);

    }
    /*NOTE: 1. Primitive datatype like int, short, char, byte etc. - JUST PASS VALUE
    *       2. Object and Reference - Passing value of reference variable. */

    // Passing the value of numbers when the sum() method is called in main method.
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

    // Passing the value of String
    static String Greet(String Naam){
        String message = "Hello " + Naam;
        return message;
    }
}
