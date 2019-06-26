package javatraining.Inheritance;

public class Parent {
    public void inheritParent() {
        System.out.println("I am parent");
    }
}

class Child extends Parent {
    public static void main(String[] args) {
        Child oC = new Child();
        oC.inheritParent();
    }
}

