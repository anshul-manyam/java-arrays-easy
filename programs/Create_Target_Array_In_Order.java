package com.company;

//https://leetcode.com/problems/create-target-array-in-the-given-order/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Create_Target_Array_In_Order {
    static int[] CreateTargetArray(int[] arr, int[] indexs)
    {
        int[] target = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++)
            list.add(indexs[i], arr[i]);
         for(int i=0; i<arr.length; i++)
             target[i] = list.get(i);

         return target;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] indexs = {0, 0, 2, 3, 4};
        int[] ans = CreateTargetArray(arr, indexs);
        System.out.println(Arrays.toString(ans));
    }
}
