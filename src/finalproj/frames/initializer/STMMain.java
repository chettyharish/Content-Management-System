
package finalproj.frames.initializer;

import finalproj.db.ConnectionManager;
import finalproj.frames.statisticmanagement.AgePie;
import finalproj.frames.statisticmanagement.Familypie;
import finalproj.frames.statisticmanagement.Individualpie;
import finalproj.frames.statisticmanagement.Individualtimeseries;
import finalproj.frames.statisticmanagement.Individualtimeseriesranged;
import finalproj.frames.statisticmanagement.Predictionalgorithm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;


public class STMMain extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private static Logger logger;

    /**
     * Creates new form STMMain
     */
    public STMMain() {
        logger = Logger.getLogger(STMMain.class.getName());
        logger.info("Information Authenticated");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_exit = new javax.swing.JButton();
        pie_panel = new javax.swing.JPanel();
        button_pieindi = new javax.swing.JButton();
        button_piefamily = new javax.swing.JButton();
        button_pieage = new javax.swing.JButton();
        ts_panel = new javax.swing.JPanel();
        button_indits = new javax.swing.JButton();
        button_pieindirange = new javax.swing.JButton();
        pred_panel = new javax.swing.JPanel();
        button_predictor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Statistic Management");
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

        pie_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pie Charts", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_pieindi.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_pieindi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/pieindi.png"))); // NOI18N
        button_pieindi.setText("Individual Ananlysis");
        button_pieindi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pieindiActionPerformed(evt);
            }
        });

        button_piefamily.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_piefamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/piefamily.png"))); // NOI18N
        button_piefamily.setText("Family Analysis");
        button_piefamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_piefamilyActionPerformed(evt);
            }
        });

        button_pieage.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_pieage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/pierange.png"))); // NOI18N
        button_pieage.setText("Age Analysis");
        button_pieage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pieageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pie_panelLayout = new javax.swing.GroupLayout(pie_panel);
        pie_panel.setLayout(pie_panelLayout);
        pie_panelLayout.setHorizontalGroup(
            pie_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pie_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_pieindi)
                .addGap(36, 36, 36)
                .addComponent(button_piefamily)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(button_pieage)
                .addGap(18, 18, 18))
        );
        pie_panelLayout.setVerticalGroup(
            pie_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pie_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pie_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_pieindi)
                    .addComponent(button_piefamily)
                    .addComponent(button_pieage))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ts_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TimeSeries Chart", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_indits.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_indits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/linesfull.png"))); // NOI18N
        button_indits.setText("Individual TS");
        button_indits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_inditsActionPerformed(evt);
            }
        });

        button_pieindirange.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_pieindirange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/linesrange.png"))); // NOI18N
        button_pieindirange.setText("Individual ranged TS");
        button_pieindirange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_pieindirangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ts_panelLayout = new javax.swing.GroupLayout(ts_panel);
        ts_panel.setLayout(ts_panelLayout);
        ts_panelLayout.setHorizontalGroup(
            ts_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ts_panelLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(button_indits)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_pieindirange)
                .addGap(58, 58, 58))
        );

        ts_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_indits, button_pieindirange});

        ts_panelLayout.setVerticalGroup(
            ts_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ts_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ts_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_indits)
                    .addComponent(button_pieindirange))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        ts_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_indits, button_pieindirange});

        pred_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Predictor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_predictor.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_predictor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/predictor.png"))); // NOI18N
        button_predictor.setText("Heuristic Algorithm");
        button_predictor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_predictorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pred_panelLayout = new javax.swing.GroupLayout(pred_panel);
        pred_panel.setLayout(pred_panelLayout);
        pred_panelLayout.setHorizontalGroup(
            pred_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_predictor, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pred_panelLayout.setVerticalGroup(
            pred_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pred_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(button_predictor)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pie_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ts_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button_exit)
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pred_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(229, 229, 229))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(button_exit)
                .addGap(36, 36, 36)
                .addComponent(pie_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ts_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pred_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
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

    private void button_pieindiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pieindiActionPerformed
        if (ConnectionManager.getLevel() <= 1) {
            logger.info("Individualpie Class Initiated");
            new Individualpie().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_pieindiActionPerformed

    private void button_piefamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_piefamilyActionPerformed

        if (ConnectionManager.getLevel() <= 1) {
            logger.info("Familypie Class Initiated");
            new Familypie().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_piefamilyActionPerformed

    private void button_pieageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pieageActionPerformed

        if (ConnectionManager.getLevel() <= 1) {
            logger.info("Agepie Class Initiated");
            new AgePie().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_pieageActionPerformed

    private void button_inditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_inditsActionPerformed

        if (ConnectionManager.getLevel() <= 1) {
            logger.info("Individualtimeseries Class Initiated");
            new Individualtimeseries().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_inditsActionPerformed

    private void button_pieindirangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_pieindirangeActionPerformed

        if (ConnectionManager.getLevel() <= 1) {
            logger.info("Individualtimeseriesranged Class Initiated");
            new Individualtimeseriesranged().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_pieindirangeActionPerformed

    private void button_predictorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_predictorActionPerformed


        if (ConnectionManager.getLevel() <= 1) {
            logger.info("Predictionalorithm Class Initiated");
            new Predictionalgorithm().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_predictorActionPerformed

  
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
                new STMMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_indits;
    private javax.swing.JButton button_pieage;
    private javax.swing.JButton button_piefamily;
    private javax.swing.JButton button_pieindi;
    private javax.swing.JButton button_pieindirange;
    private javax.swing.JButton button_predictor;
    private javax.swing.JPanel pie_panel;
    private javax.swing.JPanel pred_panel;
    private javax.swing.JPanel ts_panel;
    // End of variables declaration//GEN-END:variables
}
