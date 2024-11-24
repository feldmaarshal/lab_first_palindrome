package ru.spbstu.telematics.java;

import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeNumber() {
        assertTrue(PalindromeChecker.isPalindrome("121"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        assertFalse(PalindromeChecker.isPalindrome("123"));
    }

    @Test
    public void testIsPalindromeWithMixedCase() {
        assertTrue(PalindromeChecker.isPalindrome("Radar"));
    }

    @Test
    public void testIsPalindromeWithSpecialCharacters() {
        assertFalse(PalindromeChecker.isPalindrome("Hello!"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }
}

