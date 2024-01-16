package kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.kyu6.MultiplesOf3Or5;
import org.junit.jupiter.api.Test;

public class MultiplesOf3Or5Test {

    @Test
    public void test() {
        assertEquals(23, new MultiplesOf3Or5().solution(10));
    }
}