package com.company;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {2,7,4,9,3,8,1};
        System.out.println("Smallest number is "+Smallest1(arr));   // Here, two functions use two different approaches
        System.out.println("Smallest number is "+Smallest2(arr));
    }

    static int Smallest1(int[] arr)
    {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++)
            if(ans>arr[i])
                ans = arr[i];
        return ans;
    }

    static int Smallest2(int[] arr)
    {
        //Here, we first sort array in ascending order
        // and return array of index 0, which smallest number in array
        int temp;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr[0]; // It return smallest number in array
    }
}
