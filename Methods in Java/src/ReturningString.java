public class ReturningString {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    static String greet(){
        String message = "Hello World";
        return message;
    }
}
