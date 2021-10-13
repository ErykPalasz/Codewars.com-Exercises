package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Exercise4Test {
    // private Exercise4 odeven;
    
    // @BeforeEach
    // void setUp() throws Exception {
    // odeven = new Exercise4();
    // }
    
    // @AfterEach
    // void tearDown() throws Exception {
    // odeven = null;
    // }
    
    @Test
    void exampleTests() {
        assertEquals("odd", Exercise4.oddOrEven(new int[] {2, 5, 34, 6}));
        assertEquals("even", Exercise4.oddOrEven(new int[] {2, 5, 34, 3}));
    }
    
    @Test
    void zeroSumTest() {
        assertEquals("even", Exercise4.oddOrEven(new int[] {2, -2}));
    }
    
    @Test
    void emptyInputTest() {
        assertEquals("even", Exercise4.oddOrEven(new int[] {}));
    }
    
    @Test
    void allNegativeInts() {
        assertEquals("odd", Exercise4.oddOrEven(new int[] {-1, -3, -11}));
    }
}
