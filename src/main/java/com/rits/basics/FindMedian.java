package com.rits.basics;

/**
 * @author rits
 * @created on 29/06/2023
 * @project dsa
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class FindMedian {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                res[k] = nums1[i];
                i++;
            }else{
                res[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length ){
                res[k] = nums1[i];
                i++;
                k++;
        }
        while (j < nums2.length){
                res[k] = nums2[j];
                j++;
                k++;
        }
        if (k%2 != 0){
            return res[k/2];
        }else{
            return (res[(k/2)]+res[((k/2)-1)])/2.0;
        }
    }

    public static void main(String[] args) {
        int num1[] = {1,2};
        int num2[] = {3,4};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
