package com.sparta.thomas.sort;
import com.sparta.thomas.Exceptions.ChildNotFoundException;
import com.sparta.thomas.contract.BinaryTree;

public class BinaryTreeSort implements BinaryTree {

    class Node {
        int element;
        Node leftBranch, rightBranch;
    }
    @Override
    public int getRootElement() {
        return 0;
    }

    @Override
    public int getNumberOfElements() {
        return 0;
    }

    @Override
    public void addElement(int element) {

    }

    @Override
    public void addElements(int[] elements) {

    }

    @Override
    public boolean findElement(int value) {
        return false;
    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        return 0;
    }

    @Override
    public int[] getSortedTreeAsc() {
        return new int[0];
    }

    @Override
    public int[] getSortedTreeDesc() {
        return new int[0];
    }


}
