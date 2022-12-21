package com.rits.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 25/05/22
 */
public class MinimizeTheHeight {
    static int getMinDiff(int[] arr, int n, int k) {
        int min=0,max=0,r=0;
        Arrays.sort(arr);
        r = arr[arr.length-1] - arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                max = Math.max(arr[i - 1] + k, arr[n - 1] - k);
                min = Math.min(arr[i] - k, arr[0] + k);
                r = Math.min(r, max - min);
            }else {
                continue;
            }
        }
        return r;
        // code here
    }
    public static void main(String[] args) {

        int k = 5, n = 10;
        int arr[] = {2, 6, 3 ,4, 7, 2, 10, 3, 2, 1};
        System.out.println(getMinDiff(arr,n,k));
    }

}
