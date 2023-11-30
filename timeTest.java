import java.util.Scanner;


public class timeTest {
    private static time currentTime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for the initial time
        System.out.println("Enter the initial time (hour minute second): ");
        int initialHour = sc.nextInt();
        int initialMinute = sc.nextInt();
        int initialSecond = sc.nextInt();

        // Create a new Time object with the user-provided initial time
        currentTime = new time(initialHour, initialMinute, initialSecond);

        int choice;

        do {
            // Display the current time
            displayTime("Current time", currentTime);

            // Display the menu
            System.out.println("\nChoose an option:");
            System.out.println("1. Add 1 second");
            System.out.println("2. Add 1 minute");
            System.out.println("3. Add 1 hour");
            System.out.println("4. Add arbitrary seconds");
            System.out.println("5. Exit");

            // Get user choice
            choice = sc.nextInt();

            // Process user choice
            switch (choice) {
                case 1:
                    tick();
                    break;

                case 2:
                    incrementMinute();
                    break;

                case 3:
                    incrementHour();
                    break;

                case 4:
                    System.out.print("Enter seconds to add: ");
                    int secondsToAdd = sc.nextInt();
                    addSeconds(secondsToAdd, currentTime); // Pass the time instance
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    // Display the time
    private static void displayTime(String header, time t) {
        System.out.printf("%n%s%n %s%n  %s%n", header, t.toUniversalString(), t.toString());
    }

    // Increment the minute
    private static void incrementMinute() {
        currentTime.incrementMinute();
    }

    // Increment the hour
    private static void incrementHour() {
        currentTime.incrementHour();
    }

    // Add arbitrary seconds
    private static void addSeconds(int secondsToAdd, time t) {
        for (int i = 0; i < secondsToAdd; i++) {
            t.tick(); // Use the provided time instance
        }
    }

    // Add 1 second
    private static void tick() {
        currentTime.tick();
    }
}