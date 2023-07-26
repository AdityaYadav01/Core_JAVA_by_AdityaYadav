// Display the Type of website using switch statement.

import java.util.Scanner;

public class SS_Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the domain of the website: ");
        String dom = in.nextLine();

        int index = dom.indexOf('.');
        String extension = dom.substring(index+1,dom.length());
        System.out.print("Extension of website is: " + extension);

        switch (extension){
            case "com":
                System.out.println("It is a commercial website");
                break;
            case "gov":
                System.out.println("It is a government website");
                break;
            case "edu":
                System.out.println(" It is a education website");
                break;
            case "org":
                System.out.println("It is the organisation website");
                break;
            default:
                System.out.println("Invalid Website");

        }

    }
}
