package com.sparta.leanne;

import com.sparta.leanne.sorters.BubbleSort;
import com.sparta.leanne.sorters.InsertionSort;
import com.sparta.leanne.sorters.MergeSort;
import com.sparta.leanne.sorters.Sorter;
import com.sparta.leanne.sorters.binaryTree.BinaryTreeSort;
import com.sparta.leanne.start.SortFactory;


import org.junit.jupiter.api.Test;

public class PerformanceTest {
    public Sorter sorter;
    int[] array =  {20,1,3,45,389,90,11};


    @Test
    public void mergeTest() {
        Sorter sorter = new MergeSort();
        long start = System.nanoTime();
        int[] ans = sorter.sortArray(array);
        sorter.sortArray(array);
        long end = System.nanoTime();
        System.out.println("MergeSort Took " + (end - start) + " nanoseconds to sort");
    }


    @Test
    public void bubbleTest() {
        Sorter sorter = new BubbleSort();
        long start = System.nanoTime();
        sorter.sortArray(array);
        long end = System.nanoTime();
        System.out.println("BubbleSort Took " + (end - start) + " nanoseconds to sort");
    }

    @Test
    public void binaryTest() {
        Sorter sorter = new BinaryTreeSort();
        long start = System.nanoTime();
        sorter.sortArray(array);
        long end = System.nanoTime();
        System.out.println("BinarySort Took " + (end - start) + " nanoseconds to sort");
    }

    @Test
    public void insertionSortTest() {
        Sorter sorter = new InsertionSort();
        long start = System.nanoTime();
        sorter.sortArray(array);
        long end = System.nanoTime();
        System.out.println("InsertionSort Took " + (end - start) + " nanoseconds to sort");
    }
}
