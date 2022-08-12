package com.sparta.leanne.sorters;

public class MergeSort implements Sorter {

    public static int[] mergeSort(int[] arrayToSort, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arrayToSort, left, mid);
            mergeSort(arrayToSort, mid + 1, right);
            merge(arrayToSort, left, mid, right);
        }
        return arrayToSort;
    }
    public static void merge(int array[], int start, int mid, int end) {

        int Leftlen = mid - start + 1;
        int Rightlen = end - mid;

        int LeftArr[] = new int[Leftlen];
        int RightArr[] = new int[Rightlen];

        for (int i = 0; i < Leftlen; i++)
            LeftArr[i] = array[start + i];
        for (int j = 0; j < Rightlen; j++)
            RightArr[j] = array[mid + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = start;

        while (i < Leftlen && j < Rightlen) {
            if (LeftArr[i] <= RightArr[j]) {
                array[k] = LeftArr[i];
                i++;
            } else {
                array[k] = RightArr[j];
                j++;
            }
            k++;
        }

        while (i < Leftlen) {
            array[k] = LeftArr[i];
            i++;
            k++;
        }

        while (j < Rightlen) {
            array[k] = RightArr[j];
            j++;
            k++;
        }
    }


    @Override
    public int[] sortArray(int[] arrayToSort) {

        return mergeSort(arrayToSort,0,arrayToSort.length-1);
    }
}

