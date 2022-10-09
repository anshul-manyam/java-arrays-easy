package com.company;

// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

import java.util.Scanner;

public class pangram {

    static boolean pangram(String sentence)
    {
        String toLower = sentence.toLowerCase();
        int[] count = new int[26];
        char ch;

        for(int i=0; i<toLower.length(); i++)
        {
            ch = toLower.charAt(i);
            if (ch == ' ')
            {
                continue;
            }
            else if(ch>='a' && ch<='z')
                count[ch - 'a']++;
        }

        for(int i=0; i< count.length; i++)
        {
            if(count[i]==0)
            {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        boolean ans =  pangram(sentence);
        System.out.println(ans);
    }
}
