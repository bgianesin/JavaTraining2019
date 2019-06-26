package javatraining.ContionalStatement;

import java.util.Scanner;

public class PrintMonth {
    public static void main (String [] args) {
        String sMonth;
        int iMonth;

        Scanner oScanner = new Scanner(System.in);

        System.out.println("Enter Month : ");
        iMonth= oScanner.nextInt();
        switch(iMonth)  {
            case 1:
                sMonth = "Janvier";
                break;
            case 2 :
                sMonth = "Fevrier";
                break;
            case 3 :
                sMonth = "Mars";
                break;
            case 4 :
                sMonth = "Avril";
                break;
            case 5 :
                sMonth = "Mai";
                break;
            case 6 :
                sMonth = "Juin";
                break;
            case 7 :
                sMonth = "Juillet";
                break;
            case 8 :
                sMonth = "Aout";
                break;
            case 9 :
                sMonth = "Septembre";
                break;
            case 10 :
                sMonth = "Octobre";
                break;
            case 11  :
                sMonth = "Novembre";
                break;
            case 12 :
                sMonth = "Décembre";
                break;
                default :
                sMonth = "Non";
                break;
        }

        System.out.println("Mois : " + sMonth + ";");
    }
}

