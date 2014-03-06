package finalproj.frames.customermanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class FeedbackCustomer extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String search;
    private String subject;
    private String detail;
    private boolean flag = false;
    private String keys;
    private String message = "";
    private static Logger logger;

    public FeedbackCustomer() {
        logger = Logger.getLogger(FeedbackCustomer.class.getName());
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
        com_panel = new javax.swing.JPanel();
        sub_label = new javax.swing.JLabel();
        feed_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        txt_complaint = new javax.swing.JTextField();
        end_panel = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Feedback Customer");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        txt_login.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

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
                .addGap(101, 101, 101)
                .addComponent(login_label)
                .addGap(56, 56, 56)
                .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        com_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complaint/Feedback Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        sub_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        sub_label.setText("Complaint/Feedback Subject:");

        feed_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        feed_label.setText("Complaint/Feedback Details:");

        txt_area.setColumns(20);
        txt_area.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_area.setLineWrap(true);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        txt_complaint.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout com_panelLayout = new javax.swing.GroupLayout(com_panel);
        com_panel.setLayout(com_panelLayout);
        com_panelLayout.setHorizontalGroup(
            com_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, com_panelLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(com_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(com_panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(feed_label)
                    .addGroup(com_panelLayout.createSequentialGroup()
                        .addComponent(sub_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
        );
        com_panelLayout.setVerticalGroup(
            com_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(com_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(com_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_label)
                    .addComponent(txt_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(feed_label)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        button_cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_cancel.setText("Cancel");
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        button_confirm.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_confirm.setText("Confirm");
        button_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_confirm)
                .addGap(87, 87, 87)
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
                    .addComponent(com_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(com_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_confirmActionPerformed
        logger.info("Method call: confirm");

        subject = txt_complaint.getText();
        detail = txt_area.getText();

        if (flag == true) {
            if ("".equals(subject)) {
                message = message + "Subject cannot be empty \n";
            } else {
                if (!LengthVerifier.lengthString(subject)) {
                    message = message + "Subject cannot be longer than 40 characters \n";
                } else {
                    if (!TestPattern.textpattern(subject)) {

                        message = message + "Subject must be alphanumeric \n";
                    }
                }
            }

            if ("".equals(detail)) {

                message = message + "Details cannot be empty \n";
            } else {
                if (detail.length() > 200) {
                    message = message + "Details cannot be longer than 200 characters \n";
                }
            }


            if ("".equals(message)) {
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please search for the user first");

        }

    }//GEN-LAST:event_button_confirmActionPerformed

    private void insertDB() {
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Feedback", "Feedback Customer", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Added");
            logger.info("Change cancelled");
        } else {
            logger.info("DB begin");
            stmt = null;
            rs = null;

            String sql = ""
                    + "SELECT * "
                    + "FROM   `customer` "
                    + "WHERE  `login_login_name` =? ";
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, search);

                rs = stmt.executeQuery();

                rs.next();
                keys = rs.getString("idCustomer");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during Select" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            String sql2 = ""
                    + "INSERT INTO `complaint` "
                    + "            (`idcomplaint`, "
                    + "             `customer_idcustomer`, "
                    + "             `complaint_type`, "
                    + "             `complaint_info`, "
                    + "             `complaint_date`) "
                    + "VALUES      (?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?) ";


            stmt = null;

            try {
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, null);
                stmt.setString(2, keys);
                stmt.setString(3, subject);
                stmt.setString(4, detail);
                stmt.setString(5, Dategenerator.getCurrentDate());
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during insert" + ex.getMessage());
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
                JOptionPane.showMessageDialog(null, "Error after inserting everything " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

        }




    }

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed

        logger.info("Method call:search");
        search = txt_login.getText();
        String sql = ""
                + "SELECT * "
                + "FROM   `customer` "
                + "WHERE  login_login_name =? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, search);
            rs = stmt.executeQuery();

            if (rs.next()) {
                flag = true;
                JOptionPane.showMessageDialog(null, "Customer Found");
            } else {
                JOptionPane.showMessageDialog(null, "Customer Not Found Search Again");
                flag = false;
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
                new FeedbackCustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_confirm;
    private javax.swing.JButton button_search;
    private javax.swing.JPanel com_panel;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel feed_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JLabel sub_label;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_complaint;
    private javax.swing.JTextField txt_login;
    // End of variables declaration//GEN-END:variables
}
