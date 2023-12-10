public class DateandTime {
    private int hour;   // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
    private int month;  // 1-12
    private int day;    // 1-31 based on month
    private int year;   // any year

    private static final int[] daysPerMonth = 
        {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public DateandTime(int month, int day, int year, int hour, int minute, int second) {
        // Date validation
        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29 && isLeapYear(year)))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        }

        // Time validation
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        this.month = month;
        this.day = day;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Method to increment second
    public void tick() {
        if (second < 59) {
            second++;
        } else {
            second = 0;
            incrementMinute();
        }
    }

    // Method to increment minute
    public void incrementMinute() {
        if (minute < 59) {
            minute++;
        } else {
            minute = 0;
            incrementHour();
        }
    }

    // Method to increment hour
    public void incrementHour() {
        if (hour < 23) {
            hour++;
        } else {
            hour = 0;
            nextDay();
        }
    }

    // Method to increment day
    public void nextDay() {
        if (day < daysPerMonth[month] || (month == 2 && day == 28 && isLeapYear(year))) {
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

    // Method to increment month
    public void nextMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            year++;
        }
    }

    // Method to increment year
    public void nextYear() {
        year++;
    }

    // Check if the year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Universal string representation
    public String toUniversalString() {
        return String.format("%02d/%02d/%02d %02d:%02d:%02d", month, day, year, hour, minute, second);
    }

    // Standard string representation
    @Override
    public String toString() {
        return String.format("%d/%d/%d %d:%02d:%02d %s", 
                             month, day, year,
                             ((hour == 0 || hour == 12) ? 12 : hour % 12), 
                             minute, second, 
                             (hour < 12 ? "AM" : "PM"));
    }
}
