package com.javadp;

import com.javadp.behavioral.CommandPatternDemo;
import com.javadp.behavioral.IteratorPatternDemo;
import com.javadp.behavioral.ObserverPatternDemo;
import com.javadp.behavioral.StrategyPatternDemo;
import com.javadp.creational.BuilderPatternDemo;
import com.javadp.creational.FactoryPatternDemo;
import com.javadp.creational.PrototypePatternDemo;
import com.javadp.creational.SingletonDemo;
import com.javadp.structural.AdapterPatternDemo;
import com.javadp.structural.DecoratorPatternDemo;
import com.javadp.structural.FacadePatternDemo;
import com.javadp.structural.ProxyPatternDemo;

public class DesignPatternsDemo {
    public static void main(String[] args) {
        System.out.println("=== Creational Patterns ===");
        SingletonDemo.run();
        FactoryPatternDemo.run();
        BuilderPatternDemo.run();
        PrototypePatternDemo.run();

        System.out.println("\n=== Structural Patterns ===");
        AdapterPatternDemo.run();
        DecoratorPatternDemo.run();
        FacadePatternDemo.run();
        ProxyPatternDemo.run();

        System.out.println("\n=== Behavioral Patterns ===");
        StrategyPatternDemo.run();
        ObserverPatternDemo.run();
        CommandPatternDemo.run();
        IteratorPatternDemo.run();
    }
}
