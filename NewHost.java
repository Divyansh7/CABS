package javaapplication1;


import java.awt.HeadlessException;
import javax.swing.JFileChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.File;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NewHost extends javax.swing.JFrame {
        public NewHost()
    {
        initComponents();            
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hnew = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sdnew = new javax.swing.JTextField();
        tdnew = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lnnew = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnew = new javax.swing.JPasswordField();
        jButton4 = new javax.swing.JButton();
        ComboBox_name = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        Date date = new Date();
        SpinnerDateModel sm = new SpinnerDateModel(date,null,null,Calendar.HOUR_OF_DAY);
        jSpinner1 = new javax.swing.JSpinner(sm);
        jLabel8 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Host");

        jLabel4.setText("Target directory");

        jLabel5.setText("Login name");

        jLabel6.setText("Password");

        jLabel2.setText("Type");

        jLabel3.setText("Source directory");

        tdnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdnewActionPerformed(evt);
            }
        });

        jButton3.setText("Browse...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ComboBox_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EMS", "Router" }));
        ComboBox_name.setSelectedIndex(-1);
        ComboBox_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_nameActionPerformed(evt);
            }
        });

        jLabel9.setText("Scheduled");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Weekly" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Set Backup Time");

        jComboBox3.setVisible(false);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" }));
        jComboBox3.setSelectedIndex(-1);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "HH:mm:ss");
        jSpinner1.setEditor(de);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Create New Host");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSpinner1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addGap(78, 78, 78)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ComboBox_name, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tdnew, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lnnew, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnew, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hnew, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sdnew)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(269, 269, 269))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ComboBox_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sdnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tdnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(pnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton4))))
                .addContainerGap())
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            testpie t = new testpie();
        t.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void jMenu2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseDragged
    }//GEN-LAST:event_jMenu2MouseDragged
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Modify modify = new Modify();
        this.setVisible(false);
        modify.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        NewHost host = new NewHost();
        this.setVisible(false);
        host.setVisible(true);
    }//GEN-LAST:event_NewActionPerformed
    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Manual_backup1 mb = new Manual_backup1();
        mb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
    }//GEN-LAST:event_jSpinner1StateChanged
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
    }//GEN-LAST:event_jComboBox3ActionPerformed
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedItem().toString().equals("Weekly")){
            jComboBox3.setVisible(true);
        }
        else{
            jComboBox3.setVisible(false);
            jComboBox3.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed
    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
    }//GEN-LAST:event_jComboBox2ItemStateChanged
    private void ComboBox_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_nameActionPerformed
    }//GEN-LAST:event_ComboBox_nameActionPerformed
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ViewPage page = new ViewPage();
        this.setVisible(false);
        page.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            SimpleDateFormat sdf=new SimpleDateFormat("kk:mm:ss");
            sdf.setTimeZone(TimeZone.getDefault());
            int port = 22;
            String host = hnew.getText();
            String type = ComboBox_name.getSelectedItem().toString();
            String source = sdnew.getText();
            String target = tdnew.getText();
            String login =  lnnew.getText();
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            java.sql.Time sqlTime = new java.sql.Time(new java.util.Date().getTime());
            String password = String.valueOf(pnew.getPassword());
            String scheduled= jComboBox2.getSelectedItem().toString();
            try{
            valid v = new valid();
            int ans;
            ans=v.valid(host, login, port, password);
            if(ans==1)
            {
                if(jComboBox2.getSelectedItem().toString().equals("Weekly")){
                    String time = sdf.format(jSpinner1.getValue());
                    String schedule_day= jComboBox3.getSelectedItem().toString();
                    Connection conn = null;
                    conn = MySqlConnect1.ConnectDB();
                    PreparedStatement pstmt = null;
                    String sql = "Insert into host values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        pstmt = conn.prepareStatement(sql);
                        pstmt.setString(1, host);
                        pstmt.setString(2, type);
                        pstmt.setString(3, source);
                        pstmt.setString(4, target);
                        pstmt.setString(5, login);
                        pstmt.setString(6, password);
                        pstmt.setString(7, scheduled);
                        pstmt.setString(8, time);
                        pstmt.setString(9, schedule_day);
                        pstmt.setString(10, null);
                        pstmt.setString(11, null);
                        int i = pstmt.executeUpdate();
                        if(i>0)
                        {
                            JOptionPane.showMessageDialog(null,"Data is Saved");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Data is Not Saved");
                        }
                        //stores in log file
                        String sq = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            pstmt = conn.prepareStatement(sq);
                            pstmt.setString(1, host);
                            pstmt.setString(2, type);
                            pstmt.setString(4, target);
                            pstmt.setString(3, source);
                            pstmt.setString(5, login);
                            pstmt.setTime(6, sqlTime);
                            pstmt.setDate(7, sqlDate);
                            pstmt.setString(8, "New Host");
                            pstmt.setString(9, "Success");
                            pstmt.executeUpdate();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        //stores in temporary file
                        String s = "Insert into tlog( backup_time, host, source_dir, target_dir, login_name, password, backup_date, schedule_day, scheduled) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            pstmt = conn.prepareStatement(s);
                            pstmt.setString(1, time);
                            pstmt.setString(2, host);
                            pstmt.setString(3, source);
                            pstmt.setString(4, target);
                            pstmt.setString(5, login);
                            pstmt.setString(6, password);
                            pstmt.setDate(7, sqlDate);
                            pstmt.setString(8, schedule_day);
                            pstmt.setString(9, "Weekly");
                            pstmt.executeUpdate();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
                else{
                    String time = sdf.format(jSpinner1.getValue());
                    Connection conn = null;
                    conn = MySqlConnect1.ConnectDB();
                    PreparedStatement pstmt = null;
                    String sql = "Insert into host values( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        pstmt = conn.prepareStatement(sql);
                        pstmt.setString(1, host);
                        pstmt.setString(2, type);
                        pstmt.setString(3, source);
                        pstmt.setString(4, target);
                        pstmt.setString(5, login);
                        pstmt.setString(6, password);
                        pstmt.setString(7, scheduled);
                        pstmt.setString(8, time);
                        pstmt.setString(9, null);
                        pstmt.setString(10, null);
                        pstmt.setString(11, null);
                        int i = pstmt.executeUpdate();
                        if(i>0)
                        {
                            JOptionPane.showMessageDialog(null,"Data is Saved");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"Data is Not Saved");
                        }
                        //Stores in log file
                        String sq = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            pstmt = conn.prepareStatement(sq);
                            pstmt.setString(1, host);
                            pstmt.setString(2, type);
                            pstmt.setString(3, source);
                            pstmt.setString(4, target);
                            pstmt.setString(5, login);
                            pstmt.setTime(6, sqlTime);
                            pstmt.setDate(7, sqlDate);
                            pstmt.setString(8, "New Host");
                            pstmt.setString(9, "Success");
                            pstmt.executeUpdate();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                        //stores in temporary file
                        String s = "Insert into tlog( backup_time, host, source_dir, target_dir, login_name, password, backup_date, schedule_day, scheduled) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            pstmt = conn.prepareStatement(s);
                            pstmt.setString(1, time);
                            pstmt.setString(2, host);
                            pstmt.setString(3, source);
                            pstmt.setString(4, target);
                            pstmt.setString(5, login);
                            pstmt.setString(6, password);
                            pstmt.setDate(7, sqlDate);
                            pstmt.setString(8, "");
                            pstmt.setString(9, "Daily");
                            pstmt.executeUpdate();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Host Already Created");
                    }
                }
            }
                    else{
                            JOptionPane.showMessageDialog(null, "Invalid Credentials!!!");
                        }
        }
        catch(Exception e) {
                    Connection conn = null;
                    conn = MySqlConnect1.ConnectDB();
                    PreparedStatement pstmt = null;
                        //stores in log file
                        String sq = "Insert into plog(host, type, source_dir, target_dir, login_name, backup_time, backup_date, operations, status) values( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                        try {
                            Class.forName("com.mysql.jdbc.Driver");
                            pstmt = conn.prepareStatement(sq);
                            pstmt.setString(1, host);
                            pstmt.setString(2, type);
                            pstmt.setString(4, target);
                            pstmt.setString(3, source);
                            pstmt.setString(5, login);
                            pstmt.setTime(6, sqlTime);
                            pstmt.setDate(7, sqlDate);
                            pstmt.setString(8, "New Host");
                            pstmt.setString(9, "Failure");
                            pstmt.executeUpdate();
                        } catch (Exception e3) {
                            JOptionPane.showMessageDialog(null, e3);
                        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser=new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File filename = chooser.getSelectedFile();
            String f = filename.getAbsolutePath();
            tdnew.setText(f);
        } else {
            System.out.println("No Selection ");
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    private void tdnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdnewActionPerformed
    }//GEN-LAST:event_tdnewActionPerformed
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ViewLogs vl = new ViewLogs();
        vl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_name;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem New;
    private javax.swing.JTextField hnew;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField lnnew;
    private javax.swing.JPasswordField pnew;
    private javax.swing.JTextField sdnew;
    private javax.swing.JTextField tdnew;
    // End of variables declaration//GEN-END:variables
}