import java.util.Scanner; // import java library Scanner for user input

public class sumOfTwoNumbers {
    public static void main(String[] args) { // Set the foundation with print statments for the program
        Scanner in = new Scanner(System.in);

        System.out.println("We are going to add the sum of two numbers.");
        System.out.println("What should the first number be?");
        int number1 = in.nextInt();
        
        System.out.println("The first number is: " + number1);

        System.out.println("What should the second number be?");
        int number2 = in.nextInt();

        System.out.println("The second number is: " + number2);

        int total = number1 + number2;

        System.out.println("The total of the two numbers are: " + total);


    }
}