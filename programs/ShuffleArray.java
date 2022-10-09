package com.company;

import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];   // mostly applicable even numbers
        for(int i=0;i<arr.length;i++)
            arr[i] = in.nextInt();
        int n = arr.length/2;
        arr = shuffle(arr,n);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int j = 0;
        for(int i=0;i<2*n;i+=2)
        {
            arr[i] = nums[j];
            arr[i+1] = nums[j+n];
            j++;
        }
        return arr;
    }
}
