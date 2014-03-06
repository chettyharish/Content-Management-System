package finalproj.frames.staffmanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
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

public class Updatestaff extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
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
    private String search;
    private String message = "";
    private boolean searchflag = false;
    private static Logger logger;

    public Updatestaff() {
        logger = Logger.getLogger(Updatestaff.class.getName());
        logger.info("Initialization");

        initComponents();
        conn = ConnectionManager.getInstance().getConnection();
        this.setLocationRelativeTo(null);
        fillcountry();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button_staffupdate_gender = new javax.swing.ButtonGroup();
        login_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        txt_staffupdate_search = new javax.swing.JTextField();
        button_staffupdate_search = new javax.swing.JButton();
        personal_panel = new javax.swing.JPanel();
        fn_label = new javax.swing.JLabel();
        ln_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        gen_label = new javax.swing.JLabel();
        txt_staffupdate_firstname = new javax.swing.JTextField();
        txt_staffupdate_lastname = new javax.swing.JTextField();
        date_staffupdate_dob = new com.toedter.calendar.JDateChooser();
        radio_staffupdate_male = new javax.swing.JRadioButton();
        radio_staffupdate_female = new javax.swing.JRadioButton();
        con_panel = new javax.swing.JPanel();
        con_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        txt_staffupdate_contact = new javax.swing.JTextField();
        txt_staffupdate_email = new javax.swing.JTextField();
        add_panel = new javax.swing.JPanel();
        coun_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        add1_label = new javax.swing.JLabel();
        add2_label = new javax.swing.JLabel();
        zip_label = new javax.swing.JLabel();
        combo_staffupdate_country = new javax.swing.JComboBox();
        combo_staffupdate_city = new javax.swing.JComboBox();
        txt_staffupdate_add1 = new javax.swing.JTextField();
        txt_staffupdate_add2 = new javax.swing.JTextField();
        txt_staffupdate_zipcode = new javax.swing.JTextField();
        end_panel = new javax.swing.JPanel();
        button_staffupdate_update = new javax.swing.JButton();
        button_staffupdate_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Staff");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        button_staffupdate_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staffupdate_search.setText("Search");
        button_staffupdate_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staffupdate_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(login_label)
                .addGap(30, 30, 30)
                .addComponent(txt_staffupdate_search, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(button_staffupdate_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(txt_staffupdate_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_staffupdate_search))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        personal_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fn_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fn_label.setText("First Name:");

        ln_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ln_label.setText("Last Name:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        gen_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        gen_label.setText("Gender:");

        date_staffupdate_dob.setDateFormatString("yyyy-MM-dd");
        date_staffupdate_dob.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        date_staffupdate_dob.setPreferredSize(new java.awt.Dimension(124, 23));

        button_staffupdate_gender.add(radio_staffupdate_male);
        radio_staffupdate_male.setText("Male");
        radio_staffupdate_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_staffupdate_maleActionPerformed(evt);
            }
        });

        button_staffupdate_gender.add(radio_staffupdate_female);
        radio_staffupdate_female.setText("Female");
        radio_staffupdate_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_staffupdate_femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout personal_panelLayout = new javax.swing.GroupLayout(personal_panel);
        personal_panel.setLayout(personal_panelLayout);
        personal_panelLayout.setHorizontalGroup(
            personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_panelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(ln_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_staffupdate_lastname))
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(fn_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_staffupdate_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personal_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(personal_panelLayout.createSequentialGroup()
                        .addComponent(gen_label)
                        .addGap(18, 18, 18)
                        .addComponent(radio_staffupdate_male)
                        .addGap(18, 18, 18)
                        .addComponent(radio_staffupdate_female))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, personal_panelLayout.createSequentialGroup()
                        .addComponent(dob_label)
                        .addGap(18, 18, 18)
                        .addComponent(date_staffupdate_dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(122, 122, 122))
        );

        personal_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob_label, fn_label, gen_label, ln_label});

        personal_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_staffupdate_firstname, txt_staffupdate_lastname});

        personal_panelLayout.setVerticalGroup(
            personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personal_panelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fn_label)
                    .addComponent(txt_staffupdate_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ln_label)
                    .addComponent(txt_staffupdate_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_label)
                    .addComponent(date_staffupdate_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gen_label)
                    .addComponent(radio_staffupdate_male)
                    .addComponent(radio_staffupdate_female))
                .addGap(17, 17, 17))
        );

        personal_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dob_label, fn_label, gen_label, ln_label});

        personal_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_staffupdate_firstname, txt_staffupdate_lastname});

        con_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        con_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        con_label.setText("Contact Number:");

        email_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email_label.setText("Email:");

        txt_staffupdate_contact.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staffupdate_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

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
                    .addComponent(txt_staffupdate_contact, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(txt_staffupdate_email))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        con_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {con_label, email_label});

        con_panelLayout.setVerticalGroup(
            con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(con_panelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(con_label)
                    .addComponent(txt_staffupdate_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(txt_staffupdate_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        con_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {con_label, email_label});

        add_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        coun_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        coun_label.setText("Country:");

        city_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        city_label.setText("City:");

        add1_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add1_label.setText("Address 1:");

        add2_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        add2_label.setText("Address 2:");

        zip_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        zip_label.setText("Zipcode:");

        combo_staffupdate_country.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_staffupdate_country.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_staffupdate_countryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        combo_staffupdate_city.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staffupdate_add1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staffupdate_add2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_staffupdate_zipcode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout add_panelLayout = new javax.swing.GroupLayout(add_panel);
        add_panel.setLayout(add_panelLayout);
        add_panelLayout.setHorizontalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(add_panelLayout.createSequentialGroup()
                        .addComponent(coun_label)
                        .addGap(18, 18, 18)
                        .addComponent(combo_staffupdate_country, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(198, 198, 198)
                        .addComponent(city_label)
                        .addGap(18, 18, 18)
                        .addComponent(combo_staffupdate_city, 0, 180, Short.MAX_VALUE))
                    .addGroup(add_panelLayout.createSequentialGroup()
                        .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(add_panelLayout.createSequentialGroup()
                                .addComponent(zip_label)
                                .addGap(18, 18, 18)
                                .addComponent(txt_staffupdate_zipcode))
                            .addGroup(add_panelLayout.createSequentialGroup()
                                .addComponent(add2_label)
                                .addGap(18, 18, 18)
                                .addComponent(txt_staffupdate_add2))
                            .addGroup(add_panelLayout.createSequentialGroup()
                                .addComponent(add1_label)
                                .addGap(18, 18, 18)
                                .addComponent(txt_staffupdate_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(200, 200, 200))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, zip_label});

        add_panelLayout.setVerticalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coun_label)
                    .addComponent(combo_staffupdate_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(city_label)
                    .addComponent(combo_staffupdate_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1_label)
                    .addComponent(txt_staffupdate_add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2_label)
                    .addComponent(txt_staffupdate_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip_label)
                    .addComponent(txt_staffupdate_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, zip_label});

        button_staffupdate_update.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staffupdate_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_staffupdate_update.setText("Update");
        button_staffupdate_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staffupdate_updateActionPerformed(evt);
            }
        });

        button_staffupdate_cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staffupdate_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_staffupdate_cancel.setText("Cancel");
        button_staffupdate_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staffupdate_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_staffupdate_update)
                .addGap(104, 104, 104)
                .addComponent(button_staffupdate_cancel)
                .addContainerGap())
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_staffupdate_update)
                    .addComponent(button_staffupdate_cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(con_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personal_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(con_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_staffupdate_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_staffupdate_maleActionPerformed
        Gender = "m";
    }//GEN-LAST:event_radio_staffupdate_maleActionPerformed

    private void radio_staffupdate_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_staffupdate_femaleActionPerformed
        Gender = "f";
    }//GEN-LAST:event_radio_staffupdate_femaleActionPerformed

    private void button_staffupdate_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staffupdate_searchActionPerformed
        try {
            logger.info("Method call: search");
            String sql = ""
                    + "SELECT * "
                    + "FROM   staff "
                    + "WHERE  stafflogin_login_name = ? ";

            stmt = conn.prepareStatement(sql);

            search = txt_staffupdate_search.getText();
            stmt.setString(1, search);

            rs = stmt.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Staff found, Please start Editing");
                logger.info("Staff found");
                searchflag = true;


                txt_staffupdate_firstname.setText(rs.getString("first_name"));
                txt_staffupdate_lastname.setText(rs.getString("last_name"));

                /*Getting Date from Dategenerator class*/

                date_staffupdate_dob.setDate(Dategenerator.returndateformat(rs.getString("staff_dob")));


                /*Selecting Gender Radio*/
                if ("m".equals(rs.getString("staff_gender"))) {
                    radio_staffupdate_male.setSelected(true);
                    Gender = "m";
                } else {
                    radio_staffupdate_female.setSelected(true);
                    Gender = "f";
                }

                txt_staffupdate_contact.setText(rs.getString("contact_no"));
                txt_staffupdate_email.setText(rs.getString("staff_email"));

                /*NOTE: For filling City and Country to the value from Database*/

                combo_staffupdate_country.setSelectedItem(rs.getString("staff_country"));
                /*NOTE: Item added to avoid Constraint problems*/
                combo_staffupdate_city.addItem(rs.getString("staff_city"));




                txt_staffupdate_add1.setText(rs.getString("staff_address_1"));
                txt_staffupdate_add2.setText(rs.getString("staff_address_2"));
                txt_staffupdate_zipcode.setText(rs.getString("staff_zipcode"));




            } else {
                JOptionPane.showMessageDialog(null, "User not found, Try again");
                logger.info("User not found");
                searchflag = false;
                txt_staffupdate_firstname.setText("");
                txt_staffupdate_lastname.setText("");
                date_staffupdate_dob.setDate(null);
                Gender = null;
                radio_staffupdate_male.setSelected(false);
                radio_staffupdate_female.setSelected(false);
                txt_staffupdate_contact.setText("");
                txt_staffupdate_email.setText("");
                combo_staffupdate_country.removeAllItems();
                combo_staffupdate_city.removeAllItems();
                txt_staffupdate_add1.setText("");
                txt_staffupdate_add2.setText("");
                txt_staffupdate_zipcode.setText("");
                combo_staffupdate_country.insertItemAt("", 0);
                combo_staffupdate_country.setSelectedIndex(0);
                combo_staffupdate_city.insertItemAt("", 0);
                combo_staffupdate_city.setSelectedIndex(0);

            }




        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at Search in updatestaff" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }//GEN-LAST:event_button_staffupdate_searchActionPerformed

    private void combo_staffupdate_countryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_staffupdate_countryPopupMenuWillBecomeInvisible

        if (!(combo_staffupdate_country.getSelectedItem().toString().equals(""))) {
            try {
                logger.info("Method call: staffupdate");
                /*NOTE:Will fill the city list based on the country selected*/
                String tmp = (String) combo_staffupdate_country.getSelectedItem();

                String sql = ""
                        + "SELECT city.city_name "
                        + "FROM   city "
                        + "       INNER JOIN country "
                        + "               ON city.country_idcountry = country.idcountry "
                        + "WHERE  country.country_name = ?";

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, tmp);
                rs = stmt.executeQuery();
                combo_staffupdate_city.setModel(new DefaultComboBoxModel()); /*NOTE:Flushing combobox for new entry*/
                /*NOTE:Combo box filling*/
                while (rs.next()) {
                    String name = rs.getString("city_name");
                    combo_staffupdate_city.addItem(name);
                }
                combo_staffupdate_city.insertItemAt("", 0);
                combo_staffupdate_city.setSelectedIndex(0);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error at country filling city" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
        }

    }//GEN-LAST:event_combo_staffupdate_countryPopupMenuWillBecomeInvisible

    private void button_staffupdate_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staffupdate_cancelActionPerformed
        try {
            logger.info("Method call: exit");
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }


            this.dispose();
            new SMMain().setVisible(true);




        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error after inserting eveything " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_staffupdate_cancelActionPerformed

    private void button_staffupdate_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staffupdate_updateActionPerformed


        if (searchflag == false) {
            JOptionPane.showMessageDialog(null, "Please search for the staff first");
            logger.info("Search not performed");
        } else {
            firstname = txt_staffupdate_firstname.getText();
            lastname = txt_staffupdate_lastname.getText();
            DOB = ((JTextField) date_staffupdate_dob.getDateEditor().getUiComponent()).getText();

            Contact = txt_staffupdate_contact.getText();
            Email = txt_staffupdate_email.getText();
            Country = (String) combo_staffupdate_country.getSelectedItem();
            City = (String) combo_staffupdate_city.getSelectedItem();
            Address1 = txt_staffupdate_add1.getText();
            Address2 = txt_staffupdate_add2.getText();
            Zipcode = txt_staffupdate_zipcode.getText();


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
                logger.info("Method call: insertDB");
                insertDB();
            } else {


                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";

            }



        }


    }//GEN-LAST:event_button_staffupdate_updateActionPerformed

    private void insertDB() {
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Update Staff", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Change cancelled");
        } else {

            logger.info("DB start");
            stmt = null;

            String updatestaff =
                    "UPDATE `staff`SET  "
                    + "       `first_name` = ?,"
                    + "       `last_name` = ?,"
                    + "       `staff_dob` = ?,"
                    + "       `contact_no` = ?,    "
                    + "       `update_date` =?,"
                    + "       `staff_email` = ?,"
                    + "       `staff_gender` = ?,"
                    + "       `staff_country` = ?,"
                    + "       `staff_city` = ?,"
                    + "       `staff_address_1` = ?,"
                    + "       `staff_address_2` = ?,"
                    + "       `staff_zipcode` = ?"
                    + "WHERE  `stafflogin_login_name` =?";




            try {
                stmt = conn.prepareStatement(updatestaff);
                stmt.setString(1, firstname);
                stmt.setString(2, lastname);
                stmt.setString(3, DOB);
                stmt.setString(4, Contact);
                stmt.setString(5, Dategenerator.getCurrentDate());
                stmt.setString(6, Email);
                stmt.setString(7, Gender);
                stmt.setString(8, Country);
                stmt.setString(9, City);
                stmt.setString(10, Address1);
                stmt.setString(11, Address2);
                stmt.setString(12, Zipcode);
                stmt.setString(13, search);


                /*NOTE: Execution here*/
                stmt.executeUpdate();
                logger.info("DB end");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in insertDB method  " + ex.getMessage());
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
                JOptionPane.showMessageDialog(null, "Error after updating everything " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }



        }


    }

    private void fillcountry() {
        logger.info("Method call: fillcountry");
        String sql = "Select country_name from country";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            /*NOTE:Combo box filling*/
            while (rs.next()) {
                String name = rs.getString("country_name");
                combo_staffupdate_country.addItem(name);
            }
            combo_staffupdate_country.insertItemAt("", 0);
            combo_staffupdate_country.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcountry  " + ex.getMessage());
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
                new Updatestaff().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add1_label;
    private javax.swing.JLabel add2_label;
    private javax.swing.JPanel add_panel;
    private javax.swing.JButton button_staffupdate_cancel;
    private javax.swing.ButtonGroup button_staffupdate_gender;
    private javax.swing.JButton button_staffupdate_search;
    private javax.swing.JButton button_staffupdate_update;
    private javax.swing.JLabel city_label;
    private javax.swing.JComboBox combo_staffupdate_city;
    private javax.swing.JComboBox combo_staffupdate_country;
    private javax.swing.JLabel con_label;
    private javax.swing.JPanel con_panel;
    private javax.swing.JLabel coun_label;
    private com.toedter.calendar.JDateChooser date_staffupdate_dob;
    private javax.swing.JLabel dob_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fn_label;
    private javax.swing.JLabel gen_label;
    private javax.swing.JLabel ln_label;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPanel personal_panel;
    private javax.swing.JRadioButton radio_staffupdate_female;
    private javax.swing.JRadioButton radio_staffupdate_male;
    private javax.swing.JTextField txt_staffupdate_add1;
    private javax.swing.JTextField txt_staffupdate_add2;
    private javax.swing.JTextField txt_staffupdate_contact;
    private javax.swing.JTextField txt_staffupdate_email;
    private javax.swing.JTextField txt_staffupdate_firstname;
    private javax.swing.JTextField txt_staffupdate_lastname;
    private javax.swing.JTextField txt_staffupdate_search;
    private javax.swing.JTextField txt_staffupdate_zipcode;
    private javax.swing.JLabel zip_label;
    // End of variables declaration//GEN-END:variables
}
