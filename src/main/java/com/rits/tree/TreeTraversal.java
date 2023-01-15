package com.rits.tree;

import com.rits.common.TreeNode;

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

}
