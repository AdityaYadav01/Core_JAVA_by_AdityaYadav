/* Switch Statements are used when there are several options, and we need to choose only one.
 Switch statements are also called branch and control statements.*/

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax for Switch Statement
        System.out.print("Enter the day: ");
        int day = in.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid date");
        }

        // Below is the Enhanced version of the above code

/*        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid date");
        }  */
    }
}
