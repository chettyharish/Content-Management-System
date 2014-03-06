
package finalproj.frames.staffmanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.SMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;


public class FeedbackStaff extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private boolean flag = false;
    private String message = "";
    private static Logger logger;


    public FeedbackStaff() {
        logger = Logger.getLogger(FeedbackStaff.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcomplaint();
        fillstaff();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comp_panel = new javax.swing.JPanel();
        comp_label = new javax.swing.JLabel();
        det_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area = new javax.swing.JTextArea();
        txt_complaint = new javax.swing.JTextField();
        compl_panel = new javax.swing.JPanel();
        select_label = new javax.swing.JLabel();
        combo_complaint = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_confirm = new javax.swing.JButton();
        staff_panel = new javax.swing.JPanel();
        staff_label = new javax.swing.JLabel();
        combo_staff = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Feedback Management");
        setUndecorated(true);
        setResizable(false);

        comp_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complaint/Feedback Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        comp_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        comp_label.setText("Complaint/Feedback Subject:");

        det_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        det_label.setText("Complaint/Feedback Details:");

        txt_area.setColumns(20);
        txt_area.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_area.setLineWrap(true);
        txt_area.setRows(5);
        jScrollPane1.setViewportView(txt_area);

        txt_complaint.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout comp_panelLayout = new javax.swing.GroupLayout(comp_panel);
        comp_panel.setLayout(comp_panelLayout);
        comp_panelLayout.setHorizontalGroup(
            comp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, comp_panelLayout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(comp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(det_label)
                    .addGroup(comp_panelLayout.createSequentialGroup()
                        .addComponent(comp_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        comp_panelLayout.setVerticalGroup(
            comp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comp_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(comp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comp_label)
                    .addComponent(txt_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(det_label)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        compl_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Complaint List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        select_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        select_label.setText("Select a Complaint:");

        combo_complaint.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_complaint.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_complaintPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout compl_panelLayout = new javax.swing.GroupLayout(compl_panel);
        compl_panel.setLayout(compl_panelLayout);
        compl_panelLayout.setHorizontalGroup(
            compl_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compl_panelLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(select_label)
                .addGap(18, 18, 18)
                .addComponent(combo_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        compl_panelLayout.setVerticalGroup(
            compl_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compl_panelLayout.createSequentialGroup()
                .addGroup(compl_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_label)
                    .addComponent(combo_complaint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        staff_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Completing Staff", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        staff_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        staff_label.setText("Staff Id:");

        combo_staff.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout staff_panelLayout = new javax.swing.GroupLayout(staff_panel);
        staff_panel.setLayout(staff_panelLayout);
        staff_panelLayout.setHorizontalGroup(
            staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_panelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(staff_label)
                .addGap(65, 65, 65)
                .addComponent(combo_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staff_panelLayout.setVerticalGroup(
            staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staff_label)
                    .addComponent(combo_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staff_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(compl_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comp_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(compl_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(comp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(staff_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fillcomplaint() {
        logger.info("Method call: fillcomplaint");
        String sql = ""
                + "SELECT *"
                + "FROM   `complaint` "
                + "WHERE  `staff_idstaff` IS NULL ";


        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            /*NOTE:Combo box filling*/
            while (rs.next()) {
                String name = rs.getString("idComplaint");
                combo_complaint.addItem(name);
            }
            combo_complaint.insertItemAt("", 0);
            combo_complaint.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcomplaint  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }

    private void fillstaff() {
        logger.info("Method call: fillstaff");
        String sql = ""
                + "SELECT *"
                + "FROM   `staff` ";


        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            /*NOTE:Combo box filling*/
            while (rs.next()) {
                String id = rs.getString("idStaff");
                combo_staff.addItem(id);
            }
            combo_staff.insertItemAt("", 0);
            combo_staff.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcomplaint  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
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
            new SMMain().setVisible(true);



        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Closed by user " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_confirmActionPerformed
        logger.info("Method call: confirm");
        if (combo_complaint.getModel().getSize() == 0 || combo_complaint.getSelectedItem().toString().equals("")) {
            message = message + "Please Select a Complaint Number \n";
        }

        if (combo_staff.getModel().getSize() == 0 || combo_staff.getSelectedItem().toString().equals("")) {
            message = message + "Please Select a Staff  \n";
        }

        if ("".equals(message)) {
            logger.info("Method call: insertDB");
            insertDB();
        } else {


            JOptionPane.showMessageDialog(null, message);
            logger.error("Error message : " + message);
            message = "";
        }



    }//GEN-LAST:event_button_confirmActionPerformed

    private void combo_complaintPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_complaintPopupMenuWillBecomeInvisible

        logger.info("Method call: complaint");

        String sql = ""
                + "SELECT `complaint_type`, "
                + "       `complaint_info`, "
                + "       `complaint_date`, "
                + "       `complaint_solved_date` "
                + "FROM   `complaint` "
                + "WHERE  `idComplaint`=? ";


        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, combo_complaint.getSelectedItem().toString());
            rs = stmt.executeQuery();

            if (rs.next()) {
                txt_complaint.setText(rs.getString("complaint_type"));
                txt_area.setText(rs.getString("complaint_info"));

                txt_complaint.setEnabled(false);
                txt_area.setEnabled(false);

            }


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcomplaint  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_combo_complaintPopupMenuWillBecomeInvisible

    private void insertDB() {
        logger.info("DB start");
        String sql = ""
                + "UPDATE `complaint` "
                + "SET    `staff_idstaff` = ?, "
                + "       `complaint_solved_date` = ? "
                + "WHERE  `idcomplaint` =? ";


        try {
            stmt = null;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, combo_staff.getSelectedItem().toString());
            stmt.setString(2, Dategenerator.getCurrentDate());
            stmt.setString(3, combo_complaint.getSelectedItem().toString());
            stmt.executeUpdate();


            logger.info("DB end");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcomplaint  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
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
            JOptionPane.showMessageDialog(null, "Closed by user " + ex.getMessage());
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
                new FeedbackStaff().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_confirm;
    private javax.swing.JComboBox combo_complaint;
    private javax.swing.JComboBox combo_staff;
    private javax.swing.JLabel comp_label;
    private javax.swing.JPanel comp_panel;
    private javax.swing.JPanel compl_panel;
    private javax.swing.JLabel det_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel select_label;
    private javax.swing.JLabel staff_label;
    private javax.swing.JPanel staff_panel;
    private javax.swing.JTextArea txt_area;
    private javax.swing.JTextField txt_complaint;
    // End of variables declaration//GEN-END:variables
}
