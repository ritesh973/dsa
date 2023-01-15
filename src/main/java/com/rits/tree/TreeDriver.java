package com.rits.tree;

import com.rits.common.TreeNode;
import com.rits.tree.problems.CheckForBalancedTree;
import com.rits.tree.problems.FindHeightOfTree;

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
        //10 20 -1 -1 30 -1 -1
        //10 20 -1 -1 -1 -1 -1
        //40 20 -1 -1 20 -1 -1
        TreeNode<Integer> integerTreeNode = buildTree(null);
        TreeTraversal<Integer> treeTraversal = new TreeTraversal<>();
        treeTraversal.inOrder(integerTreeNode);
        treeTraversal.preOrder(integerTreeNode);
        System.out.println("Leaf count :: "+treeTraversal.countLeafNode(integerTreeNode));
        System.out.println("Height of tree :: "+FindHeightOfTree.height(integerTreeNode));
        System.out.println("Diameter of tree :: "+FindHeightOfTree.diameter(integerTreeNode));
        System.out.println("Is Balanced tree :: "+ CheckForBalancedTree.isBalancedFast(integerTreeNode).getFirst());
        TreeNode<Integer> integerTreeNode1 = buildTree(null);
        System.out.println("Is Identical :: "+ CheckForBalancedTree.isIdentical(integerTreeNode,integerTreeNode1));
        System.out.println("Is Sum tree :: "+ CheckForBalancedTree.isSumTree(integerTreeNode).getFirst());

    }
}
