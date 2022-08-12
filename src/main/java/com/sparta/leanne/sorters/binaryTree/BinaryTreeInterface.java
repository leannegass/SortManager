package com.sparta.leanne.sorters.binaryTree;


import com.sparta.leanne.exceptions.ChildNotFoundException;

public interface BinaryTreeInterface {

    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(final int[] elements);

    int[] getSortedTreeAsc(int[] testArray);
    boolean findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRighttChild(int element) throws ChildNotFoundException;



    int[] getSortedTreeDesc();

}
