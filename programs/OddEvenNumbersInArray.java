package com.company;

public class OddEvenNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int length = arr.length;
        System.out.println("Original array is ");
        for(int i=0; i<length; i++)
            System.out.print(arr[i]+" ");

        System.out.println();

        //Printing odd numbers in array
        System.out.println("Odd numbers in array are ");
        for(int i=0; i<length; i++)
            if(arr[i]%2 != 0)
                System.out.print(arr[i]+" ");

        System.out.println();

        //Printing even numbers in array
        System.out.println("Even numbers in array are ");
        for(int i=0; i<length; i++)
            if(arr[i]%2 == 0)
                System.out.print(arr[i]+" ");
    }

}
