package com.sparta.leanne.sorters;

public class InsertionSort implements Sorter {
    public int[] insertionSort(int array[]) {
        int size = array.length;
        for (int num = 1; num < size; num++) {
            int key = array[num];
            int index = num-1;
            while ( (index > -1) && ( array [index] > key ) ) {
                array [index+1] = array [index];
                index--;
            }
            array[index+1] = key;
        }
        return array;
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {

        return insertionSort(arrayToSort);
    }
}
