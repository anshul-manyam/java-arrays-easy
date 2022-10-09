package com.company;

// https://leetcode.com/problems/flipping-an-image/submissions/

public class FlipAndInvertImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++)
        {
            for(int j=0, k=image.length-1; j<=k; j++, k--)
            {
                int temp = image[i][j];
                image[i][j] = Math.abs(image[i][k] - 1);
                image[i][k] = Math.abs(temp - 1);
            }
        }
        return image;
    }



    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ans = flipAndInvertImage(arr);
        for(int i=0; i<arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(ans[i][j]);
            System.out.print("  ");
        }
    }
}
