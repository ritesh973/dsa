package com.rits.bst;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 17/04/22
 */

class BSTNode {
    BSTNode left,right;
    int data;

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BSTNode(int n){
        data = n;
        left = null;
        right = null;
    }

}
class BST{
    private BSTNode root;

    public BST(BSTNode root) {
        this.root = root;
    }
    public boolean isEmpty(){
       return root == null;
    }

    public boolean search(int val){
        return search(root,val);

    }
    private boolean search(BSTNode root, int data){
        boolean found = false;
        while (root != null && !found){
            int rVal = root.getData();
            if (data<rVal){
                root = root.getLeft();
            }else if (data>rVal){
                root = root.getRight();
            }else {
                found = true;
                break;
            }
            found = search(root,data);
        }
        return found;
    }
    public void insert(int data){
        insert(root,data);

    }
    private BSTNode insert(BSTNode node,int data){
        if (node == null){
            node = new BSTNode(data);
        }else {
            if (data<= node.getData()){
                node.left = insert(node.left,data);
            }else {
                node.right = insert(node.right,data);
            }
        }
        return node;

    }
    public void deleteKey(int key){
        root = deleteKey(root,key);
    }

    private BSTNode deleteKey(BSTNode r, int key) {
        if (r == null) return r;
        if (key<r.getData()){
            r.left = deleteKey(r.getLeft(),key);
        }else if (key>r.getData()){
            r.right = deleteKey(r.getRight(),key);
        }else {
            if (r.left == null){
                return r.getRight();
            }else if (r.right == null){
                return r.getLeft();
            }
            r.data = inorderSuccessor(r.getRight());
            r.right = deleteKey(r.getRight(),r.data);
        }
        return r;
    }

    int inorderSuccessor(BSTNode r){
        int rVal = r.getData();
        while (r.getLeft() != null){
            rVal = r.getData();
            r = r.getLeft();
        }
        return rVal;

    }

    public void  inorder(){
        inorder(root);
    }

    private void inorder(BSTNode root) {
        if (root != null){
            inorder(root.getLeft());
            System.out.print(root.getData() + " ");
            inorder(root.getRight());
        }
    }
    public void  preorder(){
        preorder(root);
    }

    private void preorder(BSTNode root) {
        if (root != null){
            System.out.print(root.getData() + " ");
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }
    public void  postorder(){
        postorder(root);
    }

    private void postorder(BSTNode root) {
        if (root != null){
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        BST bst = new BST(new BSTNode(10));
        bst.insert(5);
        bst.insert(20);
        bst.insert(15);
        bst.insert(30);
        bst.preorder();
        System.out.println();
        bst.inorder();
        System.out.println();
        bst.postorder();

    }
}
