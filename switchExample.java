import java.util.Scanner;

public class switchExample {

    public static void main(String[] args) {
      
        char grade = 'b';

        switch (Character.toUpperCase(grade)) {

            case 'A':
                System.out.println("You got an A!");
                break;
            case 'B':
                System.out.println("You got an B!");
                break;
            case 'C':
                System.out.println("You got an C!");
                break;
            default:
                System.out.println("You did not provide a correct input.");
            }
        }
    }
