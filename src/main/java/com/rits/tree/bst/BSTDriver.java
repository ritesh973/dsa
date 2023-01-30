package com.rits.tree.bst;

import com.rits.common.TreeNode;
import com.rits.common.TreeTraversal;

/**
 * @author Ritesh Singh
 * @version 1.0
 * @since 19/01/23
 */
public class BSTDriver {
        public static void main(String[] args) {
            BinarySearchTree bst = new BinarySearchTree(new TreeNode<>(10));
            TreeTraversal traversal = new TreeTraversal();
            bst.insert(5);
            bst.insert(20);
            bst.insert(15);
            bst.insert(30);
            System.out.println("Preorder");
            traversal.preOrder(bst.root);
            System.out.println();
            System.out.println("Inorder");
            traversal.inOrder(bst.root);
            System.out.println();
            System.out.println("Post order");
            traversal.postOrder(bst.root);

            System.out.println(bst.searchRecursive(bst.root, 90));
            System.out.println(bst.search(99));
            System.out.println(bst.findMin(bst.root));
            System.out.println(bst.findMax(bst.root));

            System.out.println();
            bst.deleteKey(20);
            traversal.inOrder(bst.root);


    }
}
