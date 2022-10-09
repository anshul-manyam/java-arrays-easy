package com.company;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int highest = 0;
        int extracandies = in.nextInt();
        boolean[] result = new boolean[n];
        int[] candies = new int[n];
        for(int i=0; i<n; i++)
        {
            candies[i] = in.nextInt();
        }
        for(int i=0; i<candies.length; i++)
        {
            if(highest <= candies[i])
                highest = candies[i];
        }
        for(int i=0; i<n; i++)
        {
            if(candies[i]+extracandies >= highest) // Main Condition
            {
                result[i] = true;
            }
            else
                result[i] = false;
        }

        for(int i=0; i<n; i++)
        {
            System.out.print(" "+result[i]+" ");
        }
    }

}

