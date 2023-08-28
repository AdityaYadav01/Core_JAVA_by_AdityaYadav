class Rectangle{
    public int length;
    public int breadth;

    public Rectangle(){
        length = breadth = 1;
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle{
    public int height;

    public Cuboid(){
        height = 1;
    }

    public Cuboid(int h){
        height = h;
    }

    public Cuboid(int l, int b, int h){
        super(l, b);
        height = h;
    }

    public int volume(){
        return length*breadth*height;
    }
}


public class ParameterizedConstructorsInheritanceQ1 {
    public static void main(String[] args) {
        Cuboid Cb = new Cuboid(4,5,8);
        System.out.println("Volume of Cuboid: " + Cb.volume());

    }
}
