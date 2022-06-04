package entity;

import model.Person;

public class ProfessorEntity extends PersonEntity {
    private int salary;
    private int subjectId;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public ProfessorEntity(int id, int age, String firstName, String lastName, String CNP, String email, String phone, String address, int salary, int subjectId) {
        super(id, age, firstName, lastName, CNP, email, phone, address);
        this.salary = salary;
        this.subjectId = subjectId;
    }
}
