package com.rits.leetcode.leetcode41_80;

/**
 * @author rits
 * @created on 20/09/2023
 * @project dsa
 */
public class LTC42 {
    public static int trap(int[] height) {

        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int result = 0;
        left[0] = height[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i-1],height[i]);
        }
        right[n-1] = height[n-1];
        for (int i = n-2; i >=0; i--) {
            right[i] = Math.max(right[i+1],height[i]);
        }
        for (int i = 0; i <n ; i++) {
            result += (Math.min(left[i],right[i]) - height[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        System.out.println(trap(height));

    }
}
