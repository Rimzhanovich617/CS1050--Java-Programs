import java.util.Scanner;

public class doWhileExample {
    public static void main(String[] args) {
      String answer;
      do {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price: ");
        double price = in.nextDouble();

        System.out.println("Enter the quantity: ");
        int qty = in.nextInt();

        double total = price * qty;

        System.out.printf("The total is $%.2f\n", total);
        
        System.out.println("Do you want to calculate another total?\nYes or No?");
        answer = in.next();

      }
      while (answer.equalsIgnoreCase("Yes"));
    }
}
