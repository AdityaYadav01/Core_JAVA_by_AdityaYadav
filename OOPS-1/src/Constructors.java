/*1. Constructors are the methods of class which are called when an object is created.
* 2. Every class will have default constructor provided by java compiler.
* 3. Constructor will not have any return type.
* 4. There are two type of constructor: 1. Parameterized and 2. Non-Parameterized */

class rectangle{
    private int length;
    private int breadth;

    public rectangle(int l, int b){             // This is parameterized constructor
        length = l;
        breadth = b;
    }

    public rectangle(int s){
        length = breadth = s;
    }

    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }

    public String isSquare(){
        if (length==breadth){
            return "Yes";
        }
        return "No";
    }
}


public class Constructors {
    public static void main(String[] args) {
        rectangle rec = new rectangle(10,10);  // Whenever a new object is created, constructor will be called.

        System.out.println("Area: " + rec.area());
        System.out.println("Perimeter: " + rec.perimeter());
        System.out.println("Area: " + rec.isSquare());
    }

}
