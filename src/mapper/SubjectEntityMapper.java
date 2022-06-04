package mapper;

import entity.RowMapper;
import entity.SubjectEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubjectEntityMapper implements RowMapper<SubjectEntity> {
    public SubjectEntity maprow (ResultSet resultSet) throws SQLException {
        // Retrieve by column name
        int id  = resultSet.getInt("id");
        String name = resultSet.getString("name");

        return new SubjectEntity(id, name);
    }
}
