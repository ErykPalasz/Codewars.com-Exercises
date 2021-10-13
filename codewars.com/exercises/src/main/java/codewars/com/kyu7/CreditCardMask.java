package codewars.com.kyu7;

/**
 * Usually when you buy something, you're asked whether your credit card number,
 * phone number or answer to your most secret question is still correct.
 * However, since someone could look over your shoulder, you don't want that
 * shown on your screen. Instead, we mask it.
 * 
 * Your task is to write a function maskify, which changes all but the last four
 * characters into '#'.
 */

public class CreditCardMask {
    private CreditCardMask() {
        throw new IllegalStateException("Utility class");
    }
    
    public static String maskify(String str) {
        String mask = "";
        int four = 4;
        
        if (str.length() < four) {
            return str;
        } else {
            
            for (int i = 0; i < str.length() - four; i++) {
                mask = mask.concat("#");
            }
            
            mask = mask.concat(str.substring(str.length() - four, str.length()));
            
            return mask;
            
        }
        
    }
    
}
