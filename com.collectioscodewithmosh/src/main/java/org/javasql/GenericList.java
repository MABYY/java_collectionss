package org.javasql;

import java.util.Iterator;

// implement iterable IF to use iterator function
public class GenericList <T> implements Iterable<T>{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add (T item){
        items[count++] = item;
    }
    public T get (int index){
        return items[index];
    };

    // It returns an iterator object
    // now we can iterate over the list without
    // knowing its internal implementation

    // The iterator object returned is actually an
    // interface...so we have to implement it -> private nested class
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
    };

        public class ListIterator implements Iterator<T>{

            private int index;

            // We want to iterate over a generic list
            private GenericList<T> list;

            public ListIterator(GenericList<T> list){
                this.list = list;
            }

            @Override
            public boolean hasNext() {
                return (index < list.count);
            }

            @Override
            public T next() {
                return list.items[index ++];
            }
        }
}
