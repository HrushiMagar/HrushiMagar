package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionUtil {
    private static Connection connection;
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/it_shaala";
            String username = "root";
            String password = "Hrushi";
            connection = DriverManager.getConnection(url, username, password)
        }catch (ClassNotFoundException e){
            System.out.println("Issue in Driver Loading");
        }catch (SQLException e){
            System.out.println("Issue in Connection");
        }

    }
    public static Connection getConnection(){
        return connection;
    }
}
