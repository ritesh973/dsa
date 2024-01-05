package com.rits.pe.practice.twopointer;

import java.util.Arrays;

/**
 * @author rits
 * @created on 02/01/2024
 * @project dsa
 * Ref LTC15
 */
public class ThreeSum {
    public static boolean findSumOfThree(int[] nums, int target) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int start = i+1;
            int end = nums.length-1;
            while (start < end){
                int temp = nums[i]+nums[start]+nums[end];
                if ( temp== target){
                    return true;
                } else if (temp < target) {
                    start++;
                }else {
                    end--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {2, 3, 4};
        System.out.println(findSumOfThree(num,6));
    }
}
