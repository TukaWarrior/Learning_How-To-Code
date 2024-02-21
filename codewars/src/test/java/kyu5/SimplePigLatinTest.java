package kyu5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu5.SimplePigLatin;

public class SimplePigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", SimplePigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
    }
}