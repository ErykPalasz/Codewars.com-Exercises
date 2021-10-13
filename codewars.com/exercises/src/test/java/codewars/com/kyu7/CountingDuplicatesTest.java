package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CountingDuplicatesTest {
    @Test
    void ReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }
    
    @Test
    void ReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
        
    }
    
    @Test
    void ReturnsTwo() {
        assertEquals(2, CountingDuplicates.duplicateCount("aabbcde"));
        assertEquals(2, CountingDuplicates.duplicateCount("ABBA"));
        
    }
}
