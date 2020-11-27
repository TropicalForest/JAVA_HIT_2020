import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

public class test {
    private static final String URL_SQLSERVER = "jdbc:sqlserver://localhost:1433;databaseName=JavaDatabase";
    private static final String USERNAME_SQLSERVER = "sa";
    private static final String PASSWORD_SQLSERVER = "123";
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL_SQLSERVER, USERNAME_SQLSERVER, PASSWORD_SQLSERVER);
            if(connection!=null) {
            	System.out.println("connected!");
            }
            
            String name = "Tê rác";
            String sqlInsert = "INSERT INTO HangHoa VALUES (?, ?)";
//            String sqlAll = "SELECT * FROM HangHoa";
//            Statement statement = connection.createStatement();
//            statement.execute(sqlInsert);
            
//           ResultSet rs = statement.executeQuery(sqlAll);
            
            int stt = 5;
            name = "kỳ lân";

            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
            preparedStatement.setInt(1, stt);
            preparedStatement.setString(2, name);
            preparedStatement.execute();
            
//          while(rs.next()) {
//     	    	System.out.println(rs.getInt(1) + ":" + rs.getString(2));
//          }
            
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}