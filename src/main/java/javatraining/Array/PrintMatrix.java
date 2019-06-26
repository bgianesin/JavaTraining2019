package javatraining.Array;

public class PrintMatrix {
       public static void main (String [] args) {
            int arrValue[][] = /*{{1, 2, 3, 4},
                                {4, 5, 6, 7},
                                {7, 8, 9, 10},
                                {10,11,12, 13}};*/
           {{1},
               {4},
               {7},
               {10}};
            System.out.println("Array Size : " + arrValue.length + ";");
           System.out.println("Array Size : " + arrValue[0].length + ";");
           for (int iCntLine=0;(iCntLine<arrValue.length);++iCntLine) {
               System.out.println("Value of Line " + iCntLine + "/" + arrValue.length + ":");
               for (int iCntCol = 0; (iCntCol < arrValue[iCntLine].length); ++iCntCol)
                   System.out.println("\tValue of " + iCntCol + "/" + arrValue[iCntLine].length + " :" + arrValue[iCntLine][iCntCol] + ";");
               System.out.println();
           }
           for (int iCntLine=0;(iCntLine<arrValue.length);++iCntLine) {
               System.out.println("\t--------------------");
               for (int iCntCol = 0; (iCntCol < arrValue[iCntLine].length); ++iCntCol) {
                   System.out.print("\t|\t" + arrValue[iCntLine][iCntCol]);

               }

               System.out.println();
           }
           System.out.println("\t-------------------");
       }

}
