package com.company;
// Program to print third largest number in array
public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Third largest number is "+ThirdLargest(arr));
    }

    static int ThirdLargest(int[] arr)         // Here you first sort array in descending order
    {                                          // and then return 3rd index of array
        int temp;                              // which is third largest number in array
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
        return arr[2];
        /*
        OR
        you can also do this program using array libraries
        Arrays.sort(a);
        return a[total-3]   Here, "total" is array length
         */
    }
}
