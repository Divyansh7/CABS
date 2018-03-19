package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;

public class makesqltable {
    public static int tableExist(Connection conn, String tableName) throws SQLException {
    int tExists = 0;
    try(ResultSet rs = conn.getMetaData().getTables(null, null, tableName, null)){
    while (rs.next()) { 
            String tName = rs.getString("TABLE_NAME");
            if (tName != null && tName.equals(tableName)) {
                tExists = 1;
                break;
            }
        }
    }
    return tExists;
}
}
