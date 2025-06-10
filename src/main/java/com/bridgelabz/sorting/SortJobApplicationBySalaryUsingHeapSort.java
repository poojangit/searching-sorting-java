package com.bridgelabz.sorting;

import java.util.Arrays;

public class SortJobApplicationBySalaryUsingHeapSort {
    public static void heapify(int[] arr, int n , int i){
        int largest = i; //assume root is the largest
        int left = 2*i+1, right = 2*i+2; //calculating the indices for left and right children
        //check if left/right children are greater than root
        if(left<n && arr[left] > arr[largest])
            largest = left;
        if(right<n && arr[right] > arr[largest])
            largest = right;
        //If the largest is not root, swap and continue heapifying
        if(largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            //Recursively heapify the affected sup-tree
            heapify(arr,n, largest);
        }
    }
    //Heap sort function
    public static void heapsort(int[] arr){
        int n = arr.length;
        //Step-1 : Build max heap
        for (int i=n/2-1; i>0;i--){
            //move current root(Largest) to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i]= temp;

            //call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    //main method
    public static void main(String[] args) {
        int[] salaries = {70000, 260000, 22000, 60000, 90000};
        System.out.println("original Salaries : " + Arrays.toString(salaries));
        heapsort(salaries);
        System.out.println("Sorted Salaries : " + Arrays.toString(salaries));
    }
}
