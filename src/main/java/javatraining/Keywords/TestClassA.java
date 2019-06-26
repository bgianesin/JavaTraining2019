package javatraining.Keywords;

class A {
    int num =15;
    A() {
        System.out.println("A Cons");
    }
    A(int pi) {
        System.out.println("A Cons(int pI)");
    }
}

class B extends A {
    int num = 20;
    B() {
        super(8);
        System.out.println("B Cons");
    }
    void show() {
        System.out.println("B show :" + num);
    }
}
class C extends B {
    int num = 30;
    C() {
        System.out.println("C Cons");
    }

    void show() {
        System.out.println("C show :" + num);
        System.out.println("C show super:" + super.num);
        super.show();
    }

    public static void main(String[] args) {
        C oC = new C();
        oC.show();
    }
}