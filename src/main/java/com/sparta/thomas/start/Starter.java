package com.sparta.thomas.start;

import com.sparta.thomas.Exceptions.ChildNotFoundException;
import com.sparta.thomas.sort.BinaryTreeSort;
import com.sparta.thomas.sort.BubbleSort;
import com.sparta.thomas.sort.MergeSort;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Starter {

    public void start() {
      //  int[] intArray = intArray = CreateIntArray.createIntArray();
        int[] testArray = {78,96,5,23,448,23,476,346,23,64,7,6,9,15,14,7,6,78,96};
        int[] returnTestArrayBubble, returnTestArrayMerge,input = {2,10,6,90,9,11,12,14,18,20};


        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(10);
        binaryTreeSort.addElements(input);


        returnTestArrayBubble=binaryTreeSort.getSortedTreeDesc();
        System.out.println(Arrays.toString(returnTestArrayBubble));

      //  BubbleSort bubbleSort = new BubbleSort();
      //  MergeSort mergeSort = new MergeSort();
      //  returnTestArrayBubble = bubbleSort.sortArray(intArray);
      //  System.out.println(Arrays.toString(returnTestArrayBubble));
       // returnTestArrayMerge = mergeSort.sortArray(intArray);
     //   System.out.println(Arrays.toString(returnTestArrayMerge));


    }
}
