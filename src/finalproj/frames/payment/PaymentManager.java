package finalproj.frames.payment;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import finalproj.arbitraryprograms.Dategenerator;
import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.AESrunner;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
import java.awt.CardLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

public class PaymentManager extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt2 = null;
    PreparedStatement stmt3 = null;
    PreparedStatement stmt4 = null;
    private String search;
    private String cuid;
    private String selecteditembill;
    private boolean flag = false;
    private String billid;
    private String adid;
    private String keys;
    private String message = "";
    Document doc;
    private String firstname;
    private String lastname;
    private String Email;
    private String savePath;
    private static Logger logger;

    public PaymentManager() {
        logger = Logger.getLogger(PaymentManager.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        doc = new Document();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bill_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        txt_login = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        out_label = new javax.swing.JLabel();
        combo_bill = new javax.swing.JComboBox();
        date_label = new javax.swing.JLabel();
        txt_date = new javax.swing.JTextField();
        val_label = new javax.swing.JLabel();
        txt_value = new javax.swing.JTextField();
        pay_panel = new javax.swing.JPanel();
        pay_label = new javax.swing.JLabel();
        combo_payment = new javax.swing.JComboBox();
        display_panel = new javax.swing.JPanel();
        CCpanel = new finalproj.frames.payment.CCPanel();
        CODpanel = new finalproj.frames.payment.CODPanel();
        DCpanel = new finalproj.frames.payment.DCPanel();
        end_panel = new javax.swing.JPanel();
        button_accept = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Process Payment");
        setUndecorated(true);
        setResizable(false);

        bill_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        txt_login.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        out_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        out_label.setText("Outstanding Bills:");

        combo_bill.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_bill.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_billPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        date_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        date_label.setText("Bill Generation Date:");

        txt_date.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        val_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        val_label.setText("Bill Value:");

        txt_value.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout bill_panelLayout = new javax.swing.GroupLayout(bill_panel);
        bill_panel.setLayout(bill_panelLayout);
        bill_panelLayout.setHorizontalGroup(
            bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_panelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(date_label)
                .addGap(18, 18, 18)
                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(val_label)
                .addGap(18, 18, 18)
                .addComponent(txt_value, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bill_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(out_label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_bill, 0, 233, Short.MAX_VALUE)
                    .addComponent(txt_login))
                .addGap(33, 33, 33)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );

        bill_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {login_label, out_label});

        bill_panelLayout.setVerticalGroup(
            bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_panelLayout.createSequentialGroup()
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(txt_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(out_label)
                    .addComponent(combo_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_label)
                    .addComponent(val_label)
                    .addComponent(txt_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        bill_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {login_label, out_label});

        pay_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        pay_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pay_label.setText("Payment Type:");

        combo_payment.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_payment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Credit Card", "Debit Card", "Cash on Delivery" }));
        combo_payment.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_paymentPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        display_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        display_panel.setPreferredSize(new java.awt.Dimension(550, 250));
        display_panel.setLayout(new java.awt.CardLayout());
        display_panel.add(CCpanel, "CCCard");
        display_panel.add(CODpanel, "CODCard");
        CODpanel.getAccessibleContext().setAccessibleDescription("");

        display_panel.add(DCpanel, "DCCard");

        javax.swing.GroupLayout pay_panelLayout = new javax.swing.GroupLayout(pay_panel);
        pay_panel.setLayout(pay_panelLayout);
        pay_panelLayout.setHorizontalGroup(
            pay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pay_panelLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(pay_label)
                .addGap(45, 45, 45)
                .addComponent(combo_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pay_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(display_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        pay_panelLayout.setVerticalGroup(
            pay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pay_panelLayout.createSequentialGroup()
                .addGroup(pay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pay_label)
                    .addComponent(combo_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(display_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        button_accept.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_accept.setText("Accept");
        button_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_acceptActionPerformed(evt);
            }
        });

        button_cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_cancel.setText("Cancel");
        button_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(button_accept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(button_cancel)
                .addGap(51, 51, 51))
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_accept)
                    .addComponent(button_cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bill_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pay_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pay_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_paymentPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_paymentPopupMenuWillBecomeInvisible
        logger.info("Method call: payment");

        if (combo_payment.getSelectedItem().toString().equals("Credit Card")) {

            CardLayout card = (CardLayout) display_panel.getLayout();
            card.show(display_panel, "CCCard");

        }

        if (combo_payment.getSelectedItem().toString().equals("Debit Card")) {

            CardLayout card = (CardLayout) display_panel.getLayout();
            card.show(display_panel, "DCCard");

        }

        if (combo_payment.getSelectedItem().toString().equals("Cash on Delivery")) {

            CardLayout card = (CardLayout) display_panel.getLayout();
            card.show(display_panel, "CODCard");
        }
    }//GEN-LAST:event_combo_paymentPopupMenuWillBecomeInvisible

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        logger.info("Method call: search");
        search = txt_login.getText();
        String sql = ""
                + "SELECT * "
                + "FROM   `customer` "
                + "WHERE  login_login_name =? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, search);
            rs = stmt.executeQuery();

            if (rs.next()) {
                flag = true;
                JOptionPane.showMessageDialog(null, "Customer Found");

                cuid = rs.getString("idCustomer");
                adid = rs.getString("Address_idAddress");
                firstname = rs.getString("first_name");
                lastname = rs.getString("last_name");
                Email = rs.getString("email");

                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `bill` "
                        + "WHERE  `customer_idcustomer` =? "
                        + "       AND `payment_idpayment` IS NULL ";

                stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, cuid);
                rs2 = stmt2.executeQuery();


                while (rs2.next()) {
                    combo_bill.addItem(rs2.getString("bill_date"));

                }

                combo_bill.insertItemAt("", 0);
                combo_bill.setSelectedIndex(0);



            } else {
                JOptionPane.showMessageDialog(null, "Customer Not Found Search Again");
                logger.error("Customer not found");
                flag = false;
                combo_bill.removeAllItems();
                combo_bill.insertItemAt("", 0);
                combo_bill.setSelectedIndex(0);
                txt_date.setText("");
                txt_value.setText("");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at search" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }






    }//GEN-LAST:event_button_searchActionPerformed

    private void combo_billPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_billPopupMenuWillBecomeInvisible
        logger.info("Method call: bill");
        if (combo_bill.getModel().getSize() != 0) {
            if (!((combo_bill.getSelectedItem().toString().equals("")))) {
                try {
                    selecteditembill = combo_bill.getSelectedItem().toString();

                    String sql = ""
                            + "SELECT * "
                            + "FROM   `bill` "
                            + "WHERE  `customer_idcustomer` =? "
                            + "       AND `bill_date` =? ";

                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, cuid);
                    stmt.setString(2, selecteditembill);
                    rs = stmt.executeQuery();

                    if (rs.next()) {
                        billid = rs.getString("idBill");
                        txt_date.setText(rs.getString("bill_date"));
                        txt_value.setText(rs.getString("bill_val"));
                        txt_value.setEnabled(false);
                        txt_date.setEnabled(false);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error at bill generator" + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }
            }
        }
    }//GEN-LAST:event_combo_billPopupMenuWillBecomeInvisible

    private void button_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_acceptActionPerformed
        logger.info("Method call: accept");
        if (flag != true) {
            JOptionPane.showMessageDialog(null, "Search for a Customer First");
        } else {
            if (!(combo_bill.getSelectedItem().toString().equals(""))) {
                if (!"Select".equals(combo_payment.getSelectedItem().toString())) {

                    if (combo_payment.getSelectedItem().toString().equals("Credit Card")) {
                        try {
                            logger.info("Method call: Creditcard payment");
                            String combo_cc_type = CCpanel.getCombo_cc_type();
                            String txt_cc_cvv = CCpanel.getTxt_cc_cvv();
                            String txt_cc_date = CCpanel.getTxt_cc_date();
                            String txt_cc_number = CCpanel.getTxt_cc_number();
                            String txt_cc_owner = CCpanel.getTxt_cc_owner();
                            String txt_cc_year = CCpanel.getTxt_cc_year();

                            if ("Select".equals(combo_cc_type)) {

                                message = message + "Please select a card type\n";
                            } else {
                                if ("American Express".equals(combo_cc_type)) {

                                    if (!TestPattern.ccverifierAmerican(txt_cc_number)) {
                                        System.out.println("reached american");
                                        System.out.println(txt_cc_number);
                                        message = message + "Incorrect American Express Card Number\n";
                                    }
                                }

                                if ("Mastercard".equals(combo_cc_type)) {
                                    if (!TestPattern.ccverifierMastercard(txt_cc_number)) {
                                        System.out.println("reached mastercard");
                                        System.out.println(txt_cc_number);
                                        message = message + "Incorrect Mastercard Card Number\n";
                                    }
                                }


                                if ("Visa".equals(combo_cc_type)) {
                                    if (!TestPattern.ccverifierVisa(txt_cc_number)) {
                                        System.out.println("reached visa");
                                        System.out.println(txt_cc_number);
                                        message = message + "Incorrect Visa Card Number\n";
                                    }
                                }


                            }


                            if (!(txt_cc_cvv.length() == 3)) {

                                message = message + "Incorrect CVV Number\n";


                            } else {
                                if (!TestPattern.numberpattern(txt_cc_cvv)) {
                                    message = message + "Incorrect CVV Number\n";
                                }
                            }



                            if (txt_cc_year.length() < 4) {

                                message = message + "Incorrect Year\n";


                            } else {
                                if (!TestPattern.numberpattern(txt_cc_year)) {
                                    message = message + "Incorrect Year\n";
                                }
                            }


                            if (txt_cc_date.length() < 2) {

                                message = message + "Incorrect Date\n";


                            } else {
                                if (!TestPattern.numberpattern(txt_cc_date)) {
                                    message = message + "Incorrect Date\n";
                                }
                            }


                            if ("".equals(txt_cc_owner)) {
                                message = message + "Name cannot be empty \n";
                            } else {
                                if (!LengthVerifier.lengthString(txt_cc_owner)) {
                                    message = message + "Name cannot be longer than 40 characters \n";
                                } else {
                                    if (!TestPattern.spacetextpattern(txt_cc_owner)) {

                                        message = message + "Name must be alphanumeric with only spaces and periods allowed \n";
                                    }
                                }
                            }



                            if ("".equals(message)) {
                                logger.info("Method call: pathgenertaor");
                                CodeSource codeSource = Billgenerator.class.getProtectionDomain().getCodeSource();
                                File jarFile = new File(codeSource.getLocation().toURI().getPath());
                                String jarDir = jarFile.getParentFile().getPath();


                                /*NOTE: Creating Path Constraints for folder saving*/
                                String folderPath = jarDir + "\\payments";

                                /*NOTE: Creating Folder if it does not exist*/
                                File f1 = new File(folderPath);
                                f1.mkdir();

                                savePath = jarDir + "\\payments\\" + cuid + "_" + firstname + "_" + lastname + "_" + Dategenerator.getCurrentDatesimple().toString() + "_Payment.pdf";

                                /*NOTE: PDF Starts here*/
                                PdfWriter.getInstance(doc, new FileOutputStream(savePath));
                                doc.open();
                                Image img = Image.getInstance("logosmall.png");
                                doc.add(img);
                                doc.add(new Paragraph(Dategenerator.getCurrentDate().toString()));
                                doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                                doc.add(new Paragraph("Customer Name :" + firstname + "  " + lastname));
                                doc.add(new Paragraph("Payment value :  INR " + Double.parseDouble(txt_value.getText()) / 100));
                                doc.add(new Paragraph("Payment Type : Credit Card"));
                                doc.add(new Paragraph("Credit Card Number : **** **** **** " + txt_cc_number.substring(12)));
                                doc.add(new Paragraph("Thank You for the Payment "));
                                doc.close();

                                /*Note: The Credit Card Insert Queries are here to avoid static variables*/

                                logger.info("DB start");

                                String sql = ""
                                        + "INSERT INTO `payment` "
                                        + "            (`idpayment`, "
                                        + "             `bill_id`, "
                                        + "             `payment_date`, "
                                        + "             `payment_type`) "
                                        + "VALUES      (?, "
                                        + "             ?, "
                                        + "             ?, "
                                        + "             ?) ";
                                try {
                                    stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                                    stmt.setString(1, null);
                                    stmt.setString(2, billid);
                                    stmt.setString(3, Dategenerator.getCurrentDate().toString());
                                    stmt.setString(4, "1");
                                    stmt.executeUpdate();
                                    rs = stmt.getGeneratedKeys();
                                    rs.next();
                                    keys = rs.getString(1);



                                    String sql2 = ""
                                            + "INSERT INTO `creditcard` "
                                            + "            (`idcreditcard`, "
                                            + "             `payment_idpayment`, "
                                            + "             `credit_card_number`, "
                                            + "             `credit_card_cvv`, "
                                            + "             `credit_card_expiry_year`, "
                                            + "             `credit_card_expiry_date`, "
                                            + "             `credit_card_owner`, "
                                            + "             `credit_card_type`) "
                                            + "VALUES      (?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?) ";

                                    stmt = conn.prepareStatement(sql2);
                                    stmt.setString(1, null);
                                    stmt.setString(2, keys);
                                    stmt.setString(3, AESrunner.AESencrypt(txt_cc_number));
                                    stmt.setString(4, AESrunner.AESencrypt(txt_cc_cvv));
                                    stmt.setString(5, txt_cc_year);
                                    stmt.setString(6, txt_cc_date);
                                    stmt.setString(7, AESrunner.AESencrypt(txt_cc_owner));
                                    stmt.setString(8, AESrunner.AESencrypt(combo_cc_type));
                                    stmt.executeUpdate();

                                    String sql3 = ""
                                            + "UPDATE `bill` "
                                            + "SET    `payment_idpayment` = ? "
                                            + "WHERE  `idbill` =? ";



                                    stmt = conn.prepareStatement(sql3);
                                    stmt.setString(1, keys);
                                    stmt.setString(2, billid);
                                    stmt.executeUpdate();

                                    logger.info("DB end");
                                    sendmail();
                                    JOptionPane.showMessageDialog(null, "Payment has been confirmed");
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
                                        JOptionPane.showMessageDialog(null, "Error user closing " + ex.getMessage());
                                        logger.fatal("Fatal error", ex);
                                    }

                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null, "Error at pay generator" + ex.getMessage());
                                    logger.fatal("Fatal error", ex);
                                }

                            } else {

                                JOptionPane.showMessageDialog(null, message);
                                logger.error("Error message : " + message);
                                message = "";
                            }

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Exception Generated : " + ex.getMessage());
                            logger.fatal("Fatal error", ex);
                        }

                    }



                    if (combo_payment.getSelectedItem().toString().equals("Debit Card")) {

                        try {
                            logger.info("Method call: Debitcardpayment");
                            String combo_dc_type = DCpanel.getCombo_dc_type();
                            String txt_dc_cvv = DCpanel.getTxt_dc_cvv();
                            String txt_dc_date = DCpanel.getTxt_dc_date();
                            String txt_dc_number = DCpanel.getTxt_dc_number();
                            String txt_dc_owner = DCpanel.getTxt_dc_owner();
                            String txt_dc_year = DCpanel.getTxt_dc_year();

                            if ("Select".equals(combo_dc_type)) {

                                message = message + "Please select a card type\n";
                            }


                            if (!(txt_dc_cvv.length() == 3)) {

                                message = message + "Incorrect CVV Number\n";


                            } else {
                                if (!TestPattern.numberpattern(txt_dc_cvv)) {
                                    message = message + "Incorrect CVV Number\n";
                                }
                            }

                            if (txt_dc_year.length() < 4) {

                                message = message + "Incorrect Year\n";


                            } else {
                                if (!TestPattern.numberpattern(txt_dc_year)) {
                                    message = message + "Incorrect Year\n";
                                }
                            }


                            if (txt_dc_date.length() < 2) {

                                message = message + "Incorrect Date\n";


                            } else {
                                if (!TestPattern.numberpattern(txt_dc_date)) {
                                    message = message + "Incorrect Date\n";
                                }
                            }


                            if ("".equals(txt_dc_owner)) {
                                message = message + "Name cannot be empty \n";
                            } else {
                                if (!LengthVerifier.lengthString(txt_dc_owner)) {
                                    message = message + "Name cannot be longer than 40 characters \n";
                                } else {
                                    if (!TestPattern.spacetextpattern(txt_dc_owner)) {

                                        message = message + "Name must be alphanumeric with only spaces and periods allowed \n";
                                    }
                                }
                            }


                            if (!(TestPattern.numberpattern(txt_dc_number))) {
                                message = message + "Incorrect Debit card number \n";

                            } else {
                                if (txt_dc_number.length() > 16 || txt_dc_number.length() < 13) {
                                    message = message + "Incorrect Debit card number \n";
                                }
                            }


                            if ("".equals(message)) {

                                logger.info("Method call: pathgenerated");


                                CodeSource codeSource = Billgenerator.class.getProtectionDomain().getCodeSource();
                                File jarFile = new File(codeSource.getLocation().toURI().getPath());
                                String jarDir = jarFile.getParentFile().getPath();


                                /*NOTE: Creating Path Constraints for folder saving*/
                                String folderPath = jarDir + "\\payments";

                                /*NOTE: Creating Folder if it does not exist*/
                                File f1 = new File(folderPath);
                                f1.mkdir();

                                savePath = jarDir + "\\payments\\" + cuid + "_" + firstname + "_" + lastname + "_" + Dategenerator.getCurrentDatesimple().toString() + "_Payment.pdf";

                                /*NOTE: PDF Starts here*/
                                PdfWriter.getInstance(doc, new FileOutputStream(savePath));
                                doc.open();
                                Image img = Image.getInstance("logosmall.png");
                                doc.add(img);
                                doc.add(new Paragraph(Dategenerator.getCurrentDate().toString()));
                                doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                                doc.add(new Paragraph("Customer Name :" + firstname + "  " + lastname));
                                doc.add(new Paragraph("Payment value :  INR " + Double.parseDouble(txt_value.getText()) / 100));
                                doc.add(new Paragraph("Payment Type : Debit Card"));
                                doc.add(new Paragraph("Debit Card Number : **** **** **** " + txt_dc_number.substring(12)));
                                doc.add(new Paragraph("Thank You for the Payment"));
                                doc.close();


                                /*Note: The Debit Card Insert Queries are here to avoid static variables*/

                                logger.info("DB start");
                                String sql = ""
                                        + "INSERT INTO `payment` "
                                        + "            (`idpayment`, "
                                        + "             `bill_id`, "
                                        + "             `payment_date`, "
                                        + "             `payment_type`) "
                                        + "VALUES      (?, "
                                        + "             ?, "
                                        + "             ?, "
                                        + "             ?) ";
                                try {
                                    stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                                    stmt.setString(1, null);
                                    stmt.setString(2, billid);
                                    stmt.setString(3, Dategenerator.getCurrentDate().toString());
                                    stmt.setString(4, "2");
                                    stmt.executeUpdate();
                                    rs = stmt.getGeneratedKeys();
                                    rs.next();
                                    keys = rs.getString(1);


                                    String sql2 = ""
                                            + "INSERT INTO `debitcard` "
                                            + "            (`iddebitcard`, "
                                            + "             `payment_idpayment`, "
                                            + "             `debit_card_number`, "
                                            + "             `debit_card_cvv`, "
                                            + "             `debit_card_expiry_year`, "
                                            + "             `debit_card_expiry_date`, "
                                            + "             `debit_card_owner`, "
                                            + "             `debit_card_type`) "
                                            + "VALUES      (?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?, "
                                            + "             ?) ";

                                    stmt = conn.prepareStatement(sql2);
                                    stmt.setString(1, null);
                                    stmt.setString(2, keys);
                                    stmt.setString(3, AESrunner.AESencrypt(txt_dc_number));
                                    stmt.setString(4, AESrunner.AESencrypt(txt_dc_cvv));
                                    stmt.setString(5, txt_dc_year);
                                    stmt.setString(6, txt_dc_date);
                                    stmt.setString(7, AESrunner.AESencrypt(txt_dc_owner));
                                    stmt.setString(8, AESrunner.AESencrypt(combo_dc_type));
                                    stmt.executeUpdate();

                                    String sql3 = ""
                                            + "UPDATE `bill` "
                                            + "SET    `payment_idpayment` = ? "
                                            + "WHERE  `idbill` =? ";



                                    stmt = conn.prepareStatement(sql3);
                                    stmt.setString(1, keys);
                                    stmt.setString(2, billid);
                                    stmt.executeUpdate();


                                    logger.info("DB end");
                                    sendmail();
                                    JOptionPane.showMessageDialog(null, "Payment has been confirmed");
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
                                        JOptionPane.showMessageDialog(null, "Error user closing " + ex.getMessage());
                                        logger.fatal("Fatal error", ex);
                                    }

                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null, "Error at pay generator" + ex.getMessage());
                                    logger.fatal("Fatal error", ex);
                                }


                            } else {

                                JOptionPane.showMessageDialog(null, message);
                                logger.error("Error message : " + message);
                                message = "";
                            }

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Exception Generated : " + ex.getMessage());
                            logger.fatal("Fatal error", ex);
                        }
                    }


                    if (combo_payment.getSelectedItem().toString().equals("Cash on Delivery")) {
                        try {
                            logger.info("Method call: cashondelivery");
                            CodeSource codeSource = Billgenerator.class.getProtectionDomain().getCodeSource();
                            File jarFile = new File(codeSource.getLocation().toURI().getPath());
                            String jarDir = jarFile.getParentFile().getPath();


                            /*NOTE: Creating Path Constraints for folder saving*/
                            String folderPath = jarDir + "\\payments";

                            /*NOTE: Creating Folder if it does not exist*/
                            File f1 = new File(folderPath);
                            f1.mkdir();

                            savePath = jarDir + "\\payments\\" + cuid + "_" + firstname + "_" + lastname + "_" + Dategenerator.getCurrentDatesimple().toString() + "_Payment.pdf";

                            /*NOTE: PDF Starts here*/
                            PdfWriter.getInstance(doc, new FileOutputStream(savePath));
                            doc.open();
                            Image img = Image.getInstance("logosmall.png");
                            doc.add(img);
                            doc.add(new Paragraph(Dategenerator.getCurrentDate().toString()));
                            doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                            doc.add(new Paragraph("Customer Name :" + firstname + "  " + lastname));
                            doc.add(new Paragraph("Payment value :  INR " + Double.parseDouble(txt_value.getText()) / 100));
                            doc.add(new Paragraph("Payment Type : Cash on Delivery"));
                            doc.add(new Paragraph("Thank You for the Payment"));
                            doc.close();


                            String sql = ""
                                    + "INSERT INTO `payment` "
                                    + "            (`idpayment`, "
                                    + "             `bill_id`, "
                                    + "             `payment_date`, "
                                    + "             `payment_type`) "
                                    + "VALUES      (?, "
                                    + "             ?, "
                                    + "             ?, "
                                    + "             ?) ";
                            try {
                                stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

                                stmt.setString(1, null);
                                stmt.setString(2, billid);
                                stmt.setString(3, Dategenerator.getCurrentDate().toString());
                                stmt.setString(4, "3");
                                stmt.executeUpdate();
                                rs = stmt.getGeneratedKeys();
                                rs.next();
                                keys = rs.getString(1);

                                logger.info("DB start");
                                String sql2 = ""
                                        + "INSERT INTO `home` "
                                        + "            (`idhome`, "
                                        + "             `payment_idpayment`, "
                                        + "             `address_id`) "
                                        + "VALUES      (?, "
                                        + "             ?, "
                                        + "             ?) ";


                                stmt = conn.prepareStatement(sql2);
                                stmt.setString(1, null);
                                stmt.setString(2, keys);
                                stmt.setString(3, adid);
                                stmt.executeUpdate();

                                try {
                                    String sql3 = ""
                                            + "UPDATE `bill` "
                                            + "SET    `payment_idpayment` = ? "
                                            + "WHERE  `idbill` =? ";



                                    stmt = conn.prepareStatement(sql3);
                                    stmt.setString(1, keys);
                                    stmt.setString(2, billid);
                                    stmt.executeUpdate();

                                    logger.info("DB end");
                                    sendmail();
                                    JOptionPane.showMessageDialog(null, "Payment has been confirmed");
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
                                        JOptionPane.showMessageDialog(null, "Error user closing " + ex.getMessage());
                                        logger.fatal("Fatal error", ex);
                                    }
                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null, "Error at Bill Insertor" + ex.getMessage());
                                    logger.fatal("Fatal error", ex);
                                }


                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null, "Error at pay generator" + ex.getMessage());
                                logger.fatal("Fatal error", ex);
                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "Exception Generated : " + ex.getMessage());
                            logger.fatal("Fatal error", ex);
                        }
                    }

                } else {

                    JOptionPane.showMessageDialog(null, "Select a payment method");
                    logger.warn("Select payment method");
                }
            } else {

                JOptionPane.showMessageDialog(null, "Select a bill");
                logger.warn("Select a bill");
            }





        }




    }//GEN-LAST:event_button_acceptActionPerformed
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
            logger.info("message sent");

        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Error during mail sending" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }





    }
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
            JOptionPane.showMessageDialog(null, "Error user closing " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_cancelActionPerformed

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
                new PaymentManager().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private finalproj.frames.payment.CCPanel CCpanel;
    private finalproj.frames.payment.CODPanel CODpanel;
    private finalproj.frames.payment.DCPanel DCpanel;
    private javax.swing.JPanel bill_panel;
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_search;
    private javax.swing.JComboBox combo_bill;
    private javax.swing.JComboBox combo_payment;
    private javax.swing.JLabel date_label;
    private javax.swing.JPanel display_panel;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel out_label;
    private javax.swing.JLabel pay_label;
    private javax.swing.JPanel pay_panel;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_login;
    private javax.swing.JTextField txt_value;
    private javax.swing.JLabel val_label;
    // End of variables declaration//GEN-END:variables
}
