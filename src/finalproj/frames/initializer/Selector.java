
package finalproj.frames.initializer;

import finalproj.db.ConnectionManager;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;


public class Selector extends javax.swing.JFrame {

    private static Logger logger;

    public Selector() {
        logger = Logger.getLogger(Selector.class.getName());
        logger.info("Information Authenticated");
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        button_stm = new javax.swing.JButton();
        label4 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        button_dm = new javax.swing.JButton();
        button_cm = new javax.swing.JButton();
        button_sm = new javax.swing.JButton();
        button_exit = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Selector");
        setUndecorated(true);
        setResizable(false);

        main_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Startup", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setText("Choose the Operation:");

        button_stm.setText("Statistic Manager");
        button_stm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_stmActionPerformed(evt);
            }
        });

        label4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/ERP.png"))); // NOI18N

        label3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/SearchStatistics.png"))); // NOI18N
        label3.setToolTipText("Analysis");

        label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/Personnel.png"))); // NOI18N
        label2.setToolTipText("Staff Management");

        label1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/ManageUsers.png"))); // NOI18N
        label1.setToolTipText("Customer Management");

        button_dm.setText("Database Manager");
        button_dm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_dmActionPerformed(evt);
            }
        });

        button_cm.setText("Customer Manager");
        button_cm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cmActionPerformed(evt);
            }
        });

        button_sm.setText("Staff Manager");
        button_sm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_smActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button_cm, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2)
                    .addComponent(button_sm, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3)
                    .addComponent(button_stm, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_dm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {label2, label3, label4});

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_sm, button_stm});

        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_cm)
                        .addComponent(button_dm))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_sm)
                        .addComponent(button_stm)))
                .addContainerGap())
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {label1, label2, label3, label4});

        panel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_cm, button_dm, button_sm, button_stm});

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/exit.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_exit)))
                .addContainerGap())
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6))
                    .addComponent(button_exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_cmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cmActionPerformed

        /*NOTE: level only possible if no one logged in*/
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("CMmain Class Initiated");
            new CMmain().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }

    }//GEN-LAST:event_button_cmActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed

        logger.info("Closing all Connections for User: " + ConnectionManager.getAccessor());
        JOptionPane.showMessageDialog(null, "Logged Out");
        logger.info("Logged out");
        ConnectionManager.getInstance().close();
        ConnectionManager.setLevel(4);
        ConnectionManager.setAccessor("Anonymous");
        ConnectionManager.setUSERNAME("levelAnonymous");
        ConnectionManager.setPASSWORD("levelAnonymous");
        logger.info("Login Class Initiated");
        new Login().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_button_exitActionPerformed

    private void button_smActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_smActionPerformed

        if (ConnectionManager.getLevel() <= 2) {
            logger.info("Selector Class Initiated");
            this.dispose();
            new SMMain().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_smActionPerformed

    private void button_stmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_stmActionPerformed

        if (ConnectionManager.getLevel() <= 1) {
            logger.info("STMMain Class Initiated");
            this.dispose();
            new STMMain().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_stmActionPerformed

    private void button_dmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_dmActionPerformed

        if (ConnectionManager.getLevel() <= 0) {
            logger.info("DMMain Class Initiated");
            this.dispose();
            new DMMain().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_dmActionPerformed

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
                new Selector().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_cm;
    private javax.swing.JButton button_dm;
    private javax.swing.JToggleButton button_exit;
    private javax.swing.JButton button_sm;
    private javax.swing.JButton button_stm;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label4;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
