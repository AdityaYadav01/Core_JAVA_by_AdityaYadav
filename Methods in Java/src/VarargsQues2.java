// Sum of all element using Varargs

public class VarargsQues2 {
    static int sum(int ...num){
        int tot = 0;
        for (int i = 0; i < num.length; i++) {
            tot = tot + num[i];
        }
        return tot;
    }


    public static void main(String[] args) {
        int res = sum(1,2,3,4,5,6);
        System.out.println("Sum of a number is " + res);

    }

}
