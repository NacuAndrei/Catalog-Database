package service;

import repository.OptionalSubjectRepository;


public class OptionalSubjectService {
    public static void insert(String columns, String values) {
        OptionalSubjectRepository.insert(columns, values);
    }

    public static void delete(String command) {
        OptionalSubjectRepository.delete(command);
    }

    public static void update(String columns, String values) {
        OptionalSubjectRepository.update(columns, values);
    }
}
