package com.sparta.thomas.util;
import com.sparta.thomas.util.Scan;
import com.sparta.thomas.util.Printer;


public class CreateIntArray {

    public static int[] createIntArray()
    {
        Scan scan = new Scan();
        int arrayLength=0;

        Printer.print("please input the desired length of the Array");
        arrayLength=scan.scanInt();
        while(arrayLength<1) {
            Printer.print("please input a number greater than 0");
            arrayLength = scan.scanInt();
        }

        while (arrayLength<2) {
            Printer.print("please input a number larger than 1");
            arrayLength=scan.scanInt();
        }

        int[] intArray = new int[arrayLength];
        Printer.print("Start entering the numbers for the array");
        for (int i = 0; i<arrayLength;i++)
        {
            intArray[i]=scan.scanInt();
            if (i<arrayLength-1)
            {
                Printer.print("please input the next number");
            }
        }
        return intArray;

    }
}
