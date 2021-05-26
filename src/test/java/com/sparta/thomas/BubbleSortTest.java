package com.sparta.thomas;
import org.junit.jupiter.api.*;
import com.sparta.thomas.sort.BubbleSort;

public class BubbleSortTest {



    @Test
    @DisplayName("given a array of un-ordered numbers, should return a ordered array with those same numbers")
    public void simpleBubbleTest(){
        int[] input = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expectedOutput = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(expectedOutput,bubbleSort.sortArray(input));
    }
    @Test
    @DisplayName("given a array of un-ordered numbers, should return a ordered array with those same numbers")
    public void harderBubbleTest(){
        int[] input = {9,9,-7,7,5,-4,3,43,1};
        int[] expectedOutput = {-7,-4,1,3,5,7,9,9,43};
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertArrayEquals(expectedOutput, bubbleSort.sortArray(input));
    }
}
