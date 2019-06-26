package javatraining.Loops;

import javax.swing.*;

public class ExtendedFor {


    public static void main(String[] args) {
        String tstr[] = new String[10];
        String sfn;
        /*sfn = JOptionPane.showInputDialog("Firt Name");
        */
        int iCnt = 0;
        for (String sStr:tstr) {
           /*sfn = JOptionPane.showInputDialog("Firt Name");
            */
            tstr[iCnt] = String.valueOf (iCnt);
           ++iCnt;
        }
        /*for(int i=0;i < tstr.length;++i) {
            tstr[i] = String.valueOf (i);
        }*/

        for (String iStr:tstr) {
            System.out.println(iStr);
        }
    }
}
