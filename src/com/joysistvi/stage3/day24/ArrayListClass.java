package com.joysistvi.stage3.day24;

import java.util.ArrayList; // import ArrayList from utility
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {
        // Create an object of an ArrayList
        List<String> cars = new ArrayList<>();


        // CRUD Operation

        // Create / Add items
        cars.add("Lamborghini"); // 0
        cars.add("Pickup"); // 2
        cars.add("BMW"); // 4
        cars.add(1, "Isuzu"); // 1
        cars.add(3, "SUV"); // 3
        cars.add("Click");

        // Read / Read item(s)
        System.out.println(cars.get(4));

        // Update / set item
        cars.set(4, "E-Bike");

        cars.set(0, "Limousine");
        //System.out.println(cars);

        // Delete / remove an item
        //cars.remove("E-Bike");

        //cars.remove(1);
        //System.out.println(cars);

        // Remove all items
        //cars.removeAll(cars);
        cars.clear();

        // Getting the size
        //System.out.println(cars.get(cars.size() -1));

        System.out.println("\nTraversing an ArrayList using for-loop: ");
        for (int i = 0; i < cars.size(); i++) {

            if("Pickup".equals(cars.get(i))){
                continue;
            }
            System.out.println(cars.get(i));
        }

        System.out.println("\nTraversing an ArrayList using for-loop: ");
        for (String car : cars) {
            System.out.println(car);
        }

        cars.forEach(System.out::println);
    }
}
