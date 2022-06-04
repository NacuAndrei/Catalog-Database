package service;

import repository.PersonRepository;
import repository.ProfessorRepository;

public class PersonService {
    public static void insert(String columns, String values) {
        PersonRepository.insert(columns, values);
    }

    public static void delete(String command) {
        PersonRepository.delete(command);
    }

    public static void update(String columns, String values) {
        PersonRepository.update(columns, values);
    }
}
