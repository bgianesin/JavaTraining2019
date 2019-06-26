package javatraining.Array;

import java.util.Scanner;

public class FirstArray {

    public static void main(String[] args) {

        System.out.println("Hey boss , give the size of array");
        Scanner objScanner = new Scanner(System.in);

        int arraySize = objScanner.nextInt();


        // Declare the array
        int firstArray[] = new int[arraySize];

        //Input

        for (int index = 0; index < firstArray.length; index++) {

            System.out.println("Enter the value number :" + (index + 1));

            firstArray[index] = objScanner.nextInt();

        }

        //output
        System.out.println("Hey dude here is the elements of the array");

        for (int count = 0; count < firstArray.length; count++) {
            System.out.println(firstArray[count]);
        }
    }
}



