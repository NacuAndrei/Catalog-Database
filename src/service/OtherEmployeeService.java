package service;

import repository.OtherEmployeeRepository;
import repository.ProfessorRepository;

public class OtherEmployeeService {
    public static void insert(String columns, String values) {
        OtherEmployeeRepository.insert(columns, values);
    }

    public static void delete(String command) {
        OtherEmployeeRepository.delete(command);
    }

    public static void update(String columns, String values) {
        OtherEmployeeRepository.update(columns, values);
    }
}
