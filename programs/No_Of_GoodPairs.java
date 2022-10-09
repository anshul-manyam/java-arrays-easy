package com.company;

import java.util.Scanner;

public class No_Of_GoodPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  //size of array
        int[] arr = new int[n];
        for (int i=0;i< arr.length;i++)  // loop for inputting array
            arr[i] = in.nextInt();
        int ans = numIdenticalPairs(arr);
        System.out.print(ans);
    }

    public static int numIdenticalPairs(int[] nums)
    {
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    count++;
            }
        }
        return count;
    }
}
