package com.javadp.creational;

public class PrototypePatternDemo {
    public static void run() {
        Person original = new Person("Alice", 30);
        Person clone = original.copy();
        clone.setName("Bob");

        System.out.println("Prototype original: " + original);
        System.out.println("Prototype clone: " + clone);
    }
}

class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person copy() {
        try {
            return (Person) clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}
