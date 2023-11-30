/*import java.util.Scanner;

public class dateTest; 

public static void main(String[] args) {

        Date date = new Date(); // February 28, 2023

        for (int i = 0; i < 5; i++) {

            System.out.println("Current date: " + date);

            date.nextDay();

        }

    }

}

import java.util.Scanner;


public class dateTest {
    private static time currentDate;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the initial time
        System.out.println("Enter the initial Date (month day year: ");
        int initialMonth = sc.nextInt();
        int initialDay = sc.nextInt();
        int initialYear = sc.nextInt();

        // Create a new Date object with the user-provided initial dat
        currentDate = new Date(initialMonth, initialDay, initialYear);

        int choice;

        do {
            // Display the current Date
            displayDate("Current Date", currentDate);

            // Display the menu
            System.out.println("\nChoose an option:");
            System.out.println("1. Add 1 Month");
            System.out.println("2. Add 1 Day");
            System.out.println("3. Add 1 Year");
            System.out.println("4. Choose an arbitrary amount of days.");
            System.out.println("5. Exit");

            // Get user choice
            choice = sc.nextInt();

            // Process user choice
            switch (choice) {
                case 1:
                    tick();
                    break;

                case 2:
                    incrementDay();
                    break;

                case 3:
                    incrementMonth();

                case 4:
                System.out.print("Enter days to add: ");
                int daysToAdd = sc.nextInt();
                nextDay(daysToAdd, currentDate); // Pass the time instance
                break;
                   
                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    // Display the Date
    private static void displayDate(String header, Date d) {
        System.out.printf("%n%s%n %s%n  %s%n", header, d.toUniversalString(), d.toString());
    }

        // Increment the day
    private static void incrementDay() {
        currentDay.incrementDay();
    }

    // Increment the month
    private static void incrementMonth() {
        currentDate.incrementMonth();
    }

    // Add arbitrary days
    public static void addDays(int daysToAdd, Date d) {
        for (int i = 0; i < daysToAdd; i++) {
            d.tick(); // Use the provided time instance
        }
    }

    // Add 1 day
    private static void tick() {
        currentDate.tick();
    }
}

*/