package mapper;

import entity.RegistrationEntity;
import entity.RowMapper;
import entity.StudentEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegistrationEntityMapper implements RowMapper<RegistrationEntity> {
    public RegistrationEntity maprow (ResultSet resultSet) throws SQLException {
        // Retrieve by column name
        int id  = resultSet.getInt("id");
        int studentId = resultSet.getInt("student_id");
        String studentLast = resultSet.getString("student_last");
        String studentFirst = resultSet.getString("student_first");
        int professorId = resultSet.getInt("professor_id");
        String professorLast = resultSet.getString("professor_last");
        String professorFirst = resultSet.getString("professor_first");

        return new RegistrationEntity(id, studentId, studentLast, studentFirst, professorId, professorLast, professorFirst);
    }
}
