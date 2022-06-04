package entity;

import model.Person;
import model.Subject;

public class GradeEntity {
    private int id;
    private int mark;
    private int studentId;

    public GradeEntity(int id, int mark, int studentId) {
        this.id = id;
        this.mark = mark;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

