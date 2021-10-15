package codewars.com.kyu6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CodewarsStyleRankingSystemTest {
    
    CodewarsStyleRankingSystem user;
    
    @BeforeEach
    void constructorTest() {
        user = new CodewarsStyleRankingSystem();
    }
    
    @Test
    void initialSetupTest() {
        assertEquals(-8, user.getRank());
        assertEquals(0, user.getProgress());
    }
    
    @Test
    void givesTenExp() {
        user.incProgress(-7);
        assertEquals(10, user.getProgress());
    }
    
    @Test
    void givesNinetyExp() {
        user.incProgress(-5);
        assertEquals(90, user.getProgress());
    }
    
    @Test
    void levelsUP() {
        user.incProgress(-4);
        assertEquals(-7, user.getRank());
        assertEquals(60, user.getProgress());
    }
    
    @Test
    void multipleLevels() {
        user.incProgress(3); // 10 ranks up from -8 kyu
        assertEquals(3, user.getRank());
        assertEquals(0, user.getProgress());
    }
    
    @Test
    void activityToLow() {
        user.incProgress(3);
        
        user.incProgress(-1);
        assertEquals(3, user.getRank());
        assertEquals(0, user.getProgress());
        
        user.incProgress(3);
        assertEquals(3, user.getProgress());
        
        user.incProgress(2);
        assertEquals(4, user.getProgress());
        
        user.incProgress(1);
        assertEquals(4, user.getProgress());
        
    }
    
    @Test
    void exceptionTest() {
        assertThrows(Exception.class, () -> user.incProgress(-9));
        assertThrows(Exception.class, () -> user.incProgress(9));
        assertThrows(Exception.class, () -> user.incProgress(0));
    }
}
