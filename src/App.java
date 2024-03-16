import controller.StudentController;
import model.Student;
import service.StudentService;

import java.util.List;

public class App {
    public static void main(String[] args) {
//        Student student = Student.builder()
//                .id(101)
//                .name("Hrushi")
//                .email("magahrushir@")
//                .phone("8329648249")
//                .address("Pune")
//                .build();
//
//        StudentController studentController = new StudentController();
//        studentController.addStudent(student);

        List<Student> allStudents = StudentController.getAllStudents();
        allStudents.forEach(System.out::println);
    }
}