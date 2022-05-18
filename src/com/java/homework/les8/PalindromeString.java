package com.java.homework.les8;

import com.java.common.ConsoleUtils;

import java.io.IOException;

public class PalindromeString {
    public static void main(String[] args) throws IOException {
        String str = ConsoleUtils.READER.readLine();
        String string = str.toLowerCase();
        string = string.replaceAll("\\s*", "");

         isPalindrome(string);
        boolean suitcase = isPalindrome(string);

        String message = suitcase ? "Не паліндром" : "Паліндром";

        System.out.println(message);

    }
    static boolean isPalindrome(String string) {
        int n = string.length();
        for (int i = 0; i < (n/2); ++i) {
            if (string.charAt(i) != string.charAt(n - i - 1)) {
                return true;
            }

        }
        return false;



    }

}
