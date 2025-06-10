package com.bridgelabz.searching.linearsearch;

public class LinearSearch{
    //method to perform linear search operation
    public static int linearSearch(int[] arr, int target){
        //traverse to each element in the array
        for(int i=0; i< arr.length; i++){
            //check if the element is equal to the target element
            if(arr[i] == target){
                return i;
            }
        }
        //if the element does not math return -1
        return -1;
    }

    //main method
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 20; //target element
        int result = linearSearch(arr,target); //call the linearSearch method and store the value in result variable
        if(result != -1){
            System.out.println("The target element " + target + " is found");
        } else {
            System.out.println("The target element is not found");
        }

    }
}