package com.company;
// Program to print Second largest number
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Second largest number is "+SecondLargest(arr));
    }

    static int SecondLargest(int[] arr)
    {
        //Here, we first sort the array in descending order
        // and then we return 2nd index to main class which is second largest number
        int temp;
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
        return arr[1]; // In array index.no 1 contains second largest number when array is sorted in descending order
    }
}
