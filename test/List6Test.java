import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class List6Test {

    @Test
    public void testIsAPalindrome() throws Exception {

        assertTrue(List6.isAPalindrome("aka"));
        assertTrue(List6.isAPalindrome("akka"));
        assertFalse(List6.isAPalindrome("ako"));
        assertFalse(List6.isAPalindrome("ak"));
        assertFalse(List6.isAPalindrome("тест"));
        assertTrue(List6.isAPalindrome("тестсет"));

    }
}