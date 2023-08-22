// Ques1. Create a class for cylinder and hide its data.

class Cyl{
    private int radius;
    private int height;

    // Creating a constructor

    public Cyl(){
        radius = height = 1;
    }

    public Cyl(int r, int h){
        radius = r;
        height = h;

    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        if (r>=0){
            radius = r;
        }else{
            radius = 0;
        }
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        if (h>=0){
            height = h;
        }
        else{
            height = 0;
        }
    }

    public double TotSurArea(){
        return 2*Math.PI*radius*(height+radius);
    }

    public double LateralSurArea(){
        return 2*Math.PI*radius*height;
    }
}

public class ConstructorQ2 {
    public static void main(String[] args) {

        Cyl cy = new Cyl();
        // Creating an object for rectangle.

        cy.setRadius(10);
        cy.setHeight(5);

        System.out.println("Height of cylinder: " + cy.getHeight());
        System.out.println("Radius of cylinder: " + cy.getRadius());

        System.out.printf("Total Surface Area: %.2f%n", cy.TotSurArea());
        System.out.printf("Lateral Surface Area: %.2f%n", cy.LateralSurArea());



    }
}
