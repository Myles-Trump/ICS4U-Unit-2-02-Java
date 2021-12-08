/*
* The "Factorial" program that figures out the
* factorial of the user's inputted integer
*
* @author  Myles Trump
* @version 1.0
* @since   2021-12-07
*/

import java.util.Scanner;

/**
* This is a program that blanks.
*/
final class Template {

    /**
    * Constant.
    */
    public static final double CONSTANT = 1;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Template() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The reversing() function reverses strings.
    *
    * @return answer of factorial
    * @param inputtedInteger inputted integer's factorial will be solved 
    */
    public static String factorial(final int inputtedInteger) {
        if (inputtedInteger == 0) {
            return (inputtedInteger + 1);

        } else {
            return factorial(inputtedInteger.substring(1)) * inputtedInteger.charAt(0);

        }

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // variables
        int factorialAnswer;

        final Scanner userInput = new Scanner(System.in);

        // Block of code to try
        try {
                // ask the user to input something
                System.out.print("Enter an integer to factorial: ");

                // Stores input as integer
                int inputtedInteger = userInput.nextInt();

                // push input to factorial() function

                factorialAnswer = factorial(inputtedInteger);

                // Outputs something
                System.out.println("\nYour factorial is: "
                    + factorialAnswer);

        } catch (java.util.InputMismatchException errorCode) {
        // Block of code to handle errors
                System.out.println("\nYou have not entered a valid input.");
        }

        System.out.println("\nDone.");
    }
}