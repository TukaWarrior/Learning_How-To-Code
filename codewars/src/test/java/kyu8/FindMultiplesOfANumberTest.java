package kyu8;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu8.FindMultiplesOfANumber;
public class FindMultiplesOfANumberTest {

    @Test
    void testExamples() {
        assertArrayEquals(new int[] { 5, 10, 15, 20, 25 }, FindMultiplesOfANumber.find(5, 25), "Testing for base=5 and limit=25");
        assertArrayEquals(new int[] { 1, 2 }, FindMultiplesOfANumber.find(1, 2), "Testing for base=1 and limit=2");
        assertArrayEquals(new int[] { 5 }, FindMultiplesOfANumber.find(5, 7), "Testing for base=5 and limit=7");
        assertArrayEquals(new int[] { 4, 8, 12, 16, 20, 24 }, FindMultiplesOfANumber.find(4, 27), "Testing for base=4 and limit=27");
        assertArrayEquals(new int[] { 11, 22, 33, 44 }, FindMultiplesOfANumber.find(11, 54), "Testing for base=11 and limit=54");
    }
}