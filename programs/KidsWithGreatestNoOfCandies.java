package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Boolean;

public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        int extra = in.nextInt();
        List<Boolean> ans = KidsWithCandies(arr,extra);
        System.out.print(ans+" ");
    }


    public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies)
    {
        List<Boolean> result = new ArrayList<>();
        int highiest = 0;
        for(int i=0;i<candies.length;i++)
        {
            if(highiest<=candies[i])
                highiest = candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=highiest)
                result.add(i,true);
            else
                result.add(i,false);
        }
        return result;
    }
}
