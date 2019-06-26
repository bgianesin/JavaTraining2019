package javatraining.binding;

class HumanDynamic{
    //Overridden Method
    public  void walk(){
        System.out.println("Human walks");
    }
}
class Boys extends HumanDynamic{
    //Overriding Method
    public void walk(){
        System.out.println("Boy walks");
    }
    public static void main( String args[]) {
        /* Reference is of Human type and object is Boy type
         */
        HumanDynamic obj = new Boys ();
        /* Reference is of HUman type and object is of Human type. */
        HumanDynamic obj2 = new HumanDynamic();
        obj.walk();
        obj2.walk();
    }
}