package finalproj.frames.customermanagement;

import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Deletecustomer extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String addid;
    private String cuid;
    private String DOB;
    private String Contact;
    private String Email;
    private String search;
    private boolean flag = false;
    private static Logger logger;

    public Deletecustomer() {
        logger = Logger.getLogger(Deletecustomer.class.getName());
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
        txt_login = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        verify_panel = new javax.swing.JPanel();
        fname_label = new javax.swing.JLabel();
        lname_label = new javax.swing.JLabel();
        con_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        txt_contact = new javax.swing.JTextField();
        txt_DOB = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        end_panel = new javax.swing.JPanel();
        button_confirm = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Delete Customer");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        txt_login.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

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
                .addGap(124, 124, 124)
                .addComponent(login_label)
                .addGap(44, 44, 44)
                .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(button_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        verify_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Verify Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fname_label.setText("First Name:");

        lname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lname_label.setText("Last Name:");

        con_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        con_label.setText("Contact No:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        email_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email_label.setText("Email:");

        txt_firstname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_lastname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_contact.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_DOB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout verify_panelLayout = new javax.swing.GroupLayout(verify_panel);
        verify_panel.setLayout(verify_panelLayout);
        verify_panelLayout.setHorizontalGroup(
            verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verify_panelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname_label)
                    .addComponent(lname_label)
                    .addComponent(con_label)
                    .addComponent(dob_label)
                    .addComponent(email_label))
                .addGap(40, 40, 40)
                .addGroup(verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218))
        );

        verify_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {con_label, dob_label, email_label, fname_label, lname_label});

        verify_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_DOB, txt_contact, txt_email, txt_firstname, txt_lastname});

        verify_panelLayout.setVerticalGroup(
            verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(verify_panelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_label)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname_label)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(con_label)
                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dob_label)
                    .addComponent(txt_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(verify_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        verify_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {con_label, dob_label, email_label, fname_label, lname_label});

        verify_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_DOB, txt_contact, txt_email, txt_firstname, txt_lastname});

        button_confirm.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_confirm.setText("Confirm");
        button_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_confirmActionPerformed(evt);
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
                .addComponent(button_confirm)
                .addGap(70, 70, 70)
                .addComponent(button_cancel)
                .addContainerGap())
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_confirm)
                    .addComponent(button_cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(verify_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(verify_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        flag = true;
        search = txt_login.getText();
        String sql = ""
                + "SELECT * "
                + "FROM   customer "
                + "WHERE  login_login_name =? ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, search);
            rs = stmt.executeQuery();

            if (rs.next()) {
                cuid = rs.getString("idCustomer");
                addid = rs.getString("Address_idAddress");
                txt_firstname.setText(rs.getString("first_name"));
                txt_lastname.setText(rs.getString("last_name"));
                txt_DOB.setText(rs.getString("dob"));
                txt_contact.setText(rs.getString("contact_no"));
                txt_email.setText(rs.getString("email"));

                txt_firstname.setEnabled(false);
                txt_lastname.setEnabled(false);
                txt_DOB.setEnabled(false);
                txt_contact.setEnabled(false);
                txt_email.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(null, "Customer Not Found Search Again");
                logger.info("Customer Not Found");
                txt_firstname.setText("");
                txt_lastname.setText("");
                txt_DOB.setText("");
                txt_contact.setText("");
                txt_email.setText("");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at search" + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "Cancelled by User " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_confirmActionPerformed

        if (flag == true) {
            logger.info("InsertDB");

            insertDB();
        } else {
            JOptionPane.showMessageDialog(null, "Please search for the user first");
            logger.info("Search for use again");
        }


    }//GEN-LAST:event_button_confirmActionPerformed

    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Delete Customer", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Change Cancelled");
        } else {
            logger.info("DB Begin");

            String sql = ""
                    + "SELECT * "
                    + "FROM   `individual` "
                    + "WHERE  `customer_idcustomer` =? ";

            stmt = null;
            rs = null;
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, cuid);
                rs = stmt.executeQuery();

                /*NOTE: Loop used to remove all the individuals preferences from their selected channel list*/
                while (rs.next()) {

                    String sql2 = ""
                            + "DELETE FROM `individual_has_channel` "
                            + "WHERE  `individual_idindividual` =? ";


                    stmt = null;
                    try {
                        stmt = conn.prepareStatement(sql2);
                        stmt.setString(1, rs.getString("idIndividual"));
                        stmt.executeUpdate();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error during Individual Channel Delete Statement" + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }



                    String sql3 = ""
                            + "DELETE FROM `customerbasetag` "
                            + "WHERE  `individual_idindividual` =? ";
                    stmt = null;
                    try {
                        stmt = conn.prepareStatement(sql3);
                        stmt.setString(1, rs.getString("idIndividual"));
                        stmt.executeUpdate();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error during Individual Basetag Delete Statement" + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }


                    String sql4 = ""
                            + "DELETE FROM `session` "
                            + "WHERE  `individual_idindividual` =? ";
                    try {
                        stmt = conn.prepareStatement(sql4);
                        stmt.setString(1, rs.getString("idIndividual"));
                        stmt.executeUpdate();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error during Individual Session Delete Statement" + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }


                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Selecting" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }




            /*NOTE: Remove all individuals under customer*/

            String sql5 = ""
                    + "DELETE FROM `individual` "
                    + "WHERE  `customer_idcustomer` =? ";
            try {
                stmt = conn.prepareStatement(sql5);
                stmt.setString(1, cuid);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Individual Delete Statement" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            /*NOTE: Remove all complaints under customer*/

            String sql6 = ""
                    + "DELETE FROM `complaint` "
                    + "WHERE  `customer_idcustomer` =? ";
            stmt = null;
            try {
                stmt = conn.prepareStatement(sql6);
                stmt.setString(1, cuid);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Complaint Delete Statement" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            /*NOTE: Null any bill linkers to the customer*/

            String sql9 = ""
                    + "UPDATE `bill` "
                    + "SET    `customer_idcustomer` = NULL "
                    + "WHERE  `customer_idcustomer` =? ";
            stmt = null;
            try {
                stmt = conn.prepareStatement(sql9);
                stmt.setString(1, cuid);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Nulling Bill Statement" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            /*NOTE: Remove the customer*/
            String sql8 = ""
                    + "DELETE FROM `customer` "
                    + "WHERE  `login_login_name` =? ";

            stmt = null;
            try {
                stmt = conn.prepareStatement(sql8);
                stmt.setString(1, search);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during last Delete Statement" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            /*NOTE: Remove Address under customer*/
            String sql7 = ""
                    + "DELETE FROM `address` "
                    + "WHERE  `idaddress` =? ";
            stmt = null;
            try {
                stmt = conn.prepareStatement(sql7);
                stmt.setString(1, addid);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Address Delete Statement" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            /*NOTE: Remove Login Name under customer*/
            String sql10 = ""
                    + "DELETE FROM `login` "
                    + "WHERE  `login_name` =? ";
            stmt = null;
            try {
                stmt = conn.prepareStatement(sql10);
                stmt.setString(1, search);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Login Delete Statement" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            logger.info("DB End");




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
                JOptionPane.showMessageDialog(null, "Error after updating everything " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }


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
                new Deletecustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_confirm;
    private javax.swing.JButton button_search;
    private javax.swing.JLabel con_label;
    private javax.swing.JLabel dob_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fname_label;
    private javax.swing.JLabel lname_label;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JTextField txt_DOB;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_login;
    private javax.swing.JPanel verify_panel;
    // End of variables declaration//GEN-END:variables
}
