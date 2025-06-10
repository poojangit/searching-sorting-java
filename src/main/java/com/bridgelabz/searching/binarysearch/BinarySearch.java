package com.bridgelabz.searching.binarysearch;

public class BinarySearch {
    //method to write the logic for binary search
   public static int binarySearch(int[] arr , int target){
       int low = 0; // consider 0th index as low
       int high = arr.length-1; // last index as high
       //loop till low is lesser than high
       while(low< high){
           int mid = low + (high-low)/2; //find the middle index
           if(arr[mid] == target){  //check if the mid-value is equal to the target
               return mid;
           } else if(arr[mid]< low){
               low = mid + 1;
           } else {
               high = mid -1;
           }
       }
       return -1;
   }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 30;
        int result = binarySearch(arr, target);
        if(result != -1)
        {
            System.out.println("Target element is found");
        } else {
            System.out.println("Target element is not found");
        }
    }
}
