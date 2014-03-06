package finalproj.frames.databasemanagement;

import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.DMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Programadder extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private String message = "";
    private String keys;
    private String channelid;
    static DateFormat fmt = new SimpleDateFormat("HH:00:00");
    private static Logger logger;

    public Programadder() {
        logger = Logger.getLogger(Programadder.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillchannel();

    }

    private void fillchannel() {
        logger.info("Method call: fillchannel");
        combo_channelname.removeAllItems();
        String sql = ""
                + "SELECT * "
                + "FROM   `channel` ";


        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                combo_channelname.addItem(rs.getString("channel_name"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error During Customer fill" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
        combo_channelname.insertItemAt("", 0);
        combo_channelname.setSelectedIndex(0);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        top_panel = new javax.swing.JPanel();
        pname_label = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        ptime_label = new javax.swing.JLabel();
        txt_time = new javax.swing.JTextField();
        cname_label = new javax.swing.JLabel();
        combo_channelname = new javax.swing.JComboBox();
        slider_panel = new javax.swing.JPanel();
        txt_music = new javax.swing.JTextField();
        txt_soap = new javax.swing.JTextField();
        txt_entertainment = new javax.swing.JTextField();
        txt_native = new javax.swing.JTextField();
        txt_speciality = new javax.swing.JTextField();
        txt_technology = new javax.swing.JTextField();
        txt_science = new javax.swing.JTextField();
        science_label = new javax.swing.JLabel();
        tech_label = new javax.swing.JLabel();
        spec_label = new javax.swing.JLabel();
        nat_label = new javax.swing.JLabel();
        soap_label = new javax.swing.JLabel();
        music_label = new javax.swing.JLabel();
        enter_label = new javax.swing.JLabel();
        slider_science = new javax.swing.JSlider();
        slider_technology = new javax.swing.JSlider();
        slider_speciality = new javax.swing.JSlider();
        slider_native = new javax.swing.JSlider();
        slider_music = new javax.swing.JSlider();
        slider_soap = new javax.swing.JSlider();
        slider_entertainment = new javax.swing.JSlider();
        end_panel = new javax.swing.JPanel();
        button_cancel = new javax.swing.JButton();
        button_accept = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Program Adder");
        setUndecorated(true);
        setResizable(false);

        top_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        pname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pname_label.setText("Programme Name:");

        txt_name.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        ptime_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ptime_label.setText("Programme Time:");

        txt_time.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cname_label.setText("Channel Name:");

        combo_channelname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout top_panelLayout = new javax.swing.GroupLayout(top_panel);
        top_panel.setLayout(top_panelLayout);
        top_panelLayout.setHorizontalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pname_label)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ptime_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(top_panelLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(cname_label)
                .addGap(18, 18, 18)
                .addComponent(combo_channelname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        top_panelLayout.setVerticalGroup(
            top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pname_label)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptime_label)
                    .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(top_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname_label)
                    .addComponent(combo_channelname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        slider_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Slider Selector", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        txt_music.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_music.setEnabled(false);

        txt_soap.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_soap.setEnabled(false);

        txt_entertainment.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_entertainment.setEnabled(false);

        txt_native.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_native.setEnabled(false);

        txt_speciality.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_speciality.setEnabled(false);

        txt_technology.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_technology.setEnabled(false);

        txt_science.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txt_science.setEnabled(false);

        science_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        science_label.setText("Science");

        tech_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tech_label.setText("Technology");

        spec_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        spec_label.setText("Speciality");

        nat_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        nat_label.setText("Native");

        soap_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        soap_label.setText("Soap");

        music_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        music_label.setText("Music");

        enter_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        enter_label.setText("Entertainment");

        slider_science.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_scienceStateChanged(evt);
            }
        });

        slider_technology.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_technologyStateChanged(evt);
            }
        });

        slider_speciality.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_specialityStateChanged(evt);
            }
        });

        slider_native.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_nativeStateChanged(evt);
            }
        });

        slider_music.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_musicStateChanged(evt);
            }
        });

        slider_soap.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_soapStateChanged(evt);
            }
        });

        slider_entertainment.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slider_entertainmentStateChanged(evt);
            }
        });

        javax.swing.GroupLayout slider_panelLayout = new javax.swing.GroupLayout(slider_panel);
        slider_panel.setLayout(slider_panelLayout);
        slider_panelLayout.setHorizontalGroup(
            slider_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(slider_panelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(slider_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(slider_soap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider_music, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider_native, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider_speciality, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider_technology, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider_science, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(slider_entertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(slider_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(slider_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(slider_panelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(science_label)
                        .addGap(135, 135, 135)
                        .addComponent(spec_label)
                        .addGap(47, 47, 47)
                        .addComponent(nat_label)
                        .addGap(61, 61, 61)
                        .addComponent(music_label)
                        .addGap(55, 55, 55)
                        .addComponent(soap_label, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enter_label))
                    .addGroup(slider_panelLayout.createSequentialGroup()
                        .addGroup(slider_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tech_label)
                            .addGroup(slider_panelLayout.createSequentialGroup()
                                .addComponent(txt_science, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_technology, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(txt_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_native, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_music, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_soap, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_entertainment, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        slider_panelLayout.setVerticalGroup(
            slider_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slider_panelLayout.createSequentialGroup()
                .addComponent(slider_science, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slider_technology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slider_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slider_native, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slider_music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slider_soap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slider_entertainment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(slider_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(science_label)
                    .addComponent(tech_label)
                    .addComponent(spec_label)
                    .addComponent(nat_label)
                    .addComponent(music_label)
                    .addComponent(soap_label)
                    .addComponent(enter_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(slider_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_science, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_technology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_native, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_music, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_soap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_entertainment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

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
                .addGap(45, 45, 45)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slider_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(top_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(slider_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slider_scienceStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_scienceStateChanged

        txt_science.setText(Integer.toString(slider_science.getValue()));
    }//GEN-LAST:event_slider_scienceStateChanged

    private void slider_technologyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_technologyStateChanged
        txt_technology.setText(Integer.toString(slider_technology.getValue()));
    }//GEN-LAST:event_slider_technologyStateChanged

    private void slider_specialityStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_specialityStateChanged

        txt_speciality.setText(Integer.toString(slider_speciality.getValue()));
    }//GEN-LAST:event_slider_specialityStateChanged

    private void slider_nativeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_nativeStateChanged
        txt_native.setText(Integer.toString(slider_native.getValue()));
    }//GEN-LAST:event_slider_nativeStateChanged

    private void slider_musicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_musicStateChanged
        txt_music.setText(Integer.toString(slider_music.getValue()));
    }//GEN-LAST:event_slider_musicStateChanged

    private void slider_soapStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_soapStateChanged
        txt_soap.setText(Integer.toString(slider_soap.getValue()));
    }//GEN-LAST:event_slider_soapStateChanged

    private void slider_entertainmentStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slider_entertainmentStateChanged

        txt_entertainment.setText("" + slider_entertainment.getValue());
    }//GEN-LAST:event_slider_entertainmentStateChanged

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
            new DMMain().setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_cancelActionPerformed

    private void button_acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_acceptActionPerformed
        logger.info("Method call: accept");
              
        if ("".equals(txt_name.getText())) {
            message = message + "Advertisement Name is Empty  \n";
        }

        if (!TestPattern.spacetextpattern(txt_name.getText())) {
            message = message + "Advertisement Name Must be Alphanumeric  \n";
        }

        if (!LengthVerifier.lengthString(txt_name.getText())) {
            message = message + "Advertisement Name Length Must be Less than 40  \n";

        }

        if ("".equals(txt_time.getText())) {
            message = message + "Time is Empty  \n";
        }

        try {
            fmt.setLenient(false);
            Date theDate = fmt.parse(txt_time.getText());

        } catch (ParseException ex) {
            message = message + "Incorrect Time Value Please enter in HH:00:00 format  \n";

        }

        if ("".equals(combo_channelname.getSelectedItem().toString())) {
            message = message + "Please Select a Channel  \n";
        }

        if ("".equals(txt_science.getText())) {
            message = message + "Science Value is Empty  \n";
        }

        if ("".equals(txt_technology.getText())) {
            message = message + "Technology Value is Empty  \n";
        }

        if ("".equals(txt_speciality.getText())) {
            message = message + "Speciality Value is Empty  \n";
        }

        if ("".equals(txt_native.getText())) {
            message = message + "Native Value is Empty  \n";
        }

        if ("".equals(txt_music.getText())) {
            message = message + "Music Value is Empty  \n";
        }

        if ("".equals(txt_soap.getText())) {
            message = message + "Soap Value is Empty  \n";
        }

        if ("".equals(txt_entertainment.getText())) {
            message = message + "Entertainment Value is Empty  \n";
        }


        /*NOTE: For veryfying if program already exists*/
        String sql = ""
                + "SELECT * "
                + "FROM   `program` "
                + "WHERE  `program_name` =? ";

        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, txt_name.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                message = message + "Programme already exists  \n";
            }


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


        /*NOTE: For verifying if channel already booked at the time both the SQL statements*/

        String sql2 = ""
                + "SELECT * "
                + "FROM   `channel` "
                + "WHERE  `channel_name` =? ";

        try {
            stmt = conn.prepareStatement(sql2);
            stmt.setString(1, combo_channelname.getSelectedItem().toString());
            rs = stmt.executeQuery();

            if (rs.next()) {
                channelid = rs.getString("idChannel");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


        String sql3 = ""
                + "SELECT * "
                + "FROM   `program` "
                + "WHERE  `channel_idchannel` =? "
                + "       AND `program_time` =? ";


        try {
            stmt = conn.prepareStatement(sql3);
            stmt.setString(1, channelid);
            stmt.setString(2, txt_time.getText());
            rs = stmt.executeQuery();

            if (rs.next()) {
                message = message + "Channel already booked by other show  \n";
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }



        if ("".equals(message)) {
            insertDB();
        } else {

            JOptionPane.showMessageDialog(null, message);
            logger.error("Error message : " + message);
            message = "";
        }

    }//GEN-LAST:event_button_acceptActionPerformed
    private void insertDB() {

        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Addition", "Add Programme", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "Programme Not Added");
            logger.info("Change cancelled");
        } else {
            try {
                logger.info("DB begin");
                String sql = ""
                        + "INSERT INTO `basetag` "
                        + "            (`idbasetag`, "
                        + "             `science`, "
                        + "             `technology`, "
                        + "             `speciality`, "
                        + "             `native`, "
                        + "             `music`, "
                        + "             `soap`, "
                        + "             `entertainment`) "
                        + "VALUES      (?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?) ";

                stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, null);
                stmt.setString(2, txt_science.getText());
                stmt.setString(3, txt_technology.getText());
                stmt.setString(4, txt_speciality.getText());
                stmt.setString(5, txt_native.getText());
                stmt.setString(6, txt_music.getText());
                stmt.setString(7, txt_soap.getText());
                stmt.setString(8, txt_entertainment.getText());
                stmt.executeUpdate();

                rs = stmt.getGeneratedKeys();
                rs.next();
                keys = rs.getString(1);


                String sql2 = ""
                        + "INSERT INTO `program` "
                        + "            (`idprogram`, "
                        + "             `basetag_idbasetag`, "
                        + "             `channel_idchannel`, "
                        + "             `program_name`, "
                        + "             `program_time`) "
                        + "VALUES      (?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?, "
                        + "             ?) ";



                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, null);
                stmt.setString(2, keys);
                stmt.setString(3, channelid);
                stmt.setString(4, txt_name.getText());
                stmt.setString(5, txt_time.getText());
                stmt.executeUpdate();
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
                    new DMMain().setVisible(true);

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception generated during insert" + ex.getMessage());
                logger.fatal("Fatal error", ex);
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
                new Programadder().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JLabel cname_label;
    private javax.swing.JComboBox combo_channelname;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel enter_label;
    private javax.swing.JLabel music_label;
    private javax.swing.JLabel nat_label;
    private javax.swing.JLabel pname_label;
    private javax.swing.JLabel ptime_label;
    private javax.swing.JLabel science_label;
    private javax.swing.JSlider slider_entertainment;
    private javax.swing.JSlider slider_music;
    private javax.swing.JSlider slider_native;
    private javax.swing.JPanel slider_panel;
    private javax.swing.JSlider slider_science;
    private javax.swing.JSlider slider_soap;
    private javax.swing.JSlider slider_speciality;
    private javax.swing.JSlider slider_technology;
    private javax.swing.JLabel soap_label;
    private javax.swing.JLabel spec_label;
    private javax.swing.JLabel tech_label;
    private javax.swing.JPanel top_panel;
    private javax.swing.JTextField txt_entertainment;
    private javax.swing.JTextField txt_music;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_native;
    private javax.swing.JTextField txt_science;
    private javax.swing.JTextField txt_soap;
    private javax.swing.JTextField txt_speciality;
    private javax.swing.JTextField txt_technology;
    private javax.swing.JTextField txt_time;
    // End of variables declaration//GEN-END:variables
}
