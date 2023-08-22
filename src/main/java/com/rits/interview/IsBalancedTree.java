package com.rits.interview;

import com.rits.common.Pair;
import com.rits.common.TreeNode;

/**
 * @author rits
 * @created on 20/08/2023
 * @project dsa
 */
public class IsBalancedTree {
    public static Pair<Boolean,Integer> isBalancedFast(TreeNode<Integer> root){
        if (root == null){
            return Pair.of(true,0);
        }
        Pair<Boolean,Integer> left = isBalancedFast(root.getLeft());
        Pair<Boolean,Integer> right = isBalancedFast(root.getRight());

        boolean leftAns = left.getFirst();
        boolean rightAns = right.getFirst();

        boolean diff = Math.abs(left.getSecond() - right.getSecond()) <= 1;

        Pair<Boolean,Integer> ans = new Pair<>();
        ans.setSecond(Math.max(left.getSecond(),right.getSecond())+1);
        boolean res = leftAns && rightAns && diff;
        ans.setFirst(res);
        return ans;
    }
}
