package javatraining.Constructor;

public class CallToConstructor {
    int var = 10;
    CallToConstructor (int pVal) {
       var += pVal;
    }

    public void result() {
        System.out.println("Var : " + var);
    }

    public static void main(String[] args) {
        CallToConstructor mCTC = new CallToConstructor(15);
        //CallToConstructor mCTC2 = new CallToConstructor();
        mCTC.result();
    }
}
