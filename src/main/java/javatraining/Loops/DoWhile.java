package javatraining.Loops;

import java.util.Scanner;

public class DoWhile {
    /**
     * 12345
     * 54321
     */
    public int reversenumber(int pValue) {
        int pDiv = 10;
        int iRest = pValue;
        int iRcVal = 0;

        do {
            System.out.print(iRest % 10);
            iRcVal = (iRcVal * 10) + (iRest % 10);
            iRest = iRest / 10;
        } while (iRest > 0);
        System.out.println();
        return(iRcVal);
    }

    public static void main (String [] args) {
        int iNumber;
        DoWhile oDoWhile = new DoWhile();

        Scanner oScanner = new Scanner(System.in);
        System.out.println("Enter Number : ");
        iNumber = oScanner.nextInt();
        System.out.println("Reverse Do WHile :" + oDoWhile.reversenumber(iNumber) + ";");

    }
}
