package org.javasql.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        System.out.println("LIST DEMO");

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        // Overload add method
        list.add(0,"!");

        Collections.addAll(list, "new A","new B");

        list.set(1, "new one");

        System.out.println(list);


    };
}
