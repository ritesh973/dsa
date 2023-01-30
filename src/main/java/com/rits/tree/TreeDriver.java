package com.rits.tree;

import com.rits.common.TreeNode;
import com.rits.common.TreeTraversal;
import com.rits.tree.bst.BinarySearchTree;
import com.rits.tree.problems.CheckForBalancedTree;
import com.rits.tree.problems.FindHeightOfTree;

import java.util.Scanner;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 14/01/23
 */
public class TreeDriver {

    public static void main(String[] args) {
        //10 20 -1 -1 30 -1 -1
        //10 20 -1 -1 -1 -1 -1
        //40 20 -1 -1 20 -1 -1
        //10 5 -1 -1 20 -1 -1
        Tree tree = new Tree();
        TreeNode<Integer> integerTreeNode = tree.buildTree(null);
        TreeTraversal<Integer> treeTraversal = new TreeTraversal<>();
        treeTraversal.inOrder(integerTreeNode);
        treeTraversal.preOrder(integerTreeNode);
        System.out.println("Leaf count :: "+treeTraversal.countLeafNode(integerTreeNode));
        System.out.println("Height of tree :: "+FindHeightOfTree.height(integerTreeNode));
        System.out.println("Diameter of tree :: "+FindHeightOfTree.diameter(integerTreeNode));
        System.out.println("Is Balanced tree :: "+ CheckForBalancedTree.isBalancedFast(integerTreeNode).getFirst());
        TreeNode<Integer> integerTreeNode1 = tree.buildTree(null);
        System.out.println("Is Identical :: "+ CheckForBalancedTree.isIdentical(integerTreeNode,integerTreeNode1));
        System.out.println("Is Sum tree :: "+ CheckForBalancedTree.isSumTree(integerTreeNode).getFirst());
        System.out.println("Is valid BST :: "+ BinarySearchTree.isValidBst(integerTreeNode,Integer.MIN_VALUE,Integer.MAX_VALUE));

    }
}
