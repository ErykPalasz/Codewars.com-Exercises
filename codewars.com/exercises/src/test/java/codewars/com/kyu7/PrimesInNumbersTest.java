package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class PrimesInNumbersTest {
    @Test
    void testPrimeDecompOne() {
        assertEquals("(2**2)(3**3)(5)(7)(11**2)(17)", PrimesInNumbers.factors(7775460));
        assertEquals("(2**5)(5)(7**2)(11)", PrimesInNumbers.factors(86240));
    }
}
