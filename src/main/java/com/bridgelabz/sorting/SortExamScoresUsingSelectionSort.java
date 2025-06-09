package com.bridgelabz.sorting;

import java.util.Arrays;

public class SortExamScoresUsingSelectionSort {
    //method to perform Selection sort on  the scores array
    public static void selectionSort(int[] scores){
        int n = scores.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i; //assume i as a smallest
            //loop for searching a real minimum element
            for(int j=i+1; j<n; j++){
                //update minIndex if a smaller value is found
                if(scores[j] < scores[minIndex]){
                    minIndex = j;
                }
            }
            //swap the smallest found element with the one at the position i
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {82,98,35,78,79};
        System.out.println("Original Scores: " + Arrays.toString(examScores));
        selectionSort(examScores);
        System.out.println("Sorted Scores: " + Arrays.toString(examScores));
    }
}
