package javatraining.Abstraction;

abstract class Bank {
    protected int interest = 0;
    abstract int interestRate();

    public Bank(int interest) {
        this.interest = interest;
    }

    public int getInterest() {
        return interest;
    }
}

class ING extends Bank{
    //private int interest = 7;

    public ING(int interest) {
        super(interest);
    }

    @Override
    int interestRate() {
        return(getInterest());
    }
}

class BNP extends Bank {
    public BNP(int interest) {
        super(interest);
    }

    //private int interest = 8;
    @Override
    int interestRate() {
        System.out.println("interest rate BNP");
        return (interest);
    }
}

public class InterestRate {
    public static void main(String[] args) {
        BNP oBNP = new BNP(8);
        ING oING = new ING(7);

        System.out.println("BNP = " + oBNP.interestRate());
        System.out.println("ING = " + oING.interestRate());
    }
}
