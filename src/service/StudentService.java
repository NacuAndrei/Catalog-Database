package service;

import entity.StudentEntity;
import entity.SubjectEntity;
import model.Grade;
import model.Professor;
import model.Student;
import model.Subject;
import repository.GradeRepository;
import repository.ProfessorRepository;
import repository.StudentRepository;
import repository.SubjectRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentService {
    public static List<Student> getAllStudents() {
        List<StudentEntity> studentEntities = StudentRepository.findAll();
        List<Student> result = new ArrayList<>();

        for(StudentEntity studentEntity: studentEntities) {
            Student student = new Student(studentEntity.getId(), studentEntity.getAge(), studentEntity.getFirstName(),
                    studentEntity.getLastName(), studentEntity.getCNP(), studentEntity.getEmail(),
                    studentEntity.getPhone(), studentEntity.getAddress());

            List<Grade> grades = GradeService.getAllGradesForStudent(studentEntity.getId());
            student.setGrades(grades);
            result.add(student);
        }

        return result;
    }

    public static void insert(String columns, String values) {
        StudentRepository.insert(columns, values);
    }

    public static void delete(String command) {
        StudentRepository.delete(command);
    }

    public static void update(String columns, String values) {
        StudentRepository.update(columns, values);
    }
}
