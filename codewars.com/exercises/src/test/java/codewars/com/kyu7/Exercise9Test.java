package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Exercise9Test {
    @Test
    void testPrimeDecompOne() {
        assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", Exercise9.factors(7775460));
        assertEquals("(2**5)(5)(7**2)(11)", Exercise9.factors(86240));
    }
}
