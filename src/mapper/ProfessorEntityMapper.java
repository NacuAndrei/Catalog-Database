package mapper;

import entity.ProfessorEntity;
import entity.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorEntityMapper implements RowMapper<ProfessorEntity> {
    public ProfessorEntity maprow (ResultSet resultSet) throws SQLException {
        // Retrieve by column name
        int id  = resultSet.getInt("id");
        int age = resultSet.getInt("age");
        String firstName = resultSet.getString("firstname");
        String lastName = resultSet.getString("lastname");
        String CNP = resultSet.getString("CNP");
        String email = resultSet.getString("email");
        String phone = resultSet.getString("phone");
        String address = resultSet.getString("address");
        int salary = resultSet.getInt("salary");
        int subjectId = resultSet.getInt("subjectId");

        return new ProfessorEntity(id, age, firstName, lastName, CNP, email, phone, address, salary, subjectId);
    }
}
