package finalproj.frames.customermanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.CMmain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Registerupdate extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String Contact;
    private String Email;
    private String Country;
    private String City;
    private String Address1;
    private String Address2;
    private String Zipcode;
    private String search;
    private boolean flag = false;
    private String tempaddid;
    private String tempcityid;
    private String tempcountryid;
    private String message = "";
    private static Logger logger;

    public Registerupdate() {

        logger = Logger.getLogger(Registerupdate.class.getName());
        logger.info("Initialization");
        initComponents();
        conn = ConnectionManager.getInstance().getConnection();
        this.setLocationRelativeTo(null);
        fillcountry();
    }

    private void fillcountry() {
        String sql = "Select country_name from country";
        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            /*NOTE:Combo box filling*/
            while (rs.next()) {
                String name = rs.getString("country_name");
                combo_country.addItem(name);
            }
            combo_country.insertItemAt("", 0);
            combo_country.setSelectedIndex(0);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fillcountry  " + ex.getMessage());
            logger.error("Error message : " + message);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login_panel = new javax.swing.JPanel();
        radio_search = new javax.swing.JButton();
        login_label = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        con_panel = new javax.swing.JPanel();
        con_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        add_panel = new javax.swing.JPanel();
        coun_label = new javax.swing.JLabel();
        city_label = new javax.swing.JLabel();
        add1_label = new javax.swing.JLabel();
        add2_label = new javax.swing.JLabel();
        zip_label = new javax.swing.JLabel();
        txt_add1 = new javax.swing.JTextField();
        txt_add2 = new javax.swing.JTextField();
        txt_zipcode = new javax.swing.JTextField();
        combo_country = new javax.swing.JComboBox();
        combo_city = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        radio_cancel = new javax.swing.JButton();
        radio_accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Register Update");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        radio_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        radio_search.setText("Search");
        radio_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_searchActionPerformed(evt);
            }
        });

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        txt_search.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_search.setToolTipText("");

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(login_label)
                .addGap(18, 18, 18)
                .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(radio_search)
                .addGap(293, 293, 293))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_search)
                    .addComponent(login_label)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        con_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contact Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        con_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        con_label.setText("Contact No:");

        email_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        email_label.setText("Email:");

        txt_contact.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_contact.setToolTipText("");

        txt_email.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_email.setToolTipText("");

        javax.swing.GroupLayout con_panelLayout = new javax.swing.GroupLayout(con_panel);
        con_panel.setLayout(con_panelLayout);
        con_panelLayout.setHorizontalGroup(
            con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(con_panelLayout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email_label)
                    .addComponent(con_label))
                .addGap(68, 68, 68)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        con_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {con_label, email_label});

        con_panelLayout.setVerticalGroup(
            con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(con_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(con_label)
                    .addComponent(txt_contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(con_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_label)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

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

        txt_add1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_add1.setToolTipText("");

        txt_add2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_add2.setToolTipText("");

        txt_zipcode.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txt_zipcode.setToolTipText("");

        combo_country.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_countryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout add_panelLayout = new javax.swing.GroupLayout(add_panel);
        add_panel.setLayout(add_panelLayout);
        add_panelLayout.setHorizontalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(zip_label)
                    .addComponent(add2_label)
                    .addComponent(add1_label)
                    .addComponent(city_label)
                    .addComponent(coun_label))
                .addGap(89, 89, 89)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_zipcode)
                    .addComponent(txt_add2)
                    .addComponent(txt_add1)
                    .addComponent(combo_country, 0, 210, Short.MAX_VALUE)
                    .addComponent(combo_city, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add1_label, add2_label, city_label, coun_label, zip_label});

        add_panelLayout.setVerticalGroup(
            add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coun_label)
                    .addComponent(combo_country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city_label)
                    .addComponent(combo_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add1_label)
                    .addComponent(txt_add1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add2_label)
                    .addComponent(txt_add2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(add_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zip_label)
                    .addComponent(txt_zipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        radio_cancel.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        radio_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        radio_cancel.setText("Cancel");
        radio_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_cancelActionPerformed(evt);
            }
        });

        radio_accept.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        radio_accept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        radio_accept.setText("Accept");
        radio_accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_acceptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio_accept)
                .addGap(112, 112, 112)
                .addComponent(radio_cancel)
                .addContainerGap())
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_accept)
                    .addComponent(radio_cancel))
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
                    .addComponent(con_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(con_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(add_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radio_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_searchActionPerformed

        search = txt_search.getText();
        String sql = ""
                + "SELECT * "
                + "FROM   customer "
                + "WHERE  login_login_name =? ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, search);
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Customer Found");
                flag = true;


                txt_contact.setText(rs.getString("contact_no"));
                txt_email.setText(rs.getString("email"));
                tempaddid = rs.getString("Address_idAddress");

                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `address` "
                        + "WHERE  idaddress =? ";

                stmt = null;

                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, tempaddid);

                rs = stmt.executeQuery();

                if (rs.next()) {
                    tempcityid = rs.getString("City_idCity");
                    txt_add1.setText(rs.getString("address1"));
                    txt_add2.setText(rs.getString("address2"));
                    txt_zipcode.setText(rs.getString("zipcode"));
                } else {
                    JOptionPane.showMessageDialog(null, "Address not found");
                    logger.error("Address Missing");

                }

                String sql3 = ""
                        + "SELECT * "
                        + "FROM   `city` "
                        + "WHERE  `idcity` =? ";

                stmt = null;

                stmt = conn.prepareStatement(sql3);
                stmt.setString(1, tempcityid);

                rs = stmt.executeQuery();



                if (rs.next()) {
                    tempcountryid = rs.getString("Country_idCountry");
                    combo_city.addItem(rs.getString("city_name"));
                    combo_city.setSelectedItem(rs.getString("city_name"));

                } else {
                    JOptionPane.showMessageDialog(null, "City not found");
                    logger.error("Country Missing");
                }

                String sql4 = ""
                        + "SELECT * "
                        + "FROM   `country` "
                        + "WHERE  `idcountry` =? ";

                stmt = null;

                stmt = conn.prepareStatement(sql4);
                stmt.setString(1, tempcountryid);

                rs = stmt.executeQuery();

                if (rs.next()) {

                    combo_country.setSelectedItem(rs.getString("country_name"));

                } else {
                    JOptionPane.showMessageDialog(null, "Country not found");
                    logger.error("Country Missing");
                }


            } else {
                JOptionPane.showMessageDialog(null, "Customer Not Found Search Again");
                logger.info("Customer Missing");
                flag = false;
                txt_contact.setText("");
                txt_email.setText("");
                txt_add1.setText("");
                txt_add2.setText("");
                txt_zipcode.setText("");
                combo_city.removeAllItems();
                combo_country.setSelectedIndex(0);
                combo_city.insertItemAt("", 0);
                combo_city.setSelectedIndex(0);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at search" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

    }//GEN-LAST:event_radio_searchActionPerformed

    private void combo_countryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_countryPopupMenuWillBecomeInvisible
        combo_city.removeAllItems();
        if (!(combo_country.getSelectedItem().toString().equals(""))) {
            try {
                /*NOTE:Will fill the city list based on the country selected*/
                String tmp = (String) combo_country.getSelectedItem();

                String sql = ""
                        + "SELECT city.city_name "
                        + "FROM   city "
                        + "       INNER JOIN country "
                        + "               ON city.country_idcountry = country.idcountry "
                        + "WHERE  country.country_name = ?";

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, tmp);
                rs = stmt.executeQuery();

                /*NOTE:Combo box filling*/
                while (rs.next()) {
                    String name = rs.getString("city_name");
                    combo_city.addItem(name);
                }
                combo_city.setSelectedIndex(0);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error at country filling city" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
        }

    }//GEN-LAST:event_combo_countryPopupMenuWillBecomeInvisible

    private void radio_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_cancelActionPerformed
        try {

            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            this.dispose();
            new CMmain().setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cancelled by User " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_radio_cancelActionPerformed

    private void radio_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_acceptActionPerformed

        if (flag == true) {
            Contact = txt_contact.getText();
            Email = txt_email.getText();
            Address1 = txt_add1.getText();
            Address2 = txt_add2.getText();
            Zipcode = txt_zipcode.getText();
            Country = combo_country.getSelectedItem().toString();
            City = combo_city.getSelectedItem().toString();

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

                        message = message + "Zipcode must be numeric \n";
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
            JOptionPane.showMessageDialog(null, "Please search for the user first");
            logger.error("Search Error");

        }
    }//GEN-LAST:event_radio_acceptActionPerformed

    private void insertDB() {


        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Update Staff", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Change cancelled");
        } else {
            logger.info("DB begin");

            stmt = null;
            rs = null;

            /*NOTE:Getting id of selected city to insert in Address field*/

            String sql = ""
                    + "SELECT `idcity` "
                    + "FROM   `city` "
                    + "WHERE  `city_name` =? ";
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, combo_city.getSelectedItem().toString());
                rs = stmt.executeQuery();
                rs.next();


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during first select query 1" + ex.getMessage());
            }


            String sql2 = ""
                    + "UPDATE `address` "
                    + "SET     `city_idcity` = ?, "
                    + "       `address1` = ?, "
                    + "       `address2` = ?, "
                    + "       `zipcode` = ? "
                    + "WHERE  `idaddress` =? ";

            stmt = null;
            try {
                stmt = conn.prepareStatement(sql);
                stmt = conn.prepareStatement(sql2);

                stmt.setInt(1, rs.getInt("idCity"));
                stmt.setString(2, Address1);
                stmt.setString(3, Address2);
                stmt.setString(4, Zipcode);
                stmt.setString(5, tempaddid);

                stmt.executeUpdate();


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during first update query " + ex.getMessage());
            }

            String sql3 = ""
                    + "UPDATE `customer` "
                    + "SET    `contact_no` = ?, "
                    + "       `email` = ?, "
                    + "       `last_update` = ? "
                    + "WHERE  `login_login_name` =? ";
            stmt = null;
            try {
                stmt = conn.prepareStatement(sql3);

                stmt.setString(1, Contact);
                stmt.setString(2, Email);
                stmt.setString(3, Dategenerator.getCurrentDate());
                stmt.setString(4, search);


                stmt.executeUpdate();


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during second update query" + ex.getMessage());
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
                new CMmain().setVisible(true);




            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error after updating everything " + ex.getMessage());
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
                new Registerupdate().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add1_label;
    private javax.swing.JLabel add2_label;
    private javax.swing.JPanel add_panel;
    private javax.swing.JLabel city_label;
    private javax.swing.JComboBox combo_city;
    private javax.swing.JComboBox combo_country;
    private javax.swing.JLabel con_label;
    private javax.swing.JPanel con_panel;
    private javax.swing.JLabel coun_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JButton radio_accept;
    private javax.swing.JButton radio_cancel;
    private javax.swing.JButton radio_search;
    private javax.swing.JTextField txt_add1;
    private javax.swing.JTextField txt_add2;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_zipcode;
    private javax.swing.JLabel zip_label;
    // End of variables declaration//GEN-END:variables
}
