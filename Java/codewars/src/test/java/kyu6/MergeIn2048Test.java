package kyu6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.example.kyu6.MergeIn2048;
import org.junit.jupiter.api.Test;

public class MergeIn2048Test {
    @Test
    public void sampleTests() {
        assertArrayEquals(new int[] {4,2,0,0}, MergeIn2048.merge(new int[] {2,0,2,2}));
        assertArrayEquals(new int[] {4,4,0,0}, MergeIn2048.merge(new int[] {2,0,2,4}));
        assertArrayEquals(new int[] {4,0,0,0}, MergeIn2048.merge(new int[] {0,0,2,2}));
    }
}