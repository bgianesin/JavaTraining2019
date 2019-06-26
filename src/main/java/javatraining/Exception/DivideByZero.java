package javatraining.Exception;

import java.util.Scanner;

public class DivideByZero {
    public DivideByZero() {
        System.out.println("Constructor");
    }
    public int EnterIntValue(String pMsg) {
        int iRc = 0;
        boolean bError;
        do {
            bError = false;
            System.out.println(pMsg);
            try {
                Scanner oSc = new Scanner(System.in);
                iRc = oSc.nextInt();
            } catch (Exception eXc) {
                System.out.println("Not Numeric");
                bError = true;
            }
        } while (bError);

        return(iRc);
    }

    public float ComputeDivision(int pToDiv, int pDiv) {
        float fRc;

        if (pDiv != 0) {
            fRc = (float) pToDiv / pDiv;
        }
        else {
            fRc = pToDiv / pDiv;
        }
        /*
        fRc = pToDiv / pDiv;

        /* fRc =  (float) pToDiv / pDiv;
        double dRc =  (double) (pToDiv) / (double) pDiv;
        try {
            fRc = (float) pToDiv / pDiv;
        }
        catch (Exception eXc){
            fRc = 0;
            System.out.println("EXECEPTION ERROR");
        }
        */

        return(fRc);
    }

    public static void main(String[] args) {
        int iToDivide;
        int iDivisor;
        float fResult = 0;


        DivideByZero    mDBZ = new DivideByZero();
        Scanner oScS = new Scanner(System.in);

        /*
            Ask Dividend, divisor and how result
            Run While user enter Y
         */
        while (true) {
            boolean bIHaveAnException = false;
            // Enter vide
            iToDivide = mDBZ.EnterIntValue("Value to divide : ");

            do {
                bIHaveAnException = false;
                iDivisor = mDBZ.EnterIntValue("Divisor : ");

                try {
                    fResult = mDBZ.ComputeDivision(iToDivide, iDivisor);
                } catch (ArithmeticException eXc) {
                    bIHaveAnException = true;
                }
            } while (bIHaveAnException);
            System.out.println("Result = " + fResult + ";");

            System.out.println("Enter Y to continue : ");
            String str = oScS.nextLine();
            if (str == "") break;
            if (str.length() == 0) break;
            if (!(str.toUpperCase().charAt(0) == 'Y'))  break;
            System.out.println("-----------------------------");
        }
    }
}
