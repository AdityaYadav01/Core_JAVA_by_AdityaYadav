/* "this" is a reference variable that refers to current object.
Using "this" can improve code readability and reduce naming conflicts. */

class recTangle{
    public int length;
    public int breadth;
    int x = 10;

    public recTangle(){
        length = breadth = 1;
    }

    public recTangle(int length, int breadth){
        this.length = length;         // To avoid name conflict between properties and parameters, we can use "this" keyword.
        this.breadth = breadth;
    }

    void display(){
        System.out.println("Length: " + this.length);
        System.out.println("Breadth: " + this.breadth);
    }
}

/* The 'super' keyword in java is the reference variable that is used to refer to the superclass or parent class.*/

class cuBoid extends recTangle{
    int height;
    int x = 20;

    public cuBoid(){
        height = 1;
    }

    public cuBoid(int l, int b, int h){
        super(l,b);
        height = h;
    }

    int volume(){
        return length*breadth*height;
    }

}

public class ThisVsSuper {
    public static void main(String[] args) {
        cuBoid cub = new cuBoid(54,64,5);

        System.out.println(cub.volume());
        System.out.println(cub.x);
    }
}
