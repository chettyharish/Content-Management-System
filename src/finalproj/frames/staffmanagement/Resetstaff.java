package finalproj.frames.staffmanagement;

import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.db.AESrunner;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.SMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Resetstaff extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String level;
    private String search;
    private String pass1;
    private String pass2;
    private String passorig;
    private String levelorig;
    private String message = "";
    /*NOTE:Flags will become false if no change is made*/
    private boolean searchflag = false;
    private static Logger logger;
    
    public Resetstaff() {
        logger = Logger.getLogger(Resetstaff.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        log_label = new javax.swing.JLabel();
        txt_reset_login = new javax.swing.JTextField();
        button_reset_select = new javax.swing.JButton();
        conf_panel = new javax.swing.JPanel();
        coun_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        add1_label = new javax.swing.JLabel();
        add2_label = new javax.swing.JLabel();
        zip_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        txt_reset_DOB = new javax.swing.JTextField();
        txt_reset_country = new javax.swing.JTextField();
        txt_reset_city = new javax.swing.JTextField();
        txt_reset_add1 = new javax.swing.JTextField();
        txt_reset_add2 = new javax.swing.JTextField();
        txt_reset_zipcode = new javax.swing.JTextField();
        pass_panel = new javax.swing.JPanel();
        pass_label = new javax.swing.JLabel();
        re_label = new javax.swing.JLabel();
        pwd_reset_pass1 = new javax.swing.JPasswordField();
        pwd_reset_pass2 = new javax.swing.JPasswordField();
        end_panel = new javax.swing.JPanel();
        button_reset_confirm = new javax.swing.JButton();
        button_reset_cancel = new javax.swing.JButton();
        level_panel = new javax.swing.JPanel();
        level_label = new javax.swing.JLabel();
        combo_reset_level = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Recover Staff Password");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        log_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        log_label.setText("Login Name:");

        txt_reset_login.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_reset_select.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_reset_select.setText("Select");
        button_reset_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_reset_selectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(log_label)
                .addGap(33, 33, 33)
                .addComponent(txt_reset_login, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(button_reset_select)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_label)
                    .addComponent(txt_reset_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_reset_select))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        conf_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm the Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        coun_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        coun_label.setText("Country:");

        city_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        city_label.setText("City:");

        add1_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add1_label.setText("Address 1:");

        add2_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add2_label.setText("Address 2:");

        zip_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        zip_label.setText("Zipcode:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        txt_reset_DOB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_reset_country.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_reset_city.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_reset_add1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_reset_add2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_reset_zipcode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout conf_panelLayout = new javax.swing.GroupLayout(conf_panel);
        conf_panel.setLayout(conf_panelLayout);
        conf_panelLayout.setHorizontalGroup(
            conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conf_panelLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_label)
                    .addComponent(zip_label)
                    .addComponent(add2_label)
                    .addComponent(add1_label)
                    .addComponent(city_label)
                    .addComponent(coun_label))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_reset_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_reset_zipcode)
                    .addComponent(txt_reset_add2)
                    .addComponent(txt_reset_add1)
                    .addComponent(txt_reset_city)
                    .addComponent(txt_reset_country, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        conf_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, dob_label, zip_label});

        conf_panelLayout.setVerticalGroup(
            conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conf_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob_label)
                    .addComponent(txt_reset_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coun_label)
                    .addComponent(txt_reset_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_label)
                    .addComponent(txt_reset_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1_label)
                    .addComponent(txt_reset_add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2_label)
                    .addComponent(txt_reset_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip_label)
                    .addComponent(txt_reset_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        conf_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, dob_label, zip_label});

        pass_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter New Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        pass_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pass_label.setText("Password:");

        re_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        re_label.setText("Retype:");

        javax.swing.GroupLayout pass_panelLayout = new javax.swing.GroupLayout(pass_panel);
        pass_panel.setLayout(pass_panelLayout);
        pass_panelLayout.setHorizontalGroup(
            pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pass_panelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pass_panelLayout.createSequentialGroup()
                        .addComponent(re_label)
                        .addGap(18, 18, 18)
                        .addComponent(pwd_reset_pass2))
                    .addGroup(pass_panelLayout.createSequentialGroup()
                        .addComponent(pass_label)
                        .addGap(18, 18, 18)
                        .addComponent(pwd_reset_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pass_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pass_label, re_label});

        pass_panelLayout.setVerticalGroup(
            pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pass_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_label)
                    .addComponent(pwd_reset_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(re_label)
                    .addComponent(pwd_reset_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pass_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pass_label, re_label});

        button_reset_confirm.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_reset_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_reset_confirm.setText("Confirm");
        button_reset_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_reset_confirmActionPerformed(evt);
            }
        });

        button_reset_cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_reset_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_reset_cancel.setText("Cancel");
        button_reset_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_reset_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_reset_confirm)
                .addGap(97, 97, 97)
                .addComponent(button_reset_cancel)
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_reset_cancel, button_reset_confirm});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_reset_confirm)
                    .addComponent(button_reset_cancel))
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_reset_cancel, button_reset_confirm});

        level_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modify level", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        level_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        level_label.setText("New Level:");

        combo_reset_level.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_reset_level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "3", "2", "1", "0" }));

        javax.swing.GroupLayout level_panelLayout = new javax.swing.GroupLayout(level_panel);
        level_panel.setLayout(level_panelLayout);
        level_panelLayout.setHorizontalGroup(
            level_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(level_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(level_label)
                .addGap(18, 18, 18)
                .addComponent(combo_reset_level, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        level_panelLayout.setVerticalGroup(
            level_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(level_panelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(level_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(level_label)
                    .addComponent(combo_reset_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conf_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pass_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(level_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conf_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pass_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(level_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_reset_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_reset_cancelActionPerformed
        try {
            logger.info("Exiting");
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            
            
            this.dispose();
            new SMMain().setVisible(true);
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Closed by user " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
        
    }//GEN-LAST:event_button_reset_cancelActionPerformed
    
    private void button_reset_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_reset_selectActionPerformed
        try {
            logger.info("Method call: reset");
            String sql = ""
                    + "SELECT * "
                    + "FROM   staff "
                    + "WHERE  stafflogin_login_name = ? ";
            
            
            
            stmt = conn.prepareStatement(sql);
            
            search = txt_reset_login.getText();
            stmt.setString(1, search);
            
            rs = stmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User found,please verify the details ");
                searchflag = true;
                txt_reset_DOB.setText(rs.getString("staff_dob"));
                txt_reset_country.setText(rs.getString("staff_country"));
                txt_reset_city.setText(rs.getString("staff_city"));
                txt_reset_add1.setText(rs.getString("staff_address_1"));
                txt_reset_add2.setText(rs.getString("staff_address_2"));
                txt_reset_zipcode.setText(rs.getString("staff_zipcode"));
                
                txt_reset_DOB.setEditable(false);
                txt_reset_country.setEditable(false);
                txt_reset_city.setEditable(false);
                txt_reset_add1.setEditable(false);
                txt_reset_add2.setEditable(false);
                txt_reset_zipcode.setEditable(false);


                /*NOTE: Get the level and password of the staff being deleted*/
                String sql2 = " SELECT *"
                        + "FROM   `stafflogin`"
                        + "WHERE  `login_name` =?  ";
                
                stmt = null;
                rs = null;
                
                
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, search);
                rs = stmt.executeQuery();
                
                if (rs.next()) {
                    passorig = rs.getString("login_password");
                    levelorig = rs.getString("login_access_level");
                    
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "User not found, Try again");
                searchflag = false;
                txt_reset_DOB.setText("");
                txt_reset_country.setText("");
                txt_reset_city.setText("");
                txt_reset_add1.setText("");
                txt_reset_add2.setText("");
                txt_reset_zipcode.setText("");
                pwd_reset_pass1.setText("");
                pwd_reset_pass2.setText("");
                combo_reset_level.setSelectedIndex(0);
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at Search in resetstaff" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
        
        
        
        
    }//GEN-LAST:event_button_reset_selectActionPerformed
    
    private void button_reset_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_reset_confirmActionPerformed
        logger.info("Method call: confirm");
        
        if (searchflag == false) {
            JOptionPane.showMessageDialog(null, "Please select a user first");
        } else {
            if (ConnectionManager.getLevel() >= 2 && ConnectionManager.getLevel() >= Integer.parseInt(levelorig)) {
                JOptionPane.showMessageDialog(null, "Authorization Failure");
            } else {
                pass1 = pwd_reset_pass1.getText();
                pass2 = pwd_reset_pass2.getText();
                level = (String) combo_reset_level.getSelectedItem();
                
                
                if ("".equals(pass1) && "".equals(pass2)) {
                    JOptionPane.showMessageDialog(null, "Passwords will remain the same");
                    
                    
                } else {
                    if (!(pass1.equals(pass2))) {
                        message = message + " Passwords are not the same   \n";
                    } else {
                        if (!LengthVerifier.lengthString(pass1)) {
                            message = message + "Password cannot be longer than 40 characters \n";
                        } else {
                            passorig = pass1;
                        }
                    }
                }
                
                if ("Select".equals(level)) {
                    JOptionPane.showMessageDialog(null, "Level will not be changed");
                    
                } else {
                    if (ConnectionManager.getLevel() > Integer.parseInt(level)) {
                        message = message + "Access requested is higher than limit please select new level or contact Administrator \n";
                    } else {
                        levelorig = level;
                    }
                }
                
                
                if ("".equals(message)) {
                    logger.info("Method call: insertDB");
                    insertDB();
                    
                    
                } else {
                    
                    
                    JOptionPane.showMessageDialog(null, message);
                    logger.error("Error message : " + message);
                    message = "";
                    
                }
                
            }
            
        }
        
        
    }//GEN-LAST:event_button_reset_confirmActionPerformed
    
    private void insertDB() {
        
        
        
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Reset Staff", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Change cancelled");
        } else {
            stmt = null;
            rs = null;
            logger.info("DB start");
            String sql = " UPDATE `stafflogin`"
                    + "SET     `login_password` = ?,"
                    + "       `login_access_level` = ?"
                    + "WHERE  `login_name` =?  ";
            
            
            try {
                stmt = conn.prepareCall(sql);
                stmt.setString(1, AESrunner.AESencrypt(passorig));
                stmt.setString(2, levelorig);
                stmt.setString(3, search);
                
                stmt.executeUpdate();
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error at final insert" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
        }
        logger.info("DB end");
        
        try {
            logger.info("Exiting");
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            
            
            this.dispose();
            new SMMain().setVisible(true);
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error after updating everything " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                    
                }
            }
        } catch (ClassNotFoundException ex) {
            logger.fatal("Fatal error", ex);
        } catch (InstantiationException ex) {
            logger.fatal("Fatal error", ex);
        } catch (IllegalAccessException ex) {
            logger.fatal("Fatal error", ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            logger.fatal("Fatal error", ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resetstaff().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add1_label;
    private javax.swing.JLabel add2_label;
    private javax.swing.JButton button_reset_cancel;
    private javax.swing.JButton button_reset_confirm;
    private javax.swing.JButton button_reset_select;
    private javax.swing.JLabel city_label;
    private javax.swing.JComboBox combo_reset_level;
    private javax.swing.JPanel conf_panel;
    private javax.swing.JLabel coun_label;
    private javax.swing.JLabel dob_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel level_label;
    private javax.swing.JPanel level_panel;
    private javax.swing.JLabel log_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel pass_label;
    private javax.swing.JPanel pass_panel;
    private javax.swing.JPasswordField pwd_reset_pass1;
    private javax.swing.JPasswordField pwd_reset_pass2;
    private javax.swing.JLabel re_label;
    private javax.swing.JTextField txt_reset_DOB;
    private javax.swing.JTextField txt_reset_add1;
    private javax.swing.JTextField txt_reset_add2;
    private javax.swing.JTextField txt_reset_city;
    private javax.swing.JTextField txt_reset_country;
    private javax.swing.JTextField txt_reset_login;
    private javax.swing.JTextField txt_reset_zipcode;
    private javax.swing.JLabel zip_label;
    // End of variables declaration//GEN-END:variables
}
