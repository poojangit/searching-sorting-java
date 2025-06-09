package com.bridgelabz.sorting;

public class InsertionSort {
    //main method
    public static void main(String[] args) {
        //declare and initialize the arrays
        int[] arr = {4,1,9,5,0,2};
        //method calling
        insertionSort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    public static void insertionSort(int[] arr){
        //find the length of the array
        int n = arr.length;
        //loop start from 1 because the first element with index 0 is already sorted
        for(int i=1; i<n; i++){
            //key is the element we are inserting it to the sorted part
            int key = arr[i];
            int j = i-1; // j is the index we are comparing it with the key elements

            //while elements are greater than key shift them one position to right
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            //place the key in the current position once all the elements are shifted
            arr[j+1] = key;
        }

    }
}
