package Timings;

/**
 * Created by Matt on 18/12/2016.
 */
public class TimeNode {
    private final int minutes;
    private final int hours;
    private final int seconds;

    public TimeNode(String timeString) {
        String[] times = timeString.split(":");

        int hours = Integer.parseInt(times[0]);
        if(hours>=24){
            hours = 00;
        }
        this.hours = hours;

        int minutes = Integer.parseInt(times[1]);
        if(minutes>=60){
            minutes = 00;
        }
        this.minutes = minutes;

        int seconds = Integer.parseInt(times[2]);
        if(seconds>=60){
            seconds = 00;
        }
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
