package com.company;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // Printing Original array
        System.out.println("Original array is ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //Printing array in reverse order
        System.out.println("Reverse of array is ");
        for(int i=arr.length-1; i>=0; i--)
            System.out.print(arr[i]+" ");
    }
}
