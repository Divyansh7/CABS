package javaapplication1;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class main {
    

    private static final String dbName = "cdot";


    public void createdatabase() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/?user=root&password=root");
        Statement s = conn.createStatement();
        int Result = s.executeUpdate("CREATE DATABASE "+dbName);
    }

    
 //public static void main(String args[]) throws SQLException
   public void checkdatabase()
 {
     main obj1=new main();
        try{
            databaseuser obj=new databaseuser();
             int b;
             b=obj.checkDBExists("cdot");
                if(b==1)
                 {
                         System.out.println("Already Exists");
                     }
                 else
                  {
                    obj1.createdatabase();
                     }  
            }
        catch(Exception e)
        {
            System.out.println(e);
        }
 }
}
