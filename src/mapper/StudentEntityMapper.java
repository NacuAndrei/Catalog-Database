package mapper;

import entity.RowMapper;
import entity.StudentEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentEntityMapper implements RowMapper<StudentEntity> {
    public StudentEntity maprow (ResultSet resultSet) throws SQLException {
        // Retrieve by column name
        int id  = resultSet.getInt("id");
        int age = resultSet.getInt("age");
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        String CNP = resultSet.getString("CNP");
        String email = resultSet.getString("email");
        String phone = resultSet.getString("phone");
        String address = resultSet.getString("address");

        return new StudentEntity(id, age, firstName, lastName, CNP, email, phone, address);
    }
}
