package org.javasql.Collections;

// Customer + email
public class CustomerComparable implements Comparable<CustomerComparable>{

    private  String name;
    private  String email;

    public CustomerComparable(String name, String email) {
        this.name = name;
        this.email = email;
    };

    @Override
    public int compareTo(CustomerComparable other) {
        return name.compareTo(other.name);
    };

    @Override
    public String toString(){
        return  name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
