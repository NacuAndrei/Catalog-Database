package service;

import entity.ProfessorEntity;
import model.Professor;
import repository.GradeRepository;
import repository.ProfessorRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProfessorService {
    public static List<Professor> getAllProfessors() {
        List<ProfessorEntity> professorEntities = ProfessorRepository.findAll();
        List<Professor> result = new ArrayList<>();

        for(ProfessorEntity professorEntity: professorEntities) {
            result.add(new Professor(professorEntity.getId(), professorEntity.getAge(), professorEntity.getFirstName(),
                    professorEntity.getLastName(), professorEntity.getCNP(), professorEntity.getEmail(),
                    professorEntity.getPhone(), professorEntity.getAddress(), professorEntity.getSalary()));
        }

        return result;
    }

    public static Set<Professor> getAllProfessorsForSubject(int subjectId) {
        List<ProfessorEntity> professorEntities =  ProfessorRepository.findAllForSubject(subjectId);
        Set<Professor> result = new HashSet<>();

        for(ProfessorEntity professorEntity: professorEntities) {
            result.add(new Professor(professorEntity.getId(), professorEntity.getAge(), professorEntity.getFirstName(),
                    professorEntity.getLastName(), professorEntity.getCNP(), professorEntity.getEmail(),
                    professorEntity.getPhone(), professorEntity.getAddress(), professorEntity.getSalary()));
        }

        return result;
    }

    public static void insert(String columns, String values) {
        ProfessorRepository.insert(columns, values);
    }

    public static void delete(String command) {
        ProfessorRepository.delete(command);
    }

    public static void update(String columns, String values) {
        ProfessorRepository.update(columns, values);
    }
}
