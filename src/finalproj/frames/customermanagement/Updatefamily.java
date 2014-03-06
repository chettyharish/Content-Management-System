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
import java.util.Collections;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.log4j.Logger;

public class Updatefamily extends javax.swing.JFrame {

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
    private String cuid;
    private String individualid;
    private String chid;
    private static Logger logger;

    public Updatefamily() {
        logger = Logger.getLogger(Updatefamily.class.getName());
        logger.info("Initialization");
        initComponents();

        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();


    }

    public void fill_list() {
        logger.info("Method call: fill channels");
        String sql = ""
                + "SELECT `channel_name` "
                + "FROM   `channel` ";
        try {

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            leftvector = new Vector<String>();

            while (rs.next()) {
                leftvector.add(rs.getString("channel_name"));
            }
            Collections.sort(leftvector);


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fill_list" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }

        String sql2 = ""
                + "SELECT channel.channel_name "
                + "FROM   individual_has_channel "
                + "       INNER JOIN channel "
                + "               ON individual_has_channel.channel_idchannel = channel.idchannel "
                + "WHERE  individual_has_channel.individual_idindividual = ? ";
        try {

            stmt = conn.prepareStatement(sql2);
            stmt.setString(1, individualid);
            rs = stmt.executeQuery();


            rightvector = new Vector<String>();
            while (rs.next()) {
                rightvector.add(rs.getString("channel_name"));
            }

            Collections.sort(rightvector);


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error at fill_list" + ex.getMessage());
            logger.fatal("Fatal error", ex);

        }

        /*NOTE:Removing common items and poulating the lists*/
        leftvector.removeAll(rightvector);
        left_list.setListData(leftvector);
        right_list.setListData(rightvector);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group_gender = new javax.swing.ButtonGroup();
        login_panel = new javax.swing.JPanel();
        login_label = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        button_search = new javax.swing.JButton();
        select_panel = new javax.swing.JPanel();
        select_label = new javax.swing.JLabel();
        combo_individual = new javax.swing.JComboBox();
        per_panel = new javax.swing.JPanel();
        fname_label = new javax.swing.JLabel();
        lname_label = new javax.swing.JLabel();
        dob_label = new javax.swing.JLabel();
        gend_label = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_lastname = new javax.swing.JTextField();
        date_DOB = new com.toedter.calendar.JDateChooser();
        radio_male = new javax.swing.JRadioButton();
        radio_female = new javax.swing.JRadioButton();
        end_panel = new javax.swing.JPanel();
        button_confirm = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();
        ch_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        left_list = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        right_list = new javax.swing.JList();
        move_panel = new javax.swing.JPanel();
        button_add = new javax.swing.JButton();
        button_remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Update Family");
        setUndecorated(true);
        setResizable(false);

        login_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        login_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        login_label.setText("Login Name:");

        txt_search.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        button_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_search.setText("Search");
        button_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_label)
                .addGap(18, 18, 18)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login_label)
                    .addComponent(button_search))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        select_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Individual", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        select_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        select_label.setText("Select Family Member:");

        combo_individual.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_individual.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_individualPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout select_panelLayout = new javax.swing.GroupLayout(select_panel);
        select_panel.setLayout(select_panelLayout);
        select_panelLayout.setHorizontalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(select_label)
                .addGap(18, 18, 18)
                .addComponent(combo_individual, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        select_panelLayout.setVerticalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(select_label)
                .addComponent(combo_individual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        per_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        fname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        fname_label.setText("First Name:");

        lname_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lname_label.setText("Last Name:");

        dob_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        dob_label.setText("DOB:");

        gend_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        gend_label.setText("Gender:");

        txt_firstname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_lastname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        date_DOB.setDateFormatString("yyyy-MM-dd");
        date_DOB.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        group_gender.add(radio_male);
        radio_male.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_male.setText("Male");
        radio_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_maleActionPerformed(evt);
            }
        });

        group_gender.add(radio_female);
        radio_female.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        radio_female.setText("Female");
        radio_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_femaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout per_panelLayout = new javax.swing.GroupLayout(per_panel);
        per_panel.setLayout(per_panelLayout);
        per_panelLayout.setHorizontalGroup(
            per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(per_panelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(per_panelLayout.createSequentialGroup()
                        .addComponent(gend_label)
                        .addGap(29, 29, 29)
                        .addComponent(radio_male)
                        .addGap(28, 28, 28)
                        .addComponent(radio_female))
                    .addGroup(per_panelLayout.createSequentialGroup()
                        .addComponent(dob_label)
                        .addGap(18, 18, 18)
                        .addComponent(date_DOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(per_panelLayout.createSequentialGroup()
                        .addComponent(lname_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_lastname))
                    .addGroup(per_panelLayout.createSequentialGroup()
                        .addComponent(fname_label)
                        .addGap(18, 18, 18)
                        .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        per_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {dob_label, fname_label, gend_label, lname_label});

        per_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {radio_female, radio_male});

        per_panelLayout.setVerticalGroup(
            per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(per_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname_label)
                    .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname_label)
                    .addComponent(txt_lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_DOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(per_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gend_label)
                    .addComponent(radio_male)
                    .addComponent(radio_female))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        per_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dob_label, fname_label, gend_label, lname_label});

        button_confirm.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_confirm.setText("Confirm");
        button_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_confirmActionPerformed(evt);
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
                .addContainerGap()
                .addComponent(button_confirm)
                .addGap(55, 55, 55)
                .addComponent(button_cancel)
                .addContainerGap())
        );
        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_confirm)
                    .addComponent(button_cancel))
                .addContainerGap())
        );

        ch_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Channel list", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        left_list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Available", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), java.awt.Color.black)); // NOI18N
        left_list.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(left_list);

        right_list.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selected", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14), java.awt.Color.black)); // NOI18N
        right_list.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(right_list);

        button_add.setText("Add ---->");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_remove.setText("<----Remove");
        button_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout move_panelLayout = new javax.swing.GroupLayout(move_panel);
        move_panel.setLayout(move_panelLayout);
        move_panelLayout.setHorizontalGroup(
            move_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(move_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(move_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_add, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_remove))
                .addContainerGap())
        );
        move_panelLayout.setVerticalGroup(
            move_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(move_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(button_remove)
                .addContainerGap())
        );

        javax.swing.GroupLayout ch_panelLayout = new javax.swing.GroupLayout(ch_panel);
        ch_panel.setLayout(ch_panelLayout);
        ch_panelLayout.setHorizontalGroup(
            ch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ch_panelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(move_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        ch_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        ch_panelLayout.setVerticalGroup(
            ch_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ch_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(move_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(select_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ch_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(per_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(322, 322, 322))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(per_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ch_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_searchActionPerformed
        try {
            logger.info("Method call: search");

            String sql = ""
                    + "SELECT * "
                    + "FROM   `customer` "
                    + "WHERE  login_login_name =? ";
            stmt = null;
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txt_search.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "User found \n Please verify the existing users before adding ");
                logger.info("User Found");
                flag = true;
                cuid = rs.getString("idCustomer");


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
                    combo_individual.addItem(name);
                }

                combo_individual.insertItemAt("", 0);
                combo_individual.setSelectedIndex(0);
            } else {
                flag = false;
                JOptionPane.showMessageDialog(null, "User not found ");
                logger.info("User not found");

                radio_male.setSelected(false);
                Gender = "";
                radio_female.setSelected(false);
                txt_firstname.setText("");
                txt_lastname.setText("");
                date_DOB.setDate(null);
                combo_individual.removeAllItems();
                combo_individual.insertItemAt("", 0);
                combo_individual.setSelectedIndex(0);
                leftvector.removeAllElements();
                rightvector.removeAllElements();
                left_list.setListData(leftvector);
                right_list.setListData(rightvector);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Search " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


    }//GEN-LAST:event_button_searchActionPerformed

    private void combo_individualPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_individualPopupMenuWillBecomeInvisible

        if (!(combo_individual.getModel().getSize()==0)) {

            logger.info("Method call: individual");
            String sql2 = ""
                    + "SELECT * "
                    + "FROM   `individual` "
                    + "WHERE  `first_name` =? "
                    + "       AND `customer_idcustomer` =? ";

            stmt = null;
            try {
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, combo_individual.getSelectedItem().toString());
                stmt.setString(2, cuid);
                rs = stmt.executeQuery();

                if (rs.next()) {
                    individualid = rs.getString("idIndividual");
                    txt_firstname.setText(rs.getString("first_name"));
                    txt_lastname.setText(rs.getString("last_name"));
                    date_DOB.setDate(Dategenerator.returndateformat(rs.getString("dob")));

                    /*Selecting Gender Radio*/
                    if ("m".equals(rs.getString("Gender"))) {
                        radio_male.setSelected(true);
                        Gender = "m";
                    } else {
                        radio_female.setSelected(true);
                        Gender = "f";
                    }

                }

                /*NOTE: Filling the list using method*/
                fill_list();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in Individual Select " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
        }

    }//GEN-LAST:event_combo_individualPopupMenuWillBecomeInvisible

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        logger.info("Method call: add");
        if (!left_list.isSelectionEmpty()) {
            rightvector.addElement(left_list.getSelectedValue().toString());
            leftvector.remove(left_list.getSelectedIndex());
            Collections.sort(rightvector);
            left_list.setListData(leftvector);
            right_list.setListData(rightvector);
        }
    }//GEN-LAST:event_button_addActionPerformed

    private void button_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_removeActionPerformed
        logger.info("Method call: remove");
        if (!right_list.isSelectionEmpty()) {
            leftvector.addElement(right_list.getSelectedValue().toString());
            rightvector.remove(right_list.getSelectedIndex());
            Collections.sort(leftvector);
            right_list.setListData(rightvector);
            left_list.setListData(leftvector);
        }
    }//GEN-LAST:event_button_removeActionPerformed

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

    private void button_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_confirmActionPerformed

        logger.info("Method call: confirm");
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "Please search for the customer first");
            logger.error("Search missing");
        } else {

            if (!(combo_individual.getSelectedItem().toString().equals(""))) {
                firstname = txt_firstname.getText();
                lastname = txt_lastname.getText();
                DOB = ((JTextField) date_DOB.getDateEditor().getUiComponent()).getText();





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
                    insertDB();
                    logger.info("Method call: insertDB");
                } else {


                    JOptionPane.showMessageDialog(null, message);
                    logger.error("Error message : " + message);
                    message = "";

                }
            } else {

                JOptionPane.showMessageDialog(null, "Please Select an Individual");
                logger.warn("Individual not selected");
            }
        }


    }//GEN-LAST:event_button_confirmActionPerformed

    private void insertDB() {
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Update family", JOptionPane.YES_NO_OPTION);
        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "User Not Modified");
            logger.info("Change Cancelled");
        } else {
            logger.info("DB Begin");

            stmt = null;
            String sql = ""
                    + "UPDATE `individual` "
                    + "SET    `first_name` = ?, "
                    + "       `last_name` = ?, "
                    + "       `dob` = ?, "
                    + "       `gender` = ?, "
                    + "       `age` = ? "
                    + "WHERE  `idindividual` =? ";
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, firstname);
                stmt.setString(2, lastname);
                stmt.setString(3, DOB);
                stmt.setString(4, Gender);
                stmt.setInt(5, Dategenerator.returnYears(DOB));
                stmt.setString(6, individualid);
                stmt.executeUpdate();


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in Update Individual" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            stmt = null;

            String sql2 = ""
                    + "DELETE FROM `individual_has_channel` "
                    + "WHERE  `individual_idindividual` =? ";

            try {
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, individualid);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in Delete Individual Channels" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

            /*NOTE: Looping is done as the number of selected channels will always vary*/
            try {
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
                    chid = rs.getString("idChannel");




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
                    stmt.setString(2, individualid);
                    stmt.setString(3, chid);
                    stmt.executeUpdate();
                }
                logger.info("DB End");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error in Adding Channels" + ex.getMessage());
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
                JOptionPane.showMessageDialog(null, "Error after everything " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

        }

    }

    private void radio_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_maleActionPerformed
        Gender = "m";
    }//GEN-LAST:event_radio_maleActionPerformed

    private void radio_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_femaleActionPerformed
        Gender = "f ";
    }//GEN-LAST:event_radio_femaleActionPerformed

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
                new Updatefamily().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_confirm;
    private javax.swing.JButton button_remove;
    private javax.swing.JButton button_search;
    private javax.swing.JPanel ch_panel;
    private javax.swing.JComboBox combo_individual;
    private com.toedter.calendar.JDateChooser date_DOB;
    private javax.swing.JLabel dob_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel fname_label;
    private javax.swing.JLabel gend_label;
    private javax.swing.ButtonGroup group_gender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList left_list;
    private javax.swing.JLabel lname_label;
    private javax.swing.JLabel login_label;
    private javax.swing.JPanel login_panel;
    private javax.swing.JPanel move_panel;
    private javax.swing.JPanel per_panel;
    private javax.swing.JRadioButton radio_female;
    private javax.swing.JRadioButton radio_male;
    private javax.swing.JList right_list;
    private javax.swing.JLabel select_label;
    private javax.swing.JPanel select_panel;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JTextField txt_lastname;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
