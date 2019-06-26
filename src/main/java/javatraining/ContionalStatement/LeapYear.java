package javatraining.ContionalStatement;
import java.util.Scanner;

public class LeapYear{
    public static void main (String [] args) {
        int iYear;

        Scanner oScanner = new Scanner(System.in);

        System.out.println("Enter Year : ");
        iYear= oScanner.nextInt();
        if (iYear%400==0 ||(iYear%4==0 && iYear%100!=0))
            System.out.println("Year : " + iYear + " is Leap year;");
        else
            System.out.println("Year : " + iYear + " is not Leap year;");

    }
}
