package codewars.com.kyu7;

/**
 * Complete the solution so that it splits the string into pairs of two characters. If the string
 * contains an odd number of characters then it should replace the missing second character of the
 * final pair with an underscore ('_').
 * 
 */

public class Exercise7 {
    private Exercise7() {
        throw new IllegalStateException("Utility class");
    }
    
    public static String[] solution(String s) {
        // Write your code here
        if (s.length() % 2 != 0) {
            s = s.concat("_");
        }
        
        String[] arrayOfStrings = new String[s.length() / 2];
        
        int counter = 0;
        
        for (int i = 0; i < arrayOfStrings.length; i++) {
            arrayOfStrings[i] = "";
            for (int j = 0; j < 2; j++) {
                arrayOfStrings[i] += Character.toString(s.charAt(counter++));
            }
        }
        
        return arrayOfStrings;
    }
}
