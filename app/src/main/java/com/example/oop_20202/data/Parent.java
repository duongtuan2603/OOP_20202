package com.example.oop_20202.data;

public class Parent extends User{
    int StudentID;
    public Parent(String id, String password, String registerdate, String name, String email, String phonenumber) {
        super(id, password, registerdate, name, email, phonenumber);
    }

    public Parent(String id, String password, String registerdate, String name, String email, String phonenumber, int studentID) {
        super(id, password, registerdate, name, email, phonenumber);
        StudentID = studentID;
    }

}
