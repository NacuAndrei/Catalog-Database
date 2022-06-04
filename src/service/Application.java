package service;

import model.Registration;
import model.Subject;

import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) throws IOException {

        AuditService auditService = new AuditService();

        System.out.println();
        System.out.println(ANSI_CYAN + "Hello!");
        System.out.println("Please follow the menu" + ANSI_RESET);
        System.out.println();

        System.out.println(ANSI_CYAN + "1. Get" + ANSI_RESET);

        while(true) {
            Scanner getScannerGet = new Scanner(System.in);
            System.out.println("Choose table to get info from: Professor, Student, Grade, Subject, Registration, AllTables, None: ");
            String inputchosenClassGet = getScannerGet.nextLine();
            switch (inputchosenClassGet) {
                case "Professor":
                    System.out.println(ANSI_CYAN + "1. a) Getting all professors..." + ANSI_RESET);
                    System.out.println(ProfessorService.getAllProfessors());
                    System.out.println();
                    break;
                case "Student":
                    System.out.println(ANSI_CYAN + "1. b) Getting all students..." + ANSI_RESET);
                    System.out.println(StudentService.getAllStudents());
                    System.out.println();
                    break;
                case "Grade":
                    System.out.println(ANSI_CYAN + "1. c) Geting all grades..." + ANSI_RESET);
                    System.out.println(GradeService.getAllGrades());
                    System.out.println();
                    break;
                case "Subject":
                    System.out.println(ANSI_CYAN + "1. d) Getting all subjects..." + ANSI_RESET);
                    System.out.println(SubjectService.getAllSubjects());
                    System.out.println();
                    break;
                case "Registration":
                    System.out.println(ANSI_CYAN + "1. e) Getting all registrations(student+professor - only id firstName lastName)..." + ANSI_RESET);
                    System.out.println(RegistrationService.getAllRegistrations().stream().map(Registration::toString).collect(Collectors.toList()));
                    System.out.println();
                    break;
                case "AllTables":
                    System.out.println(ANSI_CYAN + "1. a) Getting all professors..." + ANSI_RESET);
                    System.out.println(ProfessorService.getAllProfessors());
                    System.out.println();

                    System.out.println(ANSI_CYAN + "1. b) Getting all students..." + ANSI_RESET);
                    System.out.println(StudentService.getAllStudents());
                    System.out.println();

                    System.out.println(ANSI_CYAN + "1. c) Geting all grades..." + ANSI_RESET);
                    System.out.println(GradeService.getAllGrades());
                    System.out.println();

                    System.out.println(ANSI_CYAN + "1. d) Getting all subjects..." + ANSI_RESET);
                    System.out.println(SubjectService.getAllSubjects());
                    System.out.println();

                    System.out.println(ANSI_CYAN + "1. e) Getting all registrations(student+professor - only id firstName lastName)..." + ANSI_RESET);
                    System.out.println(RegistrationService.getAllRegistrations().stream().map(Registration::toString).collect(Collectors.toList()));
                    System.out.println();
                    break;

                case "None":
                    break;
            }
            if(!"None".equals(inputchosenClassGet))
                auditService.logAction("1. Get " + inputchosenClassGet);
            System.out.println("Repeat 1.Get (y/n) ?");
            Scanner scannerOptionGet = new Scanner(System.in);
            String inputOption = scannerOptionGet.nextLine();
            if("n".equals(inputOption)) {
                break;
            }
        }

        System.out.println(ANSI_CYAN + "2. Get by id" + ANSI_RESET);
        while(true) {
            Scanner getScannerGetId = new Scanner(System.in);
            System.out.println("Choose table to get info by id from: Professor(by subject Id), Grade(by student Id), AllTables, None: ");
            String inputchosenClassGetId = getScannerGetId.nextLine();
            switch (inputchosenClassGetId) {
                case "Professor":
                    Scanner idSubject = new Scanner(System.in);
                    System.out.println("Enter id for desired subject: " + ANSI_RESET);
                    int inputIdSubject = Integer.parseInt(idSubject.nextLine());
                    System.out.println(ANSI_CYAN + "2. a) Getting all professors for a subject id..." + ANSI_RESET);
                    System.out.println(ProfessorService.getAllProfessorsForSubject(inputIdSubject));
                    System.out.println();
                    break;
                case "Grade":
                    Scanner idStudent = new Scanner(System.in);
                    System.out.println("Enter id for desired student: " + ANSI_RESET);
                    int inputIdStudent = Integer.parseInt(idStudent.nextLine());
                    System.out.println(ANSI_CYAN + "2. b) Geting all grades for a student id..." + ANSI_RESET);
                    System.out.println(GradeService.getAllGradesForStudent(inputIdStudent));
                    System.out.println();
                    break;
                case "AllTables":
                    Scanner idSubject2 = new Scanner(System.in);
                    System.out.println("Enter id for desired subject: " + ANSI_RESET);
                    int inputIdSubject2 = Integer.parseInt(idSubject2.nextLine());
                    System.out.println(ANSI_CYAN + "2. a) Getting all professors for a subject id..." + ANSI_RESET);
                    System.out.println(ProfessorService.getAllProfessorsForSubject(inputIdSubject2));
                    System.out.println();

                    Scanner idStudent2 = new Scanner(System.in);
                    System.out.println("Enter id for desired student: " + ANSI_RESET);
                    int inputIdStudent2 = Integer.parseInt(idStudent2.nextLine());
                    System.out.println(ANSI_CYAN + "2. b) Geting all grades for a student id..." + ANSI_RESET);
                    System.out.println(GradeService.getAllGradesForStudent(inputIdStudent2));
                    System.out.println();
                    break;
                case "None":
                    break;
            }

            if(!"None".equals(inputchosenClassGetId))
                auditService.logAction("2. Get by Id " + inputchosenClassGetId);
            System.out.println("Repeat 2. Get By Id (y/n) ?");
            Scanner scannerOptionGetById = new Scanner(System.in);
            String inputOption = scannerOptionGetById.nextLine();
            if("n".equals(inputOption)) {
                break;
            }
        }

        System.out.println(ANSI_CYAN + "3. Insert" + ANSI_RESET);
        while(true) {
            Scanner insertScanner = new Scanner(System.in);
            System.out.println("Choose table to insert into: Professor, Student, Grade, Subject, Registration, Person, OtherEmployee, OptionalSubject, None: ");
            String inputchosenClass = insertScanner.nextLine();
            switch (inputchosenClass) {
                case "Professor":
                    System.out.println("Type columns separated by ',' to be inserted into: ");
                    String inputchosenInsertColumnsProfessor = insertScanner.nextLine();
                    System.out.println("Type values between ' ' and separated by ', ' to be inserted: ");
                    String inputchosenInsertValuesProfessor = insertScanner.nextLine();
                    System.out.println(ANSI_CYAN + "3. a) Inserting into Professor..." + ANSI_RESET);
                    ProfessorService.insert(inputchosenInsertColumnsProfessor, inputchosenInsertValuesProfessor);
                    break;
                case "Student":
                    System.out.println("Type columns separated by ',' to be inserted into: ");
                    String inputchosenInsertColumnsStudent = insertScanner.nextLine();
                    System.out.println("Type values between ' ' and separated by ', ' to be inserted: ");
                    String inputchosenInsertValuesStudent = insertScanner.nextLine();
                    System.out.println(ANSI_CYAN + "3. b) Inserting into Student..." + ANSI_RESET);
                    StudentService.insert(inputchosenInsertColumnsStudent, inputchosenInsertValuesStudent);
                    break;
                case "Grade":
                    System.out.println("Type columns separated by ',' to be inserted into: ");
                    String inputchosenInsertColumnsGrade = insertScanner.nextLine();
                    System.out.println("Type values between ' ' and separated by ', ' to be inserted: ");
                    String inputchosenInsertValuesGrade = insertScanner.nextLine();
                    System.out.println(ANSI_CYAN + "3. c) Inserting into Grade..." + ANSI_RESET);
                    GradeService.insert(inputchosenInsertColumnsGrade, inputchosenInsertValuesGrade);
                    break;
                case "Subject":
                    System.out.println("Id: ");
                    int inputchosenInsertIdSubject = Integer.parseInt(insertScanner.nextLine());
                    System.out.println("Name: ");
                    String inputchosenInsertName = insertScanner.nextLine();
                    Subject subject = new Subject(inputchosenInsertIdSubject, inputchosenInsertName);
                    System.out.println(ANSI_CYAN + "3. d) Inserting into Subject..." + ANSI_RESET);
                    SubjectService.insert(subject);
                    break;
                case "Registration":
                    System.out.println("Type columns separated by ',' to be inserted into: ");
                    String inputchosenInsertColumnsRegistration = insertScanner.nextLine();
                    System.out.println("Type values between ' ' and separated by ', ' to be inserted: ");
                    String inputchosenInsertValuesRegistration = insertScanner.nextLine();
                    System.out.println(ANSI_CYAN + "3. e) Inserting into Registration..." + ANSI_RESET);
                    RegistrationService.insert(inputchosenInsertColumnsRegistration, inputchosenInsertValuesRegistration);
                    break;
                case "Person":
                    System.out.println("Type columns separated by ',' to be inserted into: ");
                    String inputchosenInsertColumnsPerson = insertScanner.nextLine();
                    System.out.println("Type values between ' ' and separated by ', ' to be inserted: ");
                    String inputchosenInsertValuesPerson = insertScanner.nextLine();
                    System.out.println(ANSI_CYAN + "3. f) Inserting into Person..." + ANSI_RESET);
                    PersonService.insert(inputchosenInsertColumnsPerson, inputchosenInsertValuesPerson);
                    break;
                case "OtherEmployee":
                    System.out.println("Type columns separated by ',' to be inserted into: ");
                    String inputchosenInsertColumnsOtherEmployee = insertScanner.nextLine();
                    System.out.println("Type values between ' ' and separated by ', ' to be inserted: ");
                    String inputchosenInsertValuesOtherEmployee = insertScanner.nextLine();
                    System.out.println(ANSI_CYAN + "3. g) Inserting into OtherEmployee..." + ANSI_RESET);
                    OtherEmployeeService.insert(inputchosenInsertColumnsOtherEmployee, inputchosenInsertValuesOtherEmployee);
                    break;
                case "OptionalSubject":
                    System.out.println("Type columns separated by ',' to be inserted into: ");
                    String inputchosenInsertColumnsOptionalSubject = insertScanner.nextLine();
                    System.out.println("Type values between ' ' and separated by ', ' to be inserted: ");
                    String inputchosenInsertValuesOptionalSubject = insertScanner.nextLine();
                    System.out.println(ANSI_CYAN + "3. h) Inserting into OptionalSubject..." + ANSI_RESET);
                    OptionalSubjectService.insert(inputchosenInsertColumnsOptionalSubject, inputchosenInsertValuesOptionalSubject);
                    break;
                case "None":
                    break;
            }

            if(!"None".equals(inputchosenClass))
                auditService.logAction("3. Insert into " + inputchosenClass);
            System.out.println("Repeat 3. Insert (y/n) ?");
            Scanner scannerOptionInsert = new Scanner(System.in);
            String inputOption = scannerOptionInsert.nextLine();
            if("n".equals(inputOption)) {
                break;
            }
        }

        System.out.println(ANSI_CYAN + "4. Delete" + ANSI_RESET);
        while(true) {
            Scanner deleteScanner = new Scanner(System.in);
            System.out.println("Choose table to delete from: Professor, Student, Grade, Subject, Registration, Person, OtherEmployee, OptionalSubject, None: ");
            String inputchosenClass = deleteScanner.nextLine();
            if(!"None".equals(inputchosenClass) && !"Subject".equals(inputchosenClass))
                System.out.println("Complete the following command: Delete from " + inputchosenClass + " where" + "...");

            switch (inputchosenClass) {
                case "Professor":
                    String inputChosenDeleteProfessor = deleteScanner.nextLine();
                    System.out.println(ANSI_CYAN + "4. a) Deleting from Professor..." + ANSI_RESET);
                    ProfessorService.delete(inputChosenDeleteProfessor);
                    break;
                case "Student":
                    String inputChosenDeleteStudent = deleteScanner.nextLine();
                    System.out.println(ANSI_CYAN + "4. b) Deleting from Student..." + ANSI_RESET);
                    StudentService.delete(inputChosenDeleteStudent);
                    break;
                case "Grade":
                    String inputChosenDeleteGrade = deleteScanner.nextLine();
                    System.out.println(ANSI_CYAN + "4. c) Deleting from Grade..." + ANSI_RESET);
                    GradeService.delete(inputChosenDeleteGrade);
                    break;
                case "Subject":
                    System.out.println("Id:");
                    int inputChosenDeleteSubject = Integer.parseInt(deleteScanner.nextLine());
                    System.out.println(ANSI_CYAN + "4. d) Deleting from Subject..." + ANSI_RESET);
                    Subject subject = new Subject(inputChosenDeleteSubject, "");
                    SubjectService.delete(subject);
                    break;
                case "Registration":
                    String inputChosenDeleteRegistration = deleteScanner.nextLine();
                    System.out.println(ANSI_CYAN + "4. e) Deleting from Registration..." + ANSI_RESET);
                    RegistrationService.delete(inputChosenDeleteRegistration);
                    break;
                case "Person":
                    String inputChosenDeletePerson = deleteScanner.nextLine();
                    System.out.println(ANSI_CYAN + "4. f) Deleting from Person..." + ANSI_RESET);
                    PersonService.delete(inputChosenDeletePerson);
                    break;
                case "OtherEmployee":
                    String inputChosenDeleteOtherEmployee = deleteScanner.nextLine();
                    System.out.println(ANSI_CYAN + "4. g) Deleting from OtherEmployee..." + ANSI_RESET);
                    OtherEmployeeService.delete(inputChosenDeleteOtherEmployee);
                case "OptionalSubject":
                    String inputChosenDeleteOptionalSubject = deleteScanner.nextLine();
                    System.out.println(ANSI_CYAN + "4. h) Deleting from OptionalSubject..." + ANSI_RESET);
                    OptionalSubjectService.delete(inputChosenDeleteOptionalSubject);
                case "None":
                    break;
            }

            if(!"None".equals(inputchosenClass))
                auditService.logAction("4. Delete from " + inputchosenClass);
            System.out.println("Repeat 4. Delete (y/n) ?");
            Scanner scannerOptionInsert = new Scanner(System.in);
            String inputOption = scannerOptionInsert.nextLine();
            if("n".equals(inputOption)) {
                break;
            }
        }

        System.out.println(ANSI_CYAN + "5. Update" + ANSI_RESET);
        while(true) {
            Scanner updateScanner = new Scanner(System.in);
            System.out.println("Choose table to update: Professor, Student, Grade, Subject, Registration, Person, OtherEmployee, OptionalSubject, None: ");
            String inputchosenClass = updateScanner.nextLine();
            if(!"None".equals(inputchosenClass))
                System.out.println("Complete the following command: Update " + inputchosenClass + " set" + "..." + " where ...");

            switch (inputchosenClass) {
                case "Professor":
                    System.out.println("Type your 'column = value': ");
                    String inputchosenUpdateColumnsProfessor = updateScanner.nextLine();
                    System.out.println("Type command: ");
                    String inputchosenUpdateValuesProfessor = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. a) Updating Professor..." + ANSI_RESET);
                    ProfessorService.update(inputchosenUpdateColumnsProfessor, inputchosenUpdateValuesProfessor);
                    break;
                case "Student":
                    System.out.println("Type your 'column = value': ");
                    String inputchosenUpdateColumnsStudent = updateScanner.nextLine();
                    System.out.println("Type command: ");
                    String inputchosenUpdateValuesStudent = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. b) Updating Student..." + ANSI_RESET);
                    StudentService.update(inputchosenUpdateColumnsStudent, inputchosenUpdateValuesStudent);
                    break;
                case "Grade":
                    System.out.println("Type your 'column = value': ");
                    String inputchosenUpdateColumnsGrade = updateScanner.nextLine();
                    System.out.println("Type command: ");
                    String inputchosenUpdateValuesGrade = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. c) Updating Grade..." + ANSI_RESET);
                    GradeService.update(inputchosenUpdateColumnsGrade, inputchosenUpdateValuesGrade);
                    break;
                case "Subject":
                    System.out.println("Id: ");
                    int inputchosenUpdateIdSubject = Integer.parseInt(updateScanner.nextLine());
                    System.out.println("Desired name: ");
                    String inputchosenUpdateNameSubject = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. d) Updating Subject..." + ANSI_RESET);
                    Subject subject = new Subject(inputchosenUpdateIdSubject, inputchosenUpdateNameSubject);
                    SubjectService.update(subject);
                    break;
                case "Registration":
                    System.out.println("Type your 'column = value': ");
                    String inputchosenUpdateColumnsRegistration = updateScanner.nextLine();
                    System.out.println("Type command: ");
                    String inputchosenUpdateValuesRegistration = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. e) Updating Registration..." + ANSI_RESET);
                    RegistrationService.update(inputchosenUpdateColumnsRegistration, inputchosenUpdateValuesRegistration);
                    break;
                case "Person":
                    System.out.println("Type your 'column = value': ");
                    String inputchosenUpdateColumnsPerson = updateScanner.nextLine();
                    System.out.println("Type command: ");
                    String inputchosenUpdateValuesPerson = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. f) Updating Person..." + ANSI_RESET);
                    PersonService.update(inputchosenUpdateColumnsPerson, inputchosenUpdateValuesPerson);
                    break;
                case "OtherEmployee":
                    System.out.println("Type your 'column = value': ");
                    String inputchosenUpdateColumnsOtherEmployee = updateScanner.nextLine();
                    System.out.println("Type command: ");
                    String inputchosenUpdateValuesOtherEmployee = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. g) Updating OtherEmployee..." + ANSI_RESET);
                    OtherEmployeeService.update(inputchosenUpdateColumnsOtherEmployee, inputchosenUpdateValuesOtherEmployee);
                    break;
                case "OptionalSubject":
                    System.out.println("Type your 'column = value': ");
                    String inputchosenUpdateColumnsOptionalSubject = updateScanner.nextLine();
                    System.out.println("Type command: ");
                    String inputchosenUpdateValuesOptionalSubject = updateScanner.nextLine();
                    System.out.println(ANSI_CYAN + "5. h) Updating OptionalSubject..." + ANSI_RESET);
                    OptionalSubjectService.update(inputchosenUpdateColumnsOptionalSubject, inputchosenUpdateValuesOptionalSubject);
                    break;
                case "None":
                    break;
            }

            if(!"None".equals(inputchosenClass))
                auditService.logAction("5. Update " + inputchosenClass);
            System.out.println("Repeat 5. Update (y/n) ?");
            Scanner scannerOptionInsert = new Scanner(System.in);
            String inputOption = scannerOptionInsert.nextLine();
            if("n".equals(inputOption)) {
                break;
            }
        }
        System.out.println("\nProgram finished successfully!");

    }
}
