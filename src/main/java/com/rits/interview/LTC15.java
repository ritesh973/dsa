package com.rits.interview;

import java.util.*;

/**
 * @author rits
 * @created on 16/08/2023
 * @project dsa
 */
public class LTC15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) return new ArrayList<>();

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if (sum == 0){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
        int[] a = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = threeSum(a);
        lists.forEach(data-> {
            data.forEach(k -> System.out.print(k + " "));
            System.out.println();
        }
        );
    }
}
