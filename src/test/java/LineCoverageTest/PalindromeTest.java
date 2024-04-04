package LineCoverageTest;

import Exo.Palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void PalindromeString() {
        assertTrue(Palindrome.isPalindrome("racecar"));
    }

    @Test
    void NonPalindromeString() {
        assertFalse(Palindrome.isPalindrome("hello world"));
   }

    @Test
    void NullString() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> Palindrome.isPalindrome(null)
        );
        assertEquals("String must not be null", exception.getMessage());
    }

}