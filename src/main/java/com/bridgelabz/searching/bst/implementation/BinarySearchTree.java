package com.bridgelabz.searching.bst.implementation;

public class BinarySearchTree {
    Node root; // root of the tree

    //insert method
    public void insert(int data){
        root = insertRec(root,data);
    }

    //Recursive insert method
    private Node insertRec(Node root, int data){
        //check if the root is null
        if(root == null){
            //if the root is null then make a new Node as root
            root = new Node(data);
            return root;
        }
        //check if the data to be inserted is lesser than root data
        if(data < root.data){
            //if the data is lesser than root data insert it to left side
            root.left = insertRec(root.left, data);
        } else if(data > root.data){
            //if the data is greater than root data insert it to right side
            root.right = insertRec(root.right, data);
        }
        return root;
    }
    //Inorder traversal (prints in sorted order)
    public void inorder() {
        inorderRec(root);
    }
    // Recursive method to print the data in sorted order
    private void inorderRec(Node root){
        if(root!=null){
            inorderRec(root.left); //left data
            System.out.print(root.data + " "); //root node
            inorderRec(root.right); //right data
        }
    }
    //search method to find the data
    public boolean search(int key){
        return searchRec(root, key);
    }
    //Recursively search the data
    private boolean searchRec(Node root, int key){
        //return false if the root is empty
        if(root == null)
            return false;
        //if the data to be searched is equal to the data present in the tree return true
        if(root.data == key)
            return true;
        return key < root.data ? searchRec(root.left, key) : searchRec((root.right), key);
    }

    //method to delete the data
    public void delete(int data){
        root = deleteRec(root, data);
    }

    //private method to recursively delete the data
    private Node deleteRec(Node root, int data){
        //check if the root is empty
        if(root == null){
            return null;
        }
        //check if the given data is less than the root data
        if(data < root.data){
            root.left = deleteRec(root.left, data);
        } else if(data > root.data){
            root.right = deleteRec(root.right,data);
        }
        else{
            if(root.left == null)
                return root.right;
            else if(root.right == null)
                return root.left;

            root.data = minValue(root.right);
            root.right = deleteRec(root.right, root.data);
        }
        return root;
    }
    // Helper method to find the smallest value (inorder successor)
    private int minValue(Node root){
        //create a temp node
        int minv = root.data;
        //check if the left node is null
        while(root.left!=null){
            //deleting logic
            root = root.left;
            minv = root.data;
        }
        return minv;
    }
}
