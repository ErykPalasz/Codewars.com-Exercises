package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TribonacciSequenceTest {
    private TribonacciSequence variabonacci;
    
    @BeforeEach
    void setUp() throws Exception {
        variabonacci = new TribonacciSequence();
    }
    
    @AfterEach
    void tearDown() throws Exception {
        variabonacci = null;
    }
    
    private double precision = 1e-10;
    
    @Test
    void sampleTests() {
        assertArrayEquals(new double[] {1, 1, 1, 3, 5, 9, 17, 31, 57, 105},
                variabonacci.tribonacci(new double[] {1, 1, 1}, 10), precision);
        
        assertArrayEquals(new double[] {0, 0, 1, 1, 2, 4, 7, 13, 24, 44},
                variabonacci.tribonacci(new double[] {0, 0, 1}, 10), precision);
        
        assertArrayEquals(new double[] {0, 1, 1, 2, 4, 7, 13, 24, 44, 81},
                variabonacci.tribonacci(new double[] {0, 1, 1}, 10), precision);
    }
    
    @Test
    void shortTests() {
        assertArrayEquals(new double[] {2, 3, 4},
                variabonacci.tribonacci(new double[] {2, 3, 4}, 3), precision);
        
        assertArrayEquals(new double[] {2, 3}, variabonacci.tribonacci(new double[] {2, 3}, 2),
                precision);
        
    }
    
    @Test
    void zeroLenghtTest() {
        assertArrayEquals(new double[] {}, variabonacci.tribonacci(new double[] {2, 3, 4}, 0),
                precision);
        
    }
    
    @Test
    void negativeTest() {
        assertThrows(NegativeArraySizeException.class,
                () -> variabonacci.tribonacci(new double[] {2, 3, 4}, -3),
                "Expected to throw negative number exception");
        
    }
}
