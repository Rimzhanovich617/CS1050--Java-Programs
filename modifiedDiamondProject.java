/* Write an application that prints the following diamond shape. 
You may use output statements that print a single asterisk (*), 
a single space or a single newline character. 
Maximize your use of iteration (with nested for statements), 
and minimize the number of output statements. 

Modify the application to read an odd number in the range 1 to 19 
to specify the number of rows in the diamond. Your program should 
then display a diamond of the appropriate size.*/

import java.util.Scanner; // Allow user input to be read

public class modifiedDiamondProject { // define class modifiedDiamondProject to run java program
    public static void main(String[] args) {
        System.out.println("We are going to print a diamond."); // Instructions for the program
        System.out.println("First lets get the row amount, choose an odd between number 1-19: "); // Parameter 1
        System.out.println("If you enter a non digit the program will quit."); // Parameter 2
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt(); //number1 variable established as user input
            while(number1 % 2 == 0||number1 < 1||number1 > 19) { //create a while loop to chose an odd number 1 - 19 with parameters
                System.out.println("Must be an odd number between 1 and 19");
                System.out.print("Enter a different number(must be odd in range 1-19): ");
                number1 = in.nextInt();
            }
        
        int row; //create a variable int row for the rows
        int stars; // create a variable int stars for the stars to be drawn
        int spaces; // create a variable spaces to have the number of stars drawn

        switch (number1 % 2) { //Create a switch statement for the loop to begin
        case 0: //If user input is an even number
        
        System.out.println("You chose an even number. Please choose again. "); //In case the users input is even
        break;
            
        case 1:
        System.out.println("You chose: " + number1 + "\nLet's draw the the diamond."); // show the number choosen and draw the diamond
        for (row = 1; row <= number1; row ++) { //set variable row to increase up to users input specifications
        for (spaces = 1 ; spaces <= number1 - row; spaces ++) // place spaces for each row
            System.out.print(" ");
        for (stars = 1; stars <= (2 * row) - 1; stars++)//increase variable stars per row until it reaches the amount of rows stated earlier
            System.out.print("*"); //print out stars image
            System.out.println();  //every star image will print new line until 5 rows appeared
    }
        for (row = number1; row >=1; row --) { //decrease the rows by 1 
            for (spaces = number1; spaces > row; spaces --) //keep the same spacing as above
                System.out.print(" ");
            for (stars = 1; stars <= (2 * row) - 1; stars ++) //keep the same amount of stars as above in reverse order of rows
                System.out.print("*"); //print out the stars image
                System.out.println(); //every star loop will be on a new line until 1 star available
        }
            break;
    }
           
        }
    
    }
        



