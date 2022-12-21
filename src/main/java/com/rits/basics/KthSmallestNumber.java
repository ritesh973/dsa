package com.rits.basics;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 01/06/22
 */
public class KthSmallestNumber {
    public static int kthSmallest(int[] arr, int l, int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int n = 6;
        int arr[] = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(kthSmallest(arr,n,k));
    }
}
