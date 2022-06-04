package repository;

import entity.StudentEntity;
import mapper.StudentEntityMapper;
import service.DatabaseExecutorQueryService;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    public static List<StudentEntity> findAll() {

        List<Object> objects = DatabaseExecutorQueryService.executeReadQuery("select * from student", new StudentEntityMapper());
        List<StudentEntity> result = new ArrayList<>();

        for(Object object: objects) {
            if(object instanceof StudentEntity) {
                result.add((StudentEntity) object);
            } else {
                throw new RuntimeException("Expected StudentEntity instance");
            }
        }

        return result;
    }

    public static void insert(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into Student(" + columns + ")" + " values( " + values + ")");
    }

    public  static void delete(String command) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from Student where "+ command);
    }

    public static void update(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update Student set " + columns + " where "  + values);
    }
}
