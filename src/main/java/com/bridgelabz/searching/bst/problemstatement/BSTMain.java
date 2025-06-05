package com.bridgelabz.searching.bst.problemstatement;

public class BSTMain {
    public static void main(String[] args) {
        MyBinaryTree<Integer> bst = new MyBinaryTree<>();
        bst.add(56);
        bst.add(30);
        bst.add(70);
        System.out.println("In-Order Traversal of BST: ");
        bst.printTree();
    }
}
