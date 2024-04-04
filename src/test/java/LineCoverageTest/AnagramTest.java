package LineCoverageTest;

import Exo.Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArgnagramTest {

    @Test
    void ArgnagramStrings() {
        assertTrue(Anagram.isAnagram("cat", "tac"));
    }

    @Test
    void NonArgnagramStringsWithSameLenght() {
        assertFalse(Anagram.isAnagram("dog", "cat"));
    }

    @Test
    void NullString() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> Anagram.isAnagram(null, null)
        );
        assertEquals("Strings must not be null", exception.getMessage());
    }
    @Test
    void NonArgnagramStringsWithoutSameLenght() {
        assertFalse(Anagram.isAnagram("took", "tok"));
    }

    @Test
    void NullString2() {
        NullPointerException exception = assertThrows(
                NullPointerException.class,
                () -> Anagram.isAnagram("null", null)
        );
        assertEquals("Strings must not be null", exception.getMessage());
    }
}