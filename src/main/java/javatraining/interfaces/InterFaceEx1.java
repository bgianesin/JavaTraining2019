package javatraining.interfaces;

interface First {
    String FName();
}

interface Last {
    String LName();
}

interface Name extends First, Last {
    String Name();
}

//public class InterFaceEx1 implements First, Last {
public class InterFaceEx1 implements Name {
    public String FName() {
        return "FirstName";
    }

    public String LName() {
        return "LastName";
    }

    public static void main(String[] args) {
        InterFaceEx1 oI = new InterFaceEx1();
        System.out.println(oI.FName() + " " + oI.LName());
        System.out.println(oI.Name());
    }

    @Override
    public String Name() {
        return(FName() + "---" + LName());
    }
}
