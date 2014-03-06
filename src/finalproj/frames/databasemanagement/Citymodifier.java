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

public class Citymodifier extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt2 = null;
    private String message = "";
    private String countryid;
    private String cityid;
    private static Logger logger;

    public Citymodifier() {
        logger = Logger.getLogger(Citymodifier.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcity();

    }

    private void fillcity() {
        logger.info("Method call: fillcity");
        String sql = ""
                + "SELECT * "
                + "FROM   `city` ";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                combo_city.addItem(rs.getString("city_name"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcity  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
        combo_city.insertItemAt("", 0);
        combo_city.setSelectedIndex(0);

    }

    private void fillcountry() {
        logger.info("Method call: fillcuntry");
        combo_country.removeAllItems();

        String sql = ""
                + "SELECT `country_name` "
                + "FROM   `country` "
                + "ORDER  BY `country_name` ";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            /*NOTE:Combo box filling*/
            while (rs.next()) {
                String name = rs.getString("country_name");
                combo_country.addItem(name);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcountry  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base_panel = new javax.swing.JPanel();
        coname_label = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        cnameedit_label = new javax.swing.JLabel();
        combo_country = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_accept = new javax.swing.JButton();
        select_panel = new javax.swing.JPanel();
        cname_label = new javax.swing.JLabel();
        combo_city = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("City Modifier");
        setUndecorated(true);
        setResizable(false);

        base_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        coname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        coname_label.setText("Country Name:");

        txt_name.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cnameedit_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cnameedit_label.setText("City name:");

        combo_country.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout base_panelLayout = new javax.swing.GroupLayout(base_panel);
        base_panel.setLayout(base_panelLayout);
        base_panelLayout.setHorizontalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, base_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(coname_label)
                .addGap(18, 18, 18)
                .addComponent(combo_country, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(cnameedit_label)
                .addGap(44, 44, 44)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        base_panelLayout.setVerticalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cnameedit_label))
                    .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(coname_label)
                        .addComponent(combo_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
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

        select_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select City", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        cname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cname_label.setText("City name:");

        combo_city.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_city.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_cityPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout select_panelLayout = new javax.swing.GroupLayout(select_panel);
        select_panel.setLayout(select_panelLayout);
        select_panelLayout.setHorizontalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(cname_label)
                .addGap(45, 45, 45)
                .addComponent(combo_city, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        select_panelLayout.setVerticalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname_label)
                    .addComponent(combo_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(select_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
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
        if (!(combo_city.getSelectedItem().toString().equals(""))) {

            if ("".equals(txt_name.getText())) {
                message = message + "Channel Name is Empty  \n";
            }

            if (!TestPattern.spacetextpattern(txt_name.getText())) {
                message = message + "Channel Name Must be Alphanumeric  \n";
            }

            if (!LengthVerifier.lengthString(txt_name.getText())) {
                message = message + "Channel Name Length Must be Less than 40  \n";
            }

            if (!txt_name.getText().equals(combo_city.getSelectedItem().toString())) {
                String sql = ""
                        + "SELECT * "
                        + "FROM   `city` "
                        + "WHERE  `city_name` =? ";
                try {
                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, txt_name.getText());
                    rs = stmt.executeQuery();

                    if (rs.next()) {
                        message = message + "City already exists  \n";
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }
            }

            if ("".equals(message)) {
                logger.info("Method call: insertDB");
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Select a city first");
            logger.warn("City not selected");
        }
    }//GEN-LAST:event_button_acceptActionPerformed

    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Modify City", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "City Not Modified");
            logger.info("Change cancelled");
        } else {
            try {
                logger.info("DB start");
                String sql = ""
                        + "SELECT * "
                        + "FROM   `country` "
                        + "WHERE  `country_name` =? ";

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, combo_country.getSelectedItem().toString());
                rs = stmt.executeQuery();

                if (rs.next()) {

                    String sql2 = ""
                            + "UPDATE `city` "
                            + "SET    `country_idcountry` = ?, "
                            + "       `city_name` = ? "
                            + "WHERE  `idcity` =? ";


                    stmt2 = conn.prepareStatement(sql2);
                    stmt2.setString(1, rs.getString("idCountry"));
                    stmt2.setString(2, txt_name.getText());
                    stmt2.setString(3, cityid);
                    stmt2.executeUpdate();

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

    private void combo_cityPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_cityPopupMenuWillBecomeInvisible

        fillcountry();

        String sql = ""
                + "SELECT * "
                + "FROM   `city` "
                + "WHERE  `city_name` =? ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, combo_city.getSelectedItem().toString());
            rs = stmt.executeQuery();

            if (rs.next()) {

                txt_name.setText(rs.getString("city_name"));
                cityid = rs.getString("idCity");
                countryid = rs.getString("Country_idCountry");
                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `country` "
                        + "WHERE  `idcountry` =? ";

                stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, countryid);
                rs2 = stmt2.executeQuery();

                if (rs2.next()) {
                    combo_country.setSelectedItem(rs2.getString("country_name"));
                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcitypopup  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_combo_cityPopupMenuWillBecomeInvisible

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
                new Citymodifier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base_panel;
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JLabel cname_label;
    private javax.swing.JLabel cnameedit_label;
    private javax.swing.JComboBox combo_city;
    private javax.swing.JComboBox combo_country;
    private javax.swing.JLabel coname_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JPanel select_panel;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
