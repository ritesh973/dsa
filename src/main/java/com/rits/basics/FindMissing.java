package com.rits.basics;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 31/05/22
 */
public class FindMissing {
//    static int MissingNumber(int array[], int n) {
//        int res = 0;
//        for (int i = 1; i <= n; i++) {
//            boolean found = false;
//            for (int j = 0; j < array.length; j++) {
//                if (i == array[j]){
//                    found = true;
//                    break;
//                }
//            }
//            if (!found){
//                res = i;
//                break;
//            }
//
//        }
//        return res;
//        // Your Code Here
//    }

    static int MissingNumber(int array[], int n) {
        int res = 0;
        Map<Integer,Boolean> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i,false);
        }
        for (int j = 0; j < array.length; j++) {
           map.put(array[j],true);
        }
        for (Map.Entry<Integer,Boolean> entry : map.entrySet()) {
            if (entry.getValue() == false){
                res = entry.getKey();
            }

        }
        return res;
        // Your Code Here
    }
    public static void main(String[] args) {
        int n = 6;
        int a[] = {1,2,3,5,4};
        System.out.println(MissingNumber(a,n));

    }
}
