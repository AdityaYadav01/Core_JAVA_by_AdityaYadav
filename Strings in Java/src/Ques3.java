/* Ques3. Find if the email id is on gmail.
* find username and domain name from email. */

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your email id: ");
        String mail = in.nextLine();

        int index = mail.indexOf('@');              // Finding the index of '@' in the gmail id.
        System.out.println("Index of @ is " + index);

        String username = mail.substring(0, index);   //Finding the username
        System.out.println("User name: " + username);

        int len = mail.length();                 // Finding the domain of the string

        String domainName = mail.substring(index+1, len);
        System.out.println("Domain name: " + domainName);

        // Now, We will find if the domain is from gmail or not.
        int gmail = domainName.compareToIgnoreCase("gmail.com");
        if(gmail == 0){
            System.out.println("The email id is from gmail.");
        }
        else{
            System.out.println("The Domain is not from any other organization.");
        }





    }
}
