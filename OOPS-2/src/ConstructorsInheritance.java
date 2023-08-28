//Constructors are the method of class which are created automatically when an object is created.
// Constructors are executed from top to bottom



class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child(){
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child{
    public GrandChild(){
        System.out.println("GrandChild Constructor");
    }
}

public class ConstructorsInheritance {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
    }
}
