// Find the GCD of a number. Take input from user and create GCD Method.

import java.util.Scanner;
public class Ques3GCD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int n1 = in.nextInt();

        System.out.print("Enter the Second number: ");
        int n2 = in.nextInt();

        int res = GCD(n1,n2);
        System.out.println("The GCD of Given Two Number is "+ res);
    }

    static int GCD(int n1, int n2){
        while (n1!=n2){
            if (n1>n2){
                n1 -= n2;
            }
            else{
                n2 -= n1;
            }
        }
        return n1;

    }
}
