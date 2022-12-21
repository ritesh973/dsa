package com.rits.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 23/05/22
 */
public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> range = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int currSum = 0;
        int start = 0;
        int end = -1;
        for (int i = 0; i <n; i++) {
            currSum += arr[i];
            if (currSum - s == 0){
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(currSum - s)){
                start = map.get(currSum -s)+1;
                end = i;
                break;
            }
            map.put(currSum,i);

        }
        if (end == -1){
            range.add(-1);
        }else {
            range.add(start+1);
            range.add(end+1);
        }
        return range;

    }
    public static void main(String[] args) {
        int n = 10, s = 15;
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> integers = subarraySum(a, n, s);
        System.out.println(integers.toString());


    }
}
