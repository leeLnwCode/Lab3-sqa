package sqa.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShiftCipherTest {

    @Test
    public void testTC01_ValidUpperCase() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("ZVMADHYL", cipher.shift("SOFTWARE", 3));
    }

    @Test
    public void testTC02_ValidLowerCase() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("zvmadhyl", cipher.shift("software", 3));
    }

    @Test
    public void testTC03_PositiveMixInput() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("Khoor2026", cipher.shift("Hello2026", 3));
    }

    @Test
    public void testTC04_NegativeKeyInvalid() {
        ShiftCipher cipher = new ShiftCipher();
        assertEquals("invalid", cipher.shift("ABC", -5)); 
    }
}