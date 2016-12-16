import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Matt on 16/12/2016.
 */
public class Launcher {
    public static void main(String[] args) {
        launch();
    }

    private static void launch() {
        BerlinClock clock = new BerlinClock();

        Timer timer = new Timer("Display Timer");

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Task to be executed every second
                clock.setTime();
            }
        };

        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
}
