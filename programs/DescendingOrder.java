package com.company;

public class DescendingOrder {
    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 7, 5, 10, 1};
        int temp;
        // Printing Original array
        System.out.println("Original array is:");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        // Logic for sorting array in descending order
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        //Printing sorted descending order array
        System.out.println("Descending ordered array is:");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}
