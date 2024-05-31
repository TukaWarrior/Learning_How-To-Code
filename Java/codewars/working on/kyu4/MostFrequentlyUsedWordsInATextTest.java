package kyu4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.example.kyu4.MostFrequentlyUsedWordsInAText;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

public class MostFrequentlyUsedWordsInATextTest {

    @Test @DisplayName("Sample tests")

    void sampleTests() {

        List<String> actual = MostFrequentlyUsedWordsInAText.top3("a a a  b  c c  d d d d  e e e e e");
        assertIterableEquals(Arrays.asList("e", "d", "a"), actual);

        actual = MostFrequentlyUsedWordsInAText.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e");
        assertIterableEquals(Arrays.asList("e", "ddd", "aa"), actual);

        actual = MostFrequentlyUsedWordsInAText.top3("  //wont won't won't ");
        assertIterableEquals(Arrays.asList("won't", "wont"), actual);
        actual = MostFrequentlyUsedWordsInAText.top3("  , e   .. ");
        assertIterableEquals(Arrays.asList("e"), actual);
        actual = MostFrequentlyUsedWordsInAText.top3("  ...  ");
        assertTrue(actual.isEmpty());
        actual = MostFrequentlyUsedWordsInAText.top3("  '  ");
        assertTrue(actual.isEmpty());
        actual = MostFrequentlyUsedWordsInAText.top3("  '''  ");
        assertTrue(actual.isEmpty());
        actual = MostFrequentlyUsedWordsInAText.top3("'a 'A 'a' a'A' a'a'!");
        assertTrue(Arrays.asList(List.of("'a", "a'a'", "'a'"), List.of("a'a'", "'a", "'a'")).contains(actual));
        actual = MostFrequentlyUsedWordsInAText.top3("""
                             In a village of La Mancha, the name of which I have no desire to call to
                             mind, there lived not long since one of those gentlemen that keep a lance
                             in the lance-rack, an old buckler, a lean hack, and a greyhound for
                             coursing. An olla of rather more beef than mutton, a salad on most
                             nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra
                             on Sundays, made away with three-quarters of his income.""");
        assertIterableEquals(Arrays.asList("a", "of", "on"), actual);
    }
}