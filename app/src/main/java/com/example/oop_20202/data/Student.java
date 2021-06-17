package com.example.oop_20202.data;

public class Student {
    int id;
    String name;
    String classname;
    String dob;

    public Student(int id, String name, String classname, String dob) {
        this.id = id;
        this.name = name;
        this.classname = classname;
        this.dob = dob;
    }

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

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
