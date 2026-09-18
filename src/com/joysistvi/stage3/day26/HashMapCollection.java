package com.joysistvi.stage3.day26;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {

    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        students.put("name", "Heicel Servito");
        students.put("ageInMonths", "18");
        students.put("address", "Tondo Manila");
        students.put("isActive", "true");
        students.put("isActive", "false");
        //students.put("maxConnection", "500");

        System.out.println(students.get("address"));

        System.out.println(students.get("maxConnection"));

        students.remove("isActive");

        System.out.println(students.containsKey("address"));
        System.out.println(students.containsValue("Tondo Manila"));
    }
}
