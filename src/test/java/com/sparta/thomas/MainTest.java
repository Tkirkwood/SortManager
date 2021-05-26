package com.sparta.thomas;

import com.sparta.thomas.sort.BubbleSort;
import com.sparta.thomas.sort.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    @DisplayName("given a array of un-ordered numbers, should return a ordered array with those same numbers")
    public void simpleBubbleTest(){
        int[] input = {9,8,7,6,5,4,3,2,1};
        int[] expectedOutput = {1,2,3,4,5,6,7,8,9};
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(expectedOutput, bubbleSort.sortArray(input));
    }
    @Test
    @DisplayName("given a array of un-ordered numbers, should return a ordered array with those same numbers")
    public void harderBubbleTest(){
        int[] input = {9,9,-7,7,5,-4,3,43,1};
        int[] expectedOutput = {-7,-4,1,3,5,7,9,9,43};
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(expectedOutput, bubbleSort.sortArray(input));
    }
/*
    @Test
    @DisplayName("when given two separate sorted arrays, will combine them into a new sorted array")
    public void mergeSortMergeTest(){
        int[] array1 = {1,3,5,7,9},
                array2 = {2,4,6,8},
                output = {1,2,3,4,5,6,7,8,9};
        MergeSort mergeSort = new MergeSort();
        //requires merge method to be made public
        Assertions.assertArrayEquals(output,mergeSort.merge(array1,array2));
    }
    */
    @Test
    @DisplayName("When given a unsorted array, will then output a sorted array with the same element as the unsorted array")
    public void mergeSortTest(){
        int[] arrayToSort = {1,3,5,7,9,2,4,6,8},
                output = {1,2,3,4,5,6,7,8,9};
        MergeSort mergeSort = new MergeSort();
        Assertions.assertArrayEquals(output,mergeSort.sortArray(arrayToSort));

    }

}
