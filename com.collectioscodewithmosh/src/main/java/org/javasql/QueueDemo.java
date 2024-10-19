package org.javasql;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show () {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a"); // -> throws exception
        queue.offer("b"); // -> throws exception

        var front = queue.peek();
        System.out.println(front);


        var front_remove = queue.remove(); // -> throws exception
        System.out.println(front_remove);

        var front_poll = queue.remove(); // -> throws null
        System.out.println(front_poll);
    }
}
