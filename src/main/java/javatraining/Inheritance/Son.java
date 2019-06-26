package javatraining.Inheritance;

public class Son extends Father{
    private int iAge = -3;
    public String sName = "SON NAME";
    private int iSonAge = -33;

    public void SetAge(int pVal) {
        this.iAge = pVal;
        System.out.println("Son Set Age = " + this.iAge + ";");
    }

    public int GetAge() {
        System.out.println("Son Get Age = " + this.iAge + ";");
        return(this.iAge);
    }

    public void Print() {
        super.Print();
        System.out.println("Print Son data :");
        System.out.println("\tName : " + this.sName + ";");
        System.out.println("\tAge  : " + this.iAge + ";");
    }

    public static void main(String[] args) {
        Son oSon    = new Son();

        //oSon.sName = "Son Name";

        oSon.Print();
        System.out.println("Accessible Value :");
        System.out.println("\t" + oSon.sName);
        System.out.println("\t" + oSon.iAge);
        System.out.println("\t" + oSon.iSonAge);
        System.out.println("\t" + oSon.iFatherAge);
        System.out.println("\t" + oSon.iGranFatherAge);
    }
}
