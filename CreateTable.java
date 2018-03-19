package javaapplication1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javaapplication1.makesqltable;

public class CreateTable {
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost/cdot"; //check this part
	private static final String DB_USER = "root";   //check
	private static final String DB_PASSWORD = "root";  //check
	
      //  public static void main(String[] arg)
        public void checktable()
        {
		try {
                        java.sql.Connection conn = getDBConnection();
                        makesqltable obj=new makesqltable();
                        int b;
                        b=makesqltable.tableExist(conn,"host"); //check	
            if(b==1)
          {
                System.out.println("Already present");
          }
          else
          {
              createDbUserTable();
              createDbUserTable1();
              createDbUserTable2();
          }

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}
        
        
         private static void createDbUserTable2() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		/*String createTableSQL = "CREATE TABLE DBUSER("
				+ "USER_ID NUMBER(5) NOT NULL, "
				+ "USERNAME VARCHAR(20) NOT NULL, "
				+ "CREATED_BY VARCHAR(20) NOT NULL, "
				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
				+ ")";           */
                
                
                
                
                
                String createTableSQL ="create table tlog(backup_time time NOT NULL, host varchar(15) NOT NULL primary key,  source_dir varchar(50) NOT NULL, target_dir varchar(50) NOT NULL, login_name varchar(20) NOT NULL, password varchar(20), backup_date date, schedule_day varchar(9), scheduled varchar(6) not null)";
		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(createTableSQL);
                        // execute the SQL stetement
			statement.execute(createTableSQL);

			System.out.println("Table \"dbuser\" is created!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}
	} 
        
        private static void createDbUserTable1() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		/*String createTableSQL = "CREATE TABLE DBUSER("
				+ "USER_ID NUMBER(5) NOT NULL, "
				+ "USERNAME VARCHAR(20) NOT NULL, "
				+ "CREATED_BY VARCHAR(20) NOT NULL, "
				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
				+ ")";           */
                
                
                
                
                
                String createTableSQL ="create table plog("+"SNO int(5) NOT NULL primary key auto_increment, "+" host varchar(15) NOT NULL, "+" type varchar(6), "
                        +" source_dir varchar(50) NOT NULL, "+" target_dir varchar(50) NOT NULL, "+" login_name varchar(20) NOT NULL, "+" backup_time time NOT NULL, "
                        +" backup_date date not null, "+"operations varchar(15) NOT NULL,"+" status varchar(7) not null"+")";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(createTableSQL);
                        // execute the SQL stetement
			statement.execute(createTableSQL);

			System.out.println("Table \"dbuser\" is created!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}
        
        

	private static void createDbUserTable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		/*String createTableSQL = "CREATE TABLE DBUSER("
				+ "USER_ID NUMBER(5) NOT NULL, "
				+ "USERNAME VARCHAR(20) NOT NULL, "
				+ "CREATED_BY VARCHAR(20) NOT NULL, "
				+ "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
				+ ")";           */
                
                
                
                
                
                String createTableSQL = "create table host("+"host varchar(15) NOT NULL primary key,"
                        +" type varchar(6) NOT NULL,"+" source_dir varchar(50) NOT NULL, "+" target_dir varchar(50) NOT NULL,"+" login_name varchar(20) NOT NULL, "+" password varchar(15) NOT NULL, "
                        +" scheduled varchar(7) NOT NULL, "+" backup_time time NOT NULL,"+" schedule_day varchar(10), "+"actual_backup_time time, "
                        +" last_backup_status varchar(7)"+")";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(createTableSQL);
                        // execute the SQL stetement
			statement.execute(createTableSQL);

			System.out.println("Table \"dbuser\" is created!");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
					DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}
