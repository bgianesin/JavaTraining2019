package javatraining.binding;

public class Animal {
    void eat() {
        System.out.println("animal is eating...");
    }

}

class Dog extends Animal {
    void eat() {

        System.out.println("Inside dog");
    }

    public static void main(String[] args) {


        System.out.println("dog is eating...");
        Animal a = new Dog();
        a.eat();


    }

    }


