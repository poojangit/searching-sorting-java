package com.bridgelabz.searching.bst.implementation;

public class Node {
    int data; //stores the value
    Node left; //pointer to left child
    Node right; //pointer to right child

    //constructor
    public Node(int value){
        data = value;
        left = right = null;
    }
}
