package com.joysistvi.stage3.day25.Activity16;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoManager {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Todo Manager Menu ---");
            System.out.println("1. Add a task");
            System.out.println("2. View all tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Remove a task");
            System.out.println("5. Clear all tasks");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter a new task: ");
                    String newTask = scanner.nextLine();

                    tasks.add(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\n--- All Tasks ---");

                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to update.");
                    } else {
                        System.out.print("Enter the index of the task to update: ");
                        int index = scanner.nextInt();
                        scanner.nextLine();

                        if (index >= 0 && index < tasks.size()) {
                            System.out.print("Enter the new task: ");
                            String updatedTask = scanner.nextLine();

                            tasks.set(index, updatedTask);
                            System.out.println("Task updated successfully!");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 4:
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks available to remove.");
                    } else {
                        System.out.print("Enter the index of the task to remove: ");
                        int removeIndex = scanner.nextInt();
                        scanner.nextLine();

                        if (removeIndex >= 0 && removeIndex < tasks.size()) {
                            tasks.remove(removeIndex);
                            System.out.println("Task removed successfully!");
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;

                case 5:
                    tasks.clear();
                    System.out.println("All tasks have been cleared.");
                    break;

                case 0:
                    System.out.println("Exiting TodoManager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}
