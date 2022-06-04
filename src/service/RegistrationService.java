package service;

import entity.RegistrationEntity;
import entity.StudentEntity;
import model.Grade;
import model.Professor;
import model.Registration;
import model.Student;
import repository.GradeRepository;
import repository.ProfessorRepository;
import repository.RegistrationRepository;
import repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class RegistrationService {
    public static List<Registration> getAllRegistrations() {
        List<RegistrationEntity> registrationEntities = RegistrationRepository.findAll();
        List<Registration> result = new ArrayList<>();

        for(RegistrationEntity registrationEntity: registrationEntities) {
            Registration registration = new Registration(new Professor(registrationEntity.getProfessorId(),
                    registrationEntity.getProessorLastName(), registrationEntity.getProfessorFirstName()),
                    new Student(registrationEntity.getStudentId(), registrationEntity.getStudentLastName(), registrationEntity.getStudentFirstName()));
            result.add(registration);
        }

        return result;
    }

    public static void insert(String columns, String values) {
        RegistrationRepository.insert(columns, values);
    }

    public static void delete(String command) {
        RegistrationRepository.delete(command);
    }

    public static void update(String columns, String values) {
        RegistrationRepository.update(columns, values);
    }


}
