package kyu8;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import com.example.kyu8.TheFeastOfManyBeasts;

public class TheFeastOfManyBeastsTest {

        @Test
    public void fixedTest() {
         assertTrue(TheFeastOfManyBeasts.feast("great blue heron","garlic nann"));
         assertTrue(TheFeastOfManyBeasts.feast("chickadee","chocolate cake"));
         assertFalse(TheFeastOfManyBeasts.feast("brown bear","bear claw"));
    }
}