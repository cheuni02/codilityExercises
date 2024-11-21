package org.cheuni02.exercise1.contest2015;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LongestPasswordTests {
    LongestPassword longestPassword = new LongestPassword();
    String S;

    @Test
    public void evenLettersFollowedByOddDigits() {
        S = "test123 play12345 marvin1234567 codility321";
        assertEquals(13, longestPassword.solution(S));
    }

    @Test
    public void oddLettersFollowedByEvenDigits() {
        S = "tes1234 playing3456 johnathan12345678";
        Exception exception = assertThrows(NoSuchElementException.class, () -> longestPassword.solution(S));
        String expectedExceptionStr = "All passwords are invalid, Get a life mate";
        String actualExceptionStr = exception.getMessage();
        assertEquals(expectedExceptionStr, actualExceptionStr);
    }

    @Test
    public void oddNumbersFollowedByEvenLetters() {
        S = "123test 12345play 1234567marvin 321codility";
        assertEquals(13, longestPassword.solution(S));
    }

    @Test
    public void evenLettersOddDigitsSpecialChars(){
        S = "test123!@£$%^&*()_+ play12345!@£$%^&*()_+  marvin1234567!@£$%^&*()_+  codility321!@£$%^&*()_+ ";
        Exception exception = assertThrows(NoSuchElementException.class, () -> longestPassword.solution(S));
        assertEquals("All passwords are invalid, Get a life mate", exception.getMessage());
    }

    @Test
    public void specialCharsEvenLettersOddDigits(){
        S = "!@£$%^&*()_+test123 !@£$%^&*()_+play12345 !@£$%^&*()_+marvin1234567  !@£$%^&*()_+codility321";
        Exception exception = assertThrows(NoSuchElementException.class, () -> longestPassword.solution(S));
        assertEquals("All passwords are invalid, Get a life mate", exception.getMessage());
    }
}
