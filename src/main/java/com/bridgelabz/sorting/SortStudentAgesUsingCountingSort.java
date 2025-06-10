package com.bridgelabz.sorting;

import java.util.Arrays;

public class SortStudentAgesUsingCountingSort {
    public static void countingSort(int[] ages){
        int min = 10;
        int max = 18;
        int range = max-min+1;
        int[] count = new int[range];
        int[] output = new int[ages.length];
        //step 1 : count frequencies
        for(int age : ages){
            count[age - min]++;
        }
        //step 2: Compute cumulative count
        for(int i=1; i< count.length; i++){
            count[i] += count[i-1];
        }
        //step 3 : Place elements into output array ( traverse original array from end for stability)
        for(int i=ages.length-1; i>=0; i--){
            output[count[ages[i] -min] -1] = ages[i];
            count[ages[i] - min] --;
        }
        //step 4 : Copy back to an original array
        for(int i=0; i< ages.length; i++){
            ages[i] = output[i];
        }
    }

    //main method
    public static void main(String[] args) {
        int[] studentAges =  {12, 15, 10, 18, 12, 14, 13, 15, 10};
        System.out.println("Original Ages: " + Arrays.toString(studentAges));
        countingSort(studentAges);
        System.out.println("Sort Ages: " + Arrays.toString(studentAges));

    }
}
