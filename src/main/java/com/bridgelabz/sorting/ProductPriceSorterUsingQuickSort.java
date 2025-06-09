package com.bridgelabz.sorting;

import java.util.Arrays;

public class ProductPriceSorterUsingQuickSort {
    public static void quickSort(double[] prices, int low, int high){
        if (low < high) {
            //call the method to get the index where the pivot element is correctly placed
            int pi = partition(prices, low, high);
            //recursively sort left and right of pivot
            quickSort(prices, low, pi-1);
            quickSort(prices,pi+1,high);
        }
    }
    public static int partition(double[] prices, int low, int high){
        double pivot = prices[high]; //last element is chosen as the pivot
        int i=low-1;
        //loop from start to one before pivot
        for(int j=low; j<high;j++){
            //compare the current element with pivot
            if(prices[j]<pivot){
                i++;
                double temp = prices[i];
                prices[i] = prices[j];
                prices[j]= temp;
            }
        }
        //place pivot at the correct position
        double temp = prices[i+1];
        prices[i+1] = prices[high];
        prices[high] = temp;

        return i+1; //return the partition index
    }

    public static void main(String[] args) {
        double[] productPrices = {1213.33, 525.23,999.8,132.55,89.68};
        System.out.println("Original Prices: " + Arrays.toString(productPrices));
        quickSort(productPrices,0,productPrices.length-1);
        System.out.println("Sorted Prices:  "+ Arrays.toString(productPrices));
    }
}
