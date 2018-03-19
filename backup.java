package backup;

import com.jcraft.jsch.*;
import java.io.*;
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

public class backup {
public void backup(String host,String user,String passwd,int port,String rfile,String lfile)
{
    FileOutputStream fos=null;
    try{      
      String prefix=null;
      if(new File(lfile).isDirectory()){
        prefix=lfile+File.separator;
      }
      JSch jsch=new JSch();
      Session session=jsch.getSession(user, host, port);
      session.setPassword(passwd);
      java.util.Properties config = new java.util.Properties();
      config.put("StrictHostKeyChecking", "no");
      session.setConfig(config);
      session.connect();
      String command="scp -f "+rfile;
      Channel channel=session.openChannel("exec");
      ((ChannelExec)channel).setCommand(command);
      OutputStream out=channel.getOutputStream();
      InputStream in=channel.getInputStream();
      channel.connect();
      byte[] buf=new byte[1024];
      buf[0]=0; out.write(buf, 0, 1); out.flush();
      while(true){
	int c=checkAck(in);
        if(c!='C'){
	  break;
	}
        in.read(buf, 0, 5);
        long filesize=0L;
        while(true){
          if(in.read(buf, 0, 1)<0){
            break; 
          }
          if(buf[0]==' ')break;
          filesize=filesize*10L+(long)(buf[0]-'0');
        }
        String file=null;
        for(int i=0;;i++){
          in.read(buf, i, 1);
          if(buf[i]==(byte)0x0a){
            file=new String(buf, 0, i);
            break;
  	  }
        }
        buf[0]=0; out.write(buf, 0, 1); out.flush();
        fos=new FileOutputStream(prefix==null ? lfile : prefix+file);
        int foo;
        while(true){
          if(buf.length<filesize) foo=buf.length;
	  else foo=(int)filesize;
          foo=in.read(buf, 0, foo);
          if(foo<0){
            break;
          }
          fos.write(buf, 0, foo);
          filesize-=foo;
          if(filesize==0L) break;
        }
        fos.close();
        fos=null;
	if(checkAck(in)!=0){
	  System.exit(0);
	}
        buf[0]=0; out.write(buf, 0, 1); out.flush();
      }
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
                                preparedStmt2.setString(2, "Success");
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
                                pstmt.setString(9, "Success");
                                pstmt.executeUpdate();
                            } catch (Exception ex2) {
                                JOptionPane.showMessageDialog(null, ex2);
                        }
        }                
    }
         
      st.close();
      
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
        }
    }
    catch(JSchException | IOException e){
      System.out.println(e);
      try{if(fos!=null)fos.close();}catch(IOException ee){}
      
       
    }
  }
  static int checkAck(InputStream in) throws IOException{
    int b=in.read();
    if(b==0) return b;
    if(b==-1) return b;
    if(b==1 || b==2){
      StringBuilder sb=new StringBuilder();
      int c;
      do {
	c=in.read();
	sb.append((char)c);
      }
      while(c!='\n');
      if(b==1){ // error
	System.out.print(sb.toString());
      }
      if(b==2){ // fatal error
	System.out.print(sb.toString());
      }
    }
    return b;
  }
}