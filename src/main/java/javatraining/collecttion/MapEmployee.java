package javatraining.collecttion;
import javax.swing.*;

import java.util.HashMap;
import java.util.Iterator;

class Employee extends HashMap<String, String> {
    public final String vNAME  = "Name";
    public final String vSQUAD = "Squad";
    public final String vTRIBE = "Tribe";

    public Employee(String sName, String sSquad, String sTribe) {
        this.put(this.vNAME, sName);
        this.put(this.vSQUAD, sSquad);
        this.put(this.vTRIBE, sTribe);
    }

    public Employee() {
        super();
    }

    public String getsKValue(String pKey) {
        return this.get(pKey);
    }
}

class ListEmployee {
    public final String vCP    = "CorporateKey";
    private HashMap<String, Employee> oHME = new HashMap<String, Employee>();

    public boolean add( String pCorporateKey, String pName, String pSquad, String sTribe) {
        boolean bRc = false;
        Employee oE;
        oE = oHME.putIfAbsent(pCorporateKey, new Employee(pName, pSquad, sTribe));
        if (oE == null) {
            bRc = true;
        }
        return(bRc);
    }

    public boolean add(String pCorporateKey, Object pObj) {
        boolean bRc = false;
        Employee oE;

        oE = oHME.putIfAbsent(pCorporateKey, (Employee) pObj);
        if (oE == null) {
            bRc = true;
        }
        return(bRc);
    }

    public void listall() {
        Employee oE;
        System.out.println("List of employee, Squad, Tribe");
        for (HashMap.Entry<String, Employee> item : this.oHME.entrySet()) {
            oE = item.getValue();
            System.out.println(item.getKey() + "-" + item.getKey() + "-" + oE.getsKValue(oE.vNAME) + "-" +
                    oE.getsKValue(oE.vSQUAD) + "-" + oE.getsKValue(oE.vTRIBE));
        }
    }

    public void listallN() {
        int iCount;
        Employee oE;
        Iterator <HashMap.Entry<String, Employee>> itemL = this.oHME.entrySet().iterator();
        System.out.println("List of employee, Squad, Tribe");
        iCount = 0;
        while (itemL.hasNext()) {
            HashMap.Entry<String, Employee> item = itemL.next();
            oE = item.getValue();
            //System.out.println("Emp " + ++iCount + " " + item.getKey() + "-" + oE.getsKValue(oE.vNAME) + "-" +
            //oE.getsKValue(oE.vSQUAD) + "-" + oE.getsKValue(oE.vTRIBE));
            System.out.println("Emp " + ++iCount + ":" + item.toString());// + " " + item.getValue().toString());
        }
    }

    public String getAll() {
        String rcStr = "";
        int iCount = 0;
        Employee oE;
        for (HashMap.Entry<String, Employee> item : this.oHME.entrySet()) {
            oE = item.getValue();
            rcStr += "Emp " + ++iCount + ":" + item.toString() + "\n";
        }
        return rcStr;
    }

    public Employee getEmployee (String pCorporateKey) {
        Employee lE = null;

        lE = this.oHME.get(pCorporateKey);

        return(lE);
    }
}

public class MapEmployee {
    private ListEmployee oLE = new ListEmployee();
    protected String sMenu;

    public MapEmployee() {
        this.sMenu = " Enter you choice :\n";
        this.sMenu += "1. Enter Value\n";
        this.sMenu += "2. List\n";
        this.sMenu += "3. Search\n";
        this.sMenu += "9. Quit\n";
    }
    public static void main(String[] args) {
        MapEmployee oME = new MapEmployee();

        oME.automaticInsert();
        oME.menu();
    }

     public void menu () {
        Employee oE;
        String sChoice = "1";
        int iChoice;

        do{
            try {
                sChoice = JOptionPane.showInputDialog(this.sMenu);
            }
            catch (Exception lEx) {
                JOptionPane.showMessageDialog(null, "Enter a Value", "Alert", JOptionPane.ERROR_MESSAGE);
            }

            try {
                iChoice = Integer.parseInt(sChoice);
                switch (iChoice) {
                    case 1 :
                        String sCK =JOptionPane.showInputDialog("CorpKey of employee :");
                        if (oLE.getEmployee(sCK) != null) {
                            JOptionPane.showMessageDialog(null, "Already Exist", sCK, JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            oE = new Employee();

                            oE.put(oE.vNAME, JOptionPane.showInputDialog("Enter name of employee :"));
                            oE.put(oE.vTRIBE, JOptionPane.showInputDialog("Enter tribe of employee :"));
                            oE.put(oE.vSQUAD, JOptionPane.showInputDialog("Enter squad of employee :"));
                            if (!oLE.add(sCK, oE)) {
                                JOptionPane.showMessageDialog(null, "Already Exist", sCK, JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        break;
                    case 2 :
                        oLE.listallN();
                        String sLst = oLE.getAll();
                        JOptionPane.showMessageDialog(null, sLst, "List All", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 3 :
                        sCK = JOptionPane.showInputDialog("Enter your Corporate Key of employee :");
                        oE = oLE.getEmployee(sCK);
                        if (oE != null) {
                            //System.out.println("Coporate key : " + "CQ86ZO" + oE.toString());
                            JOptionPane.showMessageDialog(null, oE.toString(), sCK, JOptionPane.INFORMATION_MESSAGE);
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Not Found", sCK, JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 9 :
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Enter a Valid Value", "Alert", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            }
            catch (NumberFormatException lEx) {
                JOptionPane.showMessageDialog(null, "Must be a Numeric", "Alert", JOptionPane.ERROR_MESSAGE);
                sChoice = "0";
            }
        } while (! sChoice.equalsIgnoreCase("9"));
    }

    private void automaticInsert() {
        Employee oE = new Employee();
        System.out.println(oLE.add("CQ86ZO", "Ben", "ePapyrus", "DOCM") ? "True" : "False");
        System.out.println(oLE.add("CQ86ZO", "Ben", "ePapyrus", "DOCM") ? "True" : "False");
        System.out.println(oLE.add("CQ86ZO", "Ben", "ePapyrus", "DOCM") ? "True" : "False");
        oLE.add("111111", "Nom 111", "Simplify", "DOCM");
        oLE.add("222222", "Nom 222", "APS", "ESLC");
        oE.put(oE.vSQUAD, "SQUAD");
        oE.put(oE.vNAME,"NAME");
        oE.put(oE.vTRIBE,"TRIBE");
        oLE.add("444", oE);
        oLE.listall();

        oE = oLE.getEmployee("CQ86ZO");
        if (oE != null) {
            System.out.println("Coporate key : " + "CQ86ZO" + oE.toString());
        }

        oE = oLE.getEmployee("AAAA");
        if (oE == null) {
            System.out.println("NOT FOUND");
        }
    }
}
