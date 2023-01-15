package com.rits.tree;

import com.rits.common.TreeNode;

import java.util.Scanner;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 14/01/23
 */
public class TreeDriver {

    private static Scanner sc = new Scanner(System.in);
    public static TreeNode<Integer> buildTree(TreeNode<Integer> root){

        System.out.println("Enter a the Data");
        Integer data = sc.nextInt();
        root = new TreeNode<>(data);
        if (data == -1){
            return null;
        }
        System.out.println("Enter data for inserting to Left of "+data);
        root.setLeft(buildTree(root.getLeft()));
        System.out.println("Enter data for inserting to Right of "+data);
        root.setRight(buildTree(root.getRight()));
        return root;
    }
    public static void main(String[] args) {
        TreeNode<Integer> integerTreeNode = buildTree(null);
        TreeTraversal<Integer> treeTraversal = new TreeTraversal<>();
        treeTraversal.inOrder(integerTreeNode);
        treeTraversal.preOrder(integerTreeNode);
        System.out.println("Leaf count :: "+treeTraversal.countLeafNode(integerTreeNode));

    }
}
