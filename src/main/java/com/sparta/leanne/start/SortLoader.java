package com.sparta.leanne.start;

import com.sparta.leanne.display.DisplayManager;
import com.sparta.leanne.sorters.Sorter;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortLoader {
    private final static Scanner scanner = new Scanner(System.in);
    public static void starter(){
        DisplayManager.choices();
        int choice = scanner.nextInt();

        Sorter sorter = SortFactory.getSorter(choice);
        System.out.println("Enter the size of array: ");
        int[] arrayToSort = randomArray(scanner.nextInt());
        System.out.println(sorter);
        DisplayManager.unsortedArray(sorter, arrayToSort);
        DisplayManager.sortedArray(sorter,arrayToSort);


    }

    public static int[] randomArray(int length) {
        int[] randomArray = new int[length];

        for (int num = 0; num < randomArray.length; num++) {
            randomArray[num] = new Random().nextInt(100);
        }
        return randomArray;


    }
}
