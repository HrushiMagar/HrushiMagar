package controller;

import model.Student;
import service.StudentService;

import java.awt.*;

public class StudentController {
    StudentService studentService = new StudentService();
    public void addStudent(Student student){
        studentService.addStudent(student);
    }

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
