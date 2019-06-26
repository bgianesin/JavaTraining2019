package javatraining.ContionalStatement;

import javatraining.AddNumbers;

/**
 * Created by cq86zod on 7/05/2019.
 */
public class OddEven {
    public String checkOddEven(int pVal) {
        String lRc  = "Even";
        if ((pVal % 2) == 1)
            lRc = "Odd";

        return(lRc);
    }

    public static void main (String [] args) {
        OddEven oOddEven = new OddEven();
        int lVal = 1;
        System.out.println(lVal +":" + oOddEven.checkOddEven(lVal) +";");
        lVal = 2;
        System.out.println(lVal +":" + oOddEven.checkOddEven(lVal) +";");
        lVal = 3;
        System.out.println(lVal +":" + oOddEven.checkOddEven(lVal) +";");
    }
}
