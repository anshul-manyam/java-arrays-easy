package com.company;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 2, 3, 3, 4, 4};
        int[] fr = new int[arr.length];
        // This array is used to represent no.of times that number occured in array = arr
        int visited = -1;

        for(int i=0; i<arr.length; i++)
        {
            int count = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j]) {
                    count++;
                    fr[j] = visited;  // To avoid counting same element again
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        System.out.println("Element   Frequency");
        for(int i=0; i<fr.length; i++)
        {
            if(fr[i]!= visited)
            {
                System.out.println(arr[i]+"       "+fr[i]);
            }
        }
    }

}
