package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        arr = buildArray(arr);
        for (int i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
