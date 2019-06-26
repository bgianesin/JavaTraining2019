package javatraining.mySql;


import javatraining.mySql.MySqlConnector;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MySqlOperations {
    public static void main(String[] args) throws SQLException {

       // String insertQuery="INSERT INTO javatraining (CORPKEY, NAME, EMAIL,SQUAD,TRIBE) VALUES ('WJ80Vf', 'ANSARI', 'abc@xyz.com','LOS TIGRES','TRIBE');";
       //   MySqlConnector.insert(insertQuery);

       // String updateQuery ="UPDATE javatraining SET NAME = 'Mohammad', SQUAD= 'DataMovers' WHERE CORPKEY = 'WJ80Vf';";
       // MySqlConnector.update(updateQuery);


        ResultSet resultSet = MySqlConnector.select("select * from ing.javatraining");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + "\n " + resultSet.getString(2) + "\n " + resultSet.getString(3)+ "\n " + resultSet.getString(4)+ "\n " + resultSet.getString(5));
        }

      //  MySqlConnector.insert("insert into ing.javatraining values('wj8jgkd','ansari','cim')");

        MySqlConnector.close();
    }
}

