package entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface RowMapper<T> {
    T maprow(ResultSet resultSet) throws SQLException;
}
