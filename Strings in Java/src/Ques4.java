/*Ques 4. Let us write a program to compare two strings
using '==' operator, equals() and compareTo() methods.*/

public class Ques4 {
    public static void main(String[] args) {
        String s1 = "Hello! World";
        String s2 = new String("Hello! World");
        // When an object is created in JVM, It will assign as reference number which represent the memory address of the object in the heap memory.

        // 1. Using equals() method
        boolean eq = s1.equals(s2);        // Here, It is comparing the content of the object.
        System.out.println("Is s1 and s2 are equal? " + eq);

        //2. Using compareTo() method
        int eq2 = s1.compareTo(s2);      // Here, It is comparing the content of the object.
        System.out.println(eq2);
        if(eq2 == 0){
            System.out.println("Is s1 and s2 are equal? true");
        }
        else {
            System.out.println("Is s1 and s2 are equal? false");

        }

        //3. Using '==' operator          // Here, It is comparing the object references which is a unique hexadecimal number. Every object will have unique reference.
        if (s1==s2){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal.");
        }
    }
}
