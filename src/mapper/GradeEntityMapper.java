package mapper;

import entity.GradeEntity;
import entity.RowMapper;
import entity.SubjectEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GradeEntityMapper implements RowMapper<GradeEntity> {
    public GradeEntity maprow (ResultSet resultSet) throws SQLException {
        // Retrieve by column name
        int id  = resultSet.getInt("id");
        int mark = resultSet.getInt("mark");
        int studentId = resultSet.getInt("studentId");

        return new GradeEntity(id, mark, studentId);
    }
}
