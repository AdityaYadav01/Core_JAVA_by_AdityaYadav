// Overload a method to calculate areas

public class OverloadingQues1 {
    public static void main(String[] args) {
        double res = area(5);    // Here, you can provide the input
        System.out.println(res);

    }

    static int area(int l, int b){
        int AreaofRectangle = l*b;
        return AreaofRectangle;
    }
    static double area(int radius){
        double AreaofCircle = Math.PI*radius*radius;
        return AreaofCircle;
    }

    static float area(int x, int y, int height){
        float AreaofTrapezium = ((x+y)*height)/2f;
        return AreaofTrapezium;
    }
}
