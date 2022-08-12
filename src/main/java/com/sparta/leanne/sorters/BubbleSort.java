package com.sparta.leanne.sorters;

public class BubbleSort implements Sorter {

    public int[] bubbleSort(int[] array) {

        int biggest = 0;
        for (int loops = 0; loops < array.length - 1; loops++) {

            //ages = biggest(ages);

            int temp;

            for (int element = 0; element < array.length - 1; element++) {
                //System.out.println("element val is " + ages[element]);
                //System.out.println(ages[element] + " " + ages[element + 1]);

                if (array[element] > array[element + 1]) {
                    temp = array[element];
                    array[element] = array[element + 1];
                    array[element + 1] = temp;
                    //System.out.println("Swap");

                }
            }


        }

        return array;
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {

        return bubbleSort(arrayToSort);
    }
}