/* Write an application that prints the following diamond shape. 
You may use output statements that print a single asterisk (*), 
a single space or a single newline character. 
Maximize your use of iteration (with nested for statements), 
and minimize the number of output statements. */

public class drawADiamond { // define class drawADiamond to run java program
    public static void main(String[] args) {
        int row; //create a variable int row for the rows
        int stars; // create a variable int stars for the stars to be drawn
        int spaces; // create a variable spaces to have the number of stars drawn

        for (row = 1; row <= 5; row++) { //set variable row to increase up to 5 iterations
            for (spaces = 5; spaces > row; spaces --)// place spaces for each row
                System.out.print(" ");
            for (stars = 1; stars <= (2 * row) - 1; stars++)//increase variable stars per row until it reaches the amount of rows stated earlier
                System.out.print("*");//print out stars image
                System.out.println();//every star image will print new line until 5 rows appeared
        }
        for (row = 4; row >=1; row --) { //decrease the rows by 1 from 4
            for (spaces = 5; spaces > row; spaces --) //keep the same spacing as above
                System.out.print(" ");
            for (stars = 1; stars <= (2 * row) - 1; stars ++)//keep the same amount of stars as above in reverse order of rows
                System.out.print("*");//print out the stars image
                System.out.println();//every star loop will be on a new line until 1 star available
        }
        }
        
}

