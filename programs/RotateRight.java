package com.company;

public class RotateRight {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 3; // No of positions to move right
        System.out.println("Original array:");  // Printing original array
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        // Rotating array towards right
        for(int i=0; i<n; i++)
        {
            int j, last;
            last = arr[arr.length-1];  // Stores last element
            for(j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];  // Shifts array towards right one by one
            }
            arr[j] = last;
        }
        System.out.println();
        // Printing right rotated array
        System.out.println("Right rotated array is ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
