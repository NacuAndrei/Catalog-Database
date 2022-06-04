package model;

public class OtherEmployee extends Person {
    private String job;

    public OtherEmployee(int id, int age, String firstName, String lastName, String CNP, String email, String phone, String address) {
        super(id, age, firstName, lastName, CNP, email, phone, address);
        this.job = job;
    }

    public OtherEmployee(int id, String lastName, String firstName) {
        super(id, lastName, firstName);
    }
}
