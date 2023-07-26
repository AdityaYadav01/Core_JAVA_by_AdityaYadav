// Find the type of website and the protocol used

import java.util.Scanner;

public class CS_Ques9_Advance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the URL of the website: ");
        String url = in.nextLine();

        int index = url.indexOf(':');
        String protocol = url.substring(0, index);
        System.out.println("Type of Protocol used: " + protocol);

        int lastindex = url.lastIndexOf('.');
        String type = url.substring(lastindex+1,url.length());
        System.out.println("Type of website: " + type);

        if (type.equals("com")){
            System.out.println("It is a commercial website.");
        } else if (type.equals("gov")) {
            System.out.println("It is a government website.");
        } else if (type.equals("org")){
            System.out.println("It is a organisation website");
        } else if (type.equals("net")) {
            System.out.println("It is a network website");
        } else{
            System.out.println("Invalid Website");
        }

    }
}
