package com.joysistvi.stage2.discussion.day21;

import com.joysistvi.stage2.discussion.day21.Student;

public class Main {

    public static void main(String[] args) {


        Student[] students = new Student[3];
        students[0] = new Student(1, "Heicel", 23, "BSCPE", "Molave", "Tondo, Manila");
        students[1] = new Student(2, "Heicy", 23, "BSIT", "Tondo, Manila");
        students[2] = new Student(1, "Heisia", 23, "BSCPE");

        students[0].getSchoolName();

        for (Student student: students) {
            System.out.println(student);
        }

    }
}






