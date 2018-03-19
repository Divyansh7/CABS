package backup;

import backup.backup;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;
import javax.swing.JOptionPane;

public class find_dir {
    @SuppressWarnings("unchecked")
    find_dir(String SFTPHOST,String SFTPUSER,String SFTPPASS,String SFTPWORKINGDIR,String destFolder) 
    {
        backup obj=new backup();
        int    SFTPPORT = 22;
        String rfile="/";
        String rfile1,pathremote,pathlocal;
        Session     session     = null;
        Channel     channel     = null;
        ChannelSftp channelSftp = null;
        try{
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER,SFTPHOST,SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp)channel;
            channelSftp.cd(SFTPWORKINGDIR);
            @SuppressWarnings("UseOfObsoleteCollectionType")
            java.util.Vector filelist = channelSftp.ls(SFTPWORKINGDIR);
            for(int i=1; i<filelist.size();i++)
            {
                LsEntry entry = (LsEntry) filelist.get(i);
               rfile1=entry.getFilename();
               pathremote=SFTPWORKINGDIR+rfile+rfile1;
               pathlocal=destFolder+rfile+rfile1;
               if(!rfile1.equals(".")) {
                   obj.backup(SFTPHOST,SFTPUSER,SFTPPASS,SFTPPORT,pathremote,pathlocal);   
               }
            }
            
           session.disconnect();
           channel.disconnect();
        }catch(Exception ex){
            try
    {
        
     // Thread t1=new Thread(new Threads());
      String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/cdot";
      Class.forName(myDriver);
      PreparedStatement st;
        try (Connection conn = DriverManager.getConnection(myUrl,"root","root")) {
            String query = "SELECT backup_time,host,source_dir,target_dir,login_name,password,backup_date, schedule_day, scheduled FROM tlog";
            st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                String host = rs.getString("host");
                String user = rs.getString("login_name");
                String src_remote=rs.getString("source_dir");
                String target_local=rs.getString("target_dir");
                Time time=rs.getTime("backup_time");
                String scheduled_day = rs.getString("schedule_day");
                String scheduled = rs.getString("scheduled");
                DateFormat time_backup = new SimpleDateFormat("HH:mm");
                DateFormat time_sql = new SimpleDateFormat("HH:mm");
                String time1 = time_backup.format(time);
                java.sql.Time sql_time=new java.sql.Time(new java.util.Date().getTime());
                String time2 = time_sql.format(sql_time);
                Date date=rs.getDate("backup_date");
                Calendar c = Calendar.getInstance();
                //DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                java.sql.Date sql_date = new java.sql.Date(new java.util.Date().getTime());
                LocalDate sql_date1 = LocalDate.now();
                DateTimeFormatter timeFormatParser = DateTimeFormatter.ofPattern("HH:mm", Locale.ENGLISH);
                LocalTime timer1 = LocalTime.parse(time1, timeFormatParser);
                LocalTime timer2 = LocalTime.parse(time2, timeFormatParser);
                DayOfWeek s;
                
                   
                        
                        
                            try {
                                String query3 = "update host set actual_backup_time = ?, last_backup_status = ? where host= ?";
                                PreparedStatement preparedStmt2 = conn.prepareStatement(query3);
                                preparedStmt2.setTime(1, sql_time);
                                preparedStmt2.setString(2, "Failure");
                                preparedStmt2.setString(3, host);
                                preparedStmt2.executeUpdate();
                                String sq = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                                PreparedStatement pstmt = conn.prepareStatement(sq);
                                
                                pstmt.setString(1, host);
                                pstmt.setString(2, null);
                                pstmt.setString(3, src_remote);
                                pstmt.setString(4, target_local);
                                pstmt.setString(5, user);
                                pstmt.setTime(6, sql_time);
                                pstmt.setDate(7, sql_date);
                                pstmt.setString(8, "Backup");
                                pstmt.setString(9, "Failure");
                                pstmt.executeUpdate();
                            } catch (Exception ex2) {
                                JOptionPane.showMessageDialog(null, ex2);
                        }
        }                
    }
         
      st.close();
      
    }
    catch (Exception e5)
    {
      System.err.println("Got an exception!");
      System.err.println(e5.getMessage());
        }
        }
    }
}