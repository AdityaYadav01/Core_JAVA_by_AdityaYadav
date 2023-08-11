// Find maximum of a number using varargs

public class VarargsQues1 {
    static int maximum(int ...num){
        if (num.length == 0){
            return Integer.MIN_VALUE;
        }

        int max = num[0];
        for (int i = 1; i < num.length ; i++) {
            if(num[i]>max){
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int res = maximum(4,5,6,3,65,75,8,9);
        System.out.println("Maximum: " + res);
    }
}
