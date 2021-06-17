package com.example.oop_20202.data;

public class User {
    String id;
    String password;
    String registerdate;

    String name;
    String email;
    String phonenumber;

    public User(String id, String password, String registerdate, String name, String email, String phonenumber) {
        this.id = id;
        this.password = password;
        this.registerdate = registerdate;
        this.name = name;
        this.email = email;
        this.phonenumber = phonenumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
