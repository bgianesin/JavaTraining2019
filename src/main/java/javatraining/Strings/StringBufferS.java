package javatraining.Strings;

public class StringBufferS {
    public static void main(String[] args) {
        String oS;
        StringBuffer oSB = new StringBuffer("JavaTraining");

        System.out.println("Init :\t" +oSB);

        oSB = oSB.append("@ING");
        System.out.println("add @ING :\t" + oSB);

        int iPos = oSB.indexOf("ING");
        int iLen = 3;
        oSB.delete(iPos, iPos+3);
        System.out.println("delete@ING :\t" + oSB);

        iPos = oSB.indexOf("@");
        oSB.replace(iPos, iPos+1, "#");
        System.out.println("replace # :\t" + oSB);

        oSB.insert(0, "May2019");
        System.out.println("Insert May2019 :\t" + oSB);
    }
}
