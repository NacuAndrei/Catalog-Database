package entity;

public class RegistrationEntity {
    private int id;
    private int studentId;
    private String studentLastName;
    private String studentFirstName;
    private int professorId;
    private String proessorLastName;
    private String professorFirstName;


    public RegistrationEntity(int id, int studentId, String studentLastName, String studentFirstName, int professorId, String proessorLastName, String professorFirstName) {
        this.id = id;
        this.studentId = studentId;
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.professorId = professorId;
        this.proessorLastName = proessorLastName;
        this.professorFirstName = professorFirstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public String getProessorLastName() {
        return proessorLastName;
    }

    public void setProessorLastName(String proessorLastName) {
        this.proessorLastName = proessorLastName;
    }

    public String getProfessorFirstName() {
        return professorFirstName;
    }

    public void setProfessorFirstName(String professorFirstName) {
        this.professorFirstName = professorFirstName;
    }
}
