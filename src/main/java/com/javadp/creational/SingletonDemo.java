package com.javadp.creational;

public class SingletonDemo {
    public static void run() {
        System.out.println("Singleton: " + SingletonExample.getInstance().getMessage());
    }
}

class SingletonExample {
    private static final SingletonExample INSTANCE = new SingletonExample();
    private final String message;

    private SingletonExample() {
        this.message = "Only one instance exists.";
    }

    public static SingletonExample getInstance() {
        return INSTANCE;
    }

    public String getMessage() {
        return message;
    }
}
