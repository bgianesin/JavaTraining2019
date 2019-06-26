package javatraining.Loops;

import java.util.Scanner;

public class Pattern {
    int iNbSpace = 2;

    /**
     * A) Doc leftTriangle
     * @param pVal hqkjsdfhkqsjhfskj
     *
     * @return b
     *
     * @throws
     *
     * @author d
     *
     * @version e
     *
     * @see int
     *
     * @since g
     *
     * @serial h
     *
     * @deprecated i
     *      1
     *      1 2
     *      1 2 3
     *      1 2 3 4
     *      1 2 3 4 5
     */
    public void leftTriangle(int pVal) {
        leftTriangle(pVal, ' ');
    }
    /*
   E)
           *
          * *
         * * *
        * * * *
       * * * * *
    */
    /*
    A)
     1
     1 2
     1 2 3
     1 2 3 4
     1 2 3 4 5
     */
    public void leftTriangle(int pVal, char pChar) {
        //int iCnt;
        for(int iCntLine=1;(iCntLine<=pVal);iCntLine++) {
            for(int iCntCol=1;(iCntCol<=iCntLine);iCntCol++) {
                if (pChar == ' ')
                    System.out.print(" " + iCntCol);
                else
                    System.out.print(" " + pChar);
            }
            System.out.println();
        }
    }

   /*
   B)
            1
          1 2
        1 2 3
      1 2 3 4
    1 2 3 4 5
    */
   public void rightTriangle(int pNbLine) {
       rightTriangle(pNbLine, ' ');
   }

   public void rightTriangle(int pNbLine, char pChar) {
        //int iCnt;
        for(int iCntLine=1;(iCntLine<=pNbLine);iCntLine++) {
            for(int iCntCol=1;(iCntCol<=pNbLine-iCntLine);iCntCol++) {
                System.out.print("  ");//(":-");
            }
            for(int iCntCol=1;(iCntCol<=iCntLine);iCntCol++) {
                if (pChar == ' ')
                    System.out.print(" " + iCntCol);
                else
                    System.out.print(" " + pChar);
            }
            System.out.println();
        }
    }
    /*
    C)
            1
            2 1
            3 2 1
            4 3 2 1
            5 4 3 2 1
    */
    public void leftTriangleR(int pLine) {
        //int iCnt;
        for(int iCntLine=1;(iCntLine<=pLine);iCntLine++) {
            for(int iCntCol=iCntLine;(iCntCol>=1);iCntCol--) {
                System.out.print(" " + iCntCol);
            }
            System.out.println();
        }
    }
    /*
    C')
             1
           2 1
         3 2 1
       4 3 2 1
     5 4 3 2 1
    */
    public void rightTriangleR(int pNbLine) {
        //int iCnt;
        for(int iCntLine=1;(iCntLine<=pNbLine);iCntLine++) {
            for(int iCntCol=1;(iCntCol<=pNbLine-iCntLine);iCntCol++) {
                System.out.print("  ");//(":-");
            }
            for(int iCntCol=iCntLine;(iCntCol>=1);iCntCol--) {
                System.out.print( " " + iCntCol);
            }
            System.out.println();
        }
    }
    /*
    D)
            1
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5
    */
    public void pyramide(int pNbLine) {
        //int iCnt;
        for(int iCntLine=1;(iCntLine<=pNbLine);iCntLine++) {
            pyramideprintline(iCntLine, pNbLine, ' ');
        }
    }
    /*G)
         *
        * *
       * * *
      * * * *
     * * * * *
     */
    public void pyramide(int pNbLine, char pChar) {
        for(int iCntLine=1;(iCntLine<=pNbLine);iCntLine++) {
            pyramideprintline(iCntLine, pNbLine, pChar);
        }
    }
    /*
        D')
                1
               1 2
              1 2 3
             1 2 3 4
            1 2 3 4 5
        */
    public void pyramideR(int pNbLine) {
        //int iCnt;
        for(int iCntLine=1;(iCntLine<=pNbLine);iCntLine++) {
            for(int iCntCol=1;(iCntCol<=(pNbLine-iCntLine) * iNbSpace / 2);iCntCol++) {
                System.out.print("-");//(":-");
            }
            for(int iCntCol=iCntLine;(iCntCol>=1);iCntCol--) {
                for(int iCntSpace=1;(iCntSpace <= iNbSpace-1);++iCntSpace) System.out.print(" ");
                System.out.print(iCntCol);
            }
            System.out.println();
        }
    }

    /*
    E)
            1
           123
          12345
         1234567
        123456789
         1234567
          12345
           123
            1
    */

    public void pyramideprintline(int pLine, int pTotalLine, char pChar) {
        for (int iCntCol = 1; (iCntCol <= (pTotalLine - pLine) * iNbSpace / 2); iCntCol++) {
            System.out.print("-");//(":-");
        }
        for (int iCntCol = 1; (iCntCol <= pLine); iCntCol++) {
            for (int iCntSpace = 1; (iCntSpace <= iNbSpace - 1); ++iCntSpace) System.out.print(" ");
            if (pChar == ' ')
                System.out.print(iCntCol);
            else
                System.out.print(pChar);
        }
        System.out.println();
    }

    public void pyramideM(int pNbLine) {
        //int iCnt;
        pyramideM(pNbLine, ' ');
    }

    /*
    F)
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
    */
    public void pyramideM(int pNbLine, char pChar) {
        //int iCnt;
        if (pNbLine % 2 == 1) {
            for (int iCntLine = 1; (iCntLine <= pNbLine); iCntLine++) {
                boolean bToPrint = iCntLine % 2 == 1;
                if (bToPrint) {
                    pyramideprintline(iCntLine, pNbLine, pChar);
                }
            }

            for (int iCntLine = pNbLine-2; (iCntLine >= 1); iCntLine--) {
                boolean bToPrint = iCntLine % 2 == 1;
                if (bToPrint) {
                    pyramideprintline(iCntLine, pNbLine, pChar);
                }
            }

        }
        else {
            System.out.println("Pas Impair");
        }
    }
   /*
    F)
            *
           * *
          * * *
         * * * *
        * * * * *
    */
    public static void main(String[] args) {
        int iNumber;
        Pattern oPattern = new Pattern();

        Scanner oScanner = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iNumber = oScanner.nextInt();

        oPattern.iNbSpace = 2;

        System.out.println("A) leftnumtriangle");
        oPattern.leftTriangle(iNumber);

        System.out.println("B) rightnumtriangle");
        oPattern.rightTriangle(iNumber);

        System.out.println("C) leftnumtriangleR");
        oPattern.leftTriangleR(iNumber);

        System.out.println("C') rightnumtriangleR");
        oPattern.rightTriangleR(iNumber);

        System.out.println("D) pyramide");
        oPattern.pyramide(iNumber);

        System.out.println("D') pyramideR");
        oPattern.pyramideR(iNumber);

        oPattern.iNbSpace = 1;

        System.out.println("E) pyramideM");
        oPattern.pyramideM(iNumber);
        System.out.println("F) pyramideM Char");
        oPattern.pyramideM(iNumber, '*');

        oPattern.iNbSpace = 2;

        System.out.println("G) pyramide Char");
        oPattern.pyramide(iNumber, '*');

        System.out.println("H) leftnumtriangle Char");
        oPattern.leftTriangle(iNumber, '*');

        System.out.println("I) rightnumtriangle Char");
        oPattern.rightTriangle(iNumber, '*');
    }
}
