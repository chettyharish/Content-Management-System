package finalproj.frames.databasemanagement;

import finalproj.db.ConnectionManager;
import finalproj.db.DBmanager;
import finalproj.frames.initializer.DMMain;
import java.io.File;
import java.io.FilenameFilter;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Backuprestore extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private static Logger logger;

    public Backuprestore() {
        logger = Logger.getLogger(Backuprestore.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillbackupcombo();

    }

    private void fillbackupcombo() {
        logger.info("Method call: fillbackup");
        try {
            /*NOTE: Getting path to the Jar file being executed*/
            CodeSource codeSource = DBmanager.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();


            /*NOTE: Creating Path Constraints for folder saving*/
            String folderPath = jarDir + "\\backup";

            File dir = new File(folderPath);
            FilenameFilter filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {

                    if (name.endsWith(".sql")) {
                        return true;
                    } else {
                        return false;
                    }

                }
            };


            String[] var = dir.list(filter);
            if (!(var == null)) {
                for (int i = 0; i < var.length; i++) //populate the combo
                {
                    String filename = var[i];
                    combo_backup.addItem(filename);

                }
            }
            combo_backup.insertItemAt("", 0);
            combo_backup.setSelectedIndex(0);

        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Exception generated at filling combo" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_label = new javax.swing.JLabel();
        end_panel = new javax.swing.JPanel();
        button_generate = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();
        select_label = new javax.swing.JLabel();
        combo_backup = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Restore DB");
        setUndecorated(true);
        setResizable(false);

        top_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        top_label.setText("Select a backup to revert back");

        button_generate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_generate.setText("Restore");
        button_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_generateActionPerformed(evt);
            }
        });

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_generate)
                .addGap(49, 49, 49)
                .addComponent(button_exit)
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_exit, button_generate});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_generate)
                    .addComponent(button_exit))
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_exit, button_generate});

        select_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        select_label.setText("Select a Backup:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(top_label)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(select_label)
                .addGap(18, 18, 18)
                .addComponent(combo_backup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(top_label)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_label)
                    .addComponent(combo_backup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_generateActionPerformed
        logger.info("Method call: restoreDB");
        if (!(combo_backup.getSelectedItem().toString().equals(""))) {
            DBmanager.Restoredbfromsql(combo_backup.getSelectedItem().toString());
        } else {

            JOptionPane.showMessageDialog(null, "Please Select a backup");
            logger.error("Select a backup");
        }

    }//GEN-LAST:event_button_generateActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        try {
            logger.info("Method call: Exiting");
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
    }//GEN-LAST:event_button_exitActionPerformed

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
                new Backuprestore().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_generate;
    private javax.swing.JComboBox combo_backup;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel select_label;
    private javax.swing.JLabel top_label;
    // End of variables declaration//GEN-END:variables
}
