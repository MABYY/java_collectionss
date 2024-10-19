package org.javasql;

import org.javasql.Collections.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       var list = new GenericList<String>();
       list.add("name");
       list.add("surname");
       var iterator = list.iterator();

       for(var item: list){
           System.out.println(item);
       };

       while (iterator.hasNext()){
           var current = iterator.next();
           System.out.println(current);
       };

        CollectionsDemo.show();

        ListDemo.show();

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("cust 2"));
        customers.add(new Customer("cust 1"));
        customers.add(new Customer("cust 3"));
        Collections.sort(customers);
        System.out.println(customers);

        List<CustomerComparable> customerscomp = new ArrayList<>();
        customerscomp.add(new CustomerComparable("cust 2", "ex2@rmail.com"));
        customerscomp.add(new CustomerComparable("cust 1", "ex1@rmail.com"));
        customerscomp.add(new CustomerComparable("cust 3", "ex3@rmail.com"));
        Collections.sort(customerscomp, new EmailComparator());
        System.out.println(customerscomp);

        QueueDemo.show();

        SetDemo.show();

        MapDemo.show();
    }
}

// Iterate through a list without knowing
// anything about its internal implementation => Iterable Interface

// Collection: container for other objects => add, remove , check existence
// every collection is iterable

// List (Interface : it allows you to work with the index of a collection
// Comparable (IF) : sort data -> not flexible

// Comparator Interface: implement a comparison based on a field we choose

// Queue: process jobs in the order we receive them

// Set: no duplicates

// Hash Table: special table to store data ->

