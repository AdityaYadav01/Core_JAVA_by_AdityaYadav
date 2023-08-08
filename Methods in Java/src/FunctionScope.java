/* Function Scope - Variable declared inside method/function scope (means inside method)
 can't be accessed outside the method.
              */

public class FunctionScope {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;      // Hence, It will not swap the number.
        swap(a,b);

        // System.out.println(n);   Hence, We can't use a variable n which is inside num() method.

    }
    static void num(int num){
        int n = 10;
        System.out.println(n);  // 'n' can be used inside the num function.
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;      // The changes are taking places inside the function.
        System.out.println(num1 + " " + num2);
    }

}
