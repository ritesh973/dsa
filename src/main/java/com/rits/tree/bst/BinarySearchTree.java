package com.rits.tree.bst;

import com.rits.common.TreeNode;
import com.rits.tree.Tree;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 17/04/22
 */
public class BinarySearchTree{

    public TreeNode<Integer> root;

    public BinarySearchTree(TreeNode root) {
        this.root = root;
    }
    public boolean isEmpty(){
       return root == null;
    }

    public boolean search(int val){
        return search(root,val);

    }
    private boolean search(TreeNode<Integer> root, int data){
        while (root != null ){
            int rVal = root.getData();
            if (rVal == data){
                return true;
            }
            if (data<rVal){
                root = root.getLeft();
            }else{
                root = root.getRight();
            }
        }
        return false;
    }
    public int findMin(TreeNode<Integer> root){
        TreeNode<Integer> temp = root;
        while (temp != null && temp.getLeft() != null){
            temp = temp.getLeft();
        }
        return temp.getData();
    }
    public int findMax(TreeNode<Integer> root){
        TreeNode<Integer> temp = root;
        while (temp != null && temp.getRight() != null){
            temp = temp.getRight();
        }
        return temp.getData();
    }
    public static boolean searchRecursive(TreeNode<Integer> root, int data){
        if (root == null){
            return false;
        }
        if (root.getData() == data){
            return true;
        }
        if (root.getData() > data){
            return searchRecursive(root.getLeft(),data);
        }else {
            return searchRecursive(root.getRight(),data);
        }
    }
    public void insert(int data){
        insert(root,data);

    }
    private TreeNode<Integer> insert(TreeNode<Integer> root,int data){
        if (root == null){
            root = new TreeNode(data);
        }else {
            if (data<= root.getData()){
                root.setLeft(insert(root.getLeft(),data));
            }else {
                root.setRight(insert(root.getRight(),data));
            }
        }
        return root;

    }
    public void deleteKey(int key){
        root = deleteKey(root,key);
    }

    private TreeNode<Integer> deleteKey(TreeNode<Integer> r, int key) {
        if (r == null) return null;
        if (key<r.getData()){
            r.setLeft(deleteKey(r.getLeft(),key));
        }else if (key>r.getData()){
            r.setRight(deleteKey(r.getRight(),key));
        }else {
            if (r.getLeft() == null && r.getRight() == null){
                return null;
            }
            if (r.getLeft() == null && r.getRight() != null){
                return r.getRight();
            }
            if (r.getLeft() != null && r.getRight() == null){
                return r.getLeft();
            }
            if (r.getLeft() != null && r.getRight() != null){
                int min = findMin(r.getRight());
                r.setData(min);
                r.setRight(deleteKey(r.getRight(),min));
            }
        }
        return r;
    }

    int inorderSuccessor(TreeNode<Integer> r){
        int rVal = r.getData();
        while (r.getLeft() != null){
            rVal = r.getData();
            r = r.getLeft();
        }
        return rVal;

    }
    public static boolean isValidBst(TreeNode<Integer> root, int min, int max){
        if (root == null){
            return true;
        }
        if (root.getData() >= min && root.getData() <= max){
            boolean left = isValidBst(root.getLeft(),min,root.getData());
            boolean right = isValidBst(root.getRight(),root.getData(),max);
            return left && right;
        }
        return false;
    }

}

