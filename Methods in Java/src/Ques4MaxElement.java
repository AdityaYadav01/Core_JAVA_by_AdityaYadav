// Find the maximum element in an array. Create Method for Finding maximum element

public class Ques4MaxElement {
    public static void main(String[] args) {
        int res = maxElement(4,5,6,8,16,18,15,12);
        System.out.println("Largest Element is " + res);
    }
    static int maxElement(int ...ele){
        int max = ele[0];
        for (int i = 0; i < ele.length; i++) {
            if (ele[i]>=max){
                max = ele[i];
            }
        }
        return max;

    }
}
