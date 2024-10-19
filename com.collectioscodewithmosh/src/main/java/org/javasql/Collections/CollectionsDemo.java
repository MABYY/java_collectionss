package org.javasql.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {

        System.out.println("COLLECTIONS DEMO");

        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        collection.add("d");
        System.out.println(collection);

        Collections.addAll(collection,"new A", "new B", "new C");
        System.out.println(collection);
        // collection.clear()
        // .isEmpty()
        // .contains()
        // .toArray() -> convert the collection to an array of objects or your choice of item

        // Convert collection to regular array
        // Every element is an instance of the object class
        var objectArray = collection.toArray();
        // Access array methods
        var stringArray = collection.toArray(new String[0]);
        // stringArray[0].toLowerCase();

        // compare collections for equality

        Collection<String> other = new ArrayList<>();

        other.addAll(collection);

        // This output is false because it checks the
        // address in memory

        System.out.println(collection == other);

        // Compare content

        System.out.println(collection.equals(other));





    }
}
