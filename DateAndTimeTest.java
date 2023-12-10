import java.util.Scanner;

public class DateAndTimeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month, day, year, hour, minute, second;

        // Validating month input
        while (true) {
            System.out.print("Enter month (1-12): ");
            month = input.nextInt();
            if (month >= 1 && month <= 12) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // Validating day input
        while (true) {
            System.out.print("Enter day (1-31): ");
            day = input.nextInt();
            if (day >= 1 && day <= 31) { // Note: This simple check doesn't account for different days in months
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // Validating year input
        while (true) {
            System.out.print("Enter year: ");
            year = input.nextInt();
            if (year > 0) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // Validating hour input
        while (true) {
            System.out.print("Enter hour (0-23): ");
            hour = input.nextInt();
            if (hour >= 0 && hour < 24) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // Validating minute input
        while (true) {
            System.out.print("Enter minute (0-59): ");
            minute = input.nextInt();
            if (minute >= 0 && minute < 60) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // Validating second input
        while (true) {
            System.out.print("Enter second (0-59): ");
            second = input.nextInt();
            if (second >= 0 && second < 60) {
                break;
            }
            System.out.println("Invalid input. Please try again.");
        }

        // Create a DateandTime object with the user input
        DateandTime dateTime = new DateandTime(month, day, year, hour, minute, second);

        
        int choice;
        do {
            displayMenu();
            System.out.print("Choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: // Add 1 second
                    dateTime.tick();
                    break;
                case 2: // Add 1 minute
                    dateTime.incrementMinute();
                    break;
                case 3: // Add 1 hour
                    dateTime.incrementHour();
                    break;
                case 4: // Add 1 day
                    dateTime.nextDay();
                    break;
                case 5: // Add 1 month
                    dateTime.nextMonth();
                    break;
                case 6: // Add 1 year
                    dateTime.nextYear();
                    break;
                case 7: // Exit
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            if (choice >= 1 && choice <= 6) {
                displayDateTime(dateTime);
            }
        } while (choice != 7);
        input.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n1. Add 1 second");
        System.out.println("2. Add 1 Minute");
        System.out.println("3. Add 1 Hour");
        System.out.println("4. Add 1 Day");
        System.out.println("5. Add 1 Month");
        System.out.println("6. Add 1 Year");
        System.out.println("7. Exit");
    }

    private static void displayDateTime(DateandTime dateTime) {
        System.out.println("Universal date and time: " + dateTime.toUniversalString());
        System.out.println("Standard date and time: " + dateTime.toString());
    }
}
