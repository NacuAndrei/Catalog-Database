package repository;

import entity.ProfessorEntity;
import mapper.ProfessorEntityMapper;
import service.DatabaseExecutorQueryService;

import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {

    public static List<ProfessorEntity> findAll() {

        List<Object> objects = DatabaseExecutorQueryService.executeReadQuery("select * from professor", new ProfessorEntityMapper());
        List<ProfessorEntity> result = new ArrayList<>();

        for(Object object: objects) {
            if(object instanceof ProfessorEntity) {
                result.add((ProfessorEntity) object);
            } else {
                throw new RuntimeException("Expected ProfessorEntity instance");
            }
        }

        return result;
    }

    public static List<ProfessorEntity> findAllForSubject(int subjectId) {

        List<Object> objects = DatabaseExecutorQueryService.executeReadQuery("select * from professor where professor.subjectId = "+subjectId, new ProfessorEntityMapper());
        List<ProfessorEntity> result = new ArrayList<>();

        for(Object object: objects) {
            if(object instanceof ProfessorEntity) {
                result.add((ProfessorEntity) object);
            } else {
                throw new RuntimeException("Expected PersonEntity instance");
            }
        }

        return result;
    }

    public static void insert(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into Professor(" + columns + ")" + " values( " + values + ")");
    }

    public  static void delete(String command) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from Professor where "+ command);
    }

    public static void update(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update Professor set " + columns + " where " + values);
    }
}
