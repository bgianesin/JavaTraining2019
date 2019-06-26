package javatraining.Inheritance;

public class GrandFather {
    private int iAge = -1;
    public String sName = "GRAN FATHER NAME";
    protected int iGranFatherAge = -11;

    public void SetAge(int pVal) {
        this.iAge = pVal;
        System.out.println("GranFather Set Age = " + this.iAge + ";");
    }

    public int GetAge() {
        System.out.println("GranFather Get Age = " + this.iAge + ";");
        return(this.iAge);
    }

    public void Print() {
        System.out.println("Print GranFather data :");
        System.out.println("\tName : " + this.sName + ";");
        System.out.println("\tAge  : " + this.iAge + ";");
    }
}
