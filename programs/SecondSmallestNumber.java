package com.company;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {4,5,3,2,8,9,7,6};
        System.out.println("Second smallest number is "+SecondSmallest(arr));
    }

    static int SecondSmallest(int[] arr)
    {
        //Here, We first sort array in ascending order
        // and then return 1st index which gives 2nd smallest number
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j< arr.length; j++)
            {
                if(arr[i]>arr[j])  // Sorting in ascending order
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[1];// Returns second smallest number
    }
}
