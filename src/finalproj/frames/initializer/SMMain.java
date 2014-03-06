
package finalproj.frames.initializer;

import finalproj.db.ConnectionManager;
import finalproj.frames.staffmanagement.DeleteStaff;
import finalproj.frames.staffmanagement.FeedbackStaff;
import finalproj.frames.staffmanagement.Registerstaff;
import finalproj.frames.staffmanagement.Resetstaff;
import finalproj.frames.staffmanagement.Staffloginreset;
import finalproj.frames.staffmanagement.Updatestaff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;


public class SMMain extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private static Logger logger;

    public SMMain() {
        logger = Logger.getLogger(SMMain.class.getName());
        logger.info("Information Authenticated");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        select_panel = new javax.swing.JPanel();
        button_staff_delete = new javax.swing.JButton();
        button_staff_add = new javax.swing.JButton();
        button_staff_update = new javax.swing.JButton();
        button_staff_recover = new javax.swing.JButton();
        button_staff_complaint = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();
        button_staff_search = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Staff Management");
        setUndecorated(true);
        setResizable(false);

        select_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select an Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_staff_delete.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staff_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/delete.png"))); // NOI18N
        button_staff_delete.setText("Delete Staff");
        button_staff_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staff_deleteActionPerformed(evt);
            }
        });

        button_staff_add.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staff_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/add.png"))); // NOI18N
        button_staff_add.setText("Add New Staff");
        button_staff_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staff_addActionPerformed(evt);
            }
        });

        button_staff_update.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staff_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/update.png"))); // NOI18N
        button_staff_update.setText("Update Staff");
        button_staff_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staff_updateActionPerformed(evt);
            }
        });

        button_staff_recover.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staff_recover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/pass.png"))); // NOI18N
        button_staff_recover.setText("Recover Acccount");
        button_staff_recover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staff_recoverActionPerformed(evt);
            }
        });

        button_staff_complaint.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staff_complaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/feed.png"))); // NOI18N
        button_staff_complaint.setText("Allocate to Complaints");
        button_staff_complaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staff_complaintActionPerformed(evt);
            }
        });

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/exit.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        button_staff_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staff_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/find.png"))); // NOI18N
        button_staff_search.setText("Search Username");
        button_staff_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staff_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout select_panelLayout = new javax.swing.GroupLayout(select_panel);
        select_panel.setLayout(select_panelLayout);
        select_panelLayout.setHorizontalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, select_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_staff_add)
                    .addComponent(button_staff_update, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_staff_complaint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_staff_recover, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_staff_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_staff_search, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, select_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_exit))
        );

        select_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_staff_add, button_staff_complaint, button_staff_delete, button_staff_recover, button_staff_search, button_staff_update});

        select_panelLayout.setVerticalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addComponent(button_exit)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_staff_add)
                    .addComponent(button_staff_delete))
                .addGap(36, 36, 36)
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_staff_update)
                    .addComponent(button_staff_recover))
                .addGap(36, 36, 36)
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_staff_complaint)
                    .addComponent(button_staff_search))
                .addGap(302, 302, 302))
        );

        select_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_staff_add, button_staff_complaint, button_staff_delete, button_staff_recover, button_staff_search, button_staff_update});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_staff_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staff_addActionPerformed

        if (ConnectionManager.getLevel() <= 2) {
            logger.info("Registerstaff Class Initiated");
            new Registerstaff().setVisible(true);
            this.dispose();


        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_staff_addActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        try {
            logger.info("Exiting");
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            logger.info("Selector Class Initiated");
            new Selector().setVisible(true);
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_exitActionPerformed

    private void button_staff_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staff_updateActionPerformed

        if (ConnectionManager.getLevel() <= 2) {
            logger.info("Updatestaff Class Initiated");
            new Updatestaff().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_staff_updateActionPerformed

    private void button_staff_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staff_deleteActionPerformed
        if (ConnectionManager.getLevel() <= 2) {
            logger.info("DeleteStaff Class Initiated");
            new DeleteStaff().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_staff_deleteActionPerformed

    private void button_staff_recoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staff_recoverActionPerformed

        if (ConnectionManager.getLevel() <= 2) {
            logger.info("Resetstaff Class Initiated");
            new Resetstaff().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_staff_recoverActionPerformed

    private void button_staff_complaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staff_complaintActionPerformed

        if (ConnectionManager.getLevel() <= 2) {
            logger.info("Feedbackstaff Class Initiated");
            new FeedbackStaff().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_staff_complaintActionPerformed

    private void button_staff_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staff_searchActionPerformed
        if (ConnectionManager.getLevel() <= 2) {
            logger.info("Staffloginreset Class Initiated");
            new Staffloginreset().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_staff_searchActionPerformed


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
                new SMMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_staff_add;
    private javax.swing.JButton button_staff_complaint;
    private javax.swing.JButton button_staff_delete;
    private javax.swing.JButton button_staff_recover;
    private javax.swing.JToggleButton button_staff_search;
    private javax.swing.JButton button_staff_update;
    private javax.swing.JPanel select_panel;
    // End of variables declaration//GEN-END:variables
}
