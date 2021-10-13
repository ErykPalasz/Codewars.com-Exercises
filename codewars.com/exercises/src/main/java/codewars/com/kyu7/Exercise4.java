package codewars.com.kyu7;

/**
 * Task:
 * 
 * Given a list of integers, determine whether the sum of its elements is odd or even.
 * 
 * Give your answer as a string matching "odd" or "even".
 * 
 * If the input array is empty consider it as: [0] (array with a zero).
 * 
 * 
 * Examples:
 * 
 * Input: [0] Output: "even"
 * 
 * Input: [0, 1, 4] Output: "odd"
 * 
 * Input: [0, -1, -5] Output: "even"
 */

public class Exercise4 {
    private Exercise4() {
        throw new IllegalStateException("Utility class");
    }
    
    public static String oddOrEven(int[] array) {
        // your code
        
        int sum = 0;
        
        if (array.length < 1)
            return "even";
        
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        if (sum == 0)
            return "even";
        if (sum % 2 == 0)
            return "even";
        return "odd";
    }
}
