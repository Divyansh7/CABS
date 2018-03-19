package javaapplication1;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.Modify;
import javaapplication1.MySqlConnect1;
import javaapplication1.NewHost;
import javaapplication1.ViewLogs;
import javaapplication1.ViewPage;
import javaapplication1.testpie;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getString;
import net.proteanit.sql.DbUtils;

public class Manual_backup1 extends javax.swing.JFrame {
     public final void fetchData(){
         try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = null;
                conn = MySqlConnect1.ConnectDB();
                PreparedStatement pstmt = null;
                String sql = "select host, type, scheduled,  backup_time, schedule_day from host";
                pstmt=conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
     }
    public Manual_backup1() {
        initComponents();
        fetchData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Host IP");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Host IP", "Type", "Schedule Day", "Scheduled", "Backup Time", "Backup Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Backup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setOpaque(false);

        jMenu1.setText("File");

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        jMenu1.add(New);

        Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jMenu2MouseDragged(evt);
            }
        });

        jMenuItem3.setText("Modify");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Tools");

        jMenuItem4.setText("View Disk Usage");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Execute Selected");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("View Logs");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(469, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String host = jTextField1.getText();
try
    {
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      Class.forName(myDriver);
      Connection conn = null;
      conn = MySqlConnect1.ConnectDB();
      
      PreparedStatement p1 = null;
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "select type, source_dir, target_dir, login_name from host where host = ?";
      p1 = conn.prepareStatement(query);
      p1.setString(1, host);
      ResultSet rs = p1.executeQuery();
      
      
      //boolean i = true;
//    do{ 
      while (rs.next())
      {
       
          String user=rs.getString("login_name");
          String src_remote=rs.getString("source_dir");
          String target_local=rs.getString("target_dir");
          String type=rs.getString("type");
          java.sql.Time sql_time=new java.sql.Time(new java.util.Date().getTime());
          java.sql.Date sql_date=new java.sql.Date(new java.util.Date().getTime());
               String query1 = "delete from host where host = ?";
               PreparedStatement preparedStmt = conn.prepareStatement(query1);
               preparedStmt.setString(1, host);
               preparedStmt.executeUpdate();
               //find_dir obj1=new find_dir(host,user,passwd,src_remote,target_local);
               String query2 = "delete from tlog where host = ?";
               PreparedStatement preparedStmt1 = conn.prepareStatement(query2);
               preparedStmt1.setString(1, host);
               preparedStmt1.executeUpdate();
               //System.out.println("hello");
               String query3 = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement preparedStmt2 = conn.prepareStatement(query3);
               preparedStmt2.setString(1, host);
               preparedStmt2.setString(2, type);
               preparedStmt2.setString(3, src_remote);
               preparedStmt2.setString(4, target_local);
               preparedStmt2.setString(5, user);
               preparedStmt2.setTime(6, sql_time);
               preparedStmt2.setDate(7, sql_date);
               preparedStmt2.setString(8, "Delete");
               preparedStmt2.setString(9, "Success");
               preparedStmt2.executeUpdate();
          
      }
      //conn.close();
      //st.close();
    //}while(i);
    //System.exit(0);
    }
    catch (Exception e)
    {
                        try {
                            String myDriver = "com.mysql.jdbc.Driver";
                            Class.forName(myDriver);
                            Connection conn = null;
                            conn = MySqlConnect1.ConnectDB();
                            
                            PreparedStatement p1 = null;
                            // our SQL SELECT query.
                            // if you only need a few columns, specify them by name instead of using "*"
                            String query = "select type, source_dir, target_dir, login_name from host where host = ?";
                            p1 = conn.prepareStatement(query);
                            p1.setString(1, host);
                            ResultSet rs = p1.executeQuery();
                            
                            
                            //boolean i = true;
//    do{
while (rs.next())
{
    
    String user=rs.getString("login_name");
    String src_remote=rs.getString("source_dir");
    String target_local=rs.getString("target_dir");
    String type=rs.getString("type");
    java.sql.Time sql_time=new java.sql.Time(new java.util.Date().getTime());
    java.sql.Date sql_date=new java.sql.Date(new java.util.Date().getTime());
    String query3 = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement preparedStmt2 = conn.prepareStatement(query3);
    preparedStmt2.setString(1, host);
    preparedStmt2.setString(2, type);
    preparedStmt2.setString(3, src_remote);
    preparedStmt2.setString(4, target_local);
    preparedStmt2.setString(5, user);
    preparedStmt2.setTime(6, sql_time);
    preparedStmt2.setDate(7, sql_date);
    preparedStmt2.setString(8, "Delete");
    preparedStmt2.setString(9, "Failure");
    preparedStmt2.executeUpdate();
    
}
System.err.println("Got an exception! ");
System.err.println(e.getMessage());

                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Manual_backup1.class.getName()).log(Level.SEVERE,null, ex);
                        } catch (SQLException ex) {
        Logger.getLogger(Manual_backup1.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    }//GEN-LAST:event_jButton2ActionPerformed
     @SuppressWarnings("null")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String host = jTextField1.getText();
        try
    {
       
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      Class.forName(myDriver);
      Connection conn = null;
      conn = MySqlConnect1.ConnectDB();
      
      PreparedStatement p1 = null;
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "select type, source_dir, target_dir, login_name from host where host = ?";
      p1 = conn.prepareStatement(query);
      p1.setString(1, host);
      ResultSet rs = p1.executeQuery();
      //System.out.println("lol");
      Client cl = new Client(host);
      //System.out.println("hello");
      //boolean i = true;
//    do{ 
      while (rs.next())
      {
          String user=rs.getString("login_name");
          String src_remote=rs.getString("source_dir");
          String target_local=rs.getString("target_dir");
          String type=rs.getString("type");
          java.sql.Time sql_time=new java.sql.Time(new java.util.Date().getTime());
          java.sql.Date sql_date=new java.sql.Date(new java.util.Date().getTime());
         // System.out.format("%s,%s,%s,%s,%s\n",host,user,passwd,src_remote,target_local);
          
          
               
               String query1 = "update host set actual_backup_time = ?, last_backup_status = ? where host = ?";
               PreparedStatement preparedStmt = conn.prepareStatement(query1);
               preparedStmt.setTime(1, sql_time);
               preparedStmt.setString(2, "Success");
               preparedStmt.setString(3, host);
               preparedStmt.executeUpdate();
               //find_dir obj1=new find_dir(host,user,passwd,src_remote,target_local);
               String query3 = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement preparedStmt2 = conn.prepareStatement(query3);
               preparedStmt2.setString(1, host);
               preparedStmt2.setString(2, type);
               preparedStmt2.setString(3, src_remote);
               preparedStmt2.setString(4, target_local);
               preparedStmt2.setString(5, user);
               preparedStmt2.setTime(6, sql_time);
               preparedStmt2.setDate(7, sql_date);
               preparedStmt2.setString(8, "Manual Backup");
               preparedStmt2.setString(9, "Success");
               preparedStmt2.executeUpdate();
          
      }
    }
catch(Exception e1){
    e1.printStackTrace();
    try
    {
      
      // create our mysql database connection
      String myDriver = "com.mysql.jdbc.Driver";
      Class.forName(myDriver);
      Connection conn = null;
      conn = MySqlConnect1.ConnectDB();
      
      PreparedStatement p1 = null;
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "select type, source_dir, target_dir, login_name from host where host = ?";
      p1 = conn.prepareStatement(query);
      p1.setString(1, host);
      ResultSet rs = p1.executeQuery();
      
      
      //boolean i = true;
//    do{ 
      while (rs.next())
      {
          String user=rs.getString("login_name");
          String src_remote=rs.getString("source_dir");
          String target_local=rs.getString("target_dir");
          String type=rs.getString("type");
          java.sql.Time sql_time=new java.sql.Time(new java.util.Date().getTime());
          java.sql.Date sql_date=new java.sql.Date(new java.util.Date().getTime());
         // System.out.format("%s,%s,%s,%s,%s\n",host,user,passwd,src_remote,target_local);
          
          
               
               String query1 = "update host set actual_backup_time = ?, last_backup_status = ? where host = ?";
               PreparedStatement preparedStmt = conn.prepareStatement(query1);
               preparedStmt.setTime(1, sql_time);
               preparedStmt.setString(2, "Failure");
               preparedStmt.setString(3, host);
               preparedStmt.executeUpdate();
               //find_dir obj1=new find_dir(host,user,passwd,src_remote,target_local);
               String query3 = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
               PreparedStatement preparedStmt2 = conn.prepareStatement(query3);
               preparedStmt2.setString(1, host);
               preparedStmt2.setString(2, type);
               preparedStmt2.setString(3, src_remote);
               preparedStmt2.setString(4, target_local);
               preparedStmt2.setString(5, user);
               preparedStmt2.setTime(6, sql_time);
               preparedStmt2.setDate(7, sql_date);
               preparedStmt2.setString(8, "Manual Backup");
               preparedStmt2.setString(9, "Failure");
               preparedStmt2.executeUpdate();
          
      }
}catch(Exception e2){
    e2.printStackTrace();
    }
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        NewHost host = new NewHost();
        this.setVisible(false);
        host.setVisible(true);
    }//GEN-LAST:event_NewActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Modify modify = new Modify();
        this.setVisible(false);
        modify.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    private void jMenu2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseDragged
    }//GEN-LAST:event_jMenu2MouseDragged
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        testpie t = new testpie();
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Manual_backup1 mb = new Manual_backup1();
        mb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ViewLogs vl = new ViewLogs();
        vl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ViewPage page = new ViewPage();
        page.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem New;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}