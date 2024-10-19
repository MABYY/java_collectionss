package org.javasql.Collections;

import java.util.*;

public class SetDemo {
    public static void show (){

        System.out.println("SET DEMO");

        Set<String>  set = new HashSet<>();

        set.add("HELLO");
        set.add("HELLO");
        System.out.println(set);

        // Remove duplicated from a collection
        Collection<String> col = new ArrayList<>();
        Collections.addAll(col, "a","a","a","a","a","b","b","b","b","b","b");

        Set<String> setCol = new HashSet<>(col);
        System.out.println(setCol);


        Set<String> setString1 =
                new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> setString2 =
                new HashSet<>(Arrays.asList("b","c","d"));

        // Union
        setString1.addAll(setString2);
        System.out.println(setString1);

        // Intersection
        setString1.retainAll(setString2);
        System.out.println(setString1);

        // Difference
        setString1.retainAll(setString2);
        System.out.println(setString1);

    }
}
