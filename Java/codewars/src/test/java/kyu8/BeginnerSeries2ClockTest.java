package kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu8.BeginnerSeries2Clock;

public class BeginnerSeries2ClockTest {

    @Test    
    public void test1(){
        assertEquals(61000, BeginnerSeries2Clock.Past(0,1,1));
    }
}