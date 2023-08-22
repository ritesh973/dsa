package com.rits.basics.leetcode;

/**
 * @author rits
 * @created on 09/08/2023
 * @project dsa
 */
public class LTC11 {

    public static int maxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = (j - i) * Integer.min(height[i],height[j]);
                maxWater = Integer.max(maxWater,area);
            }
        }
        return maxWater;

    }
    public static int maxAreaOptimal(int[] height) {
        int l= 0;
        int r = height.length-1;
        int maxWater = 0;
        while (l < r){
            int area = (r -l) * Integer.min(height[l],height[r]);
            maxWater = Integer.max(maxWater,area);
            if (height[l] < height[r]){
                l++;
            } else
                r--;
            }
        return maxWater;

    }

    public static void main(String[] args) {
        int height[] ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
        System.out.println(maxAreaOptimal(height));
    }
}
