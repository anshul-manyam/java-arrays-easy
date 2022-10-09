package com.company;

public class EvenPositionsOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        //Original array
        System.out.println("Original array is ");
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        //Printing Even Positions of the array
        System.out.println("Even position elements of array are ");
        for(int i=1; i<arr.length; i+=2)  // Here i=1 because in array index value starts from 0 hence
            System.out.print(arr[i]+" "); // in array if index is odd then they are even positions

        /*
        For printing "Odd" positions of array
        for(int i=0; i<arr.length; i+=2)
            System.out.print(arr[i]+" ");
         */
    }
}
