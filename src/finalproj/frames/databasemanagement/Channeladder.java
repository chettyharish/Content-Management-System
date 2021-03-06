
package finalproj.frames.databasemanagement;

import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.DMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Channeladder extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String message = "";
    private String keys;
    private static Logger logger;

    public Channeladder() {
        logger = Logger.getLogger(Channeladder.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_panel = new javax.swing.JPanel();
        cname_label = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        cval_label = new javax.swing.JLabel();
        txt_value = new javax.swing.JTextField();
        end_panel = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Channel Adder");
        setUndecorated(true);
        setResizable(false);

        top_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        cname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cname_label.setText("Channel Name:");

        txt_name.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cval_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cval_label.setText("Channel Value:");

        txt_value.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cname_label)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cval_label)
                .addGap(18, 18, 18)
                .addComponent(txt_value, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        top_panelLayout.setVerticalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname_label)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cval_label)
                    .addComponent(txt_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        button_cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_cancel.setText("Cancel");
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        button_accept.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_accept.setText("Accept");
        button_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_acceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_accept)
                .addGap(45, 45, 45)
                .addComponent(button_cancel)
                .addContainerGap())
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_accept)
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
                        .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            new DMMain().setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_acceptActionPerformed
        logger.info("Method call: accept");
        if ("".equals(txt_name.getText())) {
            message = message + "Channel Name is Empty  \n";
        }

        if (!TestPattern.spacetextpattern(txt_name.getText())) {
            message = message + "Channel Name Must be Alphanumeric  \n";
        }

        if (!LengthVerifier.lengthString(txt_name.getText())) {
            message = message + "Channel Name Length Must be Less than 40  \n";
        }

        if ("".equals(txt_value.getText())) {
            message = message + "Channel Value is Empty  \n";
        }

        if (!TestPattern.numberpattern(txt_value.getText())) {
            message = message + "Channel Value Must be Numeric  \n";
        }

        if (!LengthVerifier.lengthInteger(txt_value.getText())) {
            message = message + "Channel Name Length Must be Less than 40  \n";
        }

        String sql = ""
                + "SELECT * "
                + "FROM   `channel` "
                + "WHERE  `channel_name` =? ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txt_name.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                message = message + "Channel already exists  \n";
            }


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

        if ("".equals(message)) {
            logger.info("Method call:insertDB");
            insertDB();
        } else {

            JOptionPane.showMessageDialog(null, message);
            logger.error("Error message : " + message);
            message = "";
        }

    }//GEN-LAST:event_button_acceptActionPerformed
    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Addition", "Add Channel", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "Channel Not Added");
            logger.info("Change cancelled");
        } else {
            try {
                logger.info("DB start");

                String sql2 = ""
                        + "INSERT INTO `channel` "
                        + "            (`idchannel`, "
                        + "             `channel_name`, "
                        + "             `channel_cost`) "
                        + "VALUES      (?, "
                        + "             ?, "
                        + "             ?) ";



                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, null);
                stmt.setString(2, txt_name.getText());
                stmt.setString(3, txt_value.getText());
                stmt.executeUpdate();
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
                    new DMMain().setVisible(true);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception generated during insert" + ex.getMessage());
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
                new Channeladder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JLabel cname_label;
    private javax.swing.JLabel cval_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JPanel top_panel;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_value;
    // End of variables declaration//GEN-END:variables
}
