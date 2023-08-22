package com.rits.tree;

import com.rits.common.TreeNode;

import java.util.Scanner;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 19/01/23
 */
public class Tree {

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




}
