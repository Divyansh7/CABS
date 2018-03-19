/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Student
 */
public class immediate {

//public static void main(String[] arg) throws ClassNotFoundException
 immediate(String host) throws ClassNotFoundException 
{
   // String host="192.168.4.60";
          String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/cdot";
      Class.forName(myDriver);
      //Statement st;
        try (Connection conn = DriverManager.getConnection(myUrl,"root","root")) {
            String query = "SELECT login_name,password,source_dir,target_dir FROM tlog where host=?";
            PreparedStatement st = conn.prepareStatement(query);
            st.setString(1,host);
     //       System.out.println("hello");
     System.out.println(host);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                //String host=rs.getString("host");
                String user=rs.getString("login_name");
                String passwd=rs.getString("password");
                String src_remote=rs.getString("source_dir");
                String target_local=rs.getString("target_dir");
                find_dir obj1=new find_dir(host,user,passwd,src_remote,target_local);
            }
            
}catch(Exception e){
            JOptionPane.showMessageDialog(null, e);        
                    }
    }
}
