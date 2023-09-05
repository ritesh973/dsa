package com.rits.basics.leetcode;

import java.util.Arrays;

/**
 * @author rits
 * @created on 05/09/2023
 * @project dsa
 */
public class LTC34 {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int low = -1;
        int high = -1;

        while (start<nums.length){
            if (nums[start] == target){
                low = start;
                break;
            }
            start++;
        }
        while (end >= 0){
            if (nums[end] == target){
                high = end;
                break;
            }
            end--;
        }
        return new int[]{low,high};

    }

    public static void main(String[] args) {
        int a[] = {};
        System.out.println(Arrays.toString(searchRange(a,0)));
    }
}
