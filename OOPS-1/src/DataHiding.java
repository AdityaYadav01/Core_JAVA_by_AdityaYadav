// Data Hiding - Usually Data is hidden and operations are made visible and operations
// or methods are performed over the data. Let's take an example of rectangle class and access its data outside the class.

class Rectangle{
    private int length;
    private int breadth;

    public int getLength(){                   //get****() method will allow us to read the property.
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

    public void setLength(int l){            //set*****() method will allow us to write the property.
        length = l;
    }

    public void setBreadth(int b){
        breadth = b;
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



public class DataHiding {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.setLength(10);               // These methods are used for writing and changing the value of length and breadth.
        rec.setBreadth(5);

        System.out.println("Area: " + rec.area());
        System.out.println("Perimeter: " + rec.perimeter());
        System.out.println("Is it a Square: " + rec.isSquare());

        System.out.println("Length: " + rec.getLength());    // These method are used for reading the value
        System.out.println("Breadth: " + rec.getBreadth());


    }

}
