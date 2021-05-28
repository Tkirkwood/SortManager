package com.sparta.thomas.start;


import com.sparta.thomas.Exceptions.ArrayLengthOfZeroException;
import com.sparta.thomas.contract.Sorter;
import com.sparta.thomas.util.*;

import java.util.Arrays;


public class Starter {

    public void start() {
        int[] intArray = new int[0];
       // int[] testArray = {78,96,5,23,448,23,476,346,23,64,7,6,9,15,14,7,6,78,96};
        int[] testArray = new int[0];
       // int[] returnTestArrayBubble, returnTestArrayMerge,input = {2,10,6,90,9,11,12,14,18,20};
        Scan scan = new Scan();
        int tempSortType;
        SortTypes sortType = null;

        SorterFactory sorterFactory = new SorterFactory();
        Printer.print("please input either 1 for BubbleSort, 2 for MergeSort,3 for BinaryTreeAsc or 4 for BinaryTreeDesc for the desired sorter");
        tempSortType=scan.scanInt();
        while(tempSortType <1 || tempSortType>4){
            Printer.print("please input a valid sorter type");
            tempSortType=scan.scanInt();
        }
        for (SortTypes tempSortTypes: SortTypes.values()) {
            if (tempSortTypes.ordinal() == tempSortType-1) {
                sortType = tempSortTypes;
            }
        }
        Printer.print("please follow the instructions to begin imputing your array");
        try { intArray = CreateIntArray.createIntArray();}
        catch (ArrayLengthOfZeroException e) {
            LoggerClass.logger.error(e.getMessage());
        }
        Printer.print(Arrays.toString(intArray));
        Sorter sorter = sorterFactory.getSorter(sortType);
        Printer.print(Arrays.toString(sorter.sortArray(intArray)));





    }
}
