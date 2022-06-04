package model;

public class Grade {
    private int id;
    private int mark;

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

    public Grade(int id, int mark) {
        this.id = id;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", mark=" + mark +
                '}';
    }
}
