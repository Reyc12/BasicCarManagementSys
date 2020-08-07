package sample.DatabaseManager;

import java.sql.*;

public class DbManager  {

    private   static final String USERNAME = "root";
    private  static final String PASSWORD = "Interist1";
    private   static final String CONN_STRING = "jdbc:mysql://localhost:3306/autogas_schema?serverTimezone=UTC";



    public static Connection getConnection() throws SQLException {


        return DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
    }

    public static void processException(SQLException e) {
        System.err.println("Error message: " + e.getMessage());
        System.err.println("Error code: " + e.getErrorCode());
        System.err.println("SQL state: " + e.getSQLState());
    }












    /*public static void callDbManager() throws SQLException {

        //Class.forName("com.mysql.jdbc.Driver");

        Connection connection = null;



        try{
            connection = DriverManager.getConnection(CONN_STRING,USERNAME, PASSWORD);
        }catch (SQLException e){
            System.err.println(e);
        }finally {
            if(connection != null){
                connection.close();
            }
        }

    }*/


}
/*
public class JDBCUtil {
    String className, URL, user, password;
    Connection connection;
    public JDBCUtil(String className, String URL, String user, String password) {
        this.className = className;
        this.URL = URL;
        this.user = user;
        this.password = password;
        this.connection = null;
    }
    public void getConnection() {
        //Load the driver class
        try {
            Class.forName(className);
        } catch (ClassNotFoundException ex) {
            System.out.println("Unable to load the class. Terminating the program");
            System.exit(-1);
        }
        //get the connection
        try {
            connection = DriverManager.getConnection(URL, user, password);
        } catch (SQLException ex) {
            System.out.println("Error getting connection: " + ex.getMessage());
            System.exit(-1);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            System.exit(-1);
        }
    }
}
* */




