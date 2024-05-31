package kyu7;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.example.e02_SmoothNumbers;

public class SmoothNumbersTest {
    @Test
    public void BasicTests() {
        assertEquals("power of 2"    , e02_SmoothNumbers.isSmooth(  16));
        assertEquals("3-smooth"      , e02_SmoothNumbers.isSmooth(  36));
        assertEquals("Hamming number", e02_SmoothNumbers.isSmooth(  60));
        assertEquals("humble number" , e02_SmoothNumbers.isSmooth(  98));
        assertEquals("non-smooth"    , e02_SmoothNumbers.isSmooth( 111));
        assertEquals("power of 2"    , e02_SmoothNumbers.isSmooth(4096));
        assertEquals("3-smooth"      , e02_SmoothNumbers.isSmooth( 729));
        assertEquals("Hamming number", e02_SmoothNumbers.isSmooth(3125));
        assertEquals("humble number" , e02_SmoothNumbers.isSmooth(   7));
        assertEquals("non-smooth"    , e02_SmoothNumbers.isSmooth(  17));
    }
}