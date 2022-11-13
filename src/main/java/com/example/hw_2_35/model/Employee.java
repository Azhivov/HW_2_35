package com.example.hw_2_35.model;

import java.util.Objects;

public class Employee {
    private String firstname;
    private String lastName;

    public Employee(String firstname, String lastName) {
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee emplayee = (Employee) o;
        return Objects.equals(firstname, emplayee.firstname) && Objects.equals(lastName, emplayee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastName);
    }

    @Override
    public String toString() {
        return "Emplayee{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
