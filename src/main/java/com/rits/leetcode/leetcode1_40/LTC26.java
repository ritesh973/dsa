package com.rits.leetcode.leetcode1_40;

import java.util.Arrays;

/**
 * @author rits
 * @created on 27/08/2023
 * @project dsa
 */
public class LTC26 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length-1 ; i++) {
            if (nums[i] != nums[i+1]){
                nums[j] = nums[i];
                j++;
            }
        }
        nums[j] = nums[nums.length-1];
        return Arrays.copyOfRange(nums, 0, j + 1).length;

    }

    public static void main(String[] args) {
        int a[] = {1,1,2};
        System.out.println(removeDuplicates(a));

    }
}
