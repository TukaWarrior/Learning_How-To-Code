package kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu7.GreatestCommonDivisorBitcount;

public class GreatestCommonDivisorBitcountTest {

    @Test
    public void doTest() {
        assertEquals(6, GreatestCommonDivisorBitcount.gcdBinary(666666,333111)); 
        assertEquals(1, GreatestCommonDivisorBitcount.gcdBinary(545034,5));
        assertEquals(0, GreatestCommonDivisorBitcount.gcdBinary(0,0));
        assertEquals(14, GreatestCommonDivisorBitcount.gcdBinary(0,76899299));
        assertEquals(1, GreatestCommonDivisorBitcount.gcdBinary(-124, -16));
    }
}