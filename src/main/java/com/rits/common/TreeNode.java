package com.rits.common;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 14/01/23
 */
public class TreeNode<Item> {
    private Item data;
    private TreeNode<Item> left;
    private TreeNode<Item> right;

    public TreeNode(Item data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Item getData() {
        return data;
    }

    public void setData(Item data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
