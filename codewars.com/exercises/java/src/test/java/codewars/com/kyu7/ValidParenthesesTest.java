package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {
    @Test
    void returnFalseTests() {
        assertFalse(ValidParentheses.validParentheses("(.))"));
        assertFalse(ValidParentheses.validParentheses("IG)4,(LvKL"));
        assertFalse(ValidParentheses.validParentheses("(asd)).("));
        assertFalse(ValidParentheses.validParentheses("(adas))((adasd)"));
        assertFalse(ValidParentheses.validParentheses("(aa))asdasd(((aaa))"));
        assertFalse(ValidParentheses.validParentheses("(dsgdsg))2432"));
    }
    
    @Test
    void returnTrueTests() {
        assertTrue(ValidParentheses.validParentheses("( )"));
        assertTrue(ValidParentheses.validParentheses("()()"));
        assertTrue(ValidParentheses.validParentheses("((s)NE(eZ)8wEYuK+)=4\\Bm"));
        assertTrue(ValidParentheses.validParentheses("32423(sgsdg)"));
        assertTrue(ValidParentheses.validParentheses("adasdasfa"));
    }
}
