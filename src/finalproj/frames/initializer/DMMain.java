
package finalproj.frames.initializer;

import finalproj.db.ConnectionManager;
import finalproj.frames.databasemanagement.Advertisementadder;
import finalproj.frames.databasemanagement.Advertisementmodifier;
import finalproj.frames.databasemanagement.Backupdb;
import finalproj.frames.databasemanagement.Backuprestore;
import finalproj.frames.databasemanagement.Channeladder;
import finalproj.frames.databasemanagement.Channelmodifier;
import finalproj.frames.databasemanagement.Cityadder;
import finalproj.frames.databasemanagement.Citymodifier;
import finalproj.frames.databasemanagement.Countryadder;
import finalproj.frames.databasemanagement.Countrymodifier;
import finalproj.frames.databasemanagement.Programadder;
import finalproj.frames.databasemanagement.Programmodifier;
import finalproj.frames.databasemanagement.Sessionadder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;


public class DMMain extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private static Logger logger;

    public DMMain() {
        logger = Logger.getLogger(DMMain.class.getName());
        logger.info("Information Authenticated");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_exit = new javax.swing.JButton();
        add_panel = new javax.swing.JPanel();
        button_channel = new javax.swing.JButton();
        button_program = new javax.swing.JButton();
        button_advertisement = new javax.swing.JButton();
        button_city = new javax.swing.JButton();
        button_country = new javax.swing.JButton();
        mod_panel = new javax.swing.JPanel();
        button_channelmodifier = new javax.swing.JButton();
        button_programmodifier = new javax.swing.JButton();
        button_countrymodifier = new javax.swing.JButton();
        button_advertisementmodifier = new javax.swing.JButton();
        button_citymodifier = new javax.swing.JButton();
        fun_panel = new javax.swing.JPanel();
        button_session = new javax.swing.JButton();
        button_backup = new javax.swing.JButton();
        button_restore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Database Management Main");
        setUndecorated(true);
        setResizable(false);

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/exit.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        add_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adders", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_channel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_channel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/channel.png"))); // NOI18N
        button_channel.setText("Channel Adder");
        button_channel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_channelActionPerformed(evt);
            }
        });

        button_program.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_program.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/channel.png"))); // NOI18N
        button_program.setText("Program Adder");
        button_program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_programActionPerformed(evt);
            }
        });

        button_advertisement.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_advertisement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/advertisement.png"))); // NOI18N
        button_advertisement.setText("Advertisement Adder");
        button_advertisement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_advertisementActionPerformed(evt);
            }
        });

        button_city.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/city.png"))); // NOI18N
        button_city.setText("City Adder");
        button_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cityActionPerformed(evt);
            }
        });

        button_country.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_country.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/country.png"))); // NOI18N
        button_country.setText("Country Adder");
        button_country.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_countryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout add_panelLayout = new javax.swing.GroupLayout(add_panel);
        add_panel.setLayout(add_panelLayout);
        add_panelLayout.setHorizontalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_panelLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(button_country, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(button_city, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(add_panelLayout.createSequentialGroup()
                        .addComponent(button_channel)
                        .addGap(65, 65, 65)
                        .addComponent(button_program)
                        .addGap(68, 68, 68)
                        .addComponent(button_advertisement)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_advertisement, button_channel, button_city, button_country, button_program});

        add_panelLayout.setVerticalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_program)
                    .addComponent(button_channel)
                    .addComponent(button_advertisement))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_country)
                    .addComponent(button_city)))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_advertisement, button_channel, button_program});

        add_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_city, button_country});

        mod_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modifiers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_channelmodifier.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_channelmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/channel.png"))); // NOI18N
        button_channelmodifier.setText("Channel Modifier");
        button_channelmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_channelmodifierActionPerformed(evt);
            }
        });

        button_programmodifier.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_programmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/channel.png"))); // NOI18N
        button_programmodifier.setText("Program Modifier");
        button_programmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_programmodifierActionPerformed(evt);
            }
        });

        button_countrymodifier.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_countrymodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/country.png"))); // NOI18N
        button_countrymodifier.setText("Country Modifier");
        button_countrymodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_countrymodifierActionPerformed(evt);
            }
        });

        button_advertisementmodifier.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_advertisementmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/advertisement.png"))); // NOI18N
        button_advertisementmodifier.setText("Advertisement Modifier");
        button_advertisementmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_advertisementmodifierActionPerformed(evt);
            }
        });

        button_citymodifier.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_citymodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/city.png"))); // NOI18N
        button_citymodifier.setText("City Modifier");
        button_citymodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_citymodifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mod_panelLayout = new javax.swing.GroupLayout(mod_panel);
        mod_panel.setLayout(mod_panelLayout);
        mod_panelLayout.setHorizontalGroup(
            mod_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mod_panelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(mod_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mod_panelLayout.createSequentialGroup()
                        .addComponent(button_channelmodifier)
                        .addGap(56, 56, 56)
                        .addComponent(button_programmodifier)
                        .addGap(62, 62, 62)
                        .addComponent(button_advertisementmodifier))
                    .addGroup(mod_panelLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(button_countrymodifier)
                        .addGap(92, 92, 92)
                        .addComponent(button_citymodifier)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mod_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_advertisementmodifier, button_channelmodifier, button_citymodifier, button_countrymodifier, button_programmodifier});

        mod_panelLayout.setVerticalGroup(
            mod_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mod_panelLayout.createSequentialGroup()
                .addGroup(mod_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_channelmodifier)
                    .addComponent(button_programmodifier)
                    .addComponent(button_advertisementmodifier))
                .addGap(18, 18, 18)
                .addGroup(mod_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_countrymodifier)
                    .addComponent(button_citymodifier)))
        );

        mod_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_advertisementmodifier, button_channelmodifier, button_citymodifier, button_countrymodifier, button_programmodifier});

        fun_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Functions", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_session.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_session.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/session.png"))); // NOI18N
        button_session.setText("Session Adder");
        button_session.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_sessionActionPerformed(evt);
            }
        });

        button_backup.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_backup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/databackup.png"))); // NOI18N
        button_backup.setText("Backup DB");
        button_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_backupActionPerformed(evt);
            }
        });

        button_restore.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/datarestore.png"))); // NOI18N
        button_restore.setText("Restore DB");
        button_restore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_restoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fun_panelLayout = new javax.swing.GroupLayout(fun_panel);
        fun_panel.setLayout(fun_panelLayout);
        fun_panelLayout.setHorizontalGroup(
            fun_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fun_panelLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(button_session)
                .addGap(173, 173, 173)
                .addComponent(button_backup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_restore)
                .addGap(33, 33, 33))
        );
        fun_panelLayout.setVerticalGroup(
            fun_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fun_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(fun_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_backup)
                    .addComponent(button_restore)
                    .addComponent(button_session))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fun_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mod_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button_exit))
                    .addComponent(add_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(button_exit)
                .addGap(1, 1, 1)
                .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mod_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fun_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void button_channelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_channelActionPerformed
        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Channeladder Class Initiated");
            new Channeladder().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_channelActionPerformed

    private void button_programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_programActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Programadder Class Initiated");
            new Programadder().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_programActionPerformed

    private void button_advertisementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_advertisementActionPerformed
        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Advertisementadder Class Initiated");
            new Advertisementadder().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_advertisementActionPerformed

    private void button_sessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_sessionActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Sessionadder Class Initiated");
            new Sessionadder().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_sessionActionPerformed

    private void button_countryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_countryActionPerformed
        if (ConnectionManager.getLevel() <= 0) {
            logger.info("ConnectionManager Class Initiated");
            new Countryadder().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_countryActionPerformed

    private void button_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cityActionPerformed
        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Cityadder Class Initiated");
            new Cityadder().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_cityActionPerformed

    private void button_channelmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_channelmodifierActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Channelmodifier Class Initiated");
            new Channelmodifier().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }



    }//GEN-LAST:event_button_channelmodifierActionPerformed

    private void button_programmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_programmodifierActionPerformed
        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Programmodifier Class Initiated");
            new Programmodifier().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_programmodifierActionPerformed

    private void button_advertisementmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_advertisementmodifierActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Advertisementmodifier Class Initiated");
            new Advertisementmodifier().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_advertisementmodifierActionPerformed

    private void button_countrymodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_countrymodifierActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Countrymodifier Class Initiated");
            new Countrymodifier().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_countrymodifierActionPerformed

    private void button_citymodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_citymodifierActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Citymodifier Class Initiated");
            new Citymodifier().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_citymodifierActionPerformed

    private void button_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_backupActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Backupdb Class Initiated");
            new Backupdb().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_backupActionPerformed

    private void button_restoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_restoreActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("Backuprestore Class Initiated");
            new Backuprestore().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_restoreActionPerformed


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
                new DMMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add_panel;
    private javax.swing.JButton button_advertisement;
    private javax.swing.JButton button_advertisementmodifier;
    private javax.swing.JButton button_backup;
    private javax.swing.JButton button_channel;
    private javax.swing.JButton button_channelmodifier;
    private javax.swing.JButton button_city;
    private javax.swing.JButton button_citymodifier;
    private javax.swing.JButton button_country;
    private javax.swing.JButton button_countrymodifier;
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_program;
    private javax.swing.JButton button_programmodifier;
    private javax.swing.JButton button_restore;
    private javax.swing.JButton button_session;
    private javax.swing.JPanel fun_panel;
    private javax.swing.JPanel mod_panel;
    // End of variables declaration//GEN-END:variables
}
