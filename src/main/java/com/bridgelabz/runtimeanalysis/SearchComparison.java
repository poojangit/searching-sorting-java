package com.bridgelabz.runtimeanalysis;

import java.util.Arrays;

public class SearchComparison {
    //Linear search - O(N)
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    //Binary search - O(logN)
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < low){
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {1000, 20000, 30000};
        for(int size : sizes){
            int[] data = new int[size];
            for(int i=0; i< size; i++){
                data[i] = i;
            }
            int target = size -1; //last element (the worst case for linear)

            //measure linear search time
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();

            //sort data for binary search
            Arrays.sort(data);
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();

            //print Results
            System.out.println("Dataset size : " + size);
            System.out.println("Linear Search Time: " + (endLinear-startLinear));
            System.out.println("Binary Search Time: " + (endBinary-startBinary));
            System.out.println();
        }
    }
}
