package javatraining.Loops;

import java.util.Scanner;

public class ForLoop {
        public static void main (String [] args) {
            int iLoop, nbLoop;

            System.out.println("Enter nbLoop : ");
            Scanner oScanner = new Scanner(System.in);
            nbLoop = oScanner.nextInt();
            System.out.println("Enter Month : ");
            for(iLoop=1;(iLoop <= nbLoop);++iLoop) {
                System.out.println("iLoop : " + iLoop + ";");
            }
            int itest = 1;
            System.out.println("iTest : " + (itest++ + 1) + ";");
            itest = 1;
            System.out.println("iTest : " + (++itest + 1) + ";");
        }
}
