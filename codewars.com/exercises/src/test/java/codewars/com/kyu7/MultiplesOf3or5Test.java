package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class MultiplesOf3or5Test {
    @Test
    void multiplesTest() {
        assertEquals(23, new MultiplesOf3or5().solution(10));
        assertEquals(78, new MultiplesOf3or5().solution(20));
        assertEquals(9168, new MultiplesOf3or5().solution(200));
    }
}
