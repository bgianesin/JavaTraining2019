package javatraining.Abstraction;

abstract class Parent {
    abstract void name();
    void getStatus() {
        System.out.println("Married");
    }
    abstract void Name2();
}

public class FirstAbstract extends Parent {
    /**
     *
     */
    void name () {
        System.out.println("name CALLED");
        //getStatus();
    }

    @Override
    void Name2() {
        System.out.println("name2 CALLED");
    }

    public static void main(String[] args) {
        FirstAbstract oFA = new FirstAbstract();
        oFA.getStatus();
    }
}
