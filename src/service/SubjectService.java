package service;

import entity.SubjectEntity;
import model.Professor;
import model.Subject;
import repository.GradeRepository;
import repository.ProfessorRepository;
import repository.SubjectRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubjectService {
    public static Set<Subject> getAllSubjects() {
        List<SubjectEntity> subjectEntities = SubjectRepository.findAll();
        Set<Subject> result = new HashSet<>();

        for(SubjectEntity subjectEntity: subjectEntities) {
            Subject subject = new Subject(subjectEntity.getId(), subjectEntity.getName());

            Set<Professor> professors = ProfessorService.getAllProfessorsForSubject(subjectEntity.getId());
            subject.setProfessors(professors);
            result.add(subject);
        }

        return result;
    }

    /*public static void insert(String columns, String values) {
        SubjectRepository.insert(columns, values);
    }

    public static void delete(String command) {
        SubjectRepository.delete(command);
    }

    public static void update(String columns, String values) {
        SubjectRepository.update(columns, values);
    }*/

    public static void insert(Subject subject) {
        SubjectRepository.insert(new SubjectEntity(subject.getId(), subject.getName()));
    }

    public static void delete(Subject subject) {
        SubjectRepository.delete(new SubjectEntity(subject.getId(), subject.getName()));
    }

    public static void update(Subject subject) {
        SubjectRepository.update(new SubjectEntity(subject.getId(), subject.getName()));
    }
}
