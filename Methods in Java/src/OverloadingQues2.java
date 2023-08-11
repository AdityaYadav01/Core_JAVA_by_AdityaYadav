// Overload method to reverse  a int or array

import java.util.Arrays;

public class OverloadingQues2 {
    public static void main(String[] args) {
        int[] res = reverse(new int[]{4, 5, 6});    // here, we are giving array as an input. we can also provide number.
        System.out.println(Arrays.toString(res));
    }

    static int reverse(int num){
        int revNum = 0;
        while(num>0){
            int rem = num%10;
            revNum = rem + revNum*10;
            num /= 10;
        }
        return revNum;
    }

    static int[] reverse(int[] num) {
        int[] revArr = new int[num.length];

        for (int i = num.length - 1, j=0; i >= 0; i--, j++) {
            revArr[j] = num[i];
        }
        return revArr;
    }


}
