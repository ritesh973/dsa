package com.rits.tree.problems;

import com.rits.common.Pair;
import com.rits.common.TreeNode;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 15/01/23
 */
public class CheckForBalancedTree {

    public static boolean isBalanced(TreeNode<Integer> root){
        if (root == null){
            return true;
        }
        boolean left = isBalanced(root.getLeft());
        boolean right = isBalanced(root.getRight());
        boolean diff = (FindHeightOfTree.height(root.getLeft()) - FindHeightOfTree.height(root.getRight())) <= 1;
        return left && right && diff;
    }
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

    public static boolean isIdentical(TreeNode<Integer> root1,TreeNode<Integer> root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if (root1 == null && root2 != null){
            return false;
        }
        if (root1 != null && root2 == null){
            return false;
        }

        boolean leftAns = isIdentical(root1.getLeft(),root2.getLeft());
        boolean rightAns = isIdentical(root1.getRight(),root2.getRight());

        boolean val = root1.getData().equals(root2.getData());

        boolean res = leftAns && rightAns && val;
        return res;
    }

    public static Pair<Boolean,Integer> isSumTree(TreeNode<Integer> root){
        if (root == null){
            return Pair.of(true,0);
        }
        if (root.getLeft() == null && root.getRight() == null){
            return Pair.of(true,root.getData());
        }
        Pair<Boolean,Integer> left = isSumTree(root.getLeft());
        Pair<Boolean,Integer> right = isSumTree(root.getRight());

        boolean leftAns = left.getFirst();
        boolean rightAns = right.getFirst();

        boolean sum = left.getSecond() + right.getSecond() == root.getData();

        Pair<Boolean,Integer> ans = new Pair<>();
        ans.setSecond(2*root.getData());
        boolean res = leftAns && rightAns && sum;
        ans.setFirst(res);
        return ans;
    }

}
