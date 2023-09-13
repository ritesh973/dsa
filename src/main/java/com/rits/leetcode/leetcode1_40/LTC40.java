package com.rits.leetcode.leetcode1_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rits
 * @created on 13/09/2023
 * @project dsa
 */
public class LTC40 {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        Arrays.sort(candidates);
        recursiveSol(candidates,target,0,cur,res);
        return res;


    }

    private static void recursiveSol(int[] candidates, int target, int index, List<Integer> cur, List<List<Integer>> res) {
        if (target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i <candidates.length ; i++) {
            if ((i == index || candidates[i-1] != candidates[i]) && candidates[i] <= target){
                cur.add(candidates[i]);
                recursiveSol(candidates,target-candidates[i],i+1,cur,res);
                cur.remove(cur.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {10,1,2,7,6,1,5};

        List<List<Integer>> lists = combinationSum2(a, 8);
        System.out.println(lists);

    }

}
