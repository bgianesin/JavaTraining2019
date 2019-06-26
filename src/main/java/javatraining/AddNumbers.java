package javatraining;

/**
 * Created by cq86zod on 7/05/2019.
 */
public class AddNumbers {


    public void addNumbers() {
        int value1  = 100;
        int value2  = 150;

        int value3 = value1 + value2;
        System.out.println(value3);
    }

    public static void main (String... arguments) {
        int value1  = 10;
        int value2  = 15;
        int Integer = 0;
        //Integer int = 0;
        //Integer ++;

        int value3 = value1 + value2;
        System.out.println(value3);

        AddNumbers objAddNumbers = new AddNumbers();
        objAddNumbers.addNumbers();
        int aVar = 9;
        if (aVar++ < 10 ) {
            System.out.println("Then");
        }
        else {
            System.out.println("False");
        }
        int peter =16;
        long tom = 4;
        if (peter % 4 >= 0)
            tom++;
        tom--;
        System.out.println("Tom = " + tom );

        Short s1=200;
        Integer s2=400;
        Long s3=(long)s1 + s2;
        //String s5=(String)(s3 * s2);

            String ta ="A";
            ta = ta.concat("B");
            String tb = "C";
            ta = ta.concat(tb);
            ta = ta.replace('C', 'D');
            //ta = ta.concat(tb);
            ta = ta.concat(tb);
        System.out.println(ta);
    }
}

