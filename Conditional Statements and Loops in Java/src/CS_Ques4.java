// Find person is young or not young.

import java.util.Scanner;

public class CS_Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Age of the Person: ");
        int age = in.nextInt();

        if (age>=14 && age<=55){
            System.out.println("The Person is younger.");
        } else{
            System.out.println("The Person is not young.");
        }
    }
}
