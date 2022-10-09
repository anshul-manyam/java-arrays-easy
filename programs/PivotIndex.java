package com.company;

// https://leetcode.com/problems/find-pivot-index/

public class PivotIndex {
    // pivot index means from were the left and right half sum are equal
    static int pivot_index(int[] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
            sum+=arr[i];

        int lsum = 0;
        int rsum = sum;

        for(int i=0; i<arr.length; i++)
        {
            rsum = rsum - arr[i];
            if(rsum == lsum)
                return i;
            lsum = lsum + arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        System.out.println(pivot_index(arr)); // this statement prints the index at which pivot is present
    }
}
