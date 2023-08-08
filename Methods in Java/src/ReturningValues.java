import java.util.Scanner;

public class ReturningValues {
    public static void main(String[] args) {
        int ans = sum();       // 'ans' is storing the value of sum() method.
        System.out.println(ans);
    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int n2 = in.nextInt();
        int sum = n1+n2;

        // System.out.println("Sum: " + (n1 + n2)); - Instead of passing the value. Now, we will return the value.
        return sum;   // return will end the function.
    }
}
