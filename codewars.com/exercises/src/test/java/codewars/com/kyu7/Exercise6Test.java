package codewars.com.kyu7;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class Exercise6Test {
    @Test
    void returnFalseTests() {
        assertFalse(Exercise6.validParentheses("(.))"));
        assertFalse(Exercise6.validParentheses("IG)4,(LvKL"));
        assertFalse(Exercise6.validParentheses("(asd)).("));
        assertFalse(Exercise6.validParentheses("(adas))((adasd)"));
        assertFalse(Exercise6.validParentheses("(aa))asdasd(((aaa))"));
        assertFalse(Exercise6.validParentheses("(dsgdsg))2432"));
    }
    
    @Test
    void returnTrueTests() {
        assertTrue(Exercise6.validParentheses("( )"));
        assertTrue(Exercise6.validParentheses("32423(sgsdg)"));
        assertTrue(Exercise6.validParentheses("adasdasfa"));
    }
}
