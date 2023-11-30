import java.util.Scanner; // import scanner class

public class Date {
    private int month; // 1-12
    private int day;   // 1-31 based on month
    private int year;  // any year

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: confirm proper value for month and day
    public Date(int month, int day, int year) {
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    // return a String of the form month/day/year
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }

    // increment the day by one
    public void nextDay() {
        int maxDay = daysPerMonth[month];

        // Handle leap year
        if (month == 2 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            maxDay = 29;
        }

        if (day < maxDay) {
            day++;
        } else {
            day = 1;
            if (month < 12) {
                month++;
            } else {
                month = 1;
                year++;
            }
        }
    }

    // increment the month by one
    public void nextMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            year++;
        }
    }

    // increment the year by one
    public void nextYear() {
        year++;
    }

    // get the month
    public int getMonth() {
        return month;
    }

    // get the day
    public int getDay() {
        return day;
    }

    // get the year
    public int getYear() {
        return year;
    }
}
