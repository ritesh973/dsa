package com.rits.leetcode.leetcode41_80;

/**
 * @author rits
 * @created on 15/09/2023
 * @project dsa
 */
public class LTC41 {
    public static int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int res = 1;
        for (int i = 0; i < length; i++) {
            int start = res;
            for (int j = 0; j < length; j++) {
                if (nums[j] <= 0){
                    continue;
                }
                if (nums[j] == res ){
                    res++;
                }
            }
            if (start == res){
                break;
            }
        }
        return res;

    }
    public static int firstMissingPositiveUpdated(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n){
                nums[i] = n+1;

            }
        }
        //[1,2,4]
        for (int i = 0; i < n; i++) {
            int id = Math.abs(nums[i]);
            if (id > n) continue;
            id--;
            if (nums[id] > 0)nums[id] = -nums[id];
        }

        //[1,-2,4]
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0){
                return i+1;
            }
        }
        return n+1;

    }

    public static void main(String[] args) {
        int nums[] = {1,2,0};
        System.out.println(firstMissingPositiveUpdated(nums));
    }
}
