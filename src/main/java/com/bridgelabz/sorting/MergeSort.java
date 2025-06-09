package com.bridgelabz.sorting;

import java.util.Arrays;

public class MergeSort {
    //recursive method for splitting the array
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; //find the middle index
            //recursively sort left and right halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid +1, right);
            merge(arr, left, mid, right);
        }
    }
        private static void merge (int[] arr, int left, int mid, int right){
            int n1 = mid-left+1; //size of n1
            int n2 = right-mid; //size of n2
            //temporary arrays for storing left and right halves
            int[] leftArr = new int[n1];
            int[] rightArr = new int[n2];
            //copy values from an original array into L
            for(int i=0;i<n1;i++)
                leftArr[i] = arr[left + i];
            //copy values into R
            for(int j=0; j<n2;j++)
                rightArr[j] = arr[mid+1+j];

            int i=0,j=0,k=left;
            //loop while both left array and right array have elements
            while(i<n1 && j<n2) {
                //compare and place the smaller elements into arr
                if (leftArr[i] <= rightArr[j]) {
                    arr[k] = leftArr[i];
                    i++;
                } else {
                    arr[k] = rightArr[j];
                    j++;
                }
                k++;
            }
                // copy left over elements from a left array
                while (i<n2) {
                    arr[k] = leftArr[i];
                    i++;
                    k++;
                }
                //copy left over elements from a right array
                while(j<n2) {
                    arr[k] = rightArr[j];
                    j++;
                    k++;
                }
    }


    //main method
    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2,7}; //input array
        mergeSort(arr,0,arr.length-1);
        //print the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
