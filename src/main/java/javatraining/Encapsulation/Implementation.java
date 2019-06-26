package javatraining.Encapsulation;

class ImplementationM {
    private String sName;

    ImplementationM (String pVal) {
        this.SetName(pVal);
    }

    public void SetName(String pVal) {
        this.sName = pVal;
    }

    public String GetName() {
        return(sName);
    }
}

public class Implementation {
    public static void main(String[] args) {
        ImplementationM mImp = new ImplementationM("Ben");

        System.out.println("Name = " + mImp.GetName());
        mImp.SetName("Ippo");
        System.out.println("Name = " + mImp.GetName());
    }
}
