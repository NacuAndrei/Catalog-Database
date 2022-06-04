package repository;

import service.DatabaseExecutorQueryService;

public class OptionalSubjectRepository {
    public static void insert(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into OptionalSubject(" + columns + ")" + " values( " + values + ")");
    }

    public  static void delete(String command) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from OptionalSubject where "+ command);
    }

    public static void update(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update OptionalSubject set " + columns + " where " + values);
    }
}
