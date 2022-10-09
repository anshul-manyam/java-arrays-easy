package com.company;

import java.util.Scanner;

public class SumInArray {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = in.nextInt();
        }
        arr = runningSum(arr);
        for (int j : arr) System.out.print(j + " ");//enhanced "for" by alt+enter
    }
    public static int[] runningSum(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
