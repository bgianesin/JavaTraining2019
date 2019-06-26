package javatraining.collecttion;

import java.util.HashMap;
import java.util.Iterator;

class EmployeeNo extends HashMap{
    private String sSquad;
    private String sTribe;
    private String sName;

    public EmployeeNo(String sName, String sSquad, String sTribe) {
        this.sName  = sName;
        this.sSquad = sSquad;
        this.sTribe = sTribe;
    }

    public String getsName() {
        return sName;
    }

    public String getsSquad() {
        return sSquad;
    }

    public String getsTribe() {
        return sTribe;
    }
}

class ListEmployeeNo {
    private HashMap<String, EmployeeNo> oHME = new HashMap<String, EmployeeNo>();
    //private HashMap<String, Empl> oHME = new HashMap<String, EmployeeNo>();
    private EmployeeNo oE;

    public boolean add( String pCorporateKey, String pName, String pSquad, String sTribe) {
        boolean bRc = false;
        oE = oHME.putIfAbsent(pCorporateKey, new EmployeeNo(pName, pSquad, sTribe));
        if (oE == null) {
            bRc = true;
        }
        return(bRc);
    }
    public void listall() {
        System.out.println("List of employee, Squad, Tribe");
        for (HashMap.Entry<String, EmployeeNo> item : this.oHME.entrySet()) {
            System.out.println(item.getKey() + "-" + item.getValue().getsName() + "-" + item.getValue().getsSquad() + "-" + item.getValue().getsTribe());
        }
    }
    public void listallN() {
        int iCount;
        Iterator <HashMap.Entry<String, EmployeeNo>> itemL = this.oHME.entrySet().iterator();
        System.out.println("List of employee, Squad, Tribe");
        iCount = 0;
        while (itemL.hasNext()) {
            HashMap.Entry<String, EmployeeNo> item = itemL.next();
            System.out.println("Emp " + ++iCount + " " + item.getKey() + "-" + item.getValue().getsName() + "-" + item.getValue().getsSquad() + "-" + item.getValue().getsTribe());
        }
    }

    public EmployeeNo getEmployee (String pCorporateKey) {
        EmployeeNo lE = null;

        lE = this.oHME.get(pCorporateKey);
        return(lE);
    }
}

public class MapEmployeeNo {

    public static void main(String[] args) {
        ListEmployeeNo oLE = new ListEmployeeNo();
        EmployeeNo oE;
        System.out.println(oLE.add("CQ86ZO", "Ben", "ePapyrus", "DOCM") ? "True" : "False");
        System.out.println(oLE.add("CQ86ZO", "Ben", "ePapyrus", "DOCM") ? "True" : "False");
        System.out.println(oLE.add("CQ86ZO", "Ben", "ePapyrus", "DOCM") ? "True" : "False");
        oLE.add("111111", "Nom 111", "Simplify", "DOCM");
        oLE.add("222222", "Nom 222", "APS", "ESLC");
        oLE.listall();
        oLE.listallN();

        oE = oLE.getEmployee("CQ86ZO");
        if (oE != null) {
            System.out.println("Coporate key : " + "CQ86ZO");
            System.out.println(oE.getsName() + " " + oE.getsSquad() + " " + oE.getsTribe());
        }
        oE = oLE.getEmployee("AAAA");
        if (oE == null) {
            System.out.println("NOT FOUND");
        }
    }
}
