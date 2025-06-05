package com.bridgelabz.searching.bst.problemstatement;

//A generic class where key must be comparable
public class MyBinaryTree<K extends Comparable<K>> {
    private INode<K> root; //root holds top node of the BST

    //method to add a key . Internally calls a recursive method to find the correct place
    public void add(K key) {
        root = addRecursively(root, key);
    }
    //if the current is null insert the new node here
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
}
