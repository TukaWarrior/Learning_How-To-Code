package kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.example.kyu6.ValidateCreditCardNumber;

public class ValidateCreditCardNumberTest {

    @Test
    public void Test(){
        assertEquals(false, ValidateCreditCardNumber.Validate("891"));
    }
}