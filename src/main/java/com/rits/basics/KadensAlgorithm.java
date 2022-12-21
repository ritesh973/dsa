package com.rits.basics;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 23/05/22
 */
public class KadensAlgorithm {
    static long maxSubarraySum(int arr[], int n){
        int currentSum = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i <n; i++) {
            if (currentSum >= 0){
                currentSum += arr[i];
            }else {
                currentSum = arr[i];
            }
            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1,2,3,-2,5};

        System.out.println(maxSubarraySum(arr,n));

    }
}
