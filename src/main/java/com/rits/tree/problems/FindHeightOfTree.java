package com.rits.tree.problems;

import com.rits.common.Pair;
import com.rits.common.TreeNode;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 15/01/23
 */
public class FindHeightOfTree {

    public static int height(TreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int leftHeight = height(root.getLeft());
        int rightHeight = height(root.getRight());
        int ans = Integer.max(leftHeight,rightHeight);
        return ans+1;
    }
    public static int diameter(TreeNode<Integer> root){
        if (root == null){
            return 0;
        }
        int op1 = diameter(root.getLeft());
        int op2 = diameter(root.getRight());
        int op3 = height(root.getLeft()) + height(root.getRight()) +1;
        int ans = Integer.max(op1,Integer.max(op2,op3));
        return ans;
    }
    public static Pair<Integer,Integer> diameterFast(TreeNode<Integer> root){
        if (root == null){
            Pair<Integer,Integer> pair = Pair.of(0,0);
            return pair;
        }
        Pair<Integer,Integer> left = diameterFast(root.getLeft());
        Pair<Integer,Integer> right = diameterFast(root.getRight());
        Integer op1 = left.getFirst();
        int op2 = right.getFirst();
        int op3 = left.getSecond()+right.getSecond() +1;

        Pair<Integer,Integer> ans = new Pair<>();
        ans.setFirst(Integer.max(op1,Integer.max(op2,op3)));
        ans.setSecond(left.getSecond()+right.getSecond()+1);
        return ans;
    }

}
