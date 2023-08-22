package com.rits.basics;

import com.rits.common.Pair;

/**
 * @author rits
 * @created on 15/02/2023
 * @project dsa
 */
public class MaxMinOfArray {

    static Pair<Integer,Integer> maxMin(int arr[]){
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi)
                maxi = arr[i];
            if (arr[i]<mini)
                mini = arr[i];
        }
        return Pair.of(maxi,mini);


    }
    public static void main(String[] args) {
        int arr[] = {2,1,4,9,5,8};
        Pair<Integer, Integer> pair = maxMin(arr);
        System.out.println("Max : "+pair.getFirst());
        System.out.println("Min :"+pair.getSecond());
    }

}
