//Nested Switch Case - It means Switch case inside another switch case.

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Enrollment No of the student: ");
        String empID = in.nextLine();

        System.out.print("Enter the Department of student: ");
        String department = in.nextLine();

        switch (empID){
            case "E20CSE312":
                System.out.println("Aditya Yadav");
                switch (department){
                    case "IT":
                        System.out.println("Computer Science");
                        break;
                    case "ECE":
                        System.out.println("Electronic Engineering");
                        break;
                }
            break;
            case "E20CSE302":
                System.out.println("Siddharth Dudeja");
                switch (department){
                    case "IT":
                        System.out.println("Computer Science");
                        break;
                    case "ECE":
                        System.out.println("Electronic Engineering");
                        break;
                }
            break;
            case "E20CSE307":
                System.out.println("Yuvraj Saxena");
                switch (department) {
                    case "IT":
                        System.out.println("Computer Science");
                        break;
                    case "ECE":
                        System.out.println("Electronic Engineering");
                        break;
                }
            break;
            default:
                System.out.println("Invalid User");
        }


    }
}

