package com.sparta.leanne;

import com.sparta.leanne.sorters.BubbleSort;
import com.sparta.leanne.sorters.InsertionSort;
import com.sparta.leanne.sorters.MergeSort;
import com.sparta.leanne.sorters.binaryTree.BinaryTreeSort;
import com.sparta.leanne.start.SortLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SorterTest {
    int[] testArray = {2,66,7,90,1,5};
    int[] sortedArray = {1,2,5,7,66,90};

    @Test
    void bubbleSortTest() {
        BubbleSort bubbleSort = new BubbleSort();
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(bubbleSort.bubbleSort(testArray)));
    }

    @Test
    void binaryTreeSortTest() {
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(binaryTreeSort.sortArray(testArray)));
    }



    @Test
    void mergeSortTest() {
        MergeSort mergeSort = new MergeSort();
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(mergeSort.sortArray(testArray)));
    }

    @Test
    void insertionSortTest() {
        InsertionSort insertionSort = new InsertionSort();
        Assertions.assertEquals(Arrays.toString(sortedArray), Arrays.toString(insertionSort.insertionSort(testArray)));
    }
}
