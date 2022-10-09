package com.company;

import java.util.Arrays;

public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3;  // No of times array should be rotated
        System.out.println("Original array is ");
        System.out.print(Arrays.toString(arr));

        for(int i=0; i<n; i++)
        {
            int first = arr[0];
            int j;
            for(j=0; j< arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        System.out.println();

        //Printing left rotated array
        System.out.println("Left Rotated string is ");
        System.out.println(Arrays.toString(arr));

    }
}
