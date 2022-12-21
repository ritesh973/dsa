package com.rits.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 02/06/22
 */
public class FindDuplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        Map<Integer,Boolean> cacheMap = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (cacheMap.get(arr[i]) != null){
                cacheMap.put(arr[i],true);
            }else {
                cacheMap.put(arr[i],false);
            }

        }
        for (Map.Entry<Integer,Boolean> entry: cacheMap.entrySet()) {
            if (entry.getValue() == true){
                res.add(entry.getKey());
            }
        }
        if (res.size()<1){
            res.add(-1);
        }
        Collections.sort(res);
        return res;
    }
    public static void main(String[] args) {

        int n = 18;
        int a[] = {14, 7, 14, 6, 1, 11, 3, 16, 16, 8, 7, 4, 11, 15, 17, 6, 1, 13};

        System.out.println(duplicates(a,n).toString());
    }
}
