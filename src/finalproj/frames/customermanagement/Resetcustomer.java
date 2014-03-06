package finalproj.frames.customermanagement;

import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.db.AESrunner;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Resetcustomer extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String message = "";
    private boolean flag = false;
    private String pass1;
    private String pass2;
    private String search;
    private static Logger logger;

    public Resetcustomer() {
        logger = Logger.getLogger(Resetcustomer.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        ver_panel = new javax.swing.JPanel();
        fname_label = new javax.swing.JLabel();
        lame_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        con_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_DOB = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        pass_panel = new javax.swing.JPanel();
        pass1_label = new javax.swing.JLabel();
        pass2_label = new javax.swing.JLabel();
        pwd_pass2 = new javax.swing.JPasswordField();
        pwd_pass1 = new javax.swing.JPasswordField();
        end_panel = new javax.swing.JPanel();
        button_accept = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Reset Customer");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        button_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(login_label)
                .addGap(36, 36, 36)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        ver_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verify Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fname_label.setText("First Name:");

        lame_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lame_label.setText("Last Name:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        con_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        con_label.setText("Contact no:");

        email_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email_label.setText("Email:");

        javax.swing.GroupLayout ver_panelLayout = new javax.swing.GroupLayout(ver_panel);
        ver_panel.setLayout(ver_panelLayout);
        ver_panelLayout.setHorizontalGroup(
            ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ver_panelLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname_label)
                    .addComponent(lame_label)
                    .addComponent(dob_label)
                    .addComponent(con_label)
                    .addComponent(email_label))
                .addGap(25, 25, 25)
                .addGroup(ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                    .addComponent(txt_lastname)
                    .addComponent(txt_DOB)
                    .addComponent(txt_contact)
                    .addComponent(txt_email))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ver_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {con_label, dob_label, email_label, fname_label, lame_label});

        ver_panelLayout.setVerticalGroup(
            ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ver_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_label)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lame_label)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob_label)
                    .addComponent(txt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(con_label)
                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ver_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ver_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {con_label, dob_label, email_label, fname_label, lame_label});

        pass_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        pass1_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pass1_label.setText("Password:");

        pass2_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pass2_label.setText("Re-enter Password:");

        javax.swing.GroupLayout pass_panelLayout = new javax.swing.GroupLayout(pass_panel);
        pass_panel.setLayout(pass_panelLayout);
        pass_panelLayout.setHorizontalGroup(
            pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pass_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pass_panelLayout.createSequentialGroup()
                        .addComponent(pass2_label)
                        .addGap(18, 18, 18)
                        .addComponent(pwd_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pass_panelLayout.createSequentialGroup()
                        .addComponent(pass1_label)
                        .addGap(18, 18, 18)
                        .addComponent(pwd_pass1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pass_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pass1_label, pass2_label});

        pass_panelLayout.setVerticalGroup(
            pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pass_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass1_label)
                    .addComponent(pwd_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pass_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass2_label)
                    .addComponent(pwd_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        button_accept.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_accept.setText("Accept");
        button_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_acceptActionPerformed(evt);
            }
        });

        button_cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_cancel.setText("Cancel");
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_accept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(button_cancel)
                .addContainerGap())
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, end_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancel)
                    .addComponent(button_accept))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ver_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(pass_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ver_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pass_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_acceptActionPerformed
        logger.info("Method call:accept");
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Please select a user first");
        } else {
            pass1 = pwd_pass1.getText();
            pass2 = pwd_pass2.getText();



            if ("".equals(pass1) || "".equals(pass2)) {
                message = message + " Passwords cannot be empty   \n";
            } else {
                if (!(pass1.equals(pass2))) {
                    message = message + " Passwords are not the same   \n";
                } else {
                    if (!LengthVerifier.lengthString(pass1)) {
                        message = message + "Password cannot be longer than 40 characters \n";
                    }
                }

            }

            if ("".equals(message)) {
                logger.info("Method call:insertDB");
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";

            }



        }

    }//GEN-LAST:event_button_acceptActionPerformed

    private void insertDB() {


        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Update Customer Password", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Change cancelled");
        } else {
            logger.info("DB start");
            stmt = null;
            rs = null;
            String sql = ""
                    + "UPDATE `login` "
                    + "SET    `login_password` = ? "
                    + "WHERE  `login_name` =? ";


            try {
                stmt = conn.prepareCall(sql);
                stmt.setString(1, AESrunner.AESencrypt(pass1));
                stmt.setString(2, search);
                stmt.executeUpdate();


            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error at final insert" + ex.getMessage());
                logger.fatal("Fatal error", ex);
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
                new CMmain().setVisible(true);




            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Closed by user " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }


        }
    }
    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed

        try {
            logger.info("Method call:search");
            String sql = ""
                    + "SELECT * "
                    + "FROM   `customer` "
                    + "WHERE  login_login_name =? ";
            stmt = null;
            stmt = conn.prepareStatement(sql);
            search = txt_search.getText();
            stmt.setString(1, search);
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User found \n Please verify the details ");
                flag = true;
                txt_firstname.setText(rs.getString("first_name"));
                txt_lastname.setText(rs.getString("last_name"));
                txt_contact.setText(rs.getString("contact_no"));
                txt_email.setText(rs.getString("contact_no"));
                txt_DOB.setText(rs.getString("dob"));


                txt_firstname.setEnabled(false);
                txt_lastname.setEnabled(false);
                txt_contact.setEnabled(false);
                txt_email.setEnabled(false);
                txt_DOB.setEnabled(false);


            } else {
                JOptionPane.showMessageDialog(null, "User not found");
                logger.info("User not found");
                flag = false;
                txt_firstname.setText("");
                txt_lastname.setText("");
                txt_contact.setText("");
                txt_email.setText("");
                txt_DOB.setText("");
                pwd_pass1.setText("");
                pwd_pass2.setText("");



            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Search " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_searchActionPerformed

    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed


        try {
            logger.info("Exiting");
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }


            this.dispose();
            new CMmain().setVisible(true);



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Closed by user " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }//GEN-LAST:event_button_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Resetcustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resetcustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resetcustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resetcustomer.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resetcustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_search;
    private javax.swing.JLabel con_label;
    private javax.swing.JLabel dob_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fname_label;
    private javax.swing.JLabel lame_label;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel pass1_label;
    private javax.swing.JLabel pass2_label;
    private javax.swing.JPanel pass_panel;
    private javax.swing.JPasswordField pwd_pass1;
    private javax.swing.JPasswordField pwd_pass2;
    private javax.swing.JTextField txt_DOB;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_search;
    private javax.swing.JPanel ver_panel;
    // End of variables declaration//GEN-END:variables
}
