package com.rits.sortings;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 19/04/22
 */
public class SelectionSort {


    static void printArray(int [] arr){
        int n = arr.length;
        System.out.print("[");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");

    }
    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            int minIndex = i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        printArray(arr);


    }


    public static void main(String[] args) {
        int arr[] = new int[]{2,4,1,6,3,8};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }
}
