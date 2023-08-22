package com.rits.basics;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 10/07/22
 */
public class Sort012 {
    public static void sort012(int a[], int n)
    {
       int count0=0;
       int count1=0;
        for (int data:a) {
            if (data==0)
                count0++;
            if (data == 1)
                count1++;

        }
        for (int i = 0; i < n ; i++) {
            if (count0 > 0){
                a[i]=0;
                count0--;
            }else if (count1 > 0){
                a[i]=1;
                count1--;
            }else{
                a[i]=2;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void dutchFlag(int a[], int n)
    {
        int low=0;
        int current=0;
        int high = a.length-1;

        int temp;
        for (int i = 0; i <n ; i++) {
            if (current <= high) {
                if (a[current] == 0) {
                    temp = a[low];
                    a[low] = a[current];
                    a[current] = temp;
                    low++;
                    current++;
                } else if (a[current] == 2) {
                    temp = a[high];
                    a[high] = a[current];
                    a[current] = temp;
                    high--;
                } else {
                    current++;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int n = 3;
        int arr[]= {2,0,1};
        dutchFlag(arr,n);
    }
}
