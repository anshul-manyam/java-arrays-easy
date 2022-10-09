package com.company;

import java.util.Scanner;

public class Numbers_Smaller_Than_Current_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //size of array
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i] = in.nextInt();
        arr = smallerNumberThanCurrent(arr);
        for(int i=0;i< arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static int[] smallerNumberThanCurrent(int[] nums)
    {
        int[] arr = new int[nums.length];
        for(int i=0;i< nums.length;i++)
        {
            int count = 0;
            for(int j=0;j< nums.length;j++)
            {
                if(i!=j&&nums[i]>nums[j])
                    count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}
