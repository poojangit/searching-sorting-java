package com.bridgelabz.searching.bst.problemstatement;

//UC1 - To create INode
//Define a Generic Interface with type K
public interface INode<K> {
    K getKey(); //Returns the value stored in the node
    void setKey(K key); //allows updating the key

    //get and set left child node
    INode<K> getLeft();
    void setLeft(INode<K> left);

    //get and set the right child of the node
    INode<K> getRight();
    void setRight(INode<K> right);
}
