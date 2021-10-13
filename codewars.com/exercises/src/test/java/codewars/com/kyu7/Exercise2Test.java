package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Exercise2Test {
    @Test
    void maskifyTest() {
        assertEquals("############5616", Exercise2.maskify("4556364607935616"));
        assertEquals("#######5616", Exercise2.maskify("64607935616"));
        assertEquals("four", Exercise2.maskify("four"));
        assertEquals("#ive!", Exercise2.maskify("five!"));
        assertEquals("1", Exercise2.maskify("1"));
        assertEquals("", Exercise2.maskify(""));
        
        // "What was the name of your first pet?"
        assertEquals("##ippy", Exercise2.maskify("Skippy"));
        assertEquals("####################################man!",
                Exercise2.maskify("Nananananananananananananananana Batman!"));
    }
}
