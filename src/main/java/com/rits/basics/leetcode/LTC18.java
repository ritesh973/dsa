package com.rits.basics.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author rits
 * @created on 22/08/2023
 * @project dsa
 */
public class LTC18 {

    public static List<List<Integer>> fourSumSlow(int[] nums, int target) {

        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i+1; j < nums.length-2; j++) {
                for (int k = j+1; k < nums.length-1; k++) {
                    for (int l = k+1; l < nums.length; l++) {
                        if (nums[i]+nums[j]+nums[k]+nums[l] == target){
                            List<Integer> res = new ArrayList<>();
                            res.addAll(Arrays.asList(nums[i],nums[j],nums[k],nums[l]).stream().sorted().collect(Collectors.toList()));
                            result.add(res);
                        }
                    }

                }
            }

        }
        return new ArrayList<>(result);

    }
    public static List<List<Integer>> fourSum(int[] nums,int target) {
        if (nums == null || nums.length < 4) return new ArrayList<>();

        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]).stream().sorted().collect(Collectors.toList()));
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return new ArrayList<>(result);

    }

    public static void main(String[] args) {
        int a[] ={1000000000,1000000000,1000000000,1000000000};
        List<List<Integer>> lists = fourSum(a, -294967296);
        lists.forEach(data-> {
            data.forEach(rec -> {
                System.out.print(rec + " ");
            });
            System.out.println();

        });
    }

}
