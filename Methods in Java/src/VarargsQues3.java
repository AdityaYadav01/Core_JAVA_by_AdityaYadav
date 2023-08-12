// Calculate discount using Varargs.

public class VarargsQues3 {
    static double discount(double ...num){
        int TotalPrice = 0;
        double dis = 0;
        for (int i = 0; i < num.length; i++) {   // Calculating the total price
            TotalPrice += num[i];
        }
        if(TotalPrice>500){
            dis = (10*TotalPrice)/100f;
        }
        if(TotalPrice>500 && TotalPrice<1000){
            dis = (15*TotalPrice)/100f;
        }
        if(TotalPrice>1000){
            dis = (20*TotalPrice)/100f;
        }

        return dis;
    }

    public static void main(String[] args) {
        double res = discount(8,150,562);
        System.out.println("Total discount: "+res);
    }
}
