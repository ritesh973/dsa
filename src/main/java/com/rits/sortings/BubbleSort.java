package com.rits.sortings;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 20/04/22
 */
public class BubbleSort {
    static void printArray(int [] arr){
        int n = arr.length;
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

    }

    /**
     *
     * @param arr
     */
    static void bubbleSort(int [] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        printArray(arr);

    }
    static void bubbleSortA(int [] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=i;j<n;j++){
                if (arr[i]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }
        }
        printArray(arr);

    }

    public static void main(String[] args) {
        int arr[] = new int[]{2,4,1,6,3,8};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println();
        bubbleSortA(arr);

    }
}
