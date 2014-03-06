package finalproj.frames.payment;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.db.DBmanager;
import finalproj.frames.initializer.CMmain;
import java.io.File;
import java.io.FilenameFilter;
import java.net.URISyntaxException;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Paymentresend extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String cuid;
    private boolean flag = false;
    private String firstname;
    private String lastname;
    private String Email;
    private String savePath;
    private static Logger logger;

    public Paymentresend() {
        logger = Logger.getLogger(Paymentresend.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        end_panel = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_accept = new javax.swing.JButton();
        bill_panel = new javax.swing.JPanel();
        combo_list = new javax.swing.JComboBox();
        select_panel = new javax.swing.JPanel();
        select_label = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Resened Payment Slip");
        setUndecorated(true);
        setResizable(false);

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
                .addGap(51, 51, 51)
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

        bill_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        javax.swing.GroupLayout bill_panelLayout = new javax.swing.GroupLayout(bill_panel);
        bill_panel.setLayout(bill_panelLayout);
        bill_panelLayout.setHorizontalGroup(
            bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bill_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combo_list, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        bill_panelLayout.setVerticalGroup(
            bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(combo_list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        select_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Customer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        select_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        select_label.setText("Search Customer:");

        txt_search.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout select_panelLayout = new javax.swing.GroupLayout(select_panel);
        select_panel.setLayout(select_panelLayout);
        select_panelLayout.setHorizontalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(select_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(select_panelLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        select_panelLayout.setVerticalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_label)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(button_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bill_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(select_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            new CMmain().setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error after inserting eveything " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_acceptActionPerformed
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Select a user first");
            logger.info("User not found");
        } else {

            if (!(combo_list.getSelectedItem().toString().equals(""))) {
                try {
                    logger.info("Method call: pathgenerated");
                    CodeSource codeSource = DBmanager.class.getProtectionDomain().getCodeSource();
                    File jarFile = new File(codeSource.getLocation().toURI().getPath());
                    String jarDir = jarFile.getParentFile().getPath();


                    /*NOTE: Creating Path Constraints for bill*/
                    savePath = jarDir + "\\payments\\" + combo_list.getSelectedItem().toString();
                    sendmail();


                    try {
                        logger.info("Exiting");
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (rs != null) {
                            rs.close();
                        }

                        this.dispose();
                        new CMmain().setVisible(true);

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error after sending bill " + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }

                } catch (URISyntaxException ex) {
                    JOptionPane.showMessageDialog(null, "Error on accept " + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }

            } else {

                JOptionPane.showMessageDialog(null, "Please Select a Payment Slip");
                logger.error("Select a Payment Slip");
            }

        }

    }//GEN-LAST:event_button_acceptActionPerformed

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        logger.info("Method call: search");

        flag = true;
        String sql = ""
                + "SELECT * "
                + "FROM   customer "
                + "WHERE  login_login_name =? ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txt_search.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Customer Found");
                cuid = rs.getString("idCustomer");
                firstname = rs.getString("first_name");
                lastname = rs.getString("last_name");
                Email = rs.getString("email");
                fillpayment();
            } else {
                JOptionPane.showMessageDialog(null, "Customer Not Found Search Again");
                logger.info("Customer not found");
                combo_list.removeAllItems();
                combo_list.insertItemAt("", 0);
                combo_list.setSelectedIndex(0);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at search" + ex.getMessage());
            logger.fatal("Fatal error", ex);


        }


    }//GEN-LAST:event_button_searchActionPerformed

    private void sendmail() {
        logger.info("Method call: sendmail");
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.port", "465");

        javax.mail.Session session = javax.mail.Session.getDefaultInstance(prop,
                new javax.mail.Authenticator() {
                    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                        return new javax.mail.PasswordAuthentication("harkdth@gmail.com", "8108555091");
                    }
                });


        try {
            Message message = new MimeMessage(session);
            message.setSubject("Your Payment for H.A.R.K. DTH Services " + firstname + " " + lastname + "  Dated: " + Dategenerator.getCurrentDatesimple().toString());
            message.setFrom(new InternetAddress("harkdth@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Email));


            /*NOTE: Body is for stuff and part is for joining multiple parts together*/
            MimeBodyPart body = new MimeBodyPart();
            body.setText("Attached PDF contains details about your payment.");
            Multipart part = new MimeMultipart();
            part.addBodyPart(body);



            body = new MimeBodyPart();

            DataSource source = new FileDataSource(savePath);
            body.setDataHandler(new DataHandler(source));
            body.setFileName(firstname + "_" + lastname + "_" + "Payment.pdf");

            part.addBodyPart(body);
            message.setContent(part);

            Transport.send(message);
            logger.info("Message sent");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Error during mail sending" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }

    private void fillpayment() {
        logger.info("Method call: fillpayment");
        try {
            combo_list.removeAllItems();
            /*NOTE: Getting path to the Jar file being executed*/
            CodeSource codeSource = Billresend.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();


            /*NOTE: Creating Path Constraints for folder saving*/
            String folderPath = jarDir + "\\payments";

            File dir = new File(folderPath);
            FilenameFilter filter = new FilenameFilter() {
                public boolean accept(File dir, String name) {

                    if (name.endsWith(".pdf") && name.startsWith(cuid)) {
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
                    combo_list.addItem(filename);

                }
            }

            combo_list.insertItemAt("", 0);
            combo_list.setSelectedIndex(0);

        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Exception generated at filling combo" + ex.getMessage());
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
                new Paymentresend().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bill_panel;
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_search;
    private javax.swing.JComboBox combo_list;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel select_label;
    private javax.swing.JPanel select_panel;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
