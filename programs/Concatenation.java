package com.company;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= in.nextInt();
        }
        arr = getConcatenation(arr);
        for (int i=0;i<2*n;i++)
            System.out.print(arr[i]+" ");
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
