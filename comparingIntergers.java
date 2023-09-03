// Assignment 2.16 
// Comparing Integers Problem
/* Write an application that asks the user to enter two integers, 
obtains them from the user and displays the larger number followed 
by the words "is larger". If the numbers are equal, print the message 
"These numbers are equal". */

import java.util.Scanner; // imports Scanner class for input

public class comparingIntergers {
    // main method begins execution of Java application
    // misspelled integer in the file name
    public static void main(String[] args) {
        Scanner firstNumberInput = new Scanner(System.in); // Create a Scanner object
        System.out.println("We are going to compare to whole integers (nothing with a decimal) to see which is larger");
        System.out.println("Please select the first whole integer ");

        int firstInteger = firstNumberInput.nextInt(); // Read user input as integer
        System.out.println("First Whole Integer is: " + firstInteger); // Output user input // print statemet for

        Scanner secondNumberInput = new Scanner(System.in); // Create a Scanner object
        System.out.println("Please select the second whole integer ");

        int secondInteger = secondNumberInput.nextInt(); // Read user input as integer
        System.out.println("Second Whole Integer is: " + secondInteger); // Output user input // print statemet for
        if (firstInteger > secondInteger) {
            System.out.println("The first number " + firstInteger + " is larger.");
        } else if (firstInteger < secondInteger) {
            System.out.println("The second number " + secondInteger + " is larger.");
        } else {
            System.out.println("These numbers are equal");
        }
    }
}
// terminal
// end of method main
// end of class comparingIntergers