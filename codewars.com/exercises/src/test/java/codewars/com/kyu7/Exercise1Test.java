package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class Exercise1Test {
    @Test
    void excercise1Test() {
        assertEquals(23, new Exercise1().solution(10));
        assertEquals(78, new Exercise1().solution(20));
        assertEquals(9168, new Exercise1().solution(200));
    }
}
