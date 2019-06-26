package javatraining.methodOverloading;

import static javafx.application.Platform.exit;

class OverLoad {
    int add (int pVal1, int pVal2) {
        return (pVal1 + pVal2);
    }

    String add(String pVal1, String pVal2) {
        return(pVal1.concat(pVal2));
    }

    public static void main(String[] args) {
        OverLoad pOV = new OverLoad();

        System.out.println("Add valI 5 + 10 = " + pOV.add(5,10) );
        System.out.println("Add valS 5 + 10 = " + pOV.add("5","10") );

        main();
        System.exit(0);

    }
    public static void main() {
        OverLoad pOV = new OverLoad();

        System.out.println("Add valI 5 + 10 = " + pOV.add(5,10) );
        System.out.println("Add valS 5 + 10 = " + pOV.add("5","10") );

        System.exit(2);
    }
}

