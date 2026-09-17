package com.joysistvi.stage3.day25;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search Student by ID: ");
        int targetId = scanner.nextInt();
        Student foundStudent = searchStudentById(targetId);

        if (foundStudent != null ) {
            System.out.println("Student found: " + foundStudent);
        } else {
            System.out.println("Student not found");

        }
    }

    public static List<Student> createStudents() {
        // Create a list of students
        List<Student> students = new LinkedList<>();
        students.add(new Student(1,"Heicy", "Japanese"));
        students.add(new Student(2,"Akie", "Filipino"));
        students.add(new Student(3,"Kia", "English"));

        return students; // Populated and return the list of Students

    }

    public static List<Student> getAllStudents() {
        List<Student> students = createStudents();
        return students;
    }


    // Method that return a single Student object based on ID
    public static Student searchStudentById(int targetId) {
        // Create a list of students
        List<Student> students = getAllStudents();

        // Loop through the list to find student with the matching ID
        for (Student stud : students) {
            if (stud.getId() == targetId) {
                return stud; // Return the single Student object when found
            }

        }

        // Return null if the student with that ID doesn't exist
        return null;
    }

    // Object
    // Collection
}



/*  Winter Summer  Spring Jux []
    ArrayList -> get()
    LinkedList -> add() / remove()
 */

/*
    []          []
        []          []
            []
 */

//System.out.println(letters.reversed());

/*
        List<Character> letters = new LinkedList<>();

        letters.add('a');
        letters.add('b');
        letters.add('c');
        letters.add('d');


        letters.addFirst('e');
        letters.addFirst('f');

        System.out.println(letters);

        System.out.println(letters.getFirst());
        System.out.println(letters.getLast());

        letters.removeFirst();
        letters.removeLast();

        System.out.println(letters);
 */
