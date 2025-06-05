package com.bridgelabz.searching.bst.problemstatement;

//A generic class where key must be comparable
public class MyBinaryTree<K extends Comparable<K>> {
    private INode<K> root; //root holds the top node of the BST

    //Method to add a key. Internally calls a recursive method to find the correct place
    public void add(K key) {
        root = addRecursively(root, key);
    }
    //if the current is null, insert the new node here
    private INode<K> addRecursively(INode<K> current, K key){
        if (current == null) {
            return new MyBinaryNode<>(key);
        }
        //if less, go to the left
        if (key.compareTo(current.getKey()) < 0) {
            current.setLeft(addRecursively(current.getLeft(), key));
        }
        //if right, go to the right
        else if (key.compareTo(current.getKey()) > 0) {
            current.setRight(addRecursively(current.getRight(), key));
        }

        return current;
    }
    // Printing method
    public void printTree(){
        printInOrder(root);
    }
    //inorder traversal left-> node -> right
    public void printInOrder(INode<K> node){
        if(node != null){
            printInOrder(node.getLeft());
            System.out.print(node.getKey() + " ");
            printInOrder((node.getRight()));
        }
    }

    //UC2 - Check if all are added with using size method
    public int size(){
        return getSizeRecursively(root);
    }
    private int getSizeRecursively(INode<K> node){
        if(node == null)
            return 0;
        return 1+getSizeRecursively(node.getLeft()) + getSizeRecursively(node.getRight());
    }

    //UC3 - method to search the node in the tree
    public boolean search(K key) {
        return searchRecursively(root, key);
    }
    private boolean searchRecursively(INode<K> node, K key){
        if(node == null){
            return false; //key not found
        }
        if(key.compareTo(node.getKey())==0) {
            return true; //key found
        } else if( key.compareTo(node.getKey()) < 0){
            return searchRecursively(node.getLeft(), key); //go left
        } else {
            return searchRecursively(node.getRight(), key); //go right
        }

    }
}
