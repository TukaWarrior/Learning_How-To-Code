package kyu6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu6.DifferenceOf2;

public class DifferenceOf2Test {
    @Test
    public void sample_tests() {
        assertArrayEquals(
                new int[][]{{1, 3}, {2, 4}},
                DifferenceOf2.twosDifference(new int[]{1, 2, 3, 4})
        );

        assertArrayEquals(
                new int[][]{{1, 3}, {4, 6}},
                DifferenceOf2.twosDifference(new int[]{1, 3, 4, 6})
        );
    }
}