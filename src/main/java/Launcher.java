import Timings.TimeNode;
import Timings.TimeTeller;

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
                TimeNode time = new TimeTeller().getTime();
                clock.setTime(time);
            }
        };

        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
}
