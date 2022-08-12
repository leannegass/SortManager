package com.sparta.leanne.sorters.binaryTree;


// public - methods you can access
//private - implementation
//abstract Nodes - values

import com.sparta.leanne.exceptions.ChildNotFoundException;
import com.sparta.leanne.sorters.Sorter;

public class BinaryTreeSort implements Sorter, BinaryTreeInterface {
    private Node rootNode;
    //private int[] arrayToSort;

    private static int index;
    private int[] arrayToSort;


    public BinaryTreeSort() {

    }

    @Override
    public int[] sortArray(int[] arrayToSort) {
        rootNode = new Node(arrayToSort[0]);
        this.arrayToSort = arrayToSort;
        addElements(arrayToSort);
        return getSortedTreeAsc(arrayToSort);
    }

    public void addElementToTree(final int element){
        addNodeToTree(rootNode, element);
    }


    @Override
    public int getRootElement() {

        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return numberOfElements(rootNode);

    }
    public int numberOfElements(Node rootNode) {
        if(rootNode == null) {
            return 0;
        }
        else {
            return 1 + numberOfElements(rootNode.getLeftChild()) +
                    numberOfElements(rootNode.getRightChild());
        }

    }

    @Override
    public void addElement(int element) {
       addNodeToTree(rootNode, element);



    }

    @Override
    public void addElements(int[] elements) {
        for (int element : elements){
            addElement(element);

        }


    }

    @Override
    public boolean findElement(final int value) {
        Node node = findNode(value);
        if(node != null) {
            try {
                getLeftChild(value);
                getRightChild(value);
            } catch (ChildNotFoundException e) {
                e.printStackTrace();
            }
            return true;
        }
        return false;
    }


    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.getLeftChild() == null) {
            throw new ChildNotFoundException();
        }
        return node.getLeftChild().getValue();
    }

    @Override
    public int getRighttChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }


    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = findNode(element);
        if(node.getRightChild() == null) {
            throw new ChildNotFoundException();
        }
        return node.getRightChild().getValue();
    }
    @Override
    public int[] getSortedTreeAsc(int[] testArray){
        int[] ans = new int[testArray.length];
        return getSortedTreeAsc(ans, rootNode);

    }


    /*
    @Override
    public int[] getSortedTreeAsc() {
        int[]sorted  = new int[arrayToSort.length];
        return getSortedTreeAsc(arrayToSort, rootNode);
    }
    */
    public static int[] getSortedTreeAsc(int[] arrayToSort, Node rootNode) {
        if (!rootNode.isLeftChildEmpty()) {
            getSortedTreeAsc(arrayToSort, rootNode.getLeftChild());
        }
        arrayToSort[index] = rootNode.getValue();
        index += 1;
        if (!rootNode.isRightChildEmpty()) {
            getSortedTreeAsc(arrayToSort, rootNode.getRightChild());
        }
        return arrayToSort;



    }



    private  void addNodeToTree(Node node,int element){
        if (element < node.getValue()){
            if (node.isLeftChildEmpty()){
                node.setLeftChild(new Node(element));
            }
            else{
                addNodeToTree(node.getLeftChild(), element);
            }
        }
        else if (element > node.getValue()){
            if (node.isRightChildEmpty()){
                node.setRightChild(new Node(element));
            }
            else{
                addNodeToTree(node.getRightChild(), element);
            }
        }

    }

    private Node findNode(int element){
        Node node = rootNode;
        while (node != null){
            if (element == node.getValue()){
                return node;
            }
            if (element < node.getValue()){
                node  = node.getLeftChild();
            }
            if (element > node.getValue()){
                node = node.getRightChild();
            }

        }
        return null;
    }


}

