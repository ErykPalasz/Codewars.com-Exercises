package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class Exercise5Test {
    @Test
    void Tests() {
        assertEquals("00:00:05", Exercise5.makeReadable(5));
        assertEquals("00:01:00", Exercise5.makeReadable(60));
        assertEquals("23:59:59", Exercise5.makeReadable(86399));
    }
    
    @Test
    void minValue() {
        assertEquals("00:00:00", Exercise5.makeReadable(0));
    }
    
    @Test
    void maxValue() {
        assertEquals("99:59:59", Exercise5.makeReadable(359999));
    }
    
    @Test
    void tooBigValueException() {
        assertThrows(Exception.class, () -> Exercise5.makeReadable(369999));
    }
    
    @Test
    void negativeValueException() {
        assertThrows(Exception.class, () -> Exercise5.makeReadable(-2342));
    }
}
