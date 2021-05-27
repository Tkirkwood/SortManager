package com.sparta.thomas.sort;
import com.sparta.thomas.Exceptions.ChildNotFoundException;
import com.sparta.thomas.contract.BinaryTree;

public class BinaryTreeSort implements BinaryTree {

    class Node {
        int element;
        Node leftBranch, rightBranch;
        public Node (int element){this.element=element;};
        public Node(){};
    }
    Node root = new Node();
    boolean rootInitialised = false;
    int numberOfElements = 0;
    private static int[] sortedArray;
    private static int sortedArrayIndex=0;

    public BinaryTreeSort (int rootElement){
        root.element = rootElement;
        rootInitialised = true;
        numberOfElements++;
    }
    public BinaryTreeSort(){};

    @Override
    public int getRootElement() {
        return root.element;
    }

    @Override
    public int getNumberOfElements() {
        return numberOfElements;
    }

    @Override
    // returns int for testing
    public void addElement(int element) {
        if (!rootInitialised)
        {
            root.element = element;
        }
        Node node = root;

        while (true) {
            if (element == node.element){
                return;
            }
            if (element > node.element && node.rightBranch == null)
            {
                node.rightBranch = new Node(element);
                numberOfElements++;
                return;
            }
            if (element < node.element && node.leftBranch == null)
            {
                node.leftBranch = new Node(element);
                numberOfElements++;
                return;
            }
            if (element > node.element && node.rightBranch != null)
            {

                node = node.rightBranch;

            }else if (element < node.element && node.leftBranch != null)
            {
                node = node.leftBranch;
            }

        }




    }

    @Override
    //returns an array for testing
    public void addElements(int[] elements) {
        for (int i =0; i< elements.length;i++)
        {
            addElement(elements[i]);

        }
        return;

    }

    @Override
    public boolean findElement(int value) {

      Node node = root;

      while (true)
      {
          if (value == node.element){
              return true;
          }
          if (value > node.element && node.rightBranch == null)
          {
              return false;
          }
          if (value < node.element && node.leftBranch == null)
          {
              return false;
          }
          if (value > node.element && node.rightBranch != null)
          {
              node = node.rightBranch;
          }
          if (value < node.element && node.leftBranch != null)
          {
              node = node.leftBranch;
          }
      }


    }

    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
        Node node = root;
        while (true) {

            if (element == node.element && node.leftBranch != null) {
                return node.leftBranch.element;
            }
            if (element == node.element && node.leftBranch == null) {
                throw new ChildNotFoundException();
            }

            if (element > node.element && node.rightBranch != null) {
                node = node.rightBranch;
            }
            if (element < node.element && node.leftBranch != null) {
                node = node.leftBranch;
            }
        }



    }

    @Override
    public int getRightChild(int element) throws ChildNotFoundException {
        Node node = root;
        while(true) {
            if (element == node.element && node.rightBranch != null) {
                return node.rightBranch.element;
            }
            if (element == node.element && node.rightBranch == null) {
                throw new ChildNotFoundException();
            }

            if (element > node.element && node.rightBranch != null) {
                node = node.rightBranch;
            }
            if (element < node.element && node.leftBranch != null) {
                node = node.leftBranch;
            }
        }

    }

    @Override
    public int[] getSortedTreeAsc() {
        // check left tree if true go left if false print parent, then if right go right repeat
        this.sortedArray=new int[numberOfElements];
        this.sortedArrayIndex=0;

        ascRecursion(root);
        return this.sortedArray;
    }

    private void ascRecursion(Node node){
        if (node.leftBranch != null)
        {
            ascRecursion(node.leftBranch);
        }
        sortedArray[sortedArrayIndex++] = node.element;
        if (node.rightBranch!=null)
        {
            ascRecursion(node.rightBranch);
        }

    }

    @Override
    public int[] getSortedTreeDesc() {
        this.sortedArray=new int[numberOfElements];
        this.sortedArrayIndex=0;

        descRecursion(root);
        return this.sortedArray;
    }

    private void descRecursion(Node node){
        if (node.rightBranch != null)
        {
            descRecursion(node.rightBranch);
        }
        sortedArray[sortedArrayIndex++] = node.element;
        if (node.leftBranch!=null)
        {
            descRecursion(node.leftBranch);
        }

    }


}
