package org.cheuni02.exercise1.contest2015;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LongestPassword {

    public boolean hasOnlyAlphanumerics(String password) {
        String regex = "^[a-zA-Z0-9]+$";
        return password.matches(regex);
    }

    public boolean hasEvenNumOfLetters(String password) {
        String lettersOnly = password.replaceAll("[^a-zA-Z]", "");
        return (lettersOnly.length() % 2 == 0);
    }

    public boolean hasOddNumOfNumbers(String password) {
        String numbersOnly = password.replaceAll("[^0-9]", "");
        if (numbersOnly.isEmpty()) return false;
        return (numbersOnly.length() % 2 == 1);
    }

    public boolean isValidPassword(String password) {
        return hasOnlyAlphanumerics(password) && hasEvenNumOfLetters(password) && hasOddNumOfNumbers(password);
    }

    public int solution(String S) {
        String[] passwords = S.split(" ");
        List<Integer> passwordLengths = new ArrayList<>();
        for (String password : passwords) {
            if (!isValidPassword(password)) {
                continue;
            }
            passwordLengths.add(password.length());
        }
        try {
            return passwordLengths.stream().max(Integer::compareTo).get();
        } catch (Exception e) {
            throw new NoSuchElementException("All passwords are invalid, Get a life mate");
        }
    }

    public static void main(String[] args) {
        String S = "!@£$%^&*()_+test123 !@£$%^&*()_+play12345 !@£$%^&*()_+marvin1234567  !@£$%^&*()_+codility321";
        System.out.println(new LongestPassword().solution(S));
    }
}
