
/*  Pseudocode
 * Step 1: Import Scanner from library for user input
 * Step 2: Create public class largestnumber to run java code
 * Step 3: Create set of print statements outlining the goal of the program
 * Step 4: Create interger variable number to hold an interger asked by user
 * Step 5: Create a counter interger variable and set it to 1
 * Step 6: Create interger variable called min and max and set it to variable interger number
 * Step 7: Create a while loop for 10 inputs
 * Step 8: Establish if statements to determine if the number is smallest or the largest of the inputs by user
 * Step 9: Have variable counter until 10
 * Step 10: Print which number is the largest sale and which is the smalles sale
 */
import java.util.Scanner; // import java library Scanner for user input

public class largestnumber {
    public static void main(String[] args) { // Set the foundation with print statments for the program
        Scanner in = new Scanner(System.in);
        System.out.println("We are going to find 10 sales numbers");
        System.out.println("Then we are going to determine which is the largest sale and the smallest sale.");
        System.out.println("Let's get ten sales numbers: ");
        int number = in.nextInt(); // Establish interger variables to hold the user input
        int counter = 1; // Establish interger variable to count the sales data up to 10 from 1
        int min = number, max = number; // Establish a range of what the highest user input is and lowest
        while (counter < 10) { // Create a while loop for the 10 counts needed
            number = in.nextInt();
            if (number > max) // Create if statements comparing user input whether it is higher or lower than
                              // previous
                max = number;
            if (number < min)
                ;
            min = number;
            counter++;
        }
        System.out.println("The largest sales number is: " + max); // Print largest sales number
        System.out.println("The smallest sales number is: " + min); // Print smallest sales number
    }
}
