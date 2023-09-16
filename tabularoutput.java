import java.util.Scanner; // import java library Scanner for user input

public class tabularoutput { // Set class tabularoutput to run java code
    public static void main(String[] args) {
        int number; // create a variable called number and have it be an interger
        System.out.print("\nN \t10*N \t100*N \t1000*N \n \n"); // create header of table
        for (number = 1; number <= 5; number++) { // establish number count loop 5 times
            System.out.print("\n" + number + "\t" + (number * 10) + "\t" + (number * 100) + "\t" + (number * 1000)); // print
                                                                                                                     // the
                                                                                                                     // loop
                                                                                                                     // of
                                                                                                                     // the
                                                                                                                     // individual
                                                                                                                     // numbers
                                                                                                                     // multiplied
                                                                                                                     // by
                                                                                                                     // 1,
                                                                                                                     // 10,
                                                                                                                     // 100,
                                                                                                                     // 1000
        }
    }
}