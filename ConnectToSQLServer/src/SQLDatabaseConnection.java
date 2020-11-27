//import java.sql.Connection;
//import java.sql.DriverManager;
////import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//import java.sql.*;
//
//public class SQLDatabaseConnection {
//    private static final String URL_SQLSERVER = "jdbc:sqlserver://localhost:1433;databaseName=JavaDatabase";
//    private static final String USERNAME_SQLSERVER = "sa";
//    private static final String PASSWORD_SQLSERVER = "123";
//    public static void main(String[] args) {
//
//        try {
//            Connection connection = DriverManager.getConnection(URL_SQLSERVER, USERNAME_SQLSERVER, PASSWORD_SQLSERVER);
//            if(connection!=null) {
//            	System.out.println("connected!");
//            }
//            String sql = "SELECT * FROM [HangHoa]";
//            Statement statement = connection.createStatement();
////            for(int i = 4;i < 7; ++i) {
////            	String convert = String.valueOf(i);
////            	String sql2 = "INSERT INTO HangHoa VALUES(1, N'NewHangHoa');";
////            	ResultSet rs = statement.executeQuery(sql2); 
////            }
//            
//     




import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.*;

public class SQLDatabaseConnection {
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
            String sqlInsert = "INSERT INTO HangHoa VALUES (4, N'"+name+"')";
            String sqlAll = "SELECT * FROM HangHoa";
            Statement statement = connection.createStatement();
            
            statement.executeQuery(sqlInsert);
            ResultSet rs = statement.executeQuery(sqlAll);
            
            while(rs.next()) {
            	System.out.println(rs.getInt(1) + ":" + rs.getString(2));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
//            
//            
//            ResultSet rs = statement.executeQuery(sql);
//            while (rs.next()){
//                System.out.println(rs.getInt(1) + ":" + rs.getString(2));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}