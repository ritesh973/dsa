package com.rits.interview;

import java.util.Arrays;

/**
 * @author rits
 * @created on 18/08/2023
 * @project dsa
 */
public class LTC16 {

    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 3) return 0;
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        int prevClosest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                int curr = (nums[i]+nums[left]+nums[right]);
                //Exact Match
                if (curr == target){
                   return target;
                } else if (curr < target) {
                    left++;
                }else {
                    right--;
                }

                //CurrentCloset
                int currentClosest = Math.abs(curr-target);
                //Comparing PrevClosest and currentClosest
                if (currentClosest < prevClosest){
                    closestSum = curr;
                    prevClosest = currentClosest;
                }
            }
        }
        return closestSum;

    }

    public static void main(String[] args) {
        int a[] = {-1,2,1,-4};
        System.out.println(threeSumClosest(a,1));

    }
}
