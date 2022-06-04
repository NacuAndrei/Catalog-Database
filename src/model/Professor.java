package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Professor extends Person {
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Professor(int id, int age, String firstName, String lastName, String CNP, String email, String phone, String address, int salary) {
        super(id, age, firstName, lastName, CNP, email, phone, address);
        this.salary = salary;
    }

    public Professor(int id, String lastName, String firstName) {
        super(id, lastName, firstName);
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", CNP='" + CNP + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String toStringIdLastFirst() {
        return  "Professor{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}

