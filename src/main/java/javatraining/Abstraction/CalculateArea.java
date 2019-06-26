package javatraining.Abstraction;

abstract class Shape {
    abstract double calculateArea(double pSide);
}

class Square extends Shape {
    @Override
    double calculateArea(double pSide) {
        return(pSide * pSide);
    }
}

class Circle extends Shape{
    public final double pie = 3.14587;
    @Override
    double calculateArea(double pSide) {
        return(pSide * pSide * pie);
    }
}


public class CalculateArea {
    public static void main(String[] args) {
        Square oS = new Square();
        Circle oC = new Circle();

        System.out.println("Circle = " + oC.calculateArea(2.0));
        System.out.println("Square = " + oS.calculateArea(2.0));
    }
}
