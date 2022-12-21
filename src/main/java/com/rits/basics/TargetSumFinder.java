package com.rits.basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 23/04/22
 */
public class TargetSumFinder {

    public static int[] findTargetSum(int[] arr, int targetSum){
        Set<Integer> container = new HashSet<>();
        for (int j : arr) {
            int val = targetSum - j;
            if (container.contains(val)) {
                return new int[]{j, val};
            } else {
                container.add(j);
            }
        }
        return new int[0];
    }
    public static int[] findTargetSumOptimal(int[] arr, int targetSum){
        Arrays.sort(arr);
        int first = 0;
        int last = arr.length-1;
        while (first<last){
            int val = arr[first]+arr[last];
            if (val == targetSum){
                return new int[]{arr[first],arr[last]};
            }else if (val>targetSum){
                last--;
            }else {
                first++;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

       // System.out.println(Arrays.toString(findTargetSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6},9)));
        System.out.println(Arrays.toString(findTargetSumOptimal(new int[]{3, 5, -4, 8, 11, 1, -1, 6},10)));
    }
}
