package com.sparta.leanne.display;

import com.sparta.leanne.sorters.Sorter;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayManager {
    public static ArrayList<String> menu(){
        return new ArrayList<>(Arrays.asList(
                "BubbleSort",
                "InsertionSort",
                "MergeSort",
                "BinaryTreeSort"
        ));
    }

    public static void choices() {
        System.out.println("Enter your choice: ");
        for (int element = 0; element < menu().size(); element++){
            System.out.println(element + 1 + " :" + menu().get(element));
        }


    }

    public static void unsortedArray(Sorter sorter, int[] arrayToSort) {
        System.out.println("Unsorted array is:\n" + Arrays.toString(arrayToSort));
    }

    public static void sortedArray(Sorter sorter, int[] arrayToSort) {
        int[] sortedArray = sorter.sortArray(arrayToSort);
        System.out.println("Array after sorting:\n" + Arrays.toString(sortedArray));

    }
}
