package kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu7.LeapYears;

public class LeapYearsTest {
    @Test
    public void testYear2020(){
    assertEquals(true, LeapYears.isLeapYear(2020));
    }
  
    @Test
    public void testYear2000() {
    assertEquals(true, LeapYears.isLeapYear(2000));
    }
  
    @Test
    public void testYear2015() {
        assertEquals(false, LeapYears.isLeapYear(2015));
    }
    
    @Test
    public void testYear2100() {
        assertEquals(false, LeapYears.isLeapYear(2100));
    }
}