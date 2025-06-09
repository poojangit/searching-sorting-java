package com.bridgelabz.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if (low < high) {
            //call the method to get the index where the pivot element is correctly placed
            int pi = partition(arr, low, high);
            //recursively sort left and right of pivot
            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high]; //last element is chosen as the pivot
        int i=low-1;
        //loop from start to one before pivot
        for(int j=low; j<high;j++){
            //compare the current element with pivot
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        //place pivot at the correct position
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1; //return the partition index
    }

    public static void main(String[] args) {
        int[] arr = {5,3,8,4,2};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
