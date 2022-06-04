package repository;

import entity.RegistrationEntity;
import entity.StudentEntity;
import mapper.RegistrationEntityMapper;
import mapper.StudentEntityMapper;
import service.DatabaseExecutorQueryService;

import java.util.ArrayList;
import java.util.List;

public class RegistrationRepository {

    public static List<RegistrationEntity> findAll() {

        List<Object> objects = DatabaseExecutorQueryService.executeReadQuery("select registration.id, student_id, " +
                "student.lastName as student_last, student.firstName as student_first, professor_id, professor.lastName " +
                "as professor_last, professor.firstName as professor_first from student join professor join registration\n" +
                "where registration.professor_id = professor.id\n" +
                "and registration.student_id = student.id", new RegistrationEntityMapper());
        List<RegistrationEntity> result = new ArrayList<>();

        for(Object object: objects) {
            if(object instanceof RegistrationEntity) {
                result.add((RegistrationEntity) object);
            } else {
                throw new RuntimeException("Expected RegistrationEntity instance");
            }
        }

        return result;
    }

    public static void insert(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into Registration(" + columns + ")" + " values( " + values + ")");
    }

    public  static void delete(String command) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from Registration where "+ command);
    }

    public static void update(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update Registration set " + columns + " where " + values);
    }
}
