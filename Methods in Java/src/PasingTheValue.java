public class PasingTheValue {
    public static void main(String[] args) {
        int result = sum(10,10);
        System.out.println(result);

    }

    // Passing the value of numbers when the sum() method is called in main method.
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
