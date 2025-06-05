package com.bridgelabz.searching.bst.problemstatement;

//UC1 - to create MyBinaryNode
//key has to extend comparable to compare left and right node
public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {

    private K key;
    private INode<K> left;
    private INode<K> right;

    //Constructor initializes the key and sets children to null
    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

    //Override the methods to get and set the keys
    @Override
    public K getKey() {
        return key;
    }
    @Override
    public void setKey(K key) {
        this.key = key;
    }

    //Override the methods to get and set the left child nodes
    @Override
    public INode<K> getLeft() {
        return left;
    }
    @Override
    public void setLeft(INode<K> left) {
        this.left = left;
    }

    //Override the methods to get and set the right child nodes
    @Override
    public INode<K> getRight() {
        return right;
    }
    @Override
    public void setRight(INode<K> right) {
        this.right = right;
    }
}
