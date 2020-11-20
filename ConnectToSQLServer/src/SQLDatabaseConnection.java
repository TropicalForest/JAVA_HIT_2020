import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

public class SQLDatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=JavaDatabase";
        String username = "sa";
        String password = "123";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM [HangHoa]";
            Statement statement = connection.createStatement();
//            for(int i = 4;i < 7; ++i) {
//            	String convert = String.valueOf(i);
//            	String sql2 = "INSERT INTO HangHoa VALUES(1, N'NewHangHoa');";
//            	ResultSet rs = statement.executeQuery(sql2); 
//            }
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt(1) + ":" + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}