package com.company;

import java.util.Scanner;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j] = in.nextInt();
            }
            System.out.println();
        }
        int maxi = 0;
        Wealth(arr,maxi);


    }
    public static void Wealth(int[][] accounts, int maxi)
    {
        // or you can write Integer.MIN_VALUE (takes value of mini value)
        for(int i=0;i< accounts.length;i++)
        {
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++)
                sum+=accounts[i][j];
            maxi = Math.max(maxi,sum);
        }
        System.out.println(maxi);
    }
}
