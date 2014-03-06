package finalproj.frames.statisticmanagement;

import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.STMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Predictionalgorithm extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    ResultSet rs2 = null;
    PreparedStatement stmt2 = null;
    ResultSet rs3 = null;
    PreparedStatement stmt3 = null;
    private double technologyvalue;
    private double entertainmentvalue;
    private double soapvalue;
    private double musicvalue;
    private double nativevalue;
    private double specialityvalue;
    private double sciencevalue;
    private double counter;
    private double variance;
    private double advertvar;
    private String cuid;
    String sql2;
    String sql3;
    private static Logger logger;

    public Predictionalgorithm() {
        logger = Logger.getLogger(Predictionalgorithm.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcustomer();
        output_textarea.setEditable(false);

    }

    private void fillcustomer() {
        logger.info("Method call: fillcustomer");
        combo_customerid.removeAllItems();
        String sql = ""
                + "SELECT `idcustomer` "
                + "FROM   `customer` ";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                combo_customerid.addItem(rs.getString("idCustomer"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error During Customer fill" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
        combo_customerid.insertItemAt("", 0);
        combo_customerid.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        end_panel = new javax.swing.JPanel();
        button_exit = new javax.swing.JButton();
        button_generate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        output_textarea = new javax.swing.JTextArea();
        main_label = new javax.swing.JLabel();
        combo_customerid = new javax.swing.JComboBox();
        combo_individualid = new javax.swing.JComboBox();
        cid_label = new javax.swing.JLabel();
        iid_label = new javax.swing.JLabel();
        var_label = new javax.swing.JLabel();
        txt_variance = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Prediction Algorithm");
        setResizable(false);
        setUndecorated(true);

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14));
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        button_generate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/predictor.png"))); // NOI18N
        button_generate.setText("Generate");
        button_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_generate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(button_exit)
                .addGap(34, 34, 34))
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_exit, button_generate});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_exit)
                    .addComponent(button_generate))
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_exit, button_generate});

        output_textarea.setColumns(20);
        output_textarea.setRows(5);
        jScrollPane1.setViewportView(output_textarea);

        main_label.setFont(new java.awt.Font("Calibri", 1, 18));
        main_label.setText("Individual Based Choice Analyzing Time Series");

        combo_customerid.setFont(new java.awt.Font("Calibri", 1, 14));
        combo_customerid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_customeridPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        combo_individualid.setFont(new java.awt.Font("Calibri", 1, 14));

        cid_label.setFont(new java.awt.Font("Calibri", 0, 18));
        cid_label.setText("Customer Id:");

        iid_label.setFont(new java.awt.Font("Calibri", 0, 18));
        iid_label.setText("Individual Id:");

        var_label.setFont(new java.awt.Font("Calibri", 0, 18));
        var_label.setText("Variance Level:");

        txt_variance.setFont(new java.awt.Font("Calibri", 0, 14));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(main_label)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cid_label)
                                    .addComponent(iid_label)
                                    .addComponent(var_label))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combo_customerid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combo_individualid, 0, 122, Short.MAX_VALUE)
                                    .addComponent(txt_variance))))
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cid_label)
                    .addComponent(combo_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iid_label)
                    .addComponent(combo_individualid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(var_label)
                    .addComponent(txt_variance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
            if (stmt2 != null) {
                stmt2.close();
            }
            if (rs2 != null) {
                rs2.close();
            }
            if (stmt3 != null) {
                stmt3.close();
            }
            if (rs3 != null) {
                rs3.close();
            }

            this.dispose();
            new STMMain().setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error user closing " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_exitActionPerformed

    private void button_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_generateActionPerformed
        logger.info("Method call: generate");
        output_textarea.setText("");

        if (!(combo_customerid.getSelectedItem().toString().equals(""))) {
            if (!(combo_individualid.getSelectedItem().toString().equals(""))) {

                if (!TestPattern.booleanstring(txt_variance.getText().toString())) {
                    JOptionPane.showMessageDialog(null, "Please insert correct variance");
                    logger.info("Method call: setvariance");
                } else {


                    if (Double.parseDouble(txt_variance.getText().toString()) > 100.00 || Double.parseDouble(txt_variance.getText().toString()) < 0.00) {

                        JOptionPane.showMessageDialog(null, "Variance must be between 0.00 and 100.00");
                        logger.info("Method call: setvariance");

                    } else {
                        variance = Double.parseDouble(txt_variance.getText().toString());

                        logger.info("DB start");
                        if (!(combo_individualid.getModel().getSize() == 0)) {
                            String sql = ""
                                    + "SELECT * "
                                    + "FROM   `customerbasetag` "
                                    + "WHERE  `individual_idindividual` =? ";

                            try {
                                logger.info("Method call: generateOP");
                                stmt = conn.prepareStatement(sql);
                                stmt.setString(1, combo_individualid.getSelectedItem().toString());
                                rs = stmt.executeQuery();

                                while (rs.next()) {
                                    counter++;


                                    technologyvalue += Double.parseDouble(rs.getString("technology"));

                                    entertainmentvalue += Double.parseDouble(rs.getString("entertainment"));
                                    soapvalue += Double.parseDouble(rs.getString("soap"));
                                    musicvalue += Double.parseDouble(rs.getString("music"));
                                    nativevalue += Double.parseDouble(rs.getString("native"));
                                    specialityvalue += Double.parseDouble(rs.getString("speciality"));
                                    sciencevalue += Double.parseDouble(rs.getString("science"));

                                    output_textarea.append("Individual Stats" + " ( "
                                            + Math.round(technologyvalue / counter) + " , " + Math.round(entertainmentvalue / counter) + " , "
                                            + Math.round(soapvalue / counter) + " , " + Math.round(musicvalue / counter) + " , "
                                            + Math.round(nativevalue / counter) + " , " + Math.round(specialityvalue / counter) + " , "
                                            + Math.round(sciencevalue / counter)
                                            + " )"
                                            + " On Datetime : " + rs.getString("session_date") + "\n");


                                    output_textarea.append("---------------------------------------------------------------------------------------------------------------------\n");
                                    output_textarea.append("Proposed Advertisement List: \n");


                                    writeAdvertisement();


                                    output_textarea.append("---------------------------------------------------------------------------------------------------------------------\n");
                                    output_textarea.append("\n");

                                }
                                logger.info("Method call: generateOPend");

                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Error During Customer Tag Select" + ex.getMessage());
                                logger.fatal("Fatal error", ex);
                            }



                        }
                    }
                }

            } else {

                JOptionPane.showMessageDialog(null, "Please Select an Individual");
                logger.error("Select an individual");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Please Select an Customer");
            logger.error("Select an individual");
        }




    }//GEN-LAST:event_button_generateActionPerformed

    private void writeAdvertisement() {
        logger.info("Method call: writeAdvertisement");
        try {
            sql2 = ""
                    + "SELECT * "
                    + "FROM   `advertisement` ";

            stmt2 = null;
            rs2 = null;
            stmt2 = conn.prepareStatement(sql2);
            rs2 = stmt2.executeQuery();



            while (rs2.next()) {

                sql3 = ""
                        + "SELECT * "
                        + "FROM   `basetag` "
                        + "WHERE  `idbasetag` =? ";

                stmt3 = conn.prepareStatement(sql3);
                stmt3.setString(1, rs2.getString("BaseTag_idBaseTag"));
                rs3 = stmt3.executeQuery();

                if (rs3.next()) {

                    advertvar = (technologyvalue / counter) - (Double.parseDouble(rs3.getString("technology")))
                            + (entertainmentvalue / counter) - (Double.parseDouble(rs3.getString("entertainment")))
                            + (soapvalue / counter) - (Double.parseDouble(rs3.getString("soap")))
                            + (musicvalue / counter) - (Double.parseDouble(rs3.getString("music")))
                            + (nativevalue / counter) - (Double.parseDouble(rs3.getString("native")))
                            + (specialityvalue / counter) - (Double.parseDouble(rs3.getString("speciality")))
                            + (sciencevalue / counter) - (Double.parseDouble(rs3.getString("science")));


                    if (Math.abs(advertvar / 7.00) <= variance) {
                        output_textarea.append(rs2.getString("advertisement_name") + "\n");
                    }

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error During Advertisement Select" + ex.getMessage());
            logger.fatal("Fatal error", ex);

        }
    }

    private void combo_customeridPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_customeridPopupMenuWillBecomeInvisible
        logger.info("Method call: customerid");
        if (!(combo_customerid.getSelectedItem().toString().equals(""))) {
            combo_individualid.removeAllItems();
            cuid = combo_customerid.getSelectedItem().toString();

            String sql2 = ""
                    + "SELECT * "
                    + "FROM   `individual` "
                    + "WHERE  `customer_idcustomer` =? ";

            try {
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, cuid);
                rs = stmt.executeQuery();

                while (rs.next()) {

                    combo_individualid.addItem(rs.getString("idIndividual"));
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error During Individual fill" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
            combo_individualid.insertItemAt("", 0);
            combo_individualid.setSelectedIndex(0);

        }
    }//GEN-LAST:event_combo_customeridPopupMenuWillBecomeInvisible

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
                new Predictionalgorithm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_generate;
    private javax.swing.JLabel cid_label;
    private javax.swing.JComboBox combo_customerid;
    private javax.swing.JComboBox combo_individualid;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel iid_label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel main_label;
    private javax.swing.JTextArea output_textarea;
    private javax.swing.JTextField txt_variance;
    private javax.swing.JLabel var_label;
    // End of variables declaration//GEN-END:variables
}
