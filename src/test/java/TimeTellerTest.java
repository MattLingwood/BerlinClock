import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Calendar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Matt on 16/12/2016.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({Calendar.class, TimeTeller.class})
public class TimeTellerTest {
    private TimeTeller timeTeller;

    @Before
    public void init(){
        timeTeller = new TimeTeller();
    }

    @Test
    public void get_midnight_returns_zero_time(){
        Calendar now = Calendar.getInstance();
        now.set(0,0,0,0,0,0);

        PowerMockito.mockStatic(Calendar.class);
        PowerMockito.when(Calendar.getInstance()).thenReturn(now);


        assertThat(timeTeller.getTime(),is("00:00:00"));
    }

    @Test
    public void seconds_greater_than_zero_return_previous_minute(){
        Calendar now = Calendar.getInstance();
        now.set(0,0,0,0,5,37);

        PowerMockito.mockStatic(Calendar.class);
        PowerMockito.when(Calendar.getInstance()).thenReturn(now);


        assertThat(timeTeller.getTime(),is("00:05:00"));
    }
}
