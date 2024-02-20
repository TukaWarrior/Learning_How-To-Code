package kyu7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu7.AlternateCapitalization;

public class AlternateCapitalizationTest {
    
    @Test
    public void basicTests(){
        assertArrayEquals(new String[]{"AbCdEf", "aBcDeF"}, AlternateCapitalization.capitalize("abcdef"));
        assertArrayEquals(new String[]{"CoDeWaRs", "cOdEwArS"}, AlternateCapitalization.capitalize("codewars"));
        assertArrayEquals(new String[]{"AbRaCaDaBrA", "aBrAcAdAbRa"}, AlternateCapitalization.capitalize("abracadabra"));
        assertArrayEquals(new String[]{"CoDeWaRrIoRs", "cOdEwArRiOrS"}, AlternateCapitalization.capitalize("codewarriors"));
    }
}