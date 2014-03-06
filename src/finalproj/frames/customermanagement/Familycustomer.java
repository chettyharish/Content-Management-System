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
import java.sql.Statement;
import java.util.Collections;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.log4j.Logger;

public class Familycustomer extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String firstname;
    private String lastname;
    private String DOB;
    private String Gender = "";
    private String message = "";
    Vector<String> leftvector;
    Vector<String> rightvector;
    private boolean flag = false;
    private String id;
    private String keys;
    private String sql;
    private String sql2;
    private String ch_key;
    private static Logger logger;

    public Familycustomer() {
        logger = Logger.getLogger(Familycustomer.class.getName());
        logger.info("Initialization");
        initComponents();

        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();


    }

    public void fillchannel() {
        logger.info("Method call: fillchannel");
        String sql = ""
                + "SELECT `channel_name` "
                + "FROM   `channel` ";
        try {

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            leftvector = new Vector<String>();
            rightvector = new Vector<String>();
            while (rs.next()) {
                leftvector.add(rs.getString("channel_name"));

            }

            Collections.sort(leftvector);
            left_list.setListData(leftvector);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fill list method" + ex.getMessage());
            logger.fatal("Fatal error", ex);

        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        per_panel = new javax.swing.JPanel();
        fname_label = new javax.swing.JLabel();
        gend_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        lname_label = new javax.swing.JLabel();
        txt_family_firstname = new javax.swing.JTextField();
        txt_family_lastname = new javax.swing.JTextField();
        date_family_DOB = new com.toedter.calendar.JDateChooser();
        radio_family_male = new javax.swing.JRadioButton();
        radio_family_female = new javax.swing.JRadioButton();
        ch_panel = new javax.swing.JPanel();
        pane_family_left = new javax.swing.JScrollPane();
        left_list = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        right_list = new javax.swing.JList();
        jPanel6 = new javax.swing.JPanel();
        button_family_remove = new javax.swing.JButton();
        button_family_add = new javax.swing.JButton();
        login_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        txt_family_search = new javax.swing.JTextField();
        button_family_search = new javax.swing.JButton();
        exist_panel = new javax.swing.JPanel();
        exist_label = new javax.swing.JLabel();
        combo_family_existing = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_family_confirm = new javax.swing.JButton();
        button_family_cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Family Customer");
        setUndecorated(true);
        setResizable(false);

        per_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fname_label.setText("First Name:");

        gend_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        gend_label.setText("Gender: ");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        lname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lname_label.setText("Last Name:");

        date_family_DOB.setDateFormatString("yyyy-MM-dd");
        date_family_DOB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        radio_family_male.setText("Male");
        radio_family_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_family_maleActionPerformed(evt);
            }
        });

        radio_family_female.setText("Female");
        radio_family_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_family_femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout per_panelLayout = new javax.swing.GroupLayout(per_panel);
        per_panel.setLayout(per_panelLayout);
        per_panelLayout.setHorizontalGroup(
            per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(per_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(per_panelLayout.createSequentialGroup()
                        .addComponent(lname_label)
                        .addGap(38, 38, 38)
                        .addComponent(txt_family_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(per_panelLayout.createSequentialGroup()
                        .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname_label)
                            .addComponent(gend_label))
                        .addGap(38, 38, 38)
                        .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(per_panelLayout.createSequentialGroup()
                                .addComponent(radio_family_male)
                                .addGap(35, 35, 35)
                                .addComponent(radio_family_female)
                                .addContainerGap(702, Short.MAX_VALUE))
                            .addGroup(per_panelLayout.createSequentialGroup()
                                .addComponent(txt_family_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dob_label)
                                .addGap(18, 18, 18)
                                .addComponent(date_family_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178))))))
        );

        per_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob_label, fname_label, gend_label, lname_label});

        per_panelLayout.setVerticalGroup(
            per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(per_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fname_label)
                        .addComponent(txt_family_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dob_label))
                    .addComponent(date_family_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname_label)
                    .addComponent(txt_family_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gend_label)
                    .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radio_family_male)
                        .addComponent(radio_family_female)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        per_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dob_label, fname_label, gend_label, lname_label});

        ch_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Channel List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        left_list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), java.awt.Color.black)); // NOI18N
        left_list.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        left_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        pane_family_left.setViewportView(left_list);

        right_list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selected", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), java.awt.Color.black)); // NOI18N
        right_list.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        right_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(right_list);

        button_family_remove.setText("<-----Remove");
        button_family_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_family_removeActionPerformed(evt);
            }
        });

        button_family_add.setText("Add----->");
        button_family_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_family_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_family_add)
                    .addComponent(button_family_remove, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_family_add, button_family_remove});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_family_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(button_family_remove)
                .addContainerGap())
        );

        javax.swing.GroupLayout ch_panelLayout = new javax.swing.GroupLayout(ch_panel);
        ch_panel.setLayout(ch_panelLayout);
        ch_panelLayout.setHorizontalGroup(
            ch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ch_panelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(pane_family_left, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168))
        );

        ch_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, pane_family_left});

        ch_panelLayout.setVerticalGroup(
            ch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ch_panelLayout.createSequentialGroup()
                .addGroup(ch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ch_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pane_family_left, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(ch_panelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ch_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane2, pane_family_left});

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        txt_family_search.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_family_search.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        button_family_search.setText("Search");
        button_family_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_family_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_label)
                .addGap(18, 18, 18)
                .addComponent(txt_family_search, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_family_search)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login_label)
                    .addComponent(txt_family_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_family_search))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        exist_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existing Members", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        exist_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        exist_label.setText("Existing Members:");

        javax.swing.GroupLayout exist_panelLayout = new javax.swing.GroupLayout(exist_panel);
        exist_panel.setLayout(exist_panelLayout);
        exist_panelLayout.setHorizontalGroup(
            exist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exist_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exist_label)
                .addGap(37, 37, 37)
                .addComponent(combo_family_existing, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exist_panelLayout.setVerticalGroup(
            exist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exist_panelLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(exist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exist_label)
                    .addComponent(combo_family_existing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        button_family_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_family_confirm.setText("Confirm");
        button_family_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_family_confirmActionPerformed(evt);
            }
        });

        button_family_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_family_cancel.setText("Cancel");
        button_family_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_family_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(button_family_confirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(button_family_cancel)
                .addGap(48, 48, 48))
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_family_confirm)
                    .addComponent(button_family_cancel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(per_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ch_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(294, 294, 294)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exist_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(per_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ch_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_family_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_family_addActionPerformed
        logger.info("Method call:Addaction");
        if (!left_list.isSelectionEmpty()) {
            rightvector.addElement(left_list.getSelectedValue().toString());
            leftvector.remove(left_list.getSelectedIndex());
            Collections.sort(rightvector);
            left_list.setListData(leftvector);
            right_list.setListData(rightvector);
        }
    }//GEN-LAST:event_button_family_addActionPerformed

    private void button_family_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_family_removeActionPerformed
        logger.info("Method call:remove");
        if (!right_list.isSelectionEmpty()) {
            leftvector.addElement(right_list.getSelectedValue().toString());
            rightvector.remove(right_list.getSelectedIndex());
            Collections.sort(leftvector);
            right_list.setListData(rightvector);
            left_list.setListData(leftvector);


        }

    }//GEN-LAST:event_button_family_removeActionPerformed

    private void button_family_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_family_cancelActionPerformed
        // TODO add your handling code here:
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

    }//GEN-LAST:event_button_family_cancelActionPerformed

    private void button_family_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_family_searchActionPerformed
        try {
            logger.info("Method call:search");

            String sql = ""
                    + "SELECT * "
                    + "FROM   `customer` "
                    + "WHERE  login_login_name =? ";
            stmt = null;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txt_family_search.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User found \n Please verify the existing users before adding ");
                logger.info("User Found");
                flag = true;
                id = rs.getString("idCustomer");


                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `individual` "
                        + "WHERE  `customer_idcustomer` =? ";

                stmt = null;
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, id);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    String name = rs.getString("first_name") + "  " + rs.getString("last_name");
                    combo_family_existing.addItem(name);
                }
                /*NOTE: Fillchannel done here*/
                fillchannel();
            } else {
                JOptionPane.showMessageDialog(null, "User not found ");
                logger.info("User not found");
                flag = false;

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Search " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_family_searchActionPerformed

    private void button_family_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_family_confirmActionPerformed
        // TODO add your handling code here:

        firstname = txt_family_firstname.getText();
        lastname = txt_family_lastname.getText();
        DOB = ((JTextField) date_family_DOB.getDateEditor().getUiComponent()).getText();

        if (flag == true) {

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

            if ("".equals(message)) {
                logger.info("Method call: insertDB");
                insertDB();
            } else {

                JOptionPane.showMessageDialog(null, message);
                logger.error("Error message : " + message);
                message = "";
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please search for the user first");
            logger.error("User not searched");
        }




    }//GEN-LAST:event_button_family_confirmActionPerformed

    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Addition", "Add Family Member", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Added");
            logger.info("Change cancelled");
        } else {
            logger.info("DB Begin");
            String sql = ""
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
                stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, null);
                stmt.setString(2, id);
                stmt.setString(3, firstname);
                stmt.setString(4, lastname);
                stmt.setString(5, DOB);
                stmt.setString(6, Gender);
                stmt.setInt(7, Dategenerator.returnYears(DOB));

                stmt.executeUpdate();


                /*NOTE: Getting the key of newly inserted entry in customers*/
                rs = stmt.getGeneratedKeys();
                rs.next();
                keys = rs.getString(1);


                /*NOTE: Looping is done as the number of selected channels will always vary*/

                for (int i = 0; i < rightvector.size(); i++) {

                    sql = ""
                            + "SELECT * "
                            + "FROM   `channel` "
                            + "WHERE  channel_name =? ";
                    stmt = null;
                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, rightvector.elementAt(i));

                    rs = stmt.executeQuery();

                    rs.next();
                    ch_key = rs.getString("idChannel");




                    sql2 = ""
                            + "INSERT INTO `individual_has_channel` "
                            + "            (`idindividualhaschannel`, "
                            + "             `individual_idindividual`, "
                            + "             `channel_idchannel`) "
                            + "VALUES      (?, "
                            + "             ?, "
                            + "             ?) ";
                    stmt = null;
                    stmt = conn.prepareStatement(sql2);
                    stmt.setString(1, null);
                    stmt.setString(2, keys);
                    stmt.setString(3, ch_key);

                    stmt.executeUpdate();


                }

                logger.info("DB End");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error during inserting  " + ex.getMessage());
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
                new CMmain().setVisible(true);




            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error after inserting everything " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }


        }





    }

    private void radio_family_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_family_maleActionPerformed
        Gender = "m";
    }//GEN-LAST:event_radio_family_maleActionPerformed

    private void radio_family_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_family_femaleActionPerformed
        Gender = "f";
    }//GEN-LAST:event_radio_family_femaleActionPerformed

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
                new Familycustomer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton button_family_add;
    private javax.swing.JButton button_family_cancel;
    private javax.swing.JButton button_family_confirm;
    private javax.swing.JButton button_family_remove;
    private javax.swing.JButton button_family_search;
    private javax.swing.JPanel ch_panel;
    private javax.swing.JComboBox combo_family_existing;
    private com.toedter.calendar.JDateChooser date_family_DOB;
    private javax.swing.JLabel dob_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel exist_label;
    private javax.swing.JPanel exist_panel;
    private javax.swing.JLabel fname_label;
    private javax.swing.JLabel gend_label;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList left_list;
    private javax.swing.JLabel lname_label;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JScrollPane pane_family_left;
    private javax.swing.JPanel per_panel;
    private javax.swing.JRadioButton radio_family_female;
    private javax.swing.JRadioButton radio_family_male;
    private javax.swing.JList right_list;
    private javax.swing.JTextField txt_family_firstname;
    private javax.swing.JTextField txt_family_lastname;
    private javax.swing.JTextField txt_family_search;
    // End of variables declaration//GEN-END:variables
}
