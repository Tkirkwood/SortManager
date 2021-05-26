package com.sparta.thomas;

import com.sparta.thomas.sort.BinaryTreeSort;
import com.sparta.thomas.sort.BubbleSort;
import com.sparta.thomas.sort.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreeTest {


    @Test
    @DisplayName("gets the root element for the Binary Tree")
    public void getRootElementTest()
    {
       int expectedRootElement = 7,
               inputRootElement = 7;

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        Assertions.assertEquals(7,binaryTreeSort.getRootElement() );
    }
  /*  @Test
    @DisplayName("Displays the element of a newly created node")
    public void addElementTest()
    {
        int expectedElement = 17,
                inputElement = 17;

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        Assertions.assertEquals(expectedElement,binaryTreeSort.addElement(inputElement));
    }
   @Test
    @DisplayName("Displays an array of the element of a newly created nodes")
    public void addElementsTest()
    {
        int[] expectedElement = {17,9,23,1,5},
                inputElement = {17,9,23,1,5};

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        Assertions.assertArrayEquals(expectedElement.toString(),binaryTreeSort.addElements(inputElement));
    }
*/
    @Test
    @DisplayName("Displays an array of the element of a newly created nodes")
    public void getNumberOfElementsTest()
    {
        int expectedOutput = 6;
        int[] inputElement = {17,9,23,1,5};

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        binaryTreeSort.addElements(inputElement);
        Assertions.assertEquals(expectedOutput,binaryTreeSort.getNumberOfElements());
    }
    @Test
    @DisplayName("Displays an array of the element of a newly created nodes")
    public void findElementTest()
    {

        int[] inputElement = {17,9,23,1,5};

        BinaryTreeSort binaryTreeSort = new BinaryTreeSort(7);
        binaryTreeSort.addElements(inputElement);
        Assertions.assertTrue(binaryTreeSort.findElement(9));
    }


}
