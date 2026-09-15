package com.joysistvi.stage2.discussion.day21;

public class Student {

    //private data members / private fields
    private int id;
    private String name;
    private int age;
    private String course;
    private String section;
    private String address;
    private final String schoolName = "Joysis TVI";

    // default constructor
    public Student() {

    }


    // parametherized constructor
    public Student(int id, String name, int age, String course, String section, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.section = section;
        this.address = address;
    }

    public Student(int id, String name, int age, String course,String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.address = address;
    }

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // alt + insert
    // data validation
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {}

    public String getSchoolName() {
        return schoolName;
    }

    // Object Method
    public void displayStudentInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", section='" + section + '\'' +
                ", address='" + address + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}



