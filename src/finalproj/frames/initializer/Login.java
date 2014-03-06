package finalproj.frames.initializer;

import finalproj.db.AESrunner;
import finalproj.db.ConnectionManager;
import finalproj.db.DBmanager;
import finalproj.logger.Logrunner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.log4j.Logger;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt2 = null;
    private static Logger logger;

    public Login() {

        initComponents();
        this.setLocationRelativeTo(null);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        title_panel = new javax.swing.JPanel();
        title_label = new javax.swing.JLabel();
        login__panel = new javax.swing.JPanel();
        un_label = new javax.swing.JLabel();
        pass_label = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        final_panel = new javax.swing.JPanel();
        button_exit = new javax.swing.JButton();
        button_login = new javax.swing.JButton();
        image_label = new javax.swing.JLabel();
        bgimage_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Main");
        setUndecorated(true);
        setResizable(false);

        main_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        main_panel.setMinimumSize(new java.awt.Dimension(750, 535));
        main_panel.setPreferredSize(new java.awt.Dimension(750, 562));
        main_panel.setLayout(null);

        title_panel.setOpaque(false);

        title_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/Title.png"))); // NOI18N

        javax.swing.GroupLayout title_panelLayout = new javax.swing.GroupLayout(title_panel);
        title_panel.setLayout(title_panelLayout);
        title_panelLayout.setHorizontalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
            .addGroup(title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(title_panelLayout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(title_label)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        title_panelLayout.setVerticalGroup(
            title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(title_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(title_label)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        main_panel.add(title_panel);
        title_panel.setBounds(360, 420, 380, 122);

        login__panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N
        login__panel.setOpaque(false);

        un_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        un_label.setText("User Name");

        pass_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pass_label.setText("Password");

        final_panel.setOpaque(false);

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/exit.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        button_login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/apply.png"))); // NOI18N
        button_login.setText("Login");
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout final_panelLayout = new javax.swing.GroupLayout(final_panel);
        final_panel.setLayout(final_panelLayout);
        final_panelLayout.setHorizontalGroup(
            final_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(final_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_login)
                .addGap(29, 29, 29)
                .addComponent(button_exit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        final_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_exit, button_login});

        final_panelLayout.setVerticalGroup(
            final_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(final_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(final_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_exit)
                    .addComponent(button_login))
                .addContainerGap())
        );

        final_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_exit, button_login});

        image_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/logosmall.png"))); // NOI18N

        javax.swing.GroupLayout login__panelLayout = new javax.swing.GroupLayout(login__panel);
        login__panel.setLayout(login__panelLayout);
        login__panelLayout.setHorizontalGroup(
            login__panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login__panelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(login__panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(login__panelLayout.createSequentialGroup()
                        .addGroup(login__panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass_label)
                            .addComponent(un_label))
                        .addGap(18, 18, 18)
                        .addGroup(login__panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_username, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txt_password))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(login__panelLayout.createSequentialGroup()
                        .addComponent(final_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 17, Short.MAX_VALUE))))
            .addGroup(login__panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(image_label)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        login__panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_password, txt_username});

        login__panelLayout.setVerticalGroup(
            login__panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login__panelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(image_label, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(login__panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(un_label)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(login__panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_label)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(final_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        login__panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_password, txt_username});

        main_panel.add(login__panel);
        login__panel.setBounds(440, 110, 290, 270);

        bgimage_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/planet.png"))); // NOI18N
        bgimage_label.setPreferredSize(new java.awt.Dimension(750, 540));
        main_panel.add(bgimage_label);
        bgimage_label.setBounds(0, 0, 750, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed

        if (!(txt_username.getText().equals("") || txt_password.getText().equals(""))) {
            try {
                Logrunner.Loginitialize();
                logger = Logger.getLogger(Login.class.getName());
                /*SQL Statement*/
                String sql = ""
                        + "SELECT * "
                        + "FROM   stafflogin "
                        + "WHERE  login_name = ? "
                        + "       AND login_password = ? ";


                logger.info("User Accessed: " + txt_username.getText());

                conn = ConnectionManager.getInstance().getConnection();
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, txt_username.getText());
                stmt.setString(2, AESrunner.AESencrypt(txt_password.getText()));

                rs = stmt.executeQuery();

                if (rs.next()) {

                    /*One log in can only initialize one session log in level*/
                    ConnectionManager.setLevel(rs.getInt("login_access_level"));
                    ConnectionManager.setAccessor(rs.getString("login_name"));

                    String sql2 = ""
                            + "SELECT * "
                            + "FROM   `connectionlevel` "
                            + "WHERE  `connection_level` =? ";


                    stmt2 = conn.prepareStatement(sql2);
                    stmt2.setString(1, String.valueOf(ConnectionManager.getLevel()));
                    rs2 = stmt2.executeQuery();


                    if (rs2.next()) {


                        logger.info("Information Authenticated");

                        ConnectionManager.setUSERNAME(rs2.getString("connection_name"));
                        ConnectionManager.setPASSWORD(AESrunner.AESdecrypt(rs2.getString("connection_pass")));

                        ConnectionManager.getInstance().close();
                        conn = ConnectionManager.getInstance().getConnection();

                        JOptionPane.showMessageDialog(null, "User Authenticated");

                        logger.info("New Connection Established");

                        DBmanager.Backupdbtosql();

                        new Selector().setVisible(true);
                        this.dispose();
                        logger.info("Selector Class Initiated");

                        try {
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

                            this.dispose();

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
                            logger.fatal("Fatal error", ex);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Authentication Failure");
                    logger.warn("Authentication Failure");
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, ex);
                logger.fatal("Fatal error", ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Username and password cannot be empty");
        }
    }//GEN-LAST:event_button_loginActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        try {

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
            if (conn != null) {
                conn.close();
            }
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());

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
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error in your Java installation. \n Please verify your information");


        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });




    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgimage_label;
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_login;
    private javax.swing.JPanel final_panel;
    private javax.swing.JLabel image_label;
    private javax.swing.JPanel login__panel;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel pass_label;
    private javax.swing.JLabel title_label;
    private javax.swing.JPanel title_panel;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel un_label;
    // End of variables declaration//GEN-END:variables
}
