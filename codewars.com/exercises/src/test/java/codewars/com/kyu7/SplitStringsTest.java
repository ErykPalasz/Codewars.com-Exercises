package codewars.com.kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

class SplitStringsTest {
    @Test
    void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("[ab, cd, ef]", Arrays.toString(SplitStrings.solution(s)));
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(SplitStrings.solution(s1)));
    }
    
    @Test
    void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("[ab, cd, e_]", Arrays.toString(SplitStrings.solution(s)));
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(SplitStrings.solution(s1)));
    }
}
