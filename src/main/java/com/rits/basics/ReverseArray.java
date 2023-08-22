package com.rits.basics;

import java.util.Arrays;

/**
 * @author rits
 * @created on 07/02/2023
 * @project dsa
 */
public class ReverseArray {

    /*static int[] reverseArr(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }*/
    static int[] reverseArr(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    static int[] reverseArrRecursively(int arr[],int start,int end){
        if (start>=end){
            return arr;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        return reverseArrRecursively(arr,start+1,end-1);
    }
    public static void main(String[] args) {
        int a[] = {4, 5, 1, 2};
        //System.out.println(Arrays.toString(reverseArr(a)));
        System.out.println(Arrays.toString(reverseArrRecursively(a,0,a.length-1)));
    }


}
