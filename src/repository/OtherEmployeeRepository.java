package repository;

import service.DatabaseExecutorQueryService;

public class OtherEmployeeRepository {
    public static void insert(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Insert into OtherEmployee(" + columns + ")" + " values( " + values + ")");
    }

    public  static void delete(String command) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Delete from OtherEmployee where "+ command);
    }

    public static void update(String columns, String values) {
        DatabaseExecutorQueryService.executeInsUpdDelQuery("Update OtherEmployee set " + columns + " where " + values);
    }
}
