import java.util.Scanner; //import scanner class

public class employeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// get the employee information
        System.out.print("Enter the first name of the new employee: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the last name of the new employee: ");
        String lastName = scanner.nextLine();

//set the birth date of employee
        Date birthDate;
        do {
            System.out.print("Enter the birth date of the new employee (in the format xx/xx/xxxx): ");
            birthDate = getDateFromUser();
            if (birthDate == null) {
                System.out.println("Invalid date format. Please try again.");
            }
        } while (birthDate == null);

//set the original hire date of the employee
        Date originalHireDate;
        do {
            System.out.print("Enter the original hire date of the new employee (in the format xx/xx/xxxx): ");
            originalHireDate = getDateFromUser();
            if (originalHireDate == null) {
                System.out.println("Invalid date format. Please try again.");
            }
        } while (originalHireDate == null);

//set the current hire date for dates added later
        Date currentHireDate = new Date(originalHireDate.getMonth(), originalHireDate.getDay(), originalHireDate.getYear());

//new employee information
        Employee employee = new Employee(firstName, lastName, birthDate, currentHireDate);

//create a loop for user to choose operations: add months, days, years, loop 40 days in incremental values, or close program
        int choice;
        do {
            System.out.println("\nChoose an operation:");
            System.out.println("1) Add Months to hire date");
            System.out.println("2) Add Days to hire date");
            System.out.println("3) Add Years to hire date");
            System.out.println("4) Loop 40 days");
            System.out.println("5) Close the program");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Original Hire Date: " + originalHireDate);
                    System.out.println("Current Date: " + currentHireDate);
                    System.out.print("Enter the number of months to add: ");
                    int monthsToAdd = scanner.nextInt();
                    for (int i = 0; i < monthsToAdd; i++) {
                        currentHireDate.nextMonth();
                    }
                    System.out.println("Hire Date after adding " + monthsToAdd + " months: " + currentHireDate);
                    printEmployeeDetails(employee, originalHireDate); // Print employee details
                    break;
                case 2:
                    System.out.println("Original Hire Date: " + originalHireDate);
                    System.out.println("Current Date: " + currentHireDate);
                    System.out.print("Enter the number of days to add: ");
                    int daysToAdd = scanner.nextInt();
                    for (int i = 0; i < daysToAdd; i++) {
                        currentHireDate.nextDay();
                    }
                    System.out.println("Hire Date after adding " + daysToAdd + " days: " + currentHireDate);
                    printEmployeeDetails(employee, originalHireDate); // Print employee details
                    break;
                case 3:
                    System.out.println("Original Hire Date: " + originalHireDate);
                    System.out.println("Current Date: " + currentHireDate);
                    System.out.print("Enter the number of years to add: ");
                    int yearsToAdd = scanner.nextInt();
                    for (int i = 0; i < yearsToAdd; i++) {
                        currentHireDate.nextYear();
                    }
                    System.out.println("Hire Date after adding " + yearsToAdd + " years: " + currentHireDate);
                    printEmployeeDetails(employee, originalHireDate); // Print employee details
                    break;
                case 4:
                    for (int i = 0; i < 40; i++) {
                        currentHireDate.nextDay();
                        System.out.println("Incremented Date: " + currentHireDate);
                        System.out.println("Current Date: " + currentHireDate);
                    }
                    break;
                case 5:
                    System.out.println("Closing the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static Date getDateFromUser() {
        Scanner scanner = new Scanner(System.in);

        String dateInput = scanner.next();
        String[] dateParts = dateInput.split("/");

        if (dateParts.length != 3) {
            return null; // Invalid date format
        }

        try {
            int month = Integer.parseInt(dateParts[0]);
            int day = Integer.parseInt(dateParts[1]);
            int year = Integer.parseInt(dateParts[2]);

            return new Date(month, day, year);
        } catch (NumberFormatException e) {
            return null; // Invalid date format
        }
    }

//provide the new updated information of the employee reflecting previous operations choices
    private static void printEmployeeDetails(Employee employee, Date originalHireDate) {
        System.out.println("Employee: " + employee.toString());
        System.out.println("Original Hire Date: " + originalHireDate);
        System.out.println("Current Date: " + employee.getHireDate());
    }
}
