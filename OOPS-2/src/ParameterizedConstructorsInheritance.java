// We will see how to call parameterized constructor of parent class in Inheritance. Using 'super' Keyword.

class ParentClass{
    public ParentClass(){
        System.out.println("Non-Parameterized");
    }

    public ParentClass(int x){
        System.out.println("Parameterized " + x);
    }
}

class ChildClass extends ParentClass{
    public ChildClass(){
        System.out.println("Non-Parameterized");
    }

    public ChildClass(int y){
        System.out.println("Parameterized");
    }

    public ChildClass(int x, int y){
        super(x);                     // The super keyword in java is a reference variable that is used to refer to parent class objects.
        System.out.println("2 Parameterized " + y);
    }

}

public class ParameterizedConstructorsInheritance {
    public static void main(String[] args) {
        ChildClass C = new ChildClass(5,12);
    }
}
