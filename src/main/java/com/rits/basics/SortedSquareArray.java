package com.rits.basics;

import java.util.Arrays;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 04/05/22
 */
public class SortedSquareArray {
    public static int[] sortedSquaredArray(int[] array) {
        int start = 0;
        int end = array.length-1;
        int pointer = array.length-1;
        int res[] = new int[array.length];
        while (start<=end){
            if (Math.abs(array[start]) >Math.abs(array[end])){
                res[pointer] = array[start]*array[start];
                start++;
            }else {
                res[pointer] = array[end]*array[end];
                end--;
            }
            pointer--;
        }
        return res;
    }
    public static int[] sortedSquaredArrayWithoutAbs(int[] array) {
        int start = 0;
        int end = array.length-1;
        int pointer = array.length-1;
        int res[] = new int[array.length];
        while (start<=end){
            int val1 = array[start]*array[start];
            int val2 = array[end]*array[end];
            if (val1 >val2){
                res[pointer] = val1;
                start++;
            }else {
                res[pointer] = val2;
                end--;
            }
            pointer--;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{-3,-2,0,1};
        int[] ints = sortedSquaredArray(arr);
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(sortedSquaredArrayWithoutAbs(arr)));

    }
}
