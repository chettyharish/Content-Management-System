package finalproj.frames.customermanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Deletefamily extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String firstname;
    private String lastname;
    private String DOB;
    private String Gender = "";
    private String message = "";
    Vector<String> leftvector;
    Vector<String> rightvector;
    private boolean flag = false;
    private String cuid;
    private String individualid;
    private String chid;
    private static Logger logger;

    public Deletefamily() {
        logger = Logger.getLogger(Deletefamily.class.getName());
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
        select_panel = new javax.swing.JPanel();
        select_label = new javax.swing.JLabel();
        combo_individual = new javax.swing.JComboBox();
        personal_panel = new javax.swing.JPanel();
        fname_label = new javax.swing.JLabel();
        lname_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        gen_label = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        date_DOB = new com.toedter.calendar.JDateChooser();
        radio_male = new javax.swing.JRadioButton();
        radio_female = new javax.swing.JRadioButton();
        end_panel = new javax.swing.JPanel();
        button_confirm = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Delete Family");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        txt_search.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_label)
                .addGap(74, 74, 74)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_label)
                    .addComponent(button_search))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        select_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Individual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        select_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        select_label.setText("Select Family Member:");

        combo_individual.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_individual.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_individualPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout select_panelLayout = new javax.swing.GroupLayout(select_panel);
        select_panel.setLayout(select_panelLayout);
        select_panelLayout.setHorizontalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_label)
                .addGap(18, 18, 18)
                .addComponent(combo_individual, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        select_panelLayout.setVerticalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_label)
                    .addComponent(combo_individual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        personal_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fname_label.setText("First Name:");

        lname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lname_label.setText("Last Name:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        gen_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        gen_label.setText("Gender:");

        txt_firstname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_lastname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        date_DOB.setDateFormatString("yyyy-MM-dd");
        date_DOB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        radio_male.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_male.setText("Male");

        radio_female.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_female.setText("Female");

        javax.swing.GroupLayout personal_panelLayout = new javax.swing.GroupLayout(personal_panel);
        personal_panel.setLayout(personal_panelLayout);
        personal_panelLayout.setHorizontalGroup(
            personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(gen_label)
                        .addGap(29, 29, 29)
                        .addComponent(radio_male)
                        .addGap(28, 28, 28)
                        .addComponent(radio_female))
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(dob_label)
                        .addGap(18, 18, 18)
                        .addComponent(date_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(lname_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_lastname))
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(fname_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        personal_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob_label, fname_label, lname_label});

        personal_panelLayout.setVerticalGroup(
            personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_label)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname_label)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_DOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen_label)
                    .addComponent(radio_male)
                    .addComponent(radio_female))
                .addGap(25, 25, 25))
        );

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
                .addGap(55, 55, 55)
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(select_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(personal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed

        try {
            logger.info("Search");

            String sql = ""
                    + "SELECT * "
                    + "FROM   `customer` "
                    + "WHERE  login_login_name =? ";
            stmt = null;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txt_search.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User found \n Please verify the details before deleting ");
                logger.info("User found");
                flag = true;
                cuid = rs.getString("idCustomer");

                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `individual` "
                        + "WHERE  `customer_idcustomer` =? ";

                stmt = null;
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, cuid);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    String name = rs.getString("first_name");
                    combo_individual.addItem(name);
                }

                combo_individual.insertItemAt("", 0);
                combo_individual.setSelectedIndex(0);


            } else {
                JOptionPane.showMessageDialog(null, "User not found ");
                logger.info("User not found");

                flag = false;
                combo_individual.removeAllItems();
                combo_individual.insertItemAt("", 0);
                combo_individual.setSelectedIndex(0);
                txt_firstname.setText("");
                txt_lastname.setText("");
                date_DOB.setDate(null);
                radio_male.setSelected(false);
                radio_female.setSelected(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Search " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }//GEN-LAST:event_button_searchActionPerformed

    private void combo_individualPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_individualPopupMenuWillBecomeInvisible
        logger.info("Popup select");
        if (!(combo_individual.getSelectedItem().toString().equals(""))) {
            String sql2 = ""
                    + "SELECT * "
                    + "FROM   `individual` "
                    + "WHERE  `first_name` =? "
                    + "       AND `customer_idcustomer` =? ";

            stmt = null;
            try {
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, combo_individual.getSelectedItem().toString());
                stmt.setString(2, cuid);
                rs = stmt.executeQuery();

                if (rs.next()) {
                    individualid = rs.getString("idIndividual");
                    txt_firstname.setText(rs.getString("first_name"));
                    txt_lastname.setText(rs.getString("last_name"));
                    date_DOB.setDate(Dategenerator.returndateformat(rs.getString("dob")));

                    /*Selecting Gender Radio*/
                    if ("m".equals(rs.getString("Gender"))) {
                        radio_male.setSelected(true);
                    } else {
                        radio_female.setSelected(true);
                    }

                    txt_firstname.setEnabled(false);
                    txt_lastname.setEnabled(false);
                    date_DOB.setEnabled(false);
                    radio_male.setEnabled(false);
                    radio_female.setEnabled(false);

                }



            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in Individual Select " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
        }
    }//GEN-LAST:event_combo_individualPopupMenuWillBecomeInvisible

    private void button_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_confirmActionPerformed

        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Please search for the customer first");
            logger.info("Search for customer");

        } else {
            if (!(combo_individual.getSelectedItem().toString().equals(""))) {
                logger.info("insertDB");
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, "Please Select an Individual");
                logger.warn("Individual not selected");
            }
        }


    }//GEN-LAST:event_button_confirmActionPerformed

    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Delete Family member", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Modification Cancelled");
        } else {
            logger.info("DB Begin");
            String sql = ""
                    + "DELETE FROM `session` "
                    + "WHERE  `individual_idindividual` =? ";
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, individualid);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Individual Session Delete Statement" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }



            String sql2 = ""
                    + "DELETE FROM `individual` "
                    + "WHERE  `idindividual` =? ";

            try {
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, individualid);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Individual Delete Statement" + ex.getMessage());
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
            JOptionPane.showMessageDialog(null, "Error after inserting eveything " + ex.getMessage());
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
                new Deletefamily().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_confirm;
    private javax.swing.JButton button_search;
    private javax.swing.JComboBox combo_individual;
    private com.toedter.calendar.JDateChooser date_DOB;
    private javax.swing.JLabel dob_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fname_label;
    private javax.swing.JLabel gen_label;
    private javax.swing.JLabel lname_label;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPanel personal_panel;
    private javax.swing.JRadioButton radio_female;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JLabel select_label;
    private javax.swing.JPanel select_panel;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
