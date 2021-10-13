package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CreditCardMaskTest {
    @Test
    void maskifyTest() {
        assertEquals("############5616", CreditCardMask.maskify("4556364607935616"));
        assertEquals("#######5616", CreditCardMask.maskify("64607935616"));
        assertEquals("four", CreditCardMask.maskify("four"));
        assertEquals("#ive!", CreditCardMask.maskify("five!"));
        assertEquals("1", CreditCardMask.maskify("1"));
        assertEquals("", CreditCardMask.maskify(""));
        
        // "What was the name of your first pet?"
        assertEquals("##ippy", CreditCardMask.maskify("Skippy"));
        assertEquals("####################################man!",
                CreditCardMask.maskify("Nananananananananananananananana Batman!"));
    }
}
