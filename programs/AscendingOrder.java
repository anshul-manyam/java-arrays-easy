package com.company;

public class AscendingOrder {
    public static void main(String[] args) {
        int[] arr = {1,8,7,4,3,2,1};
        int temp;  // or you can take it as "int temp=0;"
        System.out.println("Original array is:");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])      // Logic for creating sorted array in ascending order
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        // Printing a sorted array
        System.out.println("Sorted ascending order array is:");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
