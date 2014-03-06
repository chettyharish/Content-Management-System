package finalproj.frames.databasemanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.DMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Sessionadder extends javax.swing.JFrame {

    static DateTimeFormatter inputFormat = DateTimeFormat.forPattern("HH:mm:ss yyyy-MM-dd");
    static DateTimeFormatter outputFormat = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt2 = null;
    private String message = "";
    private String cuid;
    private String indid;
    private String chaid;
    private String proid;
    private String probasetag;
    private static Logger logger;

    public Sessionadder() {
        logger = Logger.getLogger(Sessionadder.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcustomer();
        txt_endtime.setEditable(false);
        txt_programmetime.setEditable(false);
        txt_startime.setEditable(false);


    }

    private void fillcustomer() {
        logger.info("Method call: fillcustomer");
        combo_customerid.removeAllItems();
        String sql = ""
                + "SELECT `idcustomer` "
                + "FROM   `customer` ";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                combo_customerid.addItem(rs.getString("idCustomer"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error During Customer fill" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
        combo_customerid.insertItemAt("", 0);
        combo_customerid.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tag_panel = new javax.swing.JPanel();
        combo_individualid = new javax.swing.JComboBox();
        combo_programmeid = new javax.swing.JComboBox();
        combo_channelid = new javax.swing.JComboBox();
        date_sessiondate = new com.toedter.calendar.JDateChooser();
        txt_endtime = new javax.swing.JTextField();
        txt_startime = new javax.swing.JTextField();
        iid_label = new javax.swing.JLabel();
        pid_label = new javax.swing.JLabel();
        cid_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        stime_label = new javax.swing.JLabel();
        etime_label = new javax.swing.JLabel();
        txt_programmetime = new javax.swing.JTextField();
        ptime_label = new javax.swing.JLabel();
        cuid_label = new javax.swing.JLabel();
        combo_customerid = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_insert = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Session Adder");
        setUndecorated(true);
        setResizable(false);

        tag_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter the Tag", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        combo_individualid.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_individualid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_individualidPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        combo_programmeid.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_programmeid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_programmeidPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        combo_channelid.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_channelid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_channelidPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        date_sessiondate.setDateFormatString("yyyy-MM-dd");
        date_sessiondate.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        date_sessiondate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_sessiondatePropertyChange(evt);
            }
        });

        txt_endtime.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_startime.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        iid_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        iid_label.setText("Individual Id:");

        pid_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pid_label.setText("Programme Id:");

        cid_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cid_label.setText("Channel Id:");

        date_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        date_label.setText("Date:");

        stime_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        stime_label.setText("Starttime:");

        etime_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        etime_label.setText("EndTime");

        txt_programmetime.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        ptime_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ptime_label.setText("Programme Time");

        cuid_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cuid_label.setText("Customer Id:");

        combo_customerid.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_customerid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_customeridPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        button_insert.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_insert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/yes.png"))); // NOI18N
        button_insert.setText("Insert");
        button_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_insertActionPerformed(evt);
            }
        });

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_insert)
                .addGap(68, 68, 68)
                .addComponent(button_exit)
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_exit, button_insert});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_insert)
                    .addComponent(button_exit))
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_exit, button_insert});

        javax.swing.GroupLayout tag_panelLayout = new javax.swing.GroupLayout(tag_panel);
        tag_panel.setLayout(tag_panelLayout);
        tag_panelLayout.setHorizontalGroup(
            tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tag_panelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tag_panelLayout.createSequentialGroup()
                        .addComponent(cuid_label)
                        .addGap(27, 27, 27)
                        .addComponent(combo_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tag_panelLayout.createSequentialGroup()
                        .addComponent(stime_label)
                        .addGap(27, 27, 27)
                        .addComponent(txt_startime, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tag_panelLayout.createSequentialGroup()
                        .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_label)
                            .addComponent(cid_label))
                        .addGap(27, 27, 27)
                        .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_channelid, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_sessiondate, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iid_label)
                    .addComponent(ptime_label)
                    .addComponent(etime_label)
                    .addComponent(pid_label))
                .addGap(44, 44, 44)
                .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_individualid, 0, 116, Short.MAX_VALUE)
                    .addComponent(txt_programmetime)
                    .addComponent(txt_endtime)
                    .addComponent(combo_programmeid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tag_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(207, 207, 207))
        );

        tag_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cid_label, cuid_label, date_label, etime_label, iid_label, pid_label, ptime_label, stime_label});

        tag_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_channelid, combo_customerid, combo_individualid, combo_programmeid, txt_endtime, txt_programmetime, txt_startime});

        tag_panelLayout.setVerticalGroup(
            tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tag_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_individualid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cuid_label)
                    .addComponent(combo_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iid_label))
                .addGap(23, 23, 23)
                .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pid_label)
                    .addComponent(combo_programmeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cid_label)
                    .addComponent(combo_channelid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date_sessiondate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tag_panelLayout.createSequentialGroup()
                        .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ptime_label)
                            .addComponent(date_label)
                            .addComponent(txt_programmetime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tag_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stime_label)
                            .addComponent(txt_startime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etime_label)
                            .addComponent(txt_endtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tag_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cid_label, cuid_label, date_label, etime_label, iid_label, pid_label, ptime_label, stime_label});

        tag_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date_sessiondate, txt_endtime, txt_programmetime, txt_startime});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tag_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(tag_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo_customeridPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_customeridPopupMenuWillBecomeInvisible
        logger.info("Method call: customerselect");

        if (!(combo_customerid.getSelectedItem().toString().equals(""))) {
            combo_individualid.removeAllItems();
            cuid = combo_customerid.getSelectedItem().toString();

            String sql2 = ""
                    + "SELECT * "
                    + "FROM   `individual` "
                    + "WHERE  `customer_idcustomer` =? ";


            try {
                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, cuid);
                rs = stmt.executeQuery();

                while (rs.next()) {

                    combo_individualid.addItem(rs.getString("idIndividual"));
                }


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error During Individual fill" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
            combo_individualid.insertItemAt("", 0);
            combo_individualid.setSelectedIndex(0);

        }


    }//GEN-LAST:event_combo_customeridPopupMenuWillBecomeInvisible

    private void combo_channelidPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_channelidPopupMenuWillBecomeInvisible
        logger.info("Method call: channelselect");
        if (!(combo_channelid.getModel().getSize()==0)) {

            combo_programmeid.removeAllItems();
            chaid = combo_channelid.getSelectedItem().toString();

            String sql3 = ""
                    + "SELECT * "
                    + "FROM   `program` "
                    + "WHERE  `channel_idchannel` =? ";


            try {
                stmt = conn.prepareStatement(sql3);
                stmt.setString(1, chaid);
                rs = stmt.executeQuery();

                while (rs.next()) {

                    combo_programmeid.addItem(rs.getString("idProgram"));
                }


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error During Channel fill" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
        }
        combo_programmeid.insertItemAt("", 0);
        combo_programmeid.setSelectedIndex(0);


    }//GEN-LAST:event_combo_channelidPopupMenuWillBecomeInvisible

    private void combo_individualidPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_individualidPopupMenuWillBecomeInvisible
        logger.info("Method call: individualselect");
        if (!(combo_individualid.getModel().getSize()==0)) {

            combo_channelid.removeAllItems();
            indid = combo_individualid.getSelectedItem().toString();

            String sql3 = ""
                    + "SELECT * "
                    + "FROM   `individual_has_channel` "
                    + "WHERE  `individual_idindividual` =? ";


            try {
                stmt = conn.prepareStatement(sql3);
                stmt.setString(1, indid);
                rs = stmt.executeQuery();

                while (rs.next()) {

                    combo_channelid.addItem(rs.getString("Channel_idChannel"));
                }


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error During Channel fill" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
            combo_channelid.insertItemAt("", 0);
            combo_channelid.setSelectedIndex(0);
        }

    }//GEN-LAST:event_combo_individualidPopupMenuWillBecomeInvisible

    private void combo_programmeidPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_programmeidPopupMenuWillBecomeInvisible
        logger.info("Method call: programmeselect");
        if (!(combo_programmeid.getModel().getSize()==0)) {
            proid = combo_programmeid.getSelectedItem().toString();

            String sql3 = ""
                    + "SELECT * "
                    + "FROM   `program` "
                    + "WHERE  `idProgram` =? ";


            try {
                stmt = conn.prepareStatement(sql3);
                stmt.setString(1, proid);
                rs = stmt.executeQuery();

                if (rs.next()) {
                    probasetag = rs.getString("BaseTag_idBaseTag");
                    txt_programmetime.setText(rs.getString("program_time"));

                }

                if (!"".equals(((JTextField) date_sessiondate.getDateEditor().getUiComponent()).getText())) {

                    getRandomTimesFromSeed(txt_programmetime.getText() + " " + (((JTextField) date_sessiondate.getDateEditor().getUiComponent()).getText()));

                }


            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error During Programme value" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }

        }
    }//GEN-LAST:event_combo_programmeidPopupMenuWillBecomeInvisible

    private void date_sessiondatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_sessiondatePropertyChange

        logger.info("Method call: sessionDate");
        if (!"".equals(((JTextField) date_sessiondate.getDateEditor().getUiComponent()).getText())) {


            if (!"".equals(txt_programmetime.getText())) {
                getRandomTimesFromSeed(txt_programmetime.getText() + " " + (((JTextField) date_sessiondate.getDateEditor().getUiComponent()).getText()));

            }



        }


    }//GEN-LAST:event_date_sessiondatePropertyChange

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed


        try {
            logger.info("Exiting");
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }


            this.dispose();
            new DMMain().setVisible(true);


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error user closing " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_exitActionPerformed

    private void button_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_insertActionPerformed
        logger.info("Method call: accept");
        if ((combo_individualid.getModel().getSize() == 0)) {
            message = message + "Select an Individual; \n";
        }
        if ((combo_channelid.getModel().getSize() == 0)) {
            message = message + "Select an Channel; \n";
        }
        if ((combo_customerid.getModel().getSize() == 0)) {
            message = message + "Select an Customer; \n";
        }
        if ((combo_programmeid.getModel().getSize() == 0)) {
            message = message + "Select an Programme; \n";
        }

        if ("".equals(((JTextField) date_sessiondate.getDateEditor().getUiComponent()).getText())) {
            message = message + "Select a date; \n";
        }

        if ("".equals(message)) {
            logger.info("Method call: insertDB");
            insertDB();
        } else {

            JOptionPane.showMessageDialog(null, message);
            logger.error("Error message : " + message);
            message = "";
        }

    }//GEN-LAST:event_button_insertActionPerformed

    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Addition", "Add Session", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "Session Not Added");
            logger.info("Change cancelled");
        } else {

            try {
                logger.info("DB start");
                String sql = ""
                        + "INSERT INTO `session` "
                        + "            (`idsession`, "
                        + "             `individual_idindividual`, "
                        + "             `program_idprogram`, "
                        + "             `channel_idchannel`, "
                        + "             `starttime`, "
                        + "             `endtime`, "
                        + "             `bill_idbill`) "
                        + "VALUES      (?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?) ";



                stmt = conn.prepareStatement(sql);
                stmt.setString(1, null);
                stmt.setString(2, indid);
                stmt.setString(3, proid);
                stmt.setString(4, chaid);
                stmt.setString(5, txt_startime.getText());
                stmt.setString(6, txt_endtime.getText());
                stmt.setString(7, null);
                stmt.executeUpdate();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception generated during insert Session " + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }


            try {


                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `basetag` "
                        + "WHERE  `idbasetag` =? ";

                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, probasetag);
                rs = stmt.executeQuery();


                if (rs.next()) {

                    if (Dategenerator.returnminutes(txt_startime.getText(), txt_endtime.getText()) > 2) {

                        String sql3 = ""
                                + "INSERT INTO `customerbasetag` "
                                + "            (`idcustomerbasetag`, "
                                + "             `individual_idindividual`, "
                                + "             `technology`, "
                                + "             `entertainment`, "
                                + "             `soap`, "
                                + "             `music`, "
                                + "             `native`, "
                                + "             `speciality`, "
                                + "             `science`, "
                                + "             `session_date`) "
                                + "VALUES      (?, "
                                + "             ?, "
                                + "             ?, "
                                + "             ?, "
                                + "             ?, "
                                + "             ?, "
                                + "             ?, "
                                + "             ?, "
                                + "             ?, "
                                + "             ?) ";





                        stmt2 = conn.prepareStatement(sql3);
                        stmt2.setString(1, null);
                        stmt2.setString(2, indid);
                        stmt2.setString(3, rs.getString("technology"));
                        stmt2.setString(4, rs.getString("entertainment"));
                        stmt2.setString(5, rs.getString("soap"));
                        stmt2.setString(6, rs.getString("music"));
                        stmt2.setString(7, rs.getString("native"));
                        stmt2.setString(8, rs.getString("speciality"));
                        stmt2.setString(9, rs.getString("science"));
                        stmt2.setString(10, ((JTextField) date_sessiondate.getDateEditor().getUiComponent()).getText());
                        stmt2.executeUpdate();
                    }


                }



            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception generated during insert Customer Tag " + ex.getMessage());
                logger.fatal("Fatal error", ex);
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
                if (stmt2 != null) {
                    stmt2.close();
                }


                this.dispose();
                new DMMain().setVisible(true);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }



        }
    }

    /*NOTE: To generate Random times within the programs hour*/
    public void getRandomTimesFromSeed(String inputDateTime) {
        logger.info("Method call: randomtime");
        DateTime seed = inputFormat.parseDateTime(inputDateTime);
        Random random = new Random();
        int seconds1 = random.nextInt(3600);
        int seconds2 = random.nextInt(3600 - seconds1);

        DateTime time1 = new DateTime(seed).plusSeconds(seconds1);
        DateTime time2 = new DateTime(time1).plusSeconds(seconds2);

        txt_startime.setText(outputFormat.print(time1));
        txt_endtime.setText(outputFormat.print(time2));

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
                new Sessionadder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_insert;
    private javax.swing.JLabel cid_label;
    private javax.swing.JComboBox combo_channelid;
    private javax.swing.JComboBox combo_customerid;
    private javax.swing.JComboBox combo_individualid;
    private javax.swing.JComboBox combo_programmeid;
    private javax.swing.JLabel cuid_label;
    private javax.swing.JLabel date_label;
    private com.toedter.calendar.JDateChooser date_sessiondate;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel etime_label;
    private javax.swing.JLabel iid_label;
    private javax.swing.JLabel pid_label;
    private javax.swing.JLabel ptime_label;
    private javax.swing.JLabel stime_label;
    private javax.swing.JPanel tag_panel;
    private javax.swing.JTextField txt_endtime;
    private javax.swing.JTextField txt_programmetime;
    private javax.swing.JTextField txt_startime;
    // End of variables declaration//GEN-END:variables
}
