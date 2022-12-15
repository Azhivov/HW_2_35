package com.example.hw_2_35.model;

import java.util.Objects;

public class Employee {

    private String firstName;
    private String lastName;

    public Employee(String firstname, String lastName) {
        this.firstName = firstname;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName()
    {return firstName + " " + lastName;    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee emplayee = (Employee) o;
        return Objects.equals(firstName, emplayee.firstName) && Objects.equals(lastName, emplayee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Emplayee{" +
                "firstname='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
