package javatraining.Exception;

public class    NullPointer {
    public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("Lenght of str : " + str.length() + ";");
        }
        catch(NullPointerException excp) {
            str= "HI";
            System.out.println("Lenght of str : " + str.length() + ";");
            System.out.println("NullException Error : ");
            System.out.println(excp.getMessage());
            System.out.println(excp.getCause());
            excp.printStackTrace();
        }
        catch (Exception excp) {
            System.out.println("Exception Error : ");
            System.out.println(excp.getMessage());
            System.out.println(excp.getCause());
            excp.printStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
    }
}
