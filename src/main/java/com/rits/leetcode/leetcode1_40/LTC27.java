package com.rits.leetcode.leetcode1_40;

import java.util.Arrays;

/**
 * @author rits
 * @created on 27/08/2023
 * @project dsa
 */
public class LTC27 {
    public static int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return Arrays.copyOfRange(nums,0,j).length;

    }

    public static void main(String[] args) {
        int a[] = {3,2,2,3};
        System.out.println(removeElement(a,3));


    }
}
