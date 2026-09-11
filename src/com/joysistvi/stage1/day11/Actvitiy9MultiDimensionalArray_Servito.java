package com.joysistvi.stage1.day11;

import java.util.Scanner;

public class Actvitiy9MultiDimensionalArray_Servito {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for number of students and subjects
        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = input.nextInt();
        input.nextLine(); // consume newline

        // Array for subject names
        String[] subjectNames = new String[subjects];

        // Array for student names
        String[] studentNames = new String[students];

        // 2D array for grades
        double[][] grades = new double[students][subjects];

        // Input subject names
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < subjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectNames[i] = input.nextLine();
        }

        // Input student names and grades
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter student's name: ");
            studentNames[i] = input.nextLine();

            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter grades for " + subjectNames[j] + ": ");
                grades[i][j] = input.nextDouble();
            }

            input.nextLine(); // consume newline
        }

        // Display Grades Report
        System.out.println("\n==================== GRADES REPORT ====================");

        System.out.printf("%-20s", "Student Name");

        for (int i = 0; i < subjects; i++) {
            System.out.printf("%-15s", subjectNames[i]);
        }

        System.out.printf("%-15s%n", "Average");

        System.out.println("--------------------------------------------------------");

        // Calculate and display averages
        for (int i = 0; i < students; i++) {
            double sum = 0;

            System.out.printf("%-20s", studentNames[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-15.2f", grades[i][j]);
                sum += grades[i][j];
            }

            double average = sum / subjects;

            System.out.printf("%-15.2f%n", average);
        }

        System.out.println("========================================================");

        input.close();
    }
}
