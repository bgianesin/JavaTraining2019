package javatraining.Inheritance;

public class Father extends GrandFather {
    private int iAge = -2;
    public String sName = "FATHER NAME";
    protected int iFatherAge = -22;

    public void SetAge(int pVal) {
        this.iAge = pVal;
        System.out.println("Father Set Age = " + this.iAge + ";");
    }

    public int GetAge() {
        System.out.println("Father Get Age = " + this.iAge + ";");
        return(this.iAge);
    }

    public void Print() {
        super.Print();
        System.out.println("Print Father data :");
        System.out.println("\tName : " + this.sName + ";");
        System.out.println("\tAge  : " + this.iAge + ";");
    }

}
