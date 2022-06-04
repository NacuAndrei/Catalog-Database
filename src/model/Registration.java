package model;

public class Registration {
    private Professor professor;
    private Student student;

    public Registration(Professor professor, Student student) {
        this.professor = professor;
        this.student = student;
    }

    @Override
    public String toString() {
        return "\nRegistration{" +
                professor.toStringIdLastFirst() +
                ", " +
                student.toStringIdLastFirst() +
                '}' + '\n';
    }
}
