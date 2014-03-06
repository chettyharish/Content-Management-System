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

public class Cityadder extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt2 = null;
    private String message = "";
    private static Logger logger;

    public Cityadder() {
        logger = Logger.getLogger(Cityadder.class.getName());
        logger.info("Initialization");

        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcountry();

    }

    private void fillcountry() {
        logger.info("Method call: fillcountry");
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
        combo_country.insertItemAt("", 0);
        combo_country.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base_panel = new javax.swing.JPanel();
        coname_label = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        cname_label = new javax.swing.JLabel();
        combo_country = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("City Adder");
        setUndecorated(true);
        setResizable(false);

        base_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        coname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        coname_label.setText("Country Name:");

        txt_name.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cname_label.setText("City name:");

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
                .addComponent(cname_label)
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
                        .addComponent(cname_label))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
        if (!(combo_country.getSelectedItem().toString().equals(""))) {
           
            if ("".equals(txt_name.getText())) {
                message = message + "City Name is Empty  \n";
            }

            if (!TestPattern.spacetextpattern(txt_name.getText())) {
                message = message + "City Name Must be Alphanumeric  \n";
            }

            if (!LengthVerifier.lengthString(txt_name.getText())) {
                message = message + "City Name Length Must be Less than 40  \n";
            }

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

            if ("".equals(message)) {
                logger.info("Method call: insertDB");
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Country Not Selected");
            logger.warn("Country Not Selected");
        }
    }//GEN-LAST:event_button_acceptActionPerformed

    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Addition", "Add City", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "City Not Added");
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
                            + "INSERT INTO `city` "
                            + "            (`idcity`, "
                            + "             `country_idcountry`, "
                            + "             `city_name`) "
                            + "VALUES      (?, "
                            + "             ?, "
                            + "             ?) ";


                    stmt2 = conn.prepareStatement(sql2);
                    stmt2.setString(1, null);
                    stmt2.setString(2, rs.getString("idCountry"));
                    stmt2.setString(3, txt_name.getText());
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
                new Cityadder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base_panel;
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JLabel cname_label;
    private javax.swing.JComboBox combo_country;
    private javax.swing.JLabel coname_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
