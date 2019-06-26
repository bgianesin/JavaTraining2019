package javatraining.mySql;

import org.apache.commons.dbutils.DbUtils;

import java.sql.*;

public class MySqlConnector {
    private  static Connection connection =null;

    public MySqlConnector(String host, String port, String database, String user, String pwd) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, user, pwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void open(){
        if (connection == null){
            new MySqlConnector("localhost", "3306", "ing", "root", "admin");
        }

    }

    public static ResultSet select(String query) throws SQLException {
        ResultSet resultset = null;
        open();
        Statement statement =  connection.createStatement();
        try {
             resultset= statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultset;

    }

    public static void insert(String query) throws SQLException {
        Statement statement = null;
        open();
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            DbUtils.closeQuietly(statement);
            close();
        }
    }

    public static void update(String query) throws SQLException {
        Statement statement = null;
        open();
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        } finally {
            DbUtils.closeQuietly(statement);
            close();
        }
    }
    public static void close() throws SQLException {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
