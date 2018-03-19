package javaapplication1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class databaseuser {
    public int checkDBExists(String dbName){

    try{
        Class.forName("com.mysql.jdbc.Driver"); //Register JDBC Driver
        Connection conn = null;
       // System.out.println("Creating a connection...");
        conn = DriverManager.getConnection("jdbc:mysql://localhost","root","root"); //Open a connection
        try (ResultSet resultSet = conn.getMetaData().getCatalogs()) {
            while (resultSet.next()) {
                
                String databaseName = resultSet.getString(1);
                if(databaseName.equals(dbName)){
                    return 1;
                }
            }
        }

    }
    catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
    }

    return 0;
}
}
