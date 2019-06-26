package javatraining.Inheritance;

//public class MultipleInheritanceNotSupported extends A,B{
public class MultipleInheritanceNotSupported extends A {
    public static void main(String[] args) {
        A oA = new A();
        B oB= new B();
        MultipleInheritanceNotSupported obj = new MultipleInheritanceNotSupported();
        obj.disp();//Now which disp() method would be invoked?
        oA.disp();
        oB.disp();
    }
}

class A {
    void disp() {
        System.out.println("A Hello");
    }
}

class B {
    void disp() {

        System.out.println("B How are you ?");
    }
}