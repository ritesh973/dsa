package com.rits.leetcode.leetcode1_40;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rits
 * @created on 16/08/2023
 * @project dsa
 */
public class LTC1 {

    public static int[] twoSumEnhanced(int[] nums, int target) {
        Map<Integer,Integer> original = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            original.put(nums[i],i);
        }
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            int sum = nums[left]+nums[right];
            if (sum == target){
                return new int[]{original.get(nums[left]),original.get(nums[right])};
            }else if(sum < 0){
                left++;
            }else {
                right--;
            }
        }
        return new int[]{};

    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i]+nums[j];
                if (sum == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};

    }

    public static void main(String[] args) {
        int[] a ={3,2,4};
        System.out.println(Arrays.toString(twoSum(a,6)));

    }
}
