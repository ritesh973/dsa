package com.rits.sortings;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 17/04/22
 */
public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        for (int j = 1; j<arr.length;j++){
            int key = arr[j];
            int i = j-1;
            while (i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;

        }
        return arr;
    }

    public static void main(String[] args) {
        int unsorted[] = new int[]{5,2,4,6,1,3};
        System.out.println(Arrays.toString(unsorted));
        int sorted[] = insertionSort(unsorted);
        System.out.println("sorted");
        System.out.println(Arrays.toString(sorted));


    }
}
