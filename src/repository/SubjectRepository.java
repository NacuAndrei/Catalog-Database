package repository;

import entity.ProfessorEntity;
import entity.SubjectEntity;
import mapper.ProfessorEntityMapper;
import mapper.SubjectEntityMapper;
import service.DatabaseExecutorQueryService;

import java.util.ArrayList;
import java.util.List;

public class SubjectRepository {

    public static List<SubjectEntity> findAll() {

        List<Object> objects = DatabaseExecutorQueryService.executeReadQuery("select * from subject", new SubjectEntityMapper());
        List<SubjectEntity> result = new ArrayList<>();

        for(Object object: objects) {
            if(object instanceof SubjectEntity) {
                result.add((SubjectEntity) object);
            } else {
                throw new RuntimeException("Expected SubjectEntity instance");
            }
        }

        return result;
    }

    /*public static void insert(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into Subject(" + columns + ")" + " values( " + values + ")");
    }

    public  static void delete(String command) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from Subject where "+ command);
    }

    public static void update(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update Subject set " + columns + " where " + values);
    }*/

    public static void insert(SubjectEntity subjectEntity) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into Subject values ('" + subjectEntity.getId() + "', '" + subjectEntity.getName() + "')");
    }

    public  static void delete(SubjectEntity subjectEntity) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from Subject where id = " + subjectEntity.getId());
    }

    public static void update(SubjectEntity subjectEntity) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update Subject set name = '" + subjectEntity.getName() + "' where id = " + subjectEntity.getId());
    }
}
