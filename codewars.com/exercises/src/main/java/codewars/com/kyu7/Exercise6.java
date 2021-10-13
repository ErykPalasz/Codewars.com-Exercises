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

public class Exercise6 {
    private Exercise6() {
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
    
    private static boolean checkIfNoParensInString(String parens) {
        long leftParensCount = parens.chars().filter(ch -> ch == '(').count();
        long rightParensCount = parens.chars().filter(ch -> ch == ')').count();
        return leftParensCount + rightParensCount == 0;
    }
    
    private static String stripFirst(String parens, char ch) {
        return parens.substring(0, parens.indexOf(ch)) + ' '
                + parens.substring(parens.indexOf(ch) + 1);
    }
    
    private static String stripLast(String parens, char ch) {
        return parens.substring(0, parens.lastIndexOf(ch)) + ' '
                + parens.substring(parens.lastIndexOf(ch) + 1);
    }
    
    private static String stripMarginal(String parens) {
        parens = stripFirst(parens, '(');
        parens = stripLast(parens, ')');
        return parens;
    }
    
    public static boolean validParentheses(String parens) {
        // Put code below
        
        if (checkIfNoParensInString(parens)) {
            return true;
        }
        
        boolean goAgain = (checkFirst(parens) && checkLast(parens) && chceckIsEqualAmount(parens));
        
        if (goAgain) {
            // strip '(' ...... ')'
            String newParens = stripMarginal(parens);
            
            if (checkIfNoParensInString(newParens)) {
                return true;
            }
            
            // strip ')' .......
            if (!checkFirst(newParens)) {
                newParens = stripFirst(newParens, ')');
            }
            // strip ...... '('
            if (!checkLast(parens)) {
                newParens = stripLast(newParens, '(');
            }
            
            return validParentheses(newParens);
            
        } else {
            return false;
        }
    }
}
