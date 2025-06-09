package com.bridgelabz.sorting;

//imported to use the method toString() to print the array
import java.util.Arrays;

public class SortStudentMarksUsingBubbleSort {
    public static void bubbleSort(double[] marks){
        int n = marks.length;
        boolean swapped;
        for(int i=0; i<n-1 ; i++){
            swapped = false;
            for(int j=0; j<n-i-1;j++){
                if(marks[j]>marks[j+1]){
                    double temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)
                break; //Stop if no swaps occurred
        }
    }
    public static void main(String[] args){
        double[] studentMarks = {58,76.6,88.7,48.37,20, 99};
        System.out.println("Original Marks : " + Arrays.toString(studentMarks));
        bubbleSort(studentMarks);
        System.out.println("Sorted Marks: " + Arrays.toString(studentMarks));
    }
}
