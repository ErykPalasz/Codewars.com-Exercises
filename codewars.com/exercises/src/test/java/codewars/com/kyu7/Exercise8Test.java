package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Exercise8Test {
    @Test
    void ReturnsZero() {
        assertEquals(0, Exercise8.duplicateCount("abcde"));
    }
    
    @Test
    void ReturnsOne() {
        assertEquals(1, Exercise8.duplicateCount("abcdea"));
        assertEquals(1, Exercise8.duplicateCount("indivisibility"));
        
    }
    
    @Test
    void ReturnsTwo() {
        assertEquals(2, Exercise8.duplicateCount("aabbcde"));
        assertEquals(2, Exercise8.duplicateCount("ABBA"));
        
    }
}
