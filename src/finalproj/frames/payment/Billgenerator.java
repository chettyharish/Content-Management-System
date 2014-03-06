package finalproj.frames.payment;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
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

public class Billgenerator extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt2 = null;
    PreparedStatement stmt3 = null;
    PreparedStatement stmt4 = null;
    private boolean flag = false;
    private String cuid;
    private static double value;
    private static double valuewithtaxes;
    Document doc;
    private String firstname;
    private String lastname;
    Font boldFont;
    Phrase firstcolumn;
    Phrase secondcolumn;
    Phrase thirdcolumn;
    private String keys;
    private String Email;
    private String savePath;
    private static Logger logger;

    public Billgenerator() {
        logger = Logger.getLogger(Billgenerator.class.getName());
        logger.info("Initialization");
        initComponents();

        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        doc = new Document();
        boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
        firstcolumn = new Phrase("Usage Date and Time", boldFont);
        secondcolumn = new Phrase("Channel Name", boldFont);
        thirdcolumn = new Phrase("Channel Cost", boldFont);


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        select_panel = new javax.swing.JPanel();
        select_label = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        bill_panel = new javax.swing.JPanel();
        date_label = new javax.swing.JLabel();
        val_label = new javax.swing.JLabel();
        name_label = new javax.swing.JLabel();
        fam_label = new javax.swing.JLabel();
        txt_customername = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        txt_value = new javax.swing.JTextField();
        combo_family = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_accept = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Generate Bill");
        setUndecorated(true);
        setResizable(false);

        select_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        select_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        select_label.setText("Enter Login Name:");

        txt_search.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_search.setToolTipText("");

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
                .addGap(111, 111, 111)
                .addComponent(select_label)
                .addGap(18, 18, 18)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        select_panelLayout.setVerticalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_label)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_search))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        bill_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill Generation Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        date_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        date_label.setText("Bill Date:");

        val_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        val_label.setText("Bill Value:");

        name_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        name_label.setText("Customer Name:");

        fam_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fam_label.setText("Customer Family:");

        txt_customername.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_customername.setToolTipText("");

        txt_date.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_date.setToolTipText("");

        txt_value.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_value.setToolTipText("");

        combo_family.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout bill_panelLayout = new javax.swing.GroupLayout(bill_panel);
        bill_panel.setLayout(bill_panelLayout);
        bill_panelLayout.setHorizontalGroup(
            bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_panelLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name_label)
                    .addComponent(fam_label)
                    .addComponent(date_label)
                    .addComponent(val_label))
                .addGap(30, 30, 30)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_customername)
                    .addComponent(txt_date)
                    .addComponent(txt_value)
                    .addComponent(combo_family, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(202, 202, 202))
        );

        bill_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {date_label, fam_label, name_label, val_label});

        bill_panelLayout.setVerticalGroup(
            bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bill_panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name_label)
                    .addComponent(txt_customername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fam_label)
                    .addComponent(combo_family, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_label)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bill_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(val_label)
                    .addComponent(txt_value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        end_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generate Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_accept.setText("Accept");
        button_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_acceptActionPerformed(evt);
            }
        });

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
                .addGap(61, 61, 61)
                .addComponent(button_accept)
                .addGap(62, 62, 62)
                .addComponent(button_cancel)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(button_accept)
                .addComponent(button_cancel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bill_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bill_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        logger.info("Method call: search");
        try {

            value = 0;
            combo_family.removeAllItems();
            String sql = ""
                    + "SELECT * "
                    + "FROM   `customer` "
                    + "WHERE  login_login_name =? ";
            stmt = null;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txt_search.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User found \n Please verify the details ");
                flag = true;
                cuid = rs.getString("idCustomer");
                txt_customername.setText(rs.getString("first_name") + "  " + rs.getString("last_name"));
                firstname = rs.getString("first_name");
                lastname = rs.getString("last_name");
                txt_date.setText(Dategenerator.getCurrentDate().toString());
                Email = rs.getString("email");


                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `individual` "
                        + "WHERE  `customer_idcustomer` =? ";

                stmt = null;
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, cuid);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    String name = rs.getString("first_name");
                    combo_family.addItem(name);



                    String sql3 = ""
                            + "SELECT * "
                            + "FROM   `session` "
                            + "WHERE  `individual_idindividual` =? "
                            + "       AND `bill_idbill` IS NULL ";

                    stmt2 = conn.prepareStatement(sql3);
                    stmt2.setString(1, rs.getString("idIndividual"));
                    rs2 = stmt2.executeQuery();

                    while (rs2.next()) {


                        if (Dategenerator.returnminutessqlformat(rs2.getString("starttime"), rs2.getString("endtime")) > 2) {
                            String sql4 = ""
                                    + "SELECT * "
                                    + "FROM   `channel` "
                                    + "WHERE  `idchannel` =? ";


                            stmt3 = conn.prepareStatement(sql4);
                            stmt3.setString(1, rs2.getString("Channel_idChannel"));
                            rs3 = stmt3.executeQuery();

                            if (rs3.next()) {
                                value = value + Double.parseDouble(rs3.getString("channel_cost"));
                            }
                        }
                    }
                }
                String answer = Double.toString(value);

                txt_value.setText(answer);


                txt_customername.setEnabled(false);
                txt_date.setEnabled(false);
                txt_value.setEnabled(false);
                combo_family.setEnabled(false);




            } else {
                JOptionPane.showMessageDialog(null, "User not found ");
                logger.info("User not found");
                flag = false;
                txt_value.setText("");
                txt_customername.setText("");
                txt_date.setText("");
                txt_value.setText("");
                combo_family.removeAllItems();

                combo_family.insertItemAt("", 0);
                combo_family.setSelectedIndex(0);


            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Search " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }//GEN-LAST:event_button_searchActionPerformed

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
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Bill Creation", "Generate the Bill", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "Bill Not Created");
            logger.info("Change cancelled");
        } else {
            if (flag == false) {
                JOptionPane.showMessageDialog(null, "Search for a User first");
                logger.error("User not found");
            } else {

                try {
                    logger.info("Method call: pathgenerated");
                    CodeSource codeSource = Billgenerator.class.getProtectionDomain().getCodeSource();
                    File jarFile = new File(codeSource.getLocation().toURI().getPath());
                    String jarDir = jarFile.getParentFile().getPath();


                    /*NOTE: Creating Path Constraints for folder saving*/
                    String folderPath = jarDir + "\\bills";

                    /*NOTE: Creating Folder if it does not exist*/
                    File f1 = new File(folderPath);
                    f1.mkdir();

                    savePath = jarDir + "\\bills\\" + cuid + "_" + firstname + "_" + lastname + "_" + Dategenerator.getCurrentDatesimple().toString() + "_Bill.pdf";

                    /*NOTE: PDF Starts here*/
                    PdfWriter.getInstance(doc, new FileOutputStream(savePath));
                    doc.open();
                    Image img = Image.getInstance("logosmall.png");
                    doc.add(img);
                    doc.add(new Paragraph(Dategenerator.getCurrentDate().toString()));
                    doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                    doc.add(new Paragraph("Customer Name :" + firstname + "  " + lastname));

                    doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));
                    logger.info("DB start");
                    /*NOTE:Selecting Individuals using customer Id*/
                    String sql2 = ""
                            + "SELECT * "
                            + "FROM   `individual` "
                            + "WHERE  `customer_idcustomer` =? ";

                    stmt = null;
                    stmt = conn.prepareStatement(sql2);
                    stmt.setString(1, cuid);
                    rs = stmt.executeQuery();
                    doc.add(new Paragraph("FAMILY MEMBERS USAGE DETAILS"));
                    while (rs.next()) {

                        doc.add(Chunk.NEWLINE);

                        doc.add(new Paragraph(rs.getString("first_name") + " " + rs.getString("last_name")));
                        doc.add(new Paragraph("USAGE DETAILS"));
                        doc.add(Chunk.NEWLINE);
                        PdfPTable t = new PdfPTable(3);


                        t.addCell(firstcolumn);
                        t.addCell(secondcolumn);
                        t.addCell(thirdcolumn);

                        /*NOTE:Selecting Individuals Sessions*/

                        String sql3 = ""
                                + "SELECT * "
                                + "FROM   `session` "
                                + "WHERE  `individual_idindividual` =? "
                                + "       AND `bill_idbill` IS NULL ";

                        stmt2 = conn.prepareStatement(sql3);
                        stmt2.setString(1, rs.getString("idIndividual"));

                        rs2 = stmt2.executeQuery();



                        while (rs2.next()) {

                            if (Dategenerator.returnminutessqlformat(rs2.getString("starttime"), rs2.getString("endtime")) > 2) {
                                /*NOTE:Selecting Channel Names*/
                                String sql4 = ""
                                        + "SELECT * "
                                        + "FROM   `channel` "
                                        + "WHERE  `idchannel` =? ";


                                stmt3 = conn.prepareStatement(sql4);
                                stmt3.setString(1, rs2.getString("Channel_idChannel"));
                                rs3 = stmt3.executeQuery();

                                if (rs3.next()) {
                                    t.addCell(rs2.getString("starttime"));
                                    t.addCell(rs3.getString("channel_name"));
                                    t.addCell(rs3.getString("channel_cost"));
                                }

                            }


                        }
                        doc.add(t);
                    }
                    doc.add(Chunk.NEWLINE);
                    doc.add(new Paragraph("----------------------------------------------------------------------------------------------------------------------------------"));

                    doc.add(new Paragraph("Bill Value :  INR " + value / 100));
                    doc.add(new Paragraph("Taxes :  INR " + (value * 10 / 100) / 100));
                    valuewithtaxes = Math.round(value + value * 10 / 100);
                    doc.add(new Paragraph("Total Bill Value :  INR " + valuewithtaxes / 100));
                    doc.close();


                    /*NOTE:Inserting in bills*/
                    String sql6 = ""
                            + "INSERT INTO `bill` "
                            + "            (`customer_idcustomer`, "
                            + "             `payment_idpayment`, "
                            + "             `bill_date`, "
                            + "             `bill_val`) "
                            + "VALUES      (?, "
                            + "             ?, "
                            + "             ?, "
                            + "             ?) ";

                    stmt = conn.prepareStatement(sql6, Statement.RETURN_GENERATED_KEYS);
                    stmt.setString(1, cuid);
                    stmt.setString(2, null);
                    stmt.setString(3, Dategenerator.getCurrentDate().toString());
                    stmt.setString(4, Double.toString(valuewithtaxes));
                    stmt.executeUpdate();

                    /*NOTE: Getting the key of newly inserted entry in address*/
                    rs = stmt.getGeneratedKeys();
                    rs.next();
                    keys = rs.getString(1);


                    if (rs2.next()) {
                        String sql5 = ""
                                + "UPDATE `session` "
                                + "SET    `bill_idbill` = ? "
                                + "WHERE  `individual_idindividual` =? ";

                        stmt4 = conn.prepareStatement(sql5);
                        stmt4.setString(1, keys);/*NOTE: Had "a" verify this section*/
                        stmt4.setString(2, rs2.getString("Individual_idIndividual"));
                        stmt4.executeUpdate();
                    }


                    sql2 = ""
                            + "SELECT * "
                            + "FROM   `individual` "
                            + "WHERE  `customer_idcustomer` =? ";

                    stmt = null;
                    stmt = conn.prepareStatement(sql2);
                    stmt.setString(1, cuid);
                    rs = stmt.executeQuery();

                    while (rs.next()) {
                        String sql3 = ""
                                + "SELECT * "
                                + "FROM   `session` "
                                + "WHERE  `individual_idindividual` =? "
                                + "       AND `bill_idbill` IS NULL ";

                        stmt2 = conn.prepareStatement(sql3);
                        stmt2.setString(1, rs.getString("idIndividual"));
                        rs2 = stmt2.executeQuery();

                        while (rs2.next()) {

                            String sql5 = ""
                                    + "UPDATE `session` "
                                    + "SET    `bill_idbill` = ? "
                                    + "WHERE  `individual_idindividual` =? ";

                            stmt4 = conn.prepareStatement(sql5);
                            stmt4.setString(1, keys);
                            stmt4.setString(2, rs2.getString("Individual_idIndividual"));
                            stmt4.executeUpdate();
                        }
                    }

                    logger.info("DB end");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error at creating PDF " + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }

                JOptionPane.showMessageDialog(null, "Bill Generated and a PDF has been saved \nThe bill was sent to the customers registered email id");
                try {
                    logger.info("Exiting");
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (rs != null) {
                        rs.close();
                    }

                    sendmail();

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error after inserting eveything " + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }


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
            message.setSubject("Your Bill for H.A.R.K. DTH Services " + firstname + " " + lastname + "  Dated: " + Dategenerator.getCurrentDatesimple().toString());
            message.setFrom(new InternetAddress("harkdth@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Email));


            /*NOTE: Body is for stuff and part is for joining multiple parts together*/
            MimeBodyPart body = new MimeBodyPart();

            body.setText("Attached PDF contains details about your bill\n Please download and pay the bill.");
            Multipart part = new MimeMultipart();
            part.addBodyPart(body);



            body = new MimeBodyPart();

            DataSource source = new FileDataSource(savePath);
            body.setDataHandler(new DataHandler(source));
            body.setFileName(firstname + "_" + lastname + "_" + "Bill.pdf");

            part.addBodyPart(body);
            message.setContent(part);

            Transport.send(message);
            logger.info("message sent");
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Error during mail sending" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


        this.dispose();
        new CMmain().setVisible(true);


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
                new Billgenerator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bill_panel;
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_search;
    private javax.swing.JComboBox combo_family;
    private javax.swing.JLabel date_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fam_label;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel select_label;
    private javax.swing.JPanel select_panel;
    private javax.swing.JTextField txt_customername;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_value;
    private javax.swing.JLabel val_label;
    // End of variables declaration//GEN-END:variables
}
