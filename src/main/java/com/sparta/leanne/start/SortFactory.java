package com.sparta.leanne.start;

import com.sparta.leanne.sorters.*;
import com.sparta.leanne.sorters.binaryTree.BinaryTreeSort;

public class SortFactory {
    public static Sorter getSorter(int choice) { //throws SortLoaderException {
        return switch (choice){
            case 1  ->  new BubbleSort();
            case 2  ->  new InsertionSort();
            case 3  ->  new MergeSort();
            case 4  ->  new BinaryTreeSort();
            default ->  null;


        };


    }


}
