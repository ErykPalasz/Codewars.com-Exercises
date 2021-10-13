package codewars.com.kyu7;

/**
 * Write a function, which takes a non-negative integer (seconds) as input and returns the time in a
 * human-readable format (HH:MM:SS)
 * 
 * HH = hours, padded to 2 digits, range: 00 - 99
 * MM = minutes, padded to 2 digits, range: 00 - 59
 * SS = seconds, padded to 2 digits, range: 00 - 59
 * 
 * The maximum time never exceeds 359999 (99:59:59)
 */

public class Exercise5 {
    private Exercise5() {
        throw new IllegalStateException("Utility class");
    }
    
    public static String makeReadable(int seconds) {
        // Do something
        if (seconds > 359999) {
            throw new ArithmeticException("Too big input value! Value should not exceed 359999");
        }
        if (seconds < 0) {
            throw new ArithmeticException("Negative input!");
        }
        
        int secondsInMin = 60;
        int secondsInHour = secondsInMin * 60;
        
        int hours = seconds / secondsInHour;
        int mins = (seconds % secondsInHour) / secondsInMin;
        int sec = seconds % secondsInMin;
        
        return String.format("%02d:%02d:%02d", hours, mins, sec);
    }
}
