package com.skillsup.springWithJavaConfig;

public class Contact {

    private String fullName;
    private int phone;

    public Contact(String fullName, int phone) {
        this.fullName = fullName;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
