package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class HumanReadableTimeTest {
    @Test
    void Tests() {
        assertEquals("00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("23:59:59", HumanReadableTime.makeReadable(86399));
    }
    
    @Test
    void minValue() {
        assertEquals("00:00:00", HumanReadableTime.makeReadable(0));
    }
    
    @Test
    void maxValue() {
        assertEquals("99:59:59", HumanReadableTime.makeReadable(359999));
    }
    
    @Test
    void tooBigValueException() {
        assertThrows(Exception.class, () -> HumanReadableTime.makeReadable(369999));
    }
    
    @Test
    void negativeValueException() {
        assertThrows(Exception.class, () -> HumanReadableTime.makeReadable(-2342));
    }
}
