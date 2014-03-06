
package finalproj.frames.staffmanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.AESrunner;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.SMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.log4j.Logger;


public class Registerstaff extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    boolean checker = false;

    /*NOTE:Private strings used inside the form*/
    private String firstname;
    private String lastname;
    private String DOB;
    private String Gender = "";
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
    private String level;
    private String message = "";
    private static Logger logger;



    public Registerstaff() {
        logger = Logger.getLogger(Registerstaff.class.getName());
        logger.info("Initialization");
        initComponents();

        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcountry();

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_staff_gender = new javax.swing.ButtonGroup();
        personal_panel = new javax.swing.JPanel();
        fn_label = new javax.swing.JLabel();
        ln_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        gen_label = new javax.swing.JLabel();
        txt_staff_fname = new javax.swing.JTextField();
        txt_staff_lname = new javax.swing.JTextField();
        date_staff_dob = new com.toedter.calendar.JDateChooser();
        radio_staff_male = new javax.swing.JRadioButton();
        radio_staff_female = new javax.swing.JRadioButton();
        con_panel = new javax.swing.JPanel();
        cn_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        txt_staff_contact = new javax.swing.JTextField();
        txt_staff_email = new javax.swing.JTextField();
        add_panel = new javax.swing.JPanel();
        coun_label = new javax.swing.JLabel();
        add1_label = new javax.swing.JLabel();
        add2_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        zip_label = new javax.swing.JLabel();
        txt_staff_add1 = new javax.swing.JTextField();
        txt_staff_add2 = new javax.swing.JTextField();
        txt_staff_zipcode = new javax.swing.JTextField();
        combo_staff_city = new javax.swing.JComboBox();
        combo_staff_country = new javax.swing.JComboBox();
        acc_panel = new javax.swing.JPanel();
        log_label = new javax.swing.JLabel();
        pass1_label = new javax.swing.JLabel();
        level_label = new javax.swing.JLabel();
        txt_staff_login = new javax.swing.JTextField();
        button_check = new javax.swing.JButton();
        password_staff_first = new javax.swing.JPasswordField();
        re_label = new javax.swing.JLabel();
        password_staff_second = new javax.swing.JPasswordField();
        button_edit = new javax.swing.JButton();
        combo_staff_level = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_accept = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register Staff");
        setUndecorated(true);
        setResizable(false);

        personal_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fn_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fn_label.setText("First Name:");

        ln_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ln_label.setText("Last Name:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        gen_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        gen_label.setText("Gender:");

        txt_staff_fname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staff_lname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        date_staff_dob.setDateFormatString("yyyy-MM-dd");
        date_staff_dob.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        group_staff_gender.add(radio_staff_male);
        radio_staff_male.setText("Male");
        radio_staff_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_staff_maleActionPerformed(evt);
            }
        });

        group_staff_gender.add(radio_staff_female);
        radio_staff_female.setText("Female");
        radio_staff_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_staff_femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personal_panelLayout = new javax.swing.GroupLayout(personal_panel);
        personal_panel.setLayout(personal_panelLayout);
        personal_panelLayout.setHorizontalGroup(
            personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_panelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fn_label)
                    .addComponent(gen_label)
                    .addComponent(ln_label))
                .addGap(36, 36, 36)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(radio_staff_male)
                        .addGap(18, 18, 18)
                        .addComponent(radio_staff_female))
                    .addComponent(txt_staff_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staff_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_label)
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(date_staff_dob, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                .addGap(178, 178, 178))
        );

        personal_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob_label, fn_label, gen_label, ln_label});

        personal_panelLayout.setVerticalGroup(
            personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fn_label)
                        .addComponent(txt_staff_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dob_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_staff_dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln_label)
                    .addComponent(txt_staff_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen_label)
                    .addComponent(radio_staff_male)
                    .addComponent(radio_staff_female))
                .addGap(41, 41, 41))
        );

        personal_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dob_label, fn_label, gen_label, ln_label});

        con_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        cn_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cn_label.setText("Contact Number:");

        email_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email_label.setText("Email Address:");

        txt_staff_contact.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staff_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout con_panelLayout = new javax.swing.GroupLayout(con_panel);
        con_panel.setLayout(con_panelLayout);
        con_panelLayout.setHorizontalGroup(
            con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(con_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cn_label)
                    .addComponent(email_label))
                .addGap(18, 18, 18)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_staff_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                    .addComponent(txt_staff_email))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        con_panelLayout.setVerticalGroup(
            con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(con_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cn_label)
                    .addComponent(txt_staff_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(txt_staff_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

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

        txt_staff_add1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staff_add2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staff_zipcode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        combo_staff_city.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        combo_staff_country.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_staff_country.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_staff_countryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

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
                .addGap(64, 64, 64)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_staff_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staff_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_staff_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(add_panelLayout.createSequentialGroup()
                        .addComponent(combo_staff_country, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(city_label)
                        .addGap(67, 67, 67)
                        .addComponent(combo_staff_city, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, zip_label});

        add_panelLayout.setVerticalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coun_label)
                    .addComponent(combo_staff_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_label)
                    .addComponent(combo_staff_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1_label)
                    .addComponent(txt_staff_add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2_label)
                    .addComponent(txt_staff_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip_label)
                    .addComponent(txt_staff_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, zip_label});

        acc_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Account Requirements", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        log_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        log_label.setText("Prefered Login Name:");

        pass1_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pass1_label.setText("Password:");

        level_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        level_label.setText("Login Level:");

        txt_staff_login.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_check.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        button_check.setText("Check");
        button_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_checkActionPerformed(evt);
            }
        });

        re_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        re_label.setText("Re-enter Password:");

        button_edit.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        button_edit.setText("Edit");
        button_edit.setEnabled(false);
        button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editActionPerformed(evt);
            }
        });

        combo_staff_level.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "3", "2", "1", "0" }));

        javax.swing.GroupLayout acc_panelLayout = new javax.swing.GroupLayout(acc_panel);
        acc_panel.setLayout(acc_panelLayout);
        acc_panelLayout.setHorizontalGroup(
            acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acc_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(log_label)
                    .addComponent(pass1_label)
                    .addComponent(level_label)
                    .addComponent(re_label))
                .addGap(32, 32, 32)
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acc_panelLayout.createSequentialGroup()
                        .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_staff_login)
                            .addComponent(password_staff_first)
                            .addComponent(password_staff_second, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_check, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(button_edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(combo_staff_level, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        acc_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {level_label, log_label, pass1_label, re_label});

        acc_panelLayout.setVerticalGroup(
            acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(acc_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_label)
                    .addComponent(txt_staff_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(acc_panelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass1_label)
                            .addComponent(password_staff_first, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(acc_panelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(button_check)))
                .addGap(18, 18, 18)
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(re_label)
                    .addComponent(password_staff_second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_edit))
                .addGap(18, 18, 18)
                .addGroup(acc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(level_label)
                    .addComponent(combo_staff_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        acc_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {level_label, log_label, pass1_label, re_label});

        button_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_accept.setText("Confirm");
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
                .addContainerGap()
                .addComponent(button_accept)
                .addGap(86, 86, 86)
                .addComponent(button_cancel)
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_accept, button_cancel});

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(personal_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(con_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(acc_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(330, 330, 330))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(personal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(acc_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_checkActionPerformed
        /*NOTE:Outputs okay if everything is correct else it outputs the message*/
        logger.info("Method call: check");
        try {
            loginname = txt_staff_login.getText();
            pass1 = password_staff_first.getText();
            pass2 = password_staff_second.getText();
            level = (String) combo_staff_level.getSelectedItem();
            String message = "";

            String sql = ""
                    + "SELECT * "
                    + "FROM   stafflogin "
                    + "WHERE  login_name = ? ";
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




            if (!"".equals(message)) {
                JOptionPane.showMessageDialog(null, message);
            } else {

                if ("Select".equals(level)) {
                    message = message + "Please select an access level \n";
                } else {
                    if (ConnectionManager.getLevel() > Integer.parseInt(level)) {
                        message = message + "Access requested is higher than limit please select new level or contact Administrator \n";
                    }
                }

                if (!"".equals(message)) {
                    JOptionPane.showMessageDialog(null, message);
                    logger.error("Error message : " + message);
                    message = "";

                } else {

                    JOptionPane.showMessageDialog(null, "Information has been confirmed and is now not Editable \n Press Edit if you want to edit again");
                    checker = true;
                    txt_staff_login.setEditable(false);
                    password_staff_first.setEditable(false);
                    password_staff_second.setEditable(false);
                    combo_staff_level.setEnabled(false);
                    button_check.setEnabled(false);
                    button_edit.setEnabled(true);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at Registerstaff button_check action" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


    }//GEN-LAST:event_button_checkActionPerformed

    private void button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editActionPerformed
        /*NOTE:Button enabled when check has been confirmed and resets if required*/
        JOptionPane.showMessageDialog(null, "The information is now Editable");
        logger.info("Method call: edit");
        checker = false;
        txt_staff_login.setEditable(true);
        password_staff_first.setEditable(true);
        password_staff_second.setEditable(true);
        combo_staff_level.setEnabled(true);
        button_check.setEnabled(true);
        button_edit.setEnabled(false);
    }//GEN-LAST:event_button_editActionPerformed

    private void button_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_acceptActionPerformed
        /*NOTE: The accept buttin executes the checking first then inserting method*/
        logger.info("Method call: accept");
        firstname = txt_staff_fname.getText();
        lastname = txt_staff_lname.getText();
        DOB = ((JTextField) date_staff_dob.getDateEditor().getUiComponent()).getText();

        Contact = txt_staff_contact.getText();
        Email = txt_staff_email.getText();
        Country = (String) combo_staff_country.getSelectedItem();
        City = (String) combo_staff_city.getSelectedItem();
        Address1 = txt_staff_add1.getText();
        Address2 = txt_staff_add2.getText();
        Zipcode = txt_staff_zipcode.getText();




        /*NOTE:Verifying all Data*/
        /*NOTE:Checker verifies the 4 data*/
        if (checker == true) {

            /*NOTE:For Verifying First Name*/
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
                message = message + "Please provide a contact number \n";
            } else {
                if (!LengthVerifier.lengthInteger(Zipcode)) {
                    message = message + "Contact cannot be longer than 10 characters \n";
                } else {
                    if (!TestPattern.numberpattern(Zipcode)) {

                        message = message + "Contact number must be numeric \n";
                    }
                }
            }

            /*NOTE: Blank message denotes all entries are correct*/

            if ("".equals(message)) {
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please submit the check option first in the account requirements section");
        }

    }//GEN-LAST:event_button_acceptActionPerformed

    /*NOTE:Function for inserting in Database*/
    private void insertDB() {
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Addition", "Add Staff", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Added");
        } else {

            stmt = null;

            String insertinstafflogin = ""
                    + "INSERT INTO `stafflogin` "
                    + "            (`login_name`, "
                    + "             `login_password`, "
                    + "             `login_access_level`) "
                    + "VALUES      (?, "
                    + "             ?, "
                    + "             ?) ";
            try {
                stmt = conn.prepareStatement(insertinstafflogin);
                stmt.setString(1, loginname);
                stmt.setString(2, AESrunner.AESencrypt(pass1));
                stmt.setString(3, level);

                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in insertDB method 1st method" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }


            stmt = null;
            String insertinstaff = ""
                    + "INSERT INTO `staff` "
                    + "            (`idstaff`, "
                    + "             `stafflogin_login_name`, "
                    + "             `first_name`, "
                    + "             `last_name`, "
                    + "             `staff_dob`, "
                    + "             `contact_no`, "
                    + "             `create_date`, "
                    + "             `update_date`, "
                    + "             `staff_email`, "
                    + "             `staff_gender`, "
                    + "             `staff_country`, "
                    + "             `staff_city`, "
                    + "             `staff_address_1`, "
                    + "             `staff_address_2`, "
                    + "             `staff_zipcode`) "
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
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?, "
                    + "             ?) ";



            try {
                stmt = conn.prepareStatement(insertinstaff);
                stmt.setString(1, null);
                stmt.setString(2, loginname);
                stmt.setString(3, firstname);
                stmt.setString(4, lastname);
                stmt.setString(5, DOB);
                stmt.setString(6, Contact);
                stmt.setString(7, Dategenerator.getCurrentDate());
                stmt.setString(8, Dategenerator.getCurrentDate());
                stmt.setString(9, Email);
                stmt.setString(10, Gender);
                stmt.setString(11, Country);
                stmt.setString(12, City);
                stmt.setString(13, Address1);
                stmt.setString(14, Address2);
                stmt.setString(15, Zipcode);


                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in insertDB method 2nd method " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }



            try {
                logger.info("Exiting");
                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }


                this.dispose();
                new SMMain().setVisible(true);




            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error after inserting everything " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }



        }

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
                combo_staff_country.addItem(name);
            }
            combo_staff_country.insertItemAt("", 0);
            combo_staff_country.setSelectedIndex(0);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcountry  " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }

    private void combo_staff_countryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_staff_countryPopupMenuWillBecomeInvisible
        try {
            logger.info("Method call: country");
            /*NOTE:Will fill the city list based on the country selected*/
            String tmp = (String) combo_staff_country.getSelectedItem();

            String sql = ""
                    + "SELECT city.city_name "
                    + "FROM   city "
                    + "       INNER JOIN country "
                    + "               ON city.country_idcountry = country.idcountry "
                    + "WHERE  country.country_name = ?";

            stmt = conn.prepareStatement(sql);
            stmt.setString(1, tmp);
            rs = stmt.executeQuery();
            combo_staff_city.setModel(new DefaultComboBoxModel()); /*NOTE:Flushing combobox for new entry*/
            /*NOTE:Combo box filling*/
            while (rs.next()) {
                String name = rs.getString("city_name");
                combo_staff_city.addItem(name);
            }
            combo_staff_city.insertItemAt("", 0);
            combo_staff_city.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at country filling city" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


    }//GEN-LAST:event_combo_staff_countryPopupMenuWillBecomeInvisible

    private void radio_staff_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_staff_maleActionPerformed
        /*NOTE:Gender is being set*/
        Gender = "m";

    }//GEN-LAST:event_radio_staff_maleActionPerformed

    private void radio_staff_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_staff_femaleActionPerformed
        /*NOTE:Gender is being set*/
        Gender = "f";
    }//GEN-LAST:event_radio_staff_femaleActionPerformed

    private void button_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_cancelActionPerformed
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
            new SMMain().setVisible(true);




        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Closed by user " + ex.getMessage());
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
                new Registerstaff().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel acc_panel;
    private javax.swing.JLabel add1_label;
    private javax.swing.JLabel add2_label;
    private javax.swing.JPanel add_panel;
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_check;
    private javax.swing.JButton button_edit;
    private javax.swing.JLabel city_label;
    private javax.swing.JLabel cn_label;
    private javax.swing.JComboBox combo_staff_city;
    private javax.swing.JComboBox combo_staff_country;
    private javax.swing.JComboBox combo_staff_level;
    private javax.swing.JPanel con_panel;
    private javax.swing.JLabel coun_label;
    private com.toedter.calendar.JDateChooser date_staff_dob;
    private javax.swing.JLabel dob_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fn_label;
    private javax.swing.JLabel gen_label;
    private javax.swing.ButtonGroup group_staff_gender;
    private javax.swing.JLabel level_label;
    private javax.swing.JLabel ln_label;
    private javax.swing.JLabel log_label;
    private javax.swing.JLabel pass1_label;
    private javax.swing.JPasswordField password_staff_first;
    private javax.swing.JPasswordField password_staff_second;
    private javax.swing.JPanel personal_panel;
    private javax.swing.JRadioButton radio_staff_female;
    private javax.swing.JRadioButton radio_staff_male;
    private javax.swing.JLabel re_label;
    private javax.swing.JTextField txt_staff_add1;
    private javax.swing.JTextField txt_staff_add2;
    private javax.swing.JTextField txt_staff_contact;
    private javax.swing.JTextField txt_staff_email;
    private javax.swing.JTextField txt_staff_fname;
    private javax.swing.JTextField txt_staff_lname;
    private javax.swing.JTextField txt_staff_login;
    private javax.swing.JTextField txt_staff_zipcode;
    private javax.swing.JLabel zip_label;
    // End of variables declaration//GEN-END:variables
}
