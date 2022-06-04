package model;


import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private List<Grade> grades = new ArrayList<>();

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }

    public Student(int id, int age, String firstName, String lastName, String CNP, String email, String phone, String address) {
        super(id, age, firstName, lastName, CNP, email, phone, address);
    }

    public Student(int id, String lastName, String firstName) {
        super(id, lastName, firstName);
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", CNP='" + CNP + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades + '\'' +
                '}';
    }

    public String toStringIdLastFirst() {
        return  "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
