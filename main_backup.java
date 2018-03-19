package backup;
import backup.find_dir;
import java.sql.*;
import javax.swing.JOptionPane;
import org.apache.commons.lang.time.DateUtils;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main_backup{
    
    
    public static class MyThread implements Runnable {
                String SFTPHOST,SFTPUSER,SFTPPASS,SFTPWORKINGDIR,destFolder;
   public MyThread(String SFTPHOST,String SFTPUSER,String SFTPPASS,String SFTPWORKINGDIR,String destFolder) {
       // store parameter for later user
       this.SFTPHOST=SFTPHOST;
            this.SFTPUSER=SFTPUSER;
            this.SFTPPASS=SFTPPASS;
            this.SFTPWORKINGDIR=SFTPWORKINGDIR;
            this.destFolder=destFolder;
   }

   public void run() {
       
       try
    {
        
      //Thread t1=new Thread(new Threads());
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
                String host=rs.getString("host");
                String user=rs.getString("login_name");
                String passwd=rs.getString("password");
                String src_remote=rs.getString("source_dir");
                String target_local=rs.getString("target_dir");
                Time time=rs.getTime("backup_time");
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
                
                   
                        try{
                            find_dir obj1=new find_dir(host,user,passwd,src_remote,target_local);
                            
                             if(scheduled.equals("Daily")){
                                c.setTime(sql_date);
                            c.add(Calendar.DATE, 1);
                            java.sql.Date x1=new java.sql.Date(c.getTime().getTime());
                            String query2 = "update tlog set backup_date = ? where host= ?";
                            PreparedStatement preparedStmt1 = conn.prepareStatement(query2);
                            preparedStmt1.setDate(1,x1);
                            preparedStmt1.setString(2, host);
                            preparedStmt1.executeUpdate();
                            }
                             else if(scheduled.equals("Weekly"))
                             {
                                 c.setTime(sql_date);
                            c.add(Calendar.DATE, 7);
                            java.sql.Date x1=new java.sql.Date(c.getTime().getTime());
                            String query2 = "update tlog set backup_date = ? where host= ?";
                            PreparedStatement preparedStmt1 = conn.prepareStatement(query2);
                            preparedStmt1.setDate(1,x1);
                            preparedStmt1.setString(2, host);
                            preparedStmt1.executeUpdate();
                            
                             }
                            
                        }
                        catch(Exception e){
                            e.printStackTrace();
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
}
    public main_backup() throws ClassNotFoundException, SQLException
    {   
        String myDriver = "com.mysql.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost/cdot";
        try {
            Class.forName(myDriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main_backup.class.getName()).log(Level.SEVERE, null, ex);
        }
      PreparedStatement st;
        try (Connection conn = DriverManager.getConnection(myUrl,"root","root")) {
            String query = "SELECT backup_time,host,source_dir,target_dir,login_name,password,backup_date, schedule_day, scheduled FROM tlog";
            st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next())
            {
                String host=rs.getString("host");
                String user=rs.getString("login_name");
                String passwd=rs.getString("password");
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
        if(DateUtils.isSameDay(sql_date,date) && scheduled.equals("Weekly"))
                {
                    
                    switch (scheduled_day) {
                        case "Monday":
                            s = DayOfWeek.MONDAY;
                            break;
                        case "Tuesday":
                            s = DayOfWeek.TUESDAY;
                            break;
                        case "Wednesday":
                            s = DayOfWeek.WEDNESDAY;
                            break;
                        case "Thursday":
                            s = DayOfWeek.THURSDAY;
                            break;
                        case "Friday":
                            s = DayOfWeek.FRIDAY;
                            break;
                        case "Saturday":
                            s = DayOfWeek.SATURDAY;
                            break;
                        default:
                            s = DayOfWeek.SUNDAY;
                            break;
                    }
                    LocalDate nextWed = LocalDate.now().with(TemporalAdjusters.next(s));
                    System.out.println("next = " + nextWed);
                    Period p = Period.between(sql_date1, nextWed);
                    long p2 = ChronoUnit.DAYS.between(sql_date1, nextWed);
//                    System.out.println(p.getDays());
                    System.out.println(sql_date1);
                    
                    //System.out.println(p.getDays());
                    if(p.getDays()<7){
                        //c.setTime(sql_date);
                        //c.add(Calendar.DATE, p.getDays());
                        //java.sql.Date x1=new java.sql.Date(c.getTime().getTime());
                        String query2 = "update tlog set backup_date = ? where host= ?";
                        PreparedStatement preparedStmt1 = conn.prepareStatement(query2);
                        //System.out.println(x1);
                        java.sql.Date date6 = java.sql.Date.valueOf(nextWed);
                        System.out.println(date6); 
                        preparedStmt1.setDate(1,date6);
                        preparedStmt1.setString(2, host);
                        preparedStmt1.executeUpdate();                      
                    }
                    
                    }
        
                            if(DateUtils.isSameDay(sql_date,date))  //&& scheduled.equals("Daily")
                {
                    if(timer1.isBefore(timer2) || time1.equals(time2)){
                            Thread t=new Thread(new MyThread(host,user,passwd,src_remote,target_local));
                             t.start();
                        }
    }
                  
        
            }
        }
        catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
        }
    }

   
    
 }