package com.rits.leetcode.leetcode1_40;

/**
 * @author rits
 * @created on 06/09/2023
 * @project dsa
 */
public class LTC35 {
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                start = mid+1;

            }else {
                end = mid-1;

            }

        }
        return start;

    }

    public static void main(String[] args) {
        int a[] = {1,3,5};
        System.out.println(searchInsert(a,4));
    }
}
