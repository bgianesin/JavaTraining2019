package javatraining.collecttion;

import java.util.ArrayList;

public class ImplementArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> oAL = new ArrayList<Integer>();

        oAL.add(0,50);
        oAL.add(1,40);
        oAL.add(2,30);
        oAL.add(3,20);
        oAL.add(4,10);
       //oAL.add(10,10);

        oAL.add(500);
        oAL.add(400);
        oAL.add(300);
        oAL.add(200);
        oAL.add(100);

        System.out.println(oAL.indexOf(100));
        System.out.println(oAL.get(1));
        System.out.println(oAL.indexOf(2));
        System.out.println(oAL.indexOf(3));
        System.out.println(oAL.indexOf(4));
        System.out.println(oAL.indexOf(5));
        System.out.println(oAL.indexOf(25));
        System.out.println(oAL);
        System.out.println("size : " + oAL.size());

        ArrayList<Integer> oAL2 = new ArrayList<Integer>();
        oAL2.add(2500);
        oAL2.add(2400);
        oAL2.add(2300);
        oAL2.add(2200);
        oAL2.add(2100);

        oAL.addAll(2, oAL2);
        System.out.println(oAL);
        System.out.println("size : " + oAL.size());

        for (Integer item : oAL) {
            System.out.println("List " + item);
        }
    }
}
