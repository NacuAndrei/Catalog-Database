package repository;

import entity.GradeEntity;
import mapper.GradeEntityMapper;
import service.DatabaseExecutorQueryService;

import java.util.ArrayList;
import java.util.List;

public class GradeRepository {

    public static List<GradeEntity> findAll() {

        List<Object> objects = DatabaseExecutorQueryService.executeReadQuery("select * from grade", new GradeEntityMapper());
        List<GradeEntity> result = new ArrayList<>();

        for(Object object: objects) {
            if(object instanceof GradeEntity) {
                result.add((GradeEntity) object);
            } else {
                throw new RuntimeException("Expected GradeEntity instance");
            }
        }

        return result;
    }

    public static List<GradeEntity> findAllForStudent(int studentId) {

        List<Object> objects = DatabaseExecutorQueryService.executeReadQuery("select * from grade where grade.studentId = "+studentId, new GradeEntityMapper());
        List<GradeEntity> result = new ArrayList<>();

        for(Object object: objects) {
            if(object instanceof GradeEntity) {
                result.add((GradeEntity) object);
            } else {
                throw new RuntimeException("Expected GradeEntity instance");
            }
        }

        return result;
    }
    public static void insert(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into Grade(" + columns + ")" + " values( " + values + ")");
    }

    public static void delete(String command) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from Grade where "+ command);
    }

    public static void update(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update Grade set " + columns + " where " + values);
    }

}
