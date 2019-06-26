package javatraining.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*   --------ACT2 ------------------- */
class ConsumerImplements implements Consumer<Integer> {
    @Override
    public void accept(Integer intVar) {
        System.out.println(intVar);
    }
}


public class ArrayAsList {



    public static void main(String[] args) {
        List<Integer> listValues = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        /*   --------ACT1 ------------------- */
        for (int counter=0; counter<listValues.size();counter++){

            System.out.println(listValues.get(counter)+" ");
        }

        System.out.println("FOR");
        for (int element : listValues  ) {
            System.out.println(element+" ");
        }


        System.out.println("/*   --------ACT2 ------------------- */");
        //listValues.forEach();// foreach takes object of consumer as argument

        //listValues.forEach(action);


        Consumer<Integer> objConImpl= new ConsumerImplements();  //  Using this class only once
        listValues.forEach(objConImpl);


        System.out.println("/*   --------ACT3 ------------------- */");

        Consumer<Integer> objCons=new Consumer<Integer>() {           // Anonyms Inner class
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        listValues.forEach(objCons);

        System.out.println("/*   --------ACT4 ------------------- */");
        Consumer<Integer> objAnonymsInner=(integer) -> {  System.out.println(integer);  };
        listValues.forEach(objAnonymsInner);

        System.out.println("/*   --------ACT5 ------------------- */");
       Consumer<Integer> objAnonymsInner2= integer ->   System.out.println(integer) ;
        listValues.forEach(objAnonymsInner2);

        System.out.println("/*   --------ACT 6------------------- */");
        listValues.forEach(integer -> System.out.println(integer));

    }
}
