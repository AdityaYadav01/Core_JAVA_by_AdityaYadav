/* Ques Find if the number is binary or not.
*       Find if the number is hexadecimal or not.
*       Find if the date format is dd/mm/yyyy.*/

import java.util.Scanner;

public class RegularExpressionQues1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter any binary number: ");
        int binary = in.nextInt();

        String str = String.valueOf(binary);                 // Converting binary number to string.
        boolean binValue = str.matches("[01]+");
        System.out.println(binValue);

        String str2 = "3F1A7BCDE942";
        boolean binvalue2 = str2.matches("[A-F0-9]+");
        System.out.println(binvalue2);

        String date = "09/12/2003";
        boolean binvalue3 = date.matches("[0-3][0-9]/[01][1-9]/[0-9]{4}");
        System.out.println(binvalue3);





    }
}
