package codewars.com.kyu7;

/**
 * Write a function that takes a string of parentheses, and determines if the order of the
 * parentheses is valid. The function should return true if the string is valid, and false if it's
 * invalid.
 * ------------------------------
 * Examples:
 * "()" => true
 * ")(()))" => false
 * "(" => false
 * "(())((()())())" => true
 * ------------------------------
 * Constraints
 * 0 <= input.length <= 100
 * ------------------------------
 * Along with opening (() and closing ()) parenthesis, input may contain any valid ASCII characters.
 * Furthermore, the input string may be empty and/or not contain any parentheses at all. Do not
 * treat other forms of brackets as parentheses (e.g. [], {}, <>).
 */

public class ValidParentheses {
    private ValidParentheses() {
        throw new IllegalStateException("Utility class");
    }
    
    private static boolean checkFirst(String parens) {
        return parens.indexOf('(') < parens.indexOf(')');
    }
    
    private static boolean checkLast(String parens) {
        return parens.lastIndexOf('(') < parens.lastIndexOf(')');
    }
    
    private static boolean chceckIsEqualAmount(String parens) {
        long leftParensCount = parens.chars().filter(ch -> ch == '(').count();
        long rightParensCount = parens.chars().filter(ch -> ch == ')').count();
        return leftParensCount == rightParensCount;
    }
    
    private static String trimChars(String parens) {
        return parens.replaceAll("[^()]", "");
    }
    
    private static String trimParensPairs(String parens) {
        return parens.replaceAll("(\\(\\))+", "");
    }
    
    public static boolean validParentheses(String parens) {
        // Put code below
        
        String newParens = trimChars(parens);
        
        if (newParens.equals("")) {
            return true;
        }
        
        boolean itsOK =
                (checkFirst(newParens) && checkLast(newParens) && chceckIsEqualAmount(newParens));
        
        if (itsOK) {
            
            newParens = trimParensPairs(newParens);
            
            return validParentheses(newParens);
            
        } else {
            return false;
        }
    }
}
