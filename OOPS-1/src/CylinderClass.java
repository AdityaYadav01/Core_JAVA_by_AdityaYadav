// Creating a Class for Cylinder

class Cylinder{
    public double radius;
    public double height;    // These are the properties of cylinder.

    public double TotSurfaceArea(){
        return 2*Math.PI*radius;
    }

    public double lidArea(){
        return 2*Math.PI*radius*radius;
    }

    public double Volume(){
        return Math.PI*radius*radius*height;
    }

}

public class CylinderClass {
    public static void main(String[] args) {
        Cylinder cy = new Cylinder();        // Creating an object for cylinder.
        // Intitializing the properties
        cy.radius = 4;
        cy.height = 4;

        System.out.printf("Total Surface Area: %.2f%n", cy.TotSurfaceArea());
        System.out.printf("Lid Area: %.2f%n", cy.lidArea());
        System.out.printf("Volume: %.2f%n", cy.Volume());
    }
}
