import org.junit.Before;
import org.junit.Test;

/**
 * Created by Matt on 16/12/2016.
 */
public class BerlinClockTest {
    private BerlinClock clock;

    @Before
    public void init(){
        clock = new BerlinClock();
    }

    @Test
    public void Set_time_to_midnight_pm_is_a_default_clock(){
        clock.setTime();
    }
}
