package com.rits.sortings;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 18/04/22
 */
public class MergeSort {

    public static int[] mSort(int[] arr,int l, int r){
        if(l<r){
            int m = (l+r)/2;
            mSort(arr,l,m);
            mSort(arr,m+1,r);
            merge(arr,l,m,r);

        }
        return arr;
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int s1= m-l+1;
        int s2 = r-m;

        int left[] = new int[s1];
        int right[] = new int[s2];

        for (int i=0;i<s1;i++){
            left[i]= arr[i+1];
        }
        for (int j=0;j<s2;j++){
            right[j]= arr[m+1+j];
        }
        int i=0;
        int j=0;
        int k=l;
       while(i<s1 && j<s2){
           if (left[i]<=right[j]){
               arr[k] = left[i];
               i++;
           }else {
               arr[k]= right[j];
               j++;
           }
           k++;
       }
       while (i<s1){
           arr[k] = left[i];
           k++;
           i++;
       }
        while (j<s2){
            arr[k] = right[j];
            k++;
            j++;
        }

    }

    public static void main(String[] args) {
        int data[] = new int[]{3,2,4,5,6,1,7};
        int[] ints = mSort(data, 0, 6);
        System.out.println(Arrays.toString(ints));

    }

}
