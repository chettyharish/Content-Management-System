package finalproj.frames.staffmanagement;

import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.SMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class DeleteStaff extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String search;
    private boolean searchflag = false;
    private static Logger logger;
    private String level;

    public DeleteStaff() {
        logger = Logger.getLogger(DeleteStaff.class.getName());
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
        txt_delete_login = new javax.swing.JTextField();
        button_delete_search = new javax.swing.JButton();
        conf_panel = new javax.swing.JPanel();
        fn_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        coun_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        ln_label = new javax.swing.JLabel();
        txt_delete_firstname = new javax.swing.JTextField();
        txt_delete_lastname = new javax.swing.JTextField();
        txt_delete_DOB = new javax.swing.JTextField();
        txt_delete_country = new javax.swing.JTextField();
        txt_delete_city = new javax.swing.JTextField();
        end_panel = new javax.swing.JPanel();
        button_delete_cancel = new javax.swing.JButton();
        button_delete_confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Delete Staff");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        log_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        log_label.setText("Login Name:");

        txt_delete_login.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_delete_search.setText("Search");
        button_delete_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_delete_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(log_label)
                .addGap(18, 18, 18)
                .addComponent(txt_delete_login, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_delete_search)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_label)
                    .addComponent(txt_delete_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_delete_search))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        conf_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fn_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fn_label.setText("First Name:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        coun_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        coun_label.setText("Country:");

        city_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        city_label.setText("City:");

        ln_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ln_label.setText("Last Name:");

        txt_delete_firstname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_delete_lastname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_delete_DOB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_delete_country.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_delete_city.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout conf_panelLayout = new javax.swing.GroupLayout(conf_panel);
        conf_panel.setLayout(conf_panelLayout);
        conf_panelLayout.setHorizontalGroup(
            conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conf_panelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(conf_panelLayout.createSequentialGroup()
                        .addComponent(fn_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_delete_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(conf_panelLayout.createSequentialGroup()
                        .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ln_label)
                            .addComponent(dob_label)
                            .addComponent(coun_label)
                            .addComponent(city_label))
                        .addGap(18, 18, 18)
                        .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_delete_lastname)
                            .addComponent(txt_delete_DOB)
                            .addComponent(txt_delete_country)
                            .addComponent(txt_delete_city))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        conf_panelLayout.setVerticalGroup(
            conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conf_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn_label)
                    .addComponent(txt_delete_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln_label)
                    .addComponent(txt_delete_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_label)
                    .addComponent(txt_delete_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coun_label)
                    .addComponent(txt_delete_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(conf_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_label)
                    .addComponent(txt_delete_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        button_delete_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_delete_cancel.setText("Cancel");
        button_delete_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_delete_cancelActionPerformed(evt);
            }
        });

        button_delete_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_delete_confirm.setText("Confirm");
        button_delete_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_delete_confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_delete_confirm)
                .addGap(94, 94, 94)
                .addComponent(button_delete_cancel)
                .addContainerGap())
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_delete_confirm)
                    .addComponent(button_delete_cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(conf_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(conf_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_delete_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_delete_searchActionPerformed
        try {
            logger.info("Method call: delete");

            String sql = ""
                    + "SELECT * "
                    + "FROM   staff "
                    + "WHERE  stafflogin_login_name = ? ";



            stmt = conn.prepareStatement(sql);

            search = txt_delete_login.getText();
            stmt.setString(1, search);

            rs = stmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User found,please verify the details ");
                logger.info("User found");
                searchflag = true;
                txt_delete_firstname.setText(rs.getString("first_name"));
                txt_delete_lastname.setText(rs.getString("last_name"));
                txt_delete_DOB.setText(rs.getString("staff_dob"));
                txt_delete_country.setText(rs.getString("staff_country"));
                txt_delete_city.setText(rs.getString("staff_city"));



                txt_delete_firstname.setEnabled(false);
                txt_delete_lastname.setEnabled(false);
                txt_delete_DOB.setEnabled(false);
                txt_delete_country.setEnabled(false);
                txt_delete_city.setEnabled(false);


                /*NOTE: Get the level of the staff being deleted*/
                String sql2 = " SELECT *"
                        + "FROM   `stafflogin`"
                        + "WHERE  `login_name` =?  ";

                stmt = null;
                rs = null;


                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, search);
                rs = stmt.executeQuery();

                if (rs.next()) {
                    level = rs.getString("login_access_level");

                }

            } else {
                JOptionPane.showMessageDialog(null, "User not found, Try again");
                logger.info("User not found");
                searchflag = false;
                txt_delete_firstname.setText("");
                txt_delete_lastname.setText("");
                txt_delete_DOB.setText("");
                txt_delete_country.setText("");
                txt_delete_city.setText("");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at Search in resetstaff" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_delete_searchActionPerformed

    private void button_delete_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_delete_cancelActionPerformed
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
    }//GEN-LAST:event_button_delete_cancelActionPerformed

    private void button_delete_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_delete_confirmActionPerformed
        logger.info("Method call: confirm");

        if (searchflag == false) {
            JOptionPane.showMessageDialog(null, "Please select a user first");
            logger.error("Search not performed");
        } else {

            deleteDB();




        }

    }//GEN-LAST:event_button_delete_confirmActionPerformed

    private void deleteDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Update Staff", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Change cancelled");
        } else {
            stmt = null;
            rs = null;

            String deletestaff = ""
                    + "DELETE FROM `staff` "
                    + "WHERE  `stafflogin_login_name` =? ";

            String deletestafflogin = ""
                    + "DELETE FROM `stafflogin` "
                    + "WHERE  `login_name` =? ";


            try {

                stmt = conn.prepareCall(deletestaff);
                stmt.setString(1, search);
                stmt.executeUpdate();

                stmt = null;
                stmt = conn.prepareStatement(deletestafflogin);
                stmt.setString(1, search);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error at final insert" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
        }


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
                new DeleteStaff().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_delete_cancel;
    private javax.swing.JButton button_delete_confirm;
    private javax.swing.JButton button_delete_search;
    private javax.swing.JLabel city_label;
    private javax.swing.JPanel conf_panel;
    private javax.swing.JLabel coun_label;
    private javax.swing.JLabel dob_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fn_label;
    private javax.swing.JLabel ln_label;
    private javax.swing.JLabel log_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JTextField txt_delete_DOB;
    private javax.swing.JTextField txt_delete_city;
    private javax.swing.JTextField txt_delete_country;
    private javax.swing.JTextField txt_delete_firstname;
    private javax.swing.JTextField txt_delete_lastname;
    private javax.swing.JTextField txt_delete_login;
    // End of variables declaration//GEN-END:variables
}
