// Find the grades of the given marks.

import java.util.Scanner;

public class CS_Ques5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the marks of the student: ");
        int marks = in.nextInt();

        if (marks >= 90){
            System.out.println("The Obtained grade is A+");
        } else if (marks >= 80 && marks<89){
            System.out.println("The Obtained grade is A");
        } else if (marks >= 70 && marks<79) {
            System.out.println("The Obtained grade is B+");
        } else if (marks >= 60 && marks<69) {
            System.out.println("The Obtained grade is B");
        } else if (marks >= 55 && marks<59) {
            System.out.println("The Obtained grade is C+");
        } else if (marks >= 50 && marks<54) {
            System.out.println("The Obtained grade is C");
        }else{
            System.out.println("The Obtained grade is F");
        }

    }
}
