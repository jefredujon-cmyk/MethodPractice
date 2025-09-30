package com.pluralsight;

public class  Hello {

    public static void main(String[] args) {

        //call the method sayHello
        sayHello();
        sayGoodbye();
        sayGoodMorning();

    }

    private static void sayGoodMorning() {
        System.out.println("Good Morning");
    }

    private static void sayGoodbye() {
        System.out.println("Goodbye");

    }

    private static void sayHello() {
        System.out.println("Hello World");
    }
}

