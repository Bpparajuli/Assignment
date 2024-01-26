import java.util.Date;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time() {
        setTime(System.currentTimeMillis());
    }
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;

        second = (int)(totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;

        minute = (int)(totalMinutes % 60);

        long totalHours = totalMinutes / 60;

        hour = (int)(totalHours % 24);
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public static void main(String[] args) {
        Time currentTime = new Time();
        System.out.println("Current Time (GMT):");
        System.out.printf("%02d:%02d:%02d%n",
                currentTime.getHour(), currentTime.getMinute(), currentTime.getSecond());
    }
}
