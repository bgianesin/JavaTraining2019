package javatraining.Array;

public class FindValue {
    public int  findValue(int pArray[], char pKind) {
        int iRc = pArray[0];
        for (int iCntEl=1;(iCntEl<pArray.length);++iCntEl) {
            if (pKind == 'L'){
                if ( pArray[iCntEl] < iRc )
                    iRc = pArray[iCntEl];
            }
            else {
                if ( pArray[iCntEl] > iRc )
                    iRc = pArray[iCntEl];
            }
        }
        return(iRc);
    }
    public static void main (String [] args) {
        FindValue oFD = new FindValue();
        int arrValue[] = {0,10,2,31,44,7,25,1,26,100};

        System.out.println("Print Array = ");
        for (int iCnt = 0;(iCnt < arrValue.length);++iCnt)
            System.out.print(arrValue[iCnt] + ", ");
        System.out.println("");
        System.out.println("High Value : "+ oFD.findValue(arrValue, 'H') + ";");
        System.out.println("Less Value : "+ oFD.findValue(arrValue, 'L') + ";");
    }
}
