// Inheritance - It is the process of acquiring the features of existing class or Parent class into new class.
// A class will have properties and methods
// Specialization is achieved using inheritance.

// Let us see how to inherit the features of existing class into new class.

// Creating a circle class without constructor.

class circle{
    public double radius; // It ia property

    // Methods for circle class
    public double area(){
        return Math.PI*radius*radius;
    }

    public double perimeter(){
        return 2*Math.PI*radius;
    }

    public double circumference(){
        return perimeter();
    }
}

class cylinder extends circle{       // Inheriting the features of circle class in cylinder class.
    public double height;       //Property of cylinder class
    public double volume(){
        return area()*height;
    }
}


public class Inheritance {
    public static void main(String[] args) {
        // Creating an object for cylinder class.

        cylinder cy = new cylinder();

        cy.radius = 8;
        cy.height = 10;

        System.out.printf("Volume: %.2f%n", cy.volume());
        System.out.print("Area: " +  cy.area());



    }

}
