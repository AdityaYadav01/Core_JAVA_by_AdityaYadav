/* Command Line Argument - In Java, Command Line Argument is an argument which is passed at
*   the time of running the java program.
*
* The command line argument is passed from the console can be received in the java program.
* And they can be used as input */

public class CommandLineArgument {

    public static void main(String[] args) {    // String[] args is a command line argument of string type array.
        double sum = 0;
        for (String arg : args) {      // Adding all the numbers provided by user at the time of running.
        if (arg.matches("[0-9]*"))   // Checking if the number provided by user is right or not.
            sum += Double.parseDouble(arg);

        }
        System.out.println(sum);;
    }
}
