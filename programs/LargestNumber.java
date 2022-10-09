package com.company;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {2,7,3,9,4,6,5,1};
        System.out.println("Largest number is "+Largest1(arr));  //Here, two functions use two different approaches
        System.out.println("Largest number is "+Largest2(arr));
    }

    static int Largest1(int[] arr)
    {
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
            if(ans<arr[i])
                ans = arr[i];
        return ans;
    }

    static int Largest2(int[] arr)
    {
        //Here, We first sort array in descending order
        //and then return array of index 0 which returns largest number in array
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

        return arr[0]; //Return largest number in an array
    }
}
