package com.bridgelabz.sorting;

import java.util.Arrays;

public class SortEmployeeIdUsingInsertionSort {
    //main method
    public static void main(String[] args) {
        //declare and initialize the arrays
        int[] empIDs = {17,19,12,15,10,16};
        //method calling
        System.out.println("Employee ID Before Sorting : " + Arrays.toString(empIDs));
        insertionSort(empIDs);
        System.out.println("Employee ID after Sorting: " + Arrays.toString(empIDs));
    }
    public static void insertionSort(int[] empID){
        //find the length of the array
        int n = empID.length;
        //loop start from 1 because the first element with index 0 is already sorted
        for(int i=1; i<n; i++){
            //key is the element we are inserting it to the sorted part
            int key = empID[i];
            int j = i-1; // j is the index we are comparing it with the key elements

            //while elements are greater than key shift them one position to right
            while(j>=0 && empID[j] > key){
                empID[j+1] = empID[j];
                j--;
            }
            //place the key in the current position once all the elements are shifted
            empID[j+1] = key;
        }

    }
}
