import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ans = 0;

        while(true) {
            System.out.print("Enter the operator: ");
            char ops = in.next().charAt(0);

            if (ops == '+' || ops == '-' || ops == '*' || ops == '/' || ops == '%') {

                System.out.print("Enter any two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (ops == '+') {
                    ans = num1 + num2;
                } else if (ops == '-') {
                    ans = num1 - num2;
                } else if (ops == '*') {
                    ans = num1 * num2;
                } else if (ops == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                } else if (ops == '%') {
                    ans = num1 % num2;
                } else if (ops == 'x' || ops == 'X') {
                    break;
                }
                else{
                    System.out.println("Invalid Operator");
                }
                System.out.println(ans);


            }
        }
    }
}
