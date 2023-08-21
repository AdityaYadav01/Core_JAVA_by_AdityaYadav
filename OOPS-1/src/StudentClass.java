// Creating a class for student

import java.util.Scanner;

class Student{
    //Properties of a student
    public String Name;
    public int rollno;
    public String Course;
    public int[] marks;

    public double TotalMarks(){
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += marks[i];
        }
        return sum;
    }

    public double Average(){
        double sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += marks[i];
        }
        return sum/6;


    }

    public char Grade(){
        if (Average()>=60){
            return 'A';
        }
        return 'B';
    }


}

public class StudentClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student stu = new Student();

        System.out.println("Enter the name of the student: ");
        stu.Name = in.nextLine();

        System.out.println("Enter the roll number of student: ");
        stu.rollno = in.nextInt();

        System.out.println("Enter the name of the course: ");
        stu.Course = in.nextLine();

        System.out.println("Enter the marks of the student: ");
        stu.marks = new int[6];             // Creating an array of size 6
        for (int i = 0; i < 6; i++) {      // Taking the input of student marks
            stu.marks[i] = in.nextInt();
        }

        System.out.println("Total marks of student is: " + stu.TotalMarks());
        System.out.println("Average of the student is: " + stu.Average());
        System.out.println("Grade obtained: " + stu.Grade());



    }
}
