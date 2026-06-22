package com.javadp.creational;

public class FactoryPatternDemo {
    public static void run() {
        IAnimal dog = AnimalFactory.createAnimal("dog");
        IAnimal cat = AnimalFactory.createAnimal("cat");

        System.out.println("Factory: " + dog.speak());
        System.out.println("Factory: " + cat.speak());
    }
}

interface IAnimal {
    String speak();
}

class Dog implements IAnimal {
    @Override
    public String speak() {
        return "Woof";
    }
}

class Cat implements IAnimal {
    @Override
    public String speak() {
        return "Meow";
    }
}

class AnimalFactory {
    public static IAnimal createAnimal(String type) {
        return switch (type.toLowerCase()) {
            case "dog" -> new Dog();
            case "cat" -> new Cat();
            default -> throw new IllegalArgumentException("Unknown animal: " + type);
        };
    }
}
