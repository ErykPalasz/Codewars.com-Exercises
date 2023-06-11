package codewars.com.kyu7;

import java.util.ArrayList;

/**
 * ------------------------------------------------------------------------------------------
 * Count the number of Duplicates
 * Write a function that will return the count of distinct case-insensitive alphabetic characters
 * and numeric digits that occur more than once in the input string. The input string can be assumed
 * to contain only alphabets (both uppercase and lowercase) and numeric digits.
 * 
 * 
 * Example
 * "abcde" -> 0 # no characters repeats more than once
 * "aabbcde" -> 2 # 'a' and 'b'
 * "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times
 * "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 * "aA11" -> 2 # 'a' and '1'
 * "ABBA" -> 2 # 'A' and 'B' each occur twice
 * ------------------------------------------------------------------------------------------
 */
public class CountingDuplicates {
    private CountingDuplicates() {
        throw new IllegalStateException("Utility class");
    }
    
    public static int duplicateCount(String text) {
        // Write your code here
        
        char[] charArr = text.toLowerCase().toCharArray();
        ArrayList<Character> checked = new ArrayList<>();
        
        int repeats = 0;
        
        for (char c : charArr) {
            int i = 0;
            
            if (!checked.contains(c)) {
                checked.add(c);
                
                for (char b : charArr) {
                    if (b == c) {
                        i++;
                    }
                }
            }
            
            if (i > 1) {
                repeats++;
            }
            
        }
        
        return repeats;
    }
}
