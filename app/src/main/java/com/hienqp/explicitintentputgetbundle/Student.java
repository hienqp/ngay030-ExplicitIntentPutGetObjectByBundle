package com.hienqp.explicitintentputgetbundle;

import java.io.Serializable;

public class Student implements Serializable {
    private String firstName;
    private int yearBirth;

    public Student(String firstName, int yearBirth) {
        this.firstName = firstName;
        this.yearBirth = yearBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
}
