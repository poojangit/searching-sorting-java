package com.bridgelabz.searching.bst.implementation;

public class BSTMainClass {
    public static void main(String[] args) {
        //Create a Binary search tree object
        BinarySearchTree bst = new BinarySearchTree();
        //checking the value of empty root node
        System.out.println(bst.root);
        //insert
        bst.insert(10);
        bst.insert(20);
        bst.insert(5);
        bst.insert(30);
        bst.insert(0);
        //printing root data value
        System.out.println(bst.root.data);
        System.out.println(bst.root.right.data);
        System.out.println(bst.root.left.data);
        //sorting and printing the data
        bst.inorder();
        System.out.println();
        //searching the data existence
        System.out.println(bst.search(10));
        System.out.println(bst.search(80));
        bst.delete(10);
        bst.inorder();
    }
}
