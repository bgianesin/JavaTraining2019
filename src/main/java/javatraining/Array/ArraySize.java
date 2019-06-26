package javatraining.Array;

import java.util.Scanner;

public class ArraySize {
    public static void main (String [] args) {
        int arr[] = new int[3];
        int arrValue[] = {1, 2, 3, 4, 6};

        System.out.println("Array Size : " + arrValue.length + ";");

        System.out.println("----- 1");
        for (int iCnt = 0; (iCnt < arrValue.length); ++iCnt)
            System.out.println("Value of " + iCnt + "/" + arrValue.length + " :" + arrValue[iCnt]);

        System.out.println("----- 2");
        int iCntL = 0;
        for (; ; ) {
            if (++iCntL == 10) break;
        }
        System.out.println("Value of i : " + iCntL);

        try {
            System.out.println("----- 3");
            for (int iCnt = 1; (iCnt < arrValue.length); ++iCnt)
                System.out.println("Value of " + iCnt + "/" + arrValue.length + " :" + arrValue[iCnt]);

            System.out.println("AFter Loop");
            int result = 5 / 0;
            System.out.println("AFter Div 0");
        } catch (ArrayIndexOutOfBoundsException excp) {
            System.out.println("Invalid Index : ");
        } catch (Exception excp){
            System.out.println("Exception ");
        }
        finally {
            System.out.println("Finally ");
        }
    }
    public void arrInput() {

    }

}
