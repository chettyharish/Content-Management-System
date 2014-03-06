package finalproj.frames.databasemanagement;

import finalproj.arbitraryprograms.LengthVerifier;
import finalproj.arbitraryprograms.TestPattern;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.DMMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

public class Programmodifier extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    ResultSet rs2 = null;
    PreparedStatement stmt2 = null;
    ResultSet rs3 = null;
    PreparedStatement stmt3 = null;
    private String message = "";
    private String proid;
    private String baseid;
    private String channelid;
    static DateFormat fmt = new SimpleDateFormat("HH:00:00");
    private static Logger logger;

    public Programmodifier() {
        logger = Logger.getLogger(Programmodifier.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillprogramme();

    }

    private void fillprogramme() {
        logger.info("Method call: fillprogramme");
        String sql = ""
                + "SELECT * "
                + "FROM   `program` ";

        try {
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                combo_program.addItem(rs.getString("program_name"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error During Programme fill" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
        combo_program.insertItemAt("", 0);
        combo_program.setSelectedIndex(0);

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base_panel = new javax.swing.JPanel();
        pnameedit_label = new javax.swing.JLabel();
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
        button_accept = new javax.swing.JButton();
        button_cancel = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        select_panel = new javax.swing.JPanel();
        pname_label = new javax.swing.JLabel();
        combo_program = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Program Modifier");
        setUndecorated(true);
        setResizable(false);

        base_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Base Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        pnameedit_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pnameedit_label.setText("Programme Name:");

        txt_name.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        ptime_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ptime_label.setText("Programme Time:");

        txt_time.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cname_label.setText("Channel Name:");

        combo_channelname.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout base_panelLayout = new javax.swing.GroupLayout(base_panel);
        base_panel.setLayout(base_panelLayout);
        base_panelLayout.setHorizontalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnameedit_label)
                .addGap(18, 18, 18)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(ptime_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(base_panelLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(cname_label)
                .addGap(18, 18, 18)
                .addComponent(combo_channelname, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        base_panelLayout.setVerticalGroup(
            base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(base_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnameedit_label)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptime_label)
                    .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(base_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cname_label)
                    .addComponent(combo_channelname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        button_delete.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/remove.png"))); // NOI18N
        button_delete.setText("Delete");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(button_accept)
                .addGap(45, 45, 45)
                .addComponent(button_cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_delete)
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_accept, button_cancel, button_delete});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_accept)
                    .addComponent(button_cancel)
                    .addComponent(button_delete))
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_accept, button_cancel, button_delete});

        select_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Programme", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        pname_label.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        pname_label.setText("Programme Name:");

        combo_program.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_program.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_programPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout select_panelLayout = new javax.swing.GroupLayout(select_panel);
        select_panel.setLayout(select_panelLayout);
        select_panelLayout.setHorizontalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(pname_label)
                .addGap(35, 35, 35)
                .addComponent(combo_program, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        select_panelLayout.setVerticalGroup(
            select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(select_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pname_label)
                    .addComponent(combo_program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(end_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slider_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(base_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(base_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(slider_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
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
        txt_entertainment.setText(Integer.toString(slider_entertainment.getValue()));
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
            if (stmt2 != null) {
                stmt2.close();
            }
            if (rs2 != null) {
                rs2.close();
            }
            if (stmt3 != null) {
                stmt3.close();
            }
            if (rs3 != null) {
                rs3.close();
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


        if (!(combo_program.getSelectedItem().toString().equals(""))) {
            if ("".equals(txt_name.getText())) {
                message = message + "Programme Name is Empty  \n";
            }

            if (!TestPattern.spacetextpattern(txt_name.getText())) {
                message = message + "Programme Name Must be Alphanumeric  \n";
            }

            if (!LengthVerifier.lengthString(txt_name.getText())) {
                message = message + "Programme Name Length Must be Less than 40  \n";

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

            /*NOTE: For veryfying if program already exists*/
            if (!txt_name.getText().equals(combo_program.getSelectedItem().toString())) {
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
            }


            /*NOTE: For verifying if channel already booked at the time by other program*/
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

                /*NOTE: We will allow if it is taking the same slot again else there is a conflict with other show*/
                if (rs.next()) {
                    if (!rs.getString("program_name").equals(combo_program.getSelectedItem().toString())) {
                        message = message + "Channel already booked by other show  \n";
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
                logger.fatal("Fatal error", ex);
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
            JOptionPane.showMessageDialog(null, "Select a programme first");
            logger.warn("Programme not selected");
        }
    }//GEN-LAST:event_button_acceptActionPerformed

    private void insertDB() {
        int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Modify Programme", JOptionPane.YES_NO_OPTION);

        if (choice != 0) {
            JOptionPane.showMessageDialog(null, "Programme Not Modified");
            logger.info("Change cancelled");
        } else {

            try {
                logger.info("DB start");
                String sql = ""
                        + "UPDATE `basetag` "
                        + "SET    `science` = ?, "
                        + "       `technology` = ?, "
                        + "       `speciality` = ?, "
                        + "       `native` = ?, "
                        + "       `music` = ?, "
                        + "       `soap` = ?, "
                        + "       `entertainment` = ? "
                        + "WHERE  `idbasetag` =? ";

                stmt = conn.prepareStatement(sql);
                stmt.setString(1, txt_science.getText());
                stmt.setString(2, txt_technology.getText());
                stmt.setString(3, txt_speciality.getText());
                stmt.setString(4, txt_native.getText());
                stmt.setString(5, txt_music.getText());
                stmt.setString(6, txt_soap.getText());
                stmt.setString(7, txt_entertainment.getText());
                stmt.setString(8, baseid);
                stmt.executeUpdate();


                String sql2 = ""
                        + "UPDATE `program` "
                        + "SET    `basetag_idbasetag` = ?, "
                        + "       `channel_idchannel` = ?, "
                        + "       `program_name` = ?, "
                        + "       `program_time` = ? "
                        + "WHERE  `idprogram` =? ";

                stmt = conn.prepareStatement(sql2);
                stmt.setString(1, baseid);
                stmt.setString(2, channelid);
                stmt.setString(3, txt_name.getText());
                stmt.setString(4, txt_time.getText());
                stmt.setString(5, proid);
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
                    if (stmt2 != null) {
                        stmt2.close();
                    }
                    if (rs2 != null) {
                        rs2.close();
                    }
                    if (stmt3 != null) {
                        stmt3.close();
                    }
                    if (rs3 != null) {
                        rs3.close();
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
    private void combo_programPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_programPopupMenuWillBecomeInvisible
        logger.info("Method call: programme");
        fillchannel();
        try {

            String sql = ""
                    + "SELECT * "
                    + "FROM   `program` "
                    + "WHERE  `program_name` =? ";


            stmt = conn.prepareStatement(sql);
            stmt.setString(1, combo_program.getSelectedItem().toString());
            rs = stmt.executeQuery();

            if (rs.next()) {
                proid = rs.getString("idProgram");
                baseid = rs.getString("BaseTag_idBaseTag");
                channelid = rs.getString("Channel_idChannel");
                txt_name.setText(rs.getString("program_name"));
                txt_time.setText(rs.getString("program_time"));

                String sql2 = ""
                        + "SELECT * "
                        + "FROM   `channel` "
                        + "WHERE  `idchannel` =? ";


                stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, channelid);
                rs2 = stmt2.executeQuery();


                if (rs2.next()) {
                    combo_channelname.getModel().setSelectedItem(rs2.getString("channel_name"));
                }


                String sql3 = ""
                        + "SELECT * "
                        + "FROM   `basetag` "
                        + "WHERE  `idbasetag` =? ";

                stmt3 = conn.prepareStatement(sql3);
                stmt3.setString(1, baseid);
                rs3 = stmt3.executeQuery();

                if (rs3.next()) {
                    txt_entertainment.setText(Integer.toString(slider_science.getValue()));
                    txt_technology.setText(Integer.toString(slider_science.getValue()));
                    txt_speciality.setText(Integer.toString(slider_science.getValue()));
                    txt_soap.setText(Integer.toString(slider_science.getValue()));
                    txt_native.setText(Integer.toString(slider_science.getValue()));
                    txt_science.setText(Integer.toString(slider_science.getValue()));
                    txt_music.setText(Integer.toString(slider_science.getValue()));

                    slider_entertainment.setValue(Integer.parseInt(rs3.getString("entertainment")));
                    slider_music.setValue(Integer.parseInt(rs3.getString("music")));
                    slider_native.setValue(Integer.parseInt(rs3.getString("native")));
                    slider_science.setValue(Integer.parseInt(rs3.getString("science")));
                    slider_soap.setValue(Integer.parseInt(rs3.getString("soap")));
                    slider_speciality.setValue(Integer.parseInt(rs3.getString("speciality")));
                    slider_technology.setValue(Integer.parseInt(rs3.getString("technology")));

                }

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }


    }//GEN-LAST:event_combo_programPopupMenuWillBecomeInvisible

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed

        if (!(combo_program.getSelectedItem().toString().equals(""))) {
            int choice = JOptionPane.showConfirmDialog(null, "Confirm the Modification", "Modify Programme", JOptionPane.YES_NO_OPTION);

            if (choice != 0) {
                JOptionPane.showMessageDialog(null, "Programme Not Modified");
                logger.info("Change cancelled");
            } else {
                try {
                    logger.info("Method call: deleteprogram");

                    String sql = ""
                            + "DELETE FROM `session` "
                            + "WHERE  `program_idprogram` =? ";

                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, proid);
                    stmt.executeUpdate();



                    String sql2 = ""
                            + "DELETE FROM `program` "
                            + "WHERE  `idprogram` =? ";

                    stmt = conn.prepareStatement(sql2);
                    stmt.setString(1, proid);
                    stmt.executeUpdate();


                    String sql3 = ""
                            + "DELETE FROM `basetag` "
                            + "WHERE  `idbasetag` =? ";
                    stmt = conn.prepareStatement(sql3);
                    stmt.setString(1, baseid);
                    System.out.println(stmt);
                    stmt.executeUpdate();


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
                        if (rs2 != null) {
                            rs2.close();
                        }
                        if (stmt3 != null) {
                            stmt3.close();
                        }
                        if (rs3 != null) {
                            rs3.close();
                        }

                        this.dispose();
                        new DMMain().setVisible(true);

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }


                } catch (SQLException ex) {
                    logger.fatal("Fatal error", ex);
                }


            }



        } else {
            JOptionPane.showMessageDialog(null, "Select a Programme first");
            logger.warn("Select a Programme first");
        }

    }//GEN-LAST:event_button_deleteActionPerformed

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
                new Programmodifier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base_panel;
    private javax.swing.JButton button_accept;
    private javax.swing.JButton button_cancel;
    private javax.swing.JButton button_delete;
    private javax.swing.JLabel cname_label;
    private javax.swing.JComboBox combo_channelname;
    private javax.swing.JComboBox combo_program;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel enter_label;
    private javax.swing.JLabel music_label;
    private javax.swing.JLabel nat_label;
    private javax.swing.JLabel pname_label;
    private javax.swing.JLabel pnameedit_label;
    private javax.swing.JLabel ptime_label;
    private javax.swing.JLabel science_label;
    private javax.swing.JPanel select_panel;
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
