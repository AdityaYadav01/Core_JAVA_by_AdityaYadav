import java.util.Scanner;

public class SyntaxForMethodsInJava {
    public static void main(String[] args) {
        sum();    // Calling the sum function
    }

    /*
        access-modifier return-type method(){
                  //code
                  return statement;
                 }

         Q. Let's create a method for Sum of two numbers

        */

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = in.nextInt();

        System.out.println("Sum: " + (n1+n2));

    }
}
