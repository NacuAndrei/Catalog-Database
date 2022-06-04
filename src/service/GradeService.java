package service;

import entity.GradeEntity;
import entity.ProfessorEntity;
import model.Grade;
import model.Professor;
import repository.GradeRepository;
import repository.ProfessorRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class GradeService {
    public static List<Grade> getAllGrades() {
        List<GradeEntity> gradeEntities = GradeRepository.findAll();
        List<Grade> result = new ArrayList<>();

        for(GradeEntity gradeEntity: gradeEntities) {
            result.add(new Grade(gradeEntity.getId(), gradeEntity.getMark()));
        }

        return result;
    }

    public static List<Grade> getAllGradesForStudent(int studentId) {
        List<GradeEntity> gradeEntities =  GradeRepository.findAllForStudent(studentId);
        List<Grade> result = new ArrayList<>();

        for(GradeEntity gradeEntity: gradeEntities) {
            result.add(new Grade(gradeEntity.getId(), gradeEntity.getMark()));
        }

        return result;
    }

    public static void insert(String columns, String values) {
        GradeRepository.insert(columns, values);
    }

    public static void delete(String command) {
        GradeRepository.delete(command);
    }

    public static void update(String columns, String values) {
        GradeRepository.update(columns, values);
    }
}
