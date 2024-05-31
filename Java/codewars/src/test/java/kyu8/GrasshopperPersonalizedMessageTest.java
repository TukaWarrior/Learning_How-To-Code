package kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu8.GrasshopperPersonalizedMessage;

public class GrasshopperPersonalizedMessageTest {
    @Test public void basicTests() {
        assertEquals("Hello boss", GrasshopperPersonalizedMessage.greet("Daniel", "Daniel"), "For inputs \"Daniel\" and \"Daniel\"");
        assertEquals("Hello guest", GrasshopperPersonalizedMessage.greet("Greg", "Daniel"),  "For inputs \"Greg\" and \"Daniel\"");
    }
}