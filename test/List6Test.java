import org.testng.annotations.Test;
import teaching.list.List6;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

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