package com.company;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

import java.util.Locale;

public class SentenceIsPangram {
    static boolean isPangram(String str)
    {
        String lowerstr = str.toLowerCase();
        char ch;
        int[] count = new int[26];
        boolean flag = true;
        for(int i=0; i<lowerstr.length(); i++) {
            ch = lowerstr.charAt(i);

            if (ch == ' ')
                continue;

            if (ch >= 'a' && ch <= 'z') {
                count[ch - 'a']++;
            }
        }

            for(int i=0; i<count.length; i++) {
                if (count[i] == 0) {
                    flag = false;
                    break;
                }
            }

            return flag;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        boolean ans = isPangram(str);
        System.out.println(ans);
    }
}
