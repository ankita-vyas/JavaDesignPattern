package com.javadp.behavioral;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPatternDemo {
    public static void run() {
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("Patterns");
        items.add("Iterator");

        Iterator<String> iterator = items.iterator();
        System.out.print("Iterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
            if (iterator.hasNext()) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}
