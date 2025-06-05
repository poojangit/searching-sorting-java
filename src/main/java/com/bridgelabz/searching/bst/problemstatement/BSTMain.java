package com.bridgelabz.searching.bst.problemstatement;

public class BSTMain {
    public static void main(String[] args) {
        MyBinaryTree<Integer> bst = new MyBinaryTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);
        bst.add(11);
        bst.add(16);
        bst.add(3);
        bst.add(63);
        bst.add(65);
        bst.add(67);
        System.out.println("In-Order Traversal of BST: ");
        bst.printTree(); //print in sorted order
        //get the size of the tree
        System.out.println("\nTotal Nodes in the tree : " + bst.size());
    }
}
