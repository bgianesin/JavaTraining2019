package javatraining.ContionalStatement;
import java.util.Scanner;
/**
 * Created by cq86zod on 7/05/2019.
 */
public class StudentGrade {
    /*
    if Marks >60 , print Grade A
                >=
               61..1000
                if else 60> Marks>50 , print Grade B  What when 60 ?
                          <       >=
                if else 50> Marks>40 , print Grade C What when 50
                                 >=
                else print Failed
     */
    public String checkStudentGrade(int pVal) {
        String lRc  = "Failed";

        if (pVal >= 0 && pVal <= 100) {
            if (pVal >= 60)
                lRc = "Grade A";
            else if (pVal >= 50)
                lRc = "Grade B";
            else if (pVal >= 40)
                lRc = "Grade C";
        }
        else {
            lRc = "Invalid Value";
        }

        return (lRc);
    }

    public String switchcase (int pVal) {
        String lRc = "Defaul";
        switch(pVal)  {
            case 1:
                lRc = "Janvier";
                break;
            case 2 :
                lRc = "Fev";
                break;
            default :
                lRc = "Non";
                break;
        }
        return(lRc);
    }

    public static void main (String [] args) {
        StudentGrade oStudentGrade = new StudentGrade();
        Scanner oScanner = new Scanner(System.in);
        int lVal = 39;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 101;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 40;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 49;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 50;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 51;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 51;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 59;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 60;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 61;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
        lVal = 99;
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");

        System.out.println("Enter Marks : ");
        lVal = oScanner.nextInt();
        System.out.println(lVal +":" + oStudentGrade .checkStudentGrade(lVal) +";");
    }
}

