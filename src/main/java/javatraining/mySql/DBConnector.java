package javatraining.mySql;

import com.mysql.cj.xdevapi.Table;

import java.sql.*;

public class DBConnector {
    public static void main(String args[]) {
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ing", "root", "admin");
            //here ing is database name, root is username and password is  admin
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from javatraining");

            while (rs.next()){
                System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
                //System.out.println(rs);
            }

        con.close();
        }
         catch (Exception e) {
           System.out.println(e);
         }
    }
}
