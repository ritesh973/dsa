package com.rits.common;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 14/01/23
 */
public class TreeTraversal<Item> {

    public void inOrder(TreeNode<Item> root){
        if (root == null){
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getData() +" ");
        inOrder(root.getRight());
    }
    public void preOrder(TreeNode<Item> root){
        if (root == null){
            return;
        }
        System.out.print(root.getData() +" ");
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }
    public void postOrder(TreeNode<Item> root){
        if (root == null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getData() +" ");
    }
    public void inOrder(TreeNode<Item> root,AtomicInteger cnt){
        if (root == null){
            return;
        }
        inOrder(root.getLeft(),cnt);
        if (root.getLeft() == null && root.getRight() == null){
            cnt.incrementAndGet();
        }
        inOrder(root.getRight(),cnt);
    }
    public int countLeafNode(TreeNode<Item> root){
        AtomicInteger cnt = new AtomicInteger(0);
        inOrder(root, cnt);
        return cnt.get();
    }
    public void levelOrder(TreeNode<Item> root){
        Queue<TreeNode<Item>> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()){
            TreeNode<Item> remove = q.remove();
            if (remove == null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                System.out.print(remove.getData()+" ");
                if (remove.getLeft() != null){
                    q.add(remove.getLeft());
                }
                if (remove.getRight() != null){
                    q.add(remove.getRight());
                }
            }
        }
    }
    public int inOrderCount(TreeNode<Item> root){
        if (root == null){
            return 0;
        }
        int left = inOrderCount(root.getLeft());
        int right = inOrderCount(root.getRight());
        return left+right+1;
    }
    public int countNode(TreeNode<Item> root){
        return inOrderCount(root);
    }
    public int inOrderSum(TreeNode<Item> root){
        if (root == null){
            return 0;
        }
        int leftSum = inOrderSum(root.getLeft());
        int rightSum = inOrderSum(root.getRight());
        return leftSum + rightSum + (Integer) root.getData();
    }
    public int nodeSum(TreeNode<Item> root){
        return inOrderSum(root);
    }

}
