public class time {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Constructors and other methods...

public time() {
    this(0,0,0);
    }

public time(int hour)
{
    this(hour,0,0);
}

public time (int hour, int minute)
{
    this(hour, minute,0);
}

public time(int hours, int minute, int second)
{
    if (hour < 0 || hour >= 24)
    throw new IllegalArgumentException("hour must be 0-23");

    if (minute < 0 || minute >= 60)
    throw new IllegalArgumentException("minute must be 0-59");

    if (second < 0 || second >= 60)
    throw new IllegalArgumentException("second must be 0-59");

    this.hour = hour;
    this.minute = minute;
    this.second = second;

}

public time(time time)
{
    this(time.getHour(), time.getMinute(), time.getSecond());

}

public void setTime(int hour, int minute, int second)
{
    if (hour < 0 || hour >= 24)
    throw new IllegalArgumentException("hour must 0-23");

    if (minute < 0 || minute >= 60)
    throw new IllegalArgumentException("minute must be 0-59");

    if (second < 0 || second >= 60)
    throw new IllegalArgumentException("second must be 0-59");

    this.hour = hour;
    this.minute = minute;
    this.second = second;
}

public void setHour(int hour)
{
    if (hour < 0 || hour >= 24)
    throw new IllegalArgumentException("hour must be 0-23");
    
    this.hour = hour;
}

public void setMinute(int minute)
{
    if (minute < 0 || minute >= 60)
    throw new IllegalArgumentException("minute must be 0-59");

    this.minute = minute;
}
public void setSecond(int second)
{
    if (second < 0 || second >= 60)
    throw new IllegalArgumentException("hour must be 0-59");

    this.second = second;
}

public int getHour()
{
    return hour;
}

public int getMinute()
{
    return minute;
}

public int getSecond()
{
    return second;
}

public String toUniversalString()
{
    return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
}

public String toString()
{
    return String.format("%d:%02d:%02d%s", ((getHour() == 0 || getHour() == 12)? 12: getHour()%12), getMinute(), getSecond(), (getHour() < 12? "AM" : "PM"));
}

public void tick() {
    if (second < 59) {
        second++;
    } else if (minute < 59) {
        second = 0;
        minute++;
    } else if (hour < 23) {
        second = 0;
        minute = 0;
        hour++;
    } else {
        second = 0;
        minute = 0;
        hour = 0;
    }
}

public void incrementMinute() {
    if (minute < 59) {
        minute++;
    } else if (hour < 23) {
        minute = 0;
        hour++;
    } else {
        minute = 0;
        hour = 0;
    }
}

public void incrementHour() {
    if (hour < 23) {
        hour++;
    } else {
        hour = 0;
    }
}
}