package dao;

import com.mysql.cj.jdbc.JdbcConnection;
import model.Student;
import util.JdbcConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StudentDao {

    public void addStudent(Student student){
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "insert into student(id, name, email, phone, address) values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,student.getId());
            preparedStatement.setString(2,student.getEmail());
            preparedStatement.setString(3,student.getEmail());
            preparedStatement.setString(4,student.getEmail());
            preparedStatement.setString(5,student.getEmail());
            preparedStatement.executeUpdate();
            System.out.println("Student Add Successfully");
        }catch (SQLException e){
            System.out.println("query ex");
        }
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        Connection connection = JdbcConnectionUtil.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Student student = Student.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getNString("name"))
                        .email(resultSet.getNString("email"))
                        .phone(resultSet.getNString("phone"))
                        .address(resultSet.getNString("address"))
                        .build();
                students.add(student);
            }
        }catch (SQLException e){

        }

       return students;
    }
}
