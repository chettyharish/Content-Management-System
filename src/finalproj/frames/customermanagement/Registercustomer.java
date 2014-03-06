package finalproj.frames.customermanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.Passwordgenerator;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.AESrunner;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.log4j.Logger;

public class Registercustomer extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    boolean checker = false;
    /*NOTE:Private strings used inside the form*/
    private String firstname;
    private String lastname;
    private String DOB;
    private String Gender = "";
    private String Family = "";
    private String Contact;
    private String Email;
    private String Country;
    private String City;
    private String Address1;
    private String Address2;
    private String Zipcode;
    private String loginname;
    private String pass1;
    private String pass2;
    private String message = "";
    private String keys = ""; /*Used for generated keys*/

    private static Logger logger;

    public Registercustomer() {
        logger = Logger.getLogger(Registercustomer.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcountry();


        /*NOTE: Generating Random Passwords*/
        pass1 = Passwordgenerator.returnPassword();
        pwd_register_pass1.setText(pass1);
        pwd_register_pass2.setText(pass1);
        pwd_register_pass1.setEditable(false);
        pwd_register_pass2.setEditable(false);

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
                combo_register_country.addItem(name);
            }
            combo_register_country.insertItemAt("", 0);
            combo_register_country.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcountry  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_gender = new javax.swing.ButtonGroup();
        group_family = new javax.swing.ButtonGroup();
        pers_panel = new javax.swing.JPanel();
        fname_label = new javax.swing.JLabel();
        lame_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        gend_label = new javax.swing.JLabel();
        txt_register_fname = new javax.swing.JTextField();
        txt_customer_lname = new javax.swing.JTextField();
        radio_register_male = new javax.swing.JRadioButton();
        radio_register_female = new javax.swing.JRadioButton();
        date_register_dob = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        radio_register_familyyes = new javax.swing.JRadioButton();
        radio_register_familyno = new javax.swing.JRadioButton();
        con_panel = new javax.swing.JPanel();
        con_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        txt_register_contact = new javax.swing.JTextField();
        txt_register_email = new javax.swing.JTextField();
        add_panel = new javax.swing.JPanel();
        coun_label = new javax.swing.JLabel();
        add1_label = new javax.swing.JLabel();
        add2_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        zip_label = new javax.swing.JLabel();
        combo_register_country = new javax.swing.JComboBox();
        combo_register_city = new javax.swing.JComboBox();
        txt_register_add1 = new javax.swing.JTextField();
        txt_register_add2 = new javax.swing.JTextField();
        txt_register_zipcode = new javax.swing.JTextField();
        end_panel = new javax.swing.JPanel();
        button_register_accept = new javax.swing.JButton();
        button_register_cancel = new javax.swing.JButton();
        acc_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        pass1_label = new javax.swing.JLabel();
        txt_register_login = new javax.swing.JTextField();
        button_register_check = new javax.swing.JButton();
        pwd_register_pass1 = new javax.swing.JPasswordField();
        button_register_edit = new javax.swing.JButton();
        pass2_label = new javax.swing.JLabel();
        pwd_register_pass2 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register Customer");
        setUndecorated(true);
        setResizable(false);

        pers_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fname_label.setText("First Name:");

        lame_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lame_label.setText("Last Name:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        gend_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        gend_label.setText("Gender:");

        txt_register_fname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_customer_lname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        group_gender.add(radio_register_male);
        radio_register_male.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_register_male.setText("Male");
        radio_register_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_register_maleActionPerformed(evt);
            }
        });

        group_gender.add(radio_register_female);
        radio_register_female.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_register_female.setText("Female");
        radio_register_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_register_femaleActionPerformed(evt);
            }
        });

        date_register_dob.setDateFormatString("yyyy-MM-dd");
        date_register_dob.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setText("Part of Family:");

        group_family.add(radio_register_familyyes);
        radio_register_familyyes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_register_familyyes.setText("Yes");
        radio_register_familyyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_register_familyyesActionPerformed(evt);
            }
        });

        group_family.add(radio_register_familyno);
        radio_register_familyno.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_register_familyno.setText("No");
        radio_register_familyno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_register_familynoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pers_panelLayout = new javax.swing.GroupLayout(pers_panel);
        pers_panel.setLayout(pers_panelLayout);
        pers_panelLayout.setHorizontalGroup(
            pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pers_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pers_panelLayout.createSequentialGroup()
                        .addComponent(lame_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_customer_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pers_panelLayout.createSequentialGroup()
                        .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pers_panelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radio_register_familyyes))
                            .addGroup(pers_panelLayout.createSequentialGroup()
                                .addComponent(gend_label)
                                .addGap(28, 28, 28)
                                .addComponent(radio_register_male)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_register_female)
                            .addComponent(radio_register_familyno)))
                    .addGroup(pers_panelLayout.createSequentialGroup()
                        .addComponent(fname_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_register_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144)
                        .addComponent(dob_label)
                        .addGap(18, 18, 18)
                        .addComponent(date_register_dob, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pers_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob_label, fname_label, gend_label, lame_label});

        pers_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radio_register_female, radio_register_male});

        pers_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_customer_lname, txt_register_fname});

        pers_panelLayout.setVerticalGroup(
            pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pers_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fname_label)
                        .addComponent(txt_register_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dob_label))
                    .addComponent(date_register_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lame_label)
                    .addComponent(txt_customer_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gend_label)
                    .addComponent(radio_register_male)
                    .addComponent(radio_register_female))
                .addGap(18, 18, 18)
                .addGroup(pers_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(radio_register_familyyes)
                    .addComponent(radio_register_familyno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pers_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dob_label, fname_label, gend_label, lame_label});

        pers_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {radio_register_female, radio_register_male});

        pers_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_customer_lname, txt_register_fname});

        con_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        con_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        con_label.setText("Contact Number:");

        email_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email_label.setText("Email Address:");

        txt_register_contact.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_register_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout con_panelLayout = new javax.swing.GroupLayout(con_panel);
        con_panel.setLayout(con_panelLayout);
        con_panelLayout.setHorizontalGroup(
            con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(con_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(con_label)
                    .addComponent(email_label))
                .addGap(18, 18, 18)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_register_contact)
                    .addComponent(txt_register_email, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        con_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_register_contact, txt_register_email});

        con_panelLayout.setVerticalGroup(
            con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(con_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(con_label)
                    .addComponent(txt_register_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(txt_register_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        con_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_register_contact, txt_register_email});

        add_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        coun_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        coun_label.setText("Country:");

        add1_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add1_label.setText("Address 1:");

        add2_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add2_label.setText("Address 2:");

        city_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        city_label.setText("City:");

        zip_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        zip_label.setText("ZipCode:");

        combo_register_country.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_register_country.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_register_countryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        combo_register_city.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_register_add1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_register_add2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_register_zipcode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout add_panelLayout = new javax.swing.GroupLayout(add_panel);
        add_panel.setLayout(add_panelLayout);
        add_panelLayout.setHorizontalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coun_label)
                    .addComponent(add1_label)
                    .addComponent(add2_label)
                    .addComponent(zip_label))
                .addGap(74, 74, 74)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_register_country, 0, 222, Short.MAX_VALUE)
                    .addComponent(txt_register_add1)
                    .addComponent(txt_register_add2)
                    .addComponent(txt_register_zipcode))
                .addGap(83, 83, 83)
                .addComponent(city_label)
                .addGap(91, 91, 91)
                .addComponent(combo_register_city, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, zip_label});

        add_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_register_city, combo_register_country, txt_register_add1, txt_register_add2, txt_register_zipcode});

        add_panelLayout.setVerticalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coun_label)
                    .addComponent(combo_register_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_label)
                    .addComponent(combo_register_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1_label)
                    .addComponent(txt_register_add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2_label)
                    .addComponent(txt_register_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip_label)
                    .addComponent(txt_register_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, zip_label});

        add_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_register_city, combo_register_country, txt_register_add1, txt_register_add2, txt_register_zipcode});

        button_register_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_register_accept.setText("Confirm");
        button_register_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register_acceptActionPerformed(evt);
            }
        });

        button_register_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_register_cancel.setText("Cancel");
        button_register_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_register_accept)
                .addGap(86, 86, 86)
                .addComponent(button_register_cancel)
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_register_accept, button_register_cancel});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_register_accept)
                    .addComponent(button_register_cancel))
                .addContainerGap())
        );

        acc_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Requirements", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Prefered Login Name:");

        pass1_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pass1_label.setText("Password:");

        txt_register_login.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_register_check.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        button_register_check.setText("Check");
        button_register_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register_checkActionPerformed(evt);
            }
        });

        pwd_register_pass1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_register_edit.setText("Edit");
        button_register_edit.setEnabled(false);
        button_register_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_register_editActionPerformed(evt);
            }
        });

        pass2_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pass2_label.setText("Re-enter Password:");

        pwd_register_pass2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout acc_panelLayout = new javax.swing.GroupLayout(acc_panel);
        acc_panel.setLayout(acc_panelLayout);
        acc_panelLayout.setHorizontalGroup(
            acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acc_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_label)
                    .addComponent(pass1_label)
                    .addComponent(pass2_label))
                .addGap(18, 18, 18)
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pwd_register_pass1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_register_login)
                    .addComponent(pwd_register_pass2, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_register_check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_register_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        acc_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {login_label, pass1_label});

        acc_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {pwd_register_pass1, pwd_register_pass2, txt_register_login});

        acc_panelLayout.setVerticalGroup(
            acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acc_panelLayout.createSequentialGroup()
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acc_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(login_label)
                            .addComponent(txt_register_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass1_label)
                            .addComponent(pwd_register_pass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass2_label)
                            .addComponent(pwd_register_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(acc_panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(button_register_check)
                        .addGap(18, 18, 18)
                        .addComponent(button_register_edit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        acc_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {login_label, pass1_label});

        acc_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {pwd_register_pass1, pwd_register_pass2, txt_register_login});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(con_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(acc_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pers_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pers_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(con_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acc_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_register_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register_checkActionPerformed
        logger.info("Method call: check");

        try {
            loginname = txt_register_login.getText();
            pass1 = pwd_register_pass1.getText();
            pass2 = pwd_register_pass2.getText();
            String message = "";

            String sql = ""
                    + "SELECT * "
                    + "FROM   `login` "
                    + "WHERE  `login_name` =? ";

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, loginname);

            rs = stmt.executeQuery();
            /*NOTE:Checking the loginname field */

            if ("".equals(loginname)) {
                message = message + "Login name is empty  \n";
            } else {
                if (!LengthVerifier.lengthString(loginname)) {

                    message = message + "Login Name cannot be longer than 40 characters \n";
                } else {
                    if (rs.next()) {
                        message = message + " Login Name already exists, please select new login name   \n";
                    } else {
                        if (!TestPattern.textpattern(loginname)) {
                            message = message + "Only Alphanumeric keys allowed in login \n";
                        }
                    }

                }
            }

            /*NOTE:Checking the password fields*/
            if ("".equals(pass1)) {
                message = message + "Password field 1 is empty \n";
            } else {
                if ("".equals(pass2)) {
                    message = message + "Password field 2 is empty  \n";
                } else {
                    if (!(pass1.equals(pass2))) {
                        message = message + " Passwords are not the same   \n";
                    } else {
                        if (!LengthVerifier.lengthString(pass1)) {
                            message = message + "Password cannot be longer than 40 characters \n";

                        } else {
                            if (!TestPattern.textpattern(pass1)) {
                                message = message + "Only Alphanumeric keys allowed in password \n";
                            }
                        }
                    }
                }
            }



            /*NOTE:Pattern Regex from test pattern used here*/




            if (!"".equals(message)) {
                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";
            } else {

                JOptionPane.showMessageDialog(null, "Information has been confirmed and is now not Editable \n Press Edit if you want to edit again");
                logger.info("Confirmed Info");
                checker = true;
                txt_register_login.setEnabled(false);
                button_register_check.setEnabled(false);
                button_register_edit.setEnabled(true);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at registercustomer" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


    }//GEN-LAST:event_button_register_checkActionPerformed
    private void radio_register_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_register_maleActionPerformed
        Gender = "m";
    }//GEN-LAST:event_radio_register_maleActionPerformed

    private void radio_register_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_register_femaleActionPerformed
        Gender = "f";
    }//GEN-LAST:event_radio_register_femaleActionPerformed

    private void radio_register_familyyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_register_familyyesActionPerformed
        Family = "y";
    }//GEN-LAST:event_radio_register_familyyesActionPerformed

    private void radio_register_familynoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_register_familynoActionPerformed
        Family = "n";
    }//GEN-LAST:event_radio_register_familynoActionPerformed

    private void button_register_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register_editActionPerformed
        logger.info("Method call: Edit");
        JOptionPane.showMessageDialog(null, "The information is now Editable");

        checker = false;
        txt_register_login.setEnabled(true);
        txt_register_login.setEditable(true);
        button_register_check.setEnabled(true);
        button_register_edit.setEnabled(false);
    }//GEN-LAST:event_button_register_editActionPerformed

    private void button_register_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register_cancelActionPerformed
        /*NOTE: Closes everything and shuts down*/
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
            JOptionPane.showMessageDialog(null, "Closed by user " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


    }//GEN-LAST:event_button_register_cancelActionPerformed

    private void button_register_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_register_acceptActionPerformed



        logger.info("Method call: Accept");



        firstname = txt_register_fname.getText();
        lastname = txt_customer_lname.getText();
        DOB = ((JTextField) date_register_dob.getDateEditor().getUiComponent()).getText();

        Contact = txt_register_contact.getText();
        Email = txt_register_email.getText();
        Country = (String) combo_register_country.getSelectedItem();
        City = (String) combo_register_city.getSelectedItem();
        Address1 = txt_register_add1.getText();
        Address2 = txt_register_add2.getText();
        Zipcode = txt_register_zipcode.getText();



        if (checker == true) {

            if ("".equals(firstname)) {
                message = message + "First Name cannot be empty \n";
            } else {
                if (!LengthVerifier.lengthString(firstname)) {
                    message = message + "First Name cannot be longer than 40 characters \n";
                } else {
                    if (!TestPattern.textpattern(firstname)) {

                        message = message + "First Name must be alphanumeric \n";
                    }
                }
            }

            /*NOTE:For Verifying Last Name*/
            if ("".equals(lastname)) {
                message = message + "Last Name cannot be empty \n";
            } else {
                if (!LengthVerifier.lengthString(lastname)) {
                    message = message + "Last Name cannot be longer than 40 characters \n";
                } else {
                    if (!TestPattern.textpattern(lastname)) {

                        message = message + "Last Name must be alphanumeric \n";
                    }
                }
            }

            /*NOTE: For Verifying Blank Gender*/
            if ("".equals(Gender)) {
                {
                    message = message + "Gender must be selected \n";
                }
            }

            if ("".equals(Family)) {
                {
                    message = message + "Family must be selected \n";
                }
            }


            /*NOTE:For Verifying DOB*/

            if ("".equals(DOB)) {
                message = message + "DOB cannot be empty \n";
            }

            /*NOTE:For Verifying Contact*/
            if ("".equals(Contact)) {
                message = message + "Please provide a contact number \n";
            } else {
                if (!LengthVerifier.lengthInteger(Contact)) {
                    message = message + "Contact cannot be longer than 10 characters \n";
                } else {
                    if (!TestPattern.numberpattern(Contact)) {

                        message = message + "Contact number must be numeric \n";
                    }
                }
            }

            if ("".equals(Email)) {
                message = message + "Email  cannot be empty \n";
            } else {
                if (!LengthVerifier.lengthString(Email)) {
                    message = message + "Email cannot be longer than 40 characters \n";
                } else {
                    if (!TestPattern.emailpattern(Email)) {

                        message = message + "Email  is invalid  \n";
                    }
                }
            }

            if ("".equals(Country)) {
                message = message + "Country Name cannot be empty \n";

            }



            if ("".equals(City)) {
                message = message + "City Name cannot be empty \n";

            }


            if ("".equals(Address1)) {
                message = message + "Address1 cannot be empty \n";
            } else {
                if (!LengthVerifier.lengthString(Address1)) {
                    message = message + "Address1 cannot be longer than 40 characters \n";
                }
            }

            if ("".equals(Address2)) {
                message = message + "Address2 cannot be empty \n";
            } else {
                if (!LengthVerifier.lengthString(Address2)) {
                    message = message + "Address2 cannot be longer than 40 characters \n";
                }
            }

            if ("".equals(Zipcode)) {
                message = message + "Please provide a Zipcode \n";
            } else {
                if (!LengthVerifier.lengthInteger(Zipcode)) {
                    message = message + "Zipcode cannot be longer than 10 characters \n";
                } else {
                    if (!TestPattern.numberpattern(Zipcode)) {

                        message = message + "Zipcode must be numeric \n";
                    }
                }
            }

            /*NOTE: Blank message denotes all entries are correct*/

            if ("".equals(message)) {
                logger.info("Method call: insertDB");
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please submit the check option first in the account requirements section");
            logger.error("Error message Check Missing");
        }



    }//GEN-LAST:event_button_register_acceptActionPerformed

    private void insertDB() {
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Addition", "Add Customer", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Added");
            logger.info("Change cancelled");
        } else {
            logger.info("DB start");
            stmt = null;
            rs = null;

            /*NOTE:Getting id of selected city to insert in Address field*/

            String sql = ""
                    + "SELECT `idcity` "
                    + "FROM   `city` "
                    + "WHERE  `city_name` =? ";
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, combo_register_city.getSelectedItem().toString());
                rs = stmt.executeQuery();
                rs.next();


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during idcity select query 1" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }



            /*NOTE: Inserting the table of Address field*/

            String sql2 = ""
                    + "INSERT INTO `address` "
                    + "            (`idaddress`, "
                    + "             `city_idcity`, "
                    + "             `address1`, "
                    + "             `address2`, "
                    + "             `zipcode`) "
                    + "VALUES      (?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?) ";

            stmt = null;
            try {
                stmt = conn.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, null);
                stmt.setInt(2, rs.getInt("idCity"));
                stmt.setString(3, Address1);
                stmt.setString(4, Address2);
                stmt.setString(5, Zipcode);

                stmt.executeUpdate();


                /*NOTE: Getting the key of newly inserted entry in address*/
                rs = stmt.getGeneratedKeys();
                rs.next();
                keys = rs.getString(1);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during first address insert query 1" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }


            /*NOTE: Inserting into login table*/
            String sql3 = ""
                    + "INSERT INTO `login` "
                    + "            (`login_name`, "
                    + "             `login_password`) "
                    + "VALUES      (?, "
                    + "             ?) ";

            stmt = null;

            try {
                stmt = conn.prepareStatement(sql3);
                stmt.setString(1, loginname);
                stmt.setString(2, AESrunner.AESencrypt(pass1));

                stmt.executeUpdate();



            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error during login insert" + ex.getMessage());
                logger.fatal("Fatal error", ex);

            }


            /*NOTE: Inserting the table of Customers*/

            String sql4 = ""
                    + "INSERT INTO `customer` "
                    + "            (`idcustomer`, "
                    + "             `address_idaddress`, "
                    + "             `login_login_name`, "
                    + "             `first_name`, "
                    + "             `last_name`, "
                    + "             `contact_no`, "
                    + "             `email`, "
                    + "             `create_date`, "
                    + "             `last_update`, "
                    + "             `gender`, "
                    + "             `dob`) "
                    + "VALUES      (?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?) ";


            stmt = null;

            try {
                stmt = conn.prepareStatement(sql4, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, null);
                stmt.setString(2, keys);
                stmt.setString(3, loginname);
                stmt.setString(4, firstname);
                stmt.setString(5, lastname);
                stmt.setString(6, Contact);
                stmt.setString(7, Email);
                stmt.setString(8, Dategenerator.getCurrentDate());
                stmt.setString(9, Dategenerator.getCurrentDate());
                stmt.setString(10, Gender);
                stmt.setString(11, DOB);

                stmt.executeUpdate();

                /*NOTE: Getting the key of newly inserted entry in customers*/
                rs = stmt.getGeneratedKeys();
                rs.next();
                keys = rs.getString(1);


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during customer insert" + ex.getMessage());
                logger.fatal("Fatal error", ex);

            }


            if ("y".equals(Family)) {


                String sql5 = ""
                        + "INSERT INTO `individual` "
                        + "            (`idindividual`, "
                        + "             `customer_idcustomer`, "
                        + "             `first_name`, "
                        + "             `last_name`, "
                        + "             `dob`, "
                        + "             `gender`, "
                        + "             `age`) "
                        + "VALUES      (?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?) ";



                stmt = null;
                try {
                    stmt = conn.prepareStatement(sql5);
                    stmt.setString(1, null);
                    stmt.setString(2, keys);
                    stmt.setString(3, firstname);
                    stmt.setString(4, lastname);
                    stmt.setString(5, DOB);
                    stmt.setString(6, Gender);
                    stmt.setInt(7, Dategenerator.returnYears(DOB));
                    stmt.executeUpdate();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error during individual insert" + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }
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


                sendmail();


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error after inserting everything " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

        }



    }

    private void sendmail() {
        logger.info("Method call: Sendmail");
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
        logger.info("Mail Authenticated");

        try {
            Message message = new MimeMessage(session);
            message.setSubject("Welcome To H.A.R.K. DTH  " + firstname + " " + lastname);
            message.setFrom(new InternetAddress("harkdth@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(Email));


            message.setText("Welcome to HARK DTH \n Please take a record of your login name and password \n"
                    + "Login Name:  " + loginname + "\n"
                    + "Password:  " + pass1 + "\n"
                    + "Please contact customer service for any other assistance. ");


            Transport.send(message);
            logger.info("Message sent");

        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, "Error during mail sending. Connection Not Available");
            logger.fatal("Fatal error", ex);
        }


        this.dispose();
        new CMmain().setVisible(true);


    }

    private void combo_register_countryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_register_countryPopupMenuWillBecomeInvisible
        logger.info("Method call:country");
        combo_register_city.removeAllItems();/*NOTE:Flushing combobox for new entry*/
        try {
            /*NOTE:Will fill the city list based on the country selected*/
            String tmp = (String) combo_register_country.getSelectedItem();

            String sql = ""
                    + "SELECT city.city_name "
                    + "FROM   city "
                    + "       INNER JOIN country "
                    + "               ON city.country_idcountry = country.idcountry "
                    + "WHERE  country.country_name = ? "
                    + "ORDER  BY city.city_name ";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, tmp);
            rs = stmt.executeQuery();

            /*NOTE:Combo box filling*/
            while (rs.next()) {
                String name = rs.getString("city_name");
                combo_register_city.addItem(name);
            }
            combo_register_city.insertItemAt("", 0);
            combo_register_city.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at country filling city" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


    }//GEN-LAST:event_combo_register_countryPopupMenuWillBecomeInvisible

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
                new Registercustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acc_panel;
    private javax.swing.JLabel add1_label;
    private javax.swing.JLabel add2_label;
    private javax.swing.JPanel add_panel;
    private javax.swing.JButton button_register_accept;
    private javax.swing.JButton button_register_cancel;
    private javax.swing.JButton button_register_check;
    private javax.swing.JButton button_register_edit;
    private javax.swing.JLabel city_label;
    private javax.swing.JComboBox combo_register_city;
    private javax.swing.JComboBox combo_register_country;
    private javax.swing.JLabel con_label;
    private javax.swing.JPanel con_panel;
    private javax.swing.JLabel coun_label;
    private com.toedter.calendar.JDateChooser date_register_dob;
    private javax.swing.JLabel dob_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fname_label;
    private javax.swing.JLabel gend_label;
    private javax.swing.ButtonGroup group_family;
    private javax.swing.ButtonGroup group_gender;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lame_label;
    private javax.swing.JLabel login_label;
    private javax.swing.JLabel pass1_label;
    private javax.swing.JLabel pass2_label;
    private javax.swing.JPanel pers_panel;
    private javax.swing.JPasswordField pwd_register_pass1;
    private javax.swing.JPasswordField pwd_register_pass2;
    private javax.swing.JRadioButton radio_register_familyno;
    private javax.swing.JRadioButton radio_register_familyyes;
    private javax.swing.JRadioButton radio_register_female;
    private javax.swing.JRadioButton radio_register_male;
    private javax.swing.JTextField txt_customer_lname;
    private javax.swing.JTextField txt_register_add1;
    private javax.swing.JTextField txt_register_add2;
    private javax.swing.JTextField txt_register_contact;
    private javax.swing.JTextField txt_register_email;
    private javax.swing.JTextField txt_register_fname;
    private javax.swing.JTextField txt_register_login;
    private javax.swing.JTextField txt_register_zipcode;
    private javax.swing.JLabel zip_label;
    // End of variables declaration//GEN-END:variables
}
