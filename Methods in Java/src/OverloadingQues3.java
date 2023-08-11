// Overload method to validate name or age

public class OverloadingQues3 {

    static boolean validate(String name){
        if(name.matches("[a-zA-Z\\s]*")){
            return true;
        }
        return false;
    }

    static boolean validate(int num){
        if(num>=0 && num<=90){
            return true;
        }
        return false;
    }

    
    public static void main(String[] args) {
        boolean res = validate(15);
        System.out.println(res);

    }
}
