package com.sparta.thomas.start;

import com.sparta.thomas.contract.Sorter;
import com.sparta.thomas.sort.BinaryTreeSort;
import com.sparta.thomas.sort.BubbleSort;
import com.sparta.thomas.sort.MergeSort;
import com.sparta.thomas.util.*;

public class SorterFactory {


    public Sorter getSorter(SortTypes sortType) {

    Sorter sorter;
        switch (sortType) {
            case BubbleSort:
                sorter = new BubbleSort();
                System.out.println("bubblesort");
                break;

            case MergeSort:
                sorter = new MergeSort();
                System.out.println("merge sort");
                break;
            case BinaryTreeAsc:
                sorter = new BinaryTreeSort("Asc");
                System.out.println("binary tree asc");
                break;
            case BinaryTreeDesc:
                sorter = new BinaryTreeSort("Desc");
                System.out.println("binary tree desc");
                break;
            default:
                sorter=null;
                System.out.println("null");
                break;
        }
        return sorter;
    }
}
