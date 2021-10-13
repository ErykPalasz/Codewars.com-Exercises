package codewars.com.kyu7;

/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a
 * string with the following form :
 * 
 * "(p1**n1)(p2**n2)...(pk**nk)"
 * 
 * 
 * 
 * with the p(i) in increasing order and n(i) empty if n(i) is 1.
 * 
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 * 
 */

public class Exercise9 {
    
    private Exercise9() {
        throw new IllegalStateException("Utility class");
    }
    
    public static String factors(int numbertofactor) {
        // your code
        
        StringBuilder result = new StringBuilder();
        
        for (int factor = 2; factor <= numbertofactor; factor++) {
            int counter = 0;
            
            while (numbertofactor % factor == 0) {
                counter += 1;
                numbertofactor /= factor;
            }
            
            if (counter > 0) {
                
                result.append("(");
                result.append(factor);
                if (counter > 1) {
                    result.append("**");
                    result.append(counter);
                }
                result.append(")");
                
            }
            
        }
        
        return result.toString();
    }
}
