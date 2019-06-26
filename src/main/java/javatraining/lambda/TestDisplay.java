package javatraining.lambda;

interface Display {
    void show();
    //void show2();
}

class TestDisplay implements Display {
    public void show () {
        System.out.println("Ben");
    }
    public void show2 () {
        System.out.println("Ben");
    }

    public static void main(String[] args) {
        TestDisplay oTD = new TestDisplay();
        oTD.show();

        Display oD = new TestDisplay();
        oD.show();

        oD = new Display() {
            @Override
            public void show() {
                System.out.println("inside inner class");
            }

            /*@Override
            public void show2() {
                System.out.println("Show inside innner class");
            }

             */
        };
        oD.show();
        String str = "System.out.println(\"inside inner class ->\")";

        oD = () -> {

            System.out.println("inside inner class ->");
            System.out.println("---------------------");
        };
        oD.show();

    }
}

