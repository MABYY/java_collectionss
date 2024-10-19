package org.javasql.Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show(){

        var c1 = new CustomerComparable("name1", "email1");
        var c2 = new CustomerComparable("name2", "email2");


        Map<String,CustomerComparable> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        var cust = map.get("email1");
        System.out.println("Cust HASMAP " + cust);



        //        List<CustomerComparable> customers = new ArrayList<>();
        // O(n)  --> Takes too long for big datasets -> use mapps
//        for (var customer : customers){
//            if(customer.getEmail().equals("e1")){
//                System.out.println("Found customer");
//            };
//        };



    }
}
