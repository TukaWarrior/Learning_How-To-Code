package kyu6;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.example.kyu6.MultiplicationTable;
import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @Test
    void test3() {
        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        assertArrayEquals(test, MultiplicationTable.multiplicationTable(3));
    }

    @Test
    void test1(){
        int[][] test1 = {{1}};
        assertArrayEquals(test1, MultiplicationTable.multiplicationTable(1));
    }
}