package org.javasql.Collections;

import java.util.Comparator;

public class EmailComparator implements Comparator<CustomerComparable> {
    @Override
    public int compare(CustomerComparable o1, CustomerComparable o2) {
       return o1.getEmail().compareTo(o2.getEmail()); // strings are comparable
    };
}
