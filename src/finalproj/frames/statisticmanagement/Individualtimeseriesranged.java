package finalproj.frames.statisticmanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.STMMain;
import java.awt.Color;
import java.awt.Shape;
import java.io.File;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.time.Day;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.ui.RectangleInsets;
import org.jfree.util.ShapeUtilities;
import org.apache.log4j.Logger;

public class Individualtimeseriesranged extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private double technologyvalue;
    private double entertainmentvalue;
    private double soapvalue;
    private double musicvalue;
    private double nativevalue;
    private double specialityvalue;
    private double sciencevalue;
    private double counter;
    private String cuid;
    private static Logger logger;

    public Individualtimeseriesranged() {
        logger = Logger.getLogger(Individualtimeseriesranged.class.getName());
        logger.info("Initialization");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();
        fillcustomer();

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

        main_panel = new javax.swing.JPanel();
        main_label = new javax.swing.JLabel();
        combo_individualid = new javax.swing.JComboBox();
        iid_label = new javax.swing.JLabel();
        cid_label = new javax.swing.JLabel();
        end_panel = new javax.swing.JPanel();
        button_exit = new javax.swing.JButton();
        button_generate = new javax.swing.JButton();
        combo_customerid = new javax.swing.JComboBox();
        date_start = new com.toedter.calendar.JDateChooser();
        date_end = new com.toedter.calendar.JDateChooser();
        edate_label = new javax.swing.JLabel();
        sdate_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Individual TS ranged");
        setResizable(false);
        setUndecorated(true);

        main_label.setFont(new java.awt.Font("Calibri", 1, 18));
        main_label.setText("Individual Based Choice Analyzing Time Series");

        combo_individualid.setFont(new java.awt.Font("Calibri", 1, 14));

        iid_label.setFont(new java.awt.Font("Calibri", 0, 18));
        iid_label.setText("Individual Id:");

        cid_label.setFont(new java.awt.Font("Calibri", 0, 18));
        cid_label.setText("Customer Id:");

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14));
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        button_generate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/linesrange.png"))); // NOI18N
        button_generate.setText("Generate");
        button_generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout end_panelLayout = new javax.swing.GroupLayout(end_panel);
        end_panel.setLayout(end_panelLayout);
        end_panelLayout.setHorizontalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_generate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(button_exit)
                .addGap(34, 34, 34))
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_exit, button_generate});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_exit)
                    .addComponent(button_generate))
                .addContainerGap())
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_exit, button_generate});

        combo_customerid.setFont(new java.awt.Font("Calibri", 1, 14));
        combo_customerid.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo_customeridPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        date_start.setDateFormatString("yyyy-MM-dd");
        date_start.setFont(new java.awt.Font("Calibri", 0, 14));

        date_end.setDateFormatString("yyyy-MM-dd");
        date_end.setFont(new java.awt.Font("Calibri", 0, 14));

        edate_label.setFont(new java.awt.Font("Calibri", 0, 14));
        edate_label.setText("End Date:");

        sdate_label.setFont(new java.awt.Font("Calibri", 0, 14));
        sdate_label.setText("Start Date:");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, main_panelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sdate_label)
                        .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(date_end, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(main_panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(main_panelLayout.createSequentialGroup()
                                        .addComponent(date_start, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(edate_label)
                                        .addGap(111, 111, 111))
                                    .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(main_label)
                                        .addGroup(main_panelLayout.createSequentialGroup()
                                            .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cid_label)
                                                .addComponent(iid_label))
                                            .addGap(58, 58, 58)
                                            .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(combo_customerid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(combo_individualid, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(48, 48, 48))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cid_label)
                    .addComponent(combo_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iid_label)
                    .addComponent(combo_individualid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(date_start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(date_end, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(edate_label, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(sdate_label, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            new STMMain().setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error user closing " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_exitActionPerformed

    private void button_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_generateActionPerformed
        logger.info("Method call: Generate");
        TimeSeries s1 = new TimeSeries("Technology", Day.class);
        TimeSeries s2 = new TimeSeries("Entertainment", Day.class);
        TimeSeries s3 = new TimeSeries("Soap", Day.class);
        TimeSeries s4 = new TimeSeries("Music", Day.class);
        TimeSeries s5 = new TimeSeries("Native", Day.class);
        TimeSeries s6 = new TimeSeries("Speciality", Day.class);
        TimeSeries s7 = new TimeSeries("Science", Day.class);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date plotdate;

        if ("".equals(((JTextField) date_start.getDateEditor().getUiComponent()).getText()) || "".equals(((JTextField) date_end.getDateEditor().getUiComponent()).getText())) {
            JOptionPane.showMessageDialog(null, "Please Select both the start and end Dates");
            logger.error("Date Error");
        } else {
            logger.info("DB start");
            if (!(combo_customerid.getSelectedItem().toString().equals(""))) {
                if (!(combo_individualid.getSelectedItem().toString().equals(""))) {
                    String sql = ""
                            + "SELECT * "
                            + "FROM   `customerbasetag` "
                            + "WHERE  `individual_idindividual` =? "
                            + "       AND `session_date` BETWEEN ? AND ? "
                            + "ORDER  BY `session_date` ";

                    try {
                        stmt = conn.prepareStatement(sql);
                        stmt.setString(1, combo_individualid.getSelectedItem().toString());
                        stmt.setString(2, ((JTextField) date_start.getDateEditor().getUiComponent()).getText());
                        stmt.setString(3, ((JTextField) date_end.getDateEditor().getUiComponent()).getText());

                        rs = stmt.executeQuery();

                        while (rs.next()) {
                            counter++;

                            try {

                                plotdate = sdf.parse(rs.getString("session_date"));
                                technologyvalue += Double.parseDouble(rs.getString("technology"));
                                entertainmentvalue += Double.parseDouble(rs.getString("entertainment"));
                                soapvalue += Double.parseDouble(rs.getString("soap"));
                                musicvalue += Double.parseDouble(rs.getString("music"));
                                nativevalue += Double.parseDouble(rs.getString("native"));
                                specialityvalue += Double.parseDouble(rs.getString("speciality"));
                                sciencevalue += Double.parseDouble(rs.getString("science"));

                                s1.addOrUpdate(new Day(plotdate), new Integer((int) Math.round(technologyvalue / counter)));
                                s2.addOrUpdate(new Day(plotdate), new Integer((int) Math.round(entertainmentvalue / counter)));
                                s3.addOrUpdate(new Day(plotdate), new Integer((int) Math.round(soapvalue / counter)));
                                s4.addOrUpdate(new Day(plotdate), new Integer((int) Math.round(musicvalue / counter)));
                                s5.addOrUpdate(new Day(plotdate), new Integer((int) Math.round(nativevalue / counter)));
                                s6.addOrUpdate(new Day(plotdate), new Integer((int) Math.round(specialityvalue / counter)));
                                s7.addOrUpdate(new Day(plotdate), new Integer((int) Math.round(sciencevalue / counter)));

                            } catch (ParseException ex) {
                                JOptionPane.showMessageDialog(null, "Parse Exception" + ex.getMessage());
                                logger.fatal("Fatal error", ex);
                            }

                        }

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error During Session Select" + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }
                    logger.info("DB end");
                    /*NOTE: Chart plotting here*/
                    TimeSeriesCollection dataset = new TimeSeriesCollection();
                    dataset.addSeries(s1);
                    dataset.addSeries(s2);
                    dataset.addSeries(s3);
                    dataset.addSeries(s4);
                    dataset.addSeries(s5);
                    dataset.addSeries(s6);
                    dataset.addSeries(s7);
                    JFreeChart chart = ChartFactory.createTimeSeriesChart("Time Series Chart for Individual id: " + combo_individualid.getSelectedItem().toString(), "Date", "Value", dataset, true, true, false);

                    Shape theShape = ShapeUtilities.createDiamond(1);

                    XYPlot plot = (XYPlot) chart.getPlot();
                    plot.setBackgroundPaint(Color.lightGray);
                    plot.setDomainGridlinePaint(Color.white);
                    plot.setRangeGridlinePaint(Color.white);
                    plot.setAxisOffset(new RectangleInsets(5.0, 5.0, 5.0, 5.0));
                    plot.setDomainCrosshairVisible(true);
                    plot.setRangeCrosshairVisible(true);




                    XYLineAndShapeRenderer renderer = (XYLineAndShapeRenderer) plot.getRenderer();

                    renderer.setSeriesShape(0, theShape);
                    renderer.setSeriesShape(1, theShape);
                    renderer.setSeriesShape(2, theShape);
                    renderer.setSeriesShape(3, theShape);
                    renderer.setSeriesShape(4, theShape);
                    renderer.setSeriesShape(5, theShape);
                    renderer.setSeriesShape(6, theShape);
                    renderer.setSeriesShapesVisible(0, true);
                    renderer.setSeriesShapesVisible(1, true);
                    renderer.setSeriesShapesVisible(2, true);
                    renderer.setSeriesShapesVisible(3, true);
                    renderer.setSeriesShapesVisible(4, true);
                    renderer.setSeriesShapesVisible(5, true);
                    renderer.setSeriesShapesVisible(6, true);

                    renderer.setSeriesPaint(0, new Color(97, 123, 45));
                    renderer.setSeriesPaint(1, new Color(82, 59, 111));
                    renderer.setSeriesPaint(2, new Color(33, 109, 130));
                    renderer.setSeriesPaint(3, new Color(154, 82, 24));
                    renderer.setSeriesPaint(4, new Color(150, 46, 44));
                    renderer.setSeriesPaint(5, new Color(0, 0, 0));
                    renderer.setSeriesPaint(6, new Color(200, 39, 37));





                    ChartFrame f = new ChartFrame("Individual Choice Evaluation", chart);
                    f.setVisible(true);
                    f.setSize(800, 600);
                    f.setLocationRelativeTo(null);

                    try {
                        logger.info("Method call: pathgenerate");
                        /*NOTE: Getting path to the Jar file being executed*/
                        CodeSource codeSource = Individualtimeseriesranged.class.getProtectionDomain().getCodeSource();
                        File jarFile = new File(codeSource.getLocation().toURI().getPath());
                        String jarDir = jarFile.getParentFile().getPath();


                        /*NOTE: Creating Path Constraints for folder saving*/
                        String folderPath = jarDir + "\\images";

                        /*NOTE: Creating Folder if it does not exist*/
                        File f1 = new File(folderPath);
                        f1.mkdir();

                        ChartRenderingInfo chartpng = new ChartRenderingInfo(new StandardEntityCollection());

                        String savePath = jarDir + "\\images\\" + "IndividualTSRange_" + Dategenerator.getCurrentDatepath() + ".png";
                        File f2 = new File(savePath);
                        ChartUtilities.saveChartAsPNG(f2, chart, 800, 600, chartpng);

                        logger.info("Method call: .png saved");


                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Error at Generating png" + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }

                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                        if (rs != null) {
                            rs.close();
                        }

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error after inserting " + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }




                } else {

                    JOptionPane.showMessageDialog(null, "Please Select an Individual");
                    logger.error("Individual not selected");
                }
            } else {

                JOptionPane.showMessageDialog(null, "Please Select an Customer");
                logger.error("Select an individual");
            }

        }
    }//GEN-LAST:event_button_generateActionPerformed

    private void combo_customeridPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo_customeridPopupMenuWillBecomeInvisible
        logger.info("Method call: customerid");
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
                new Individualtimeseriesranged().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_generate;
    private javax.swing.JLabel cid_label;
    private javax.swing.JComboBox combo_customerid;
    private javax.swing.JComboBox combo_individualid;
    private com.toedter.calendar.JDateChooser date_end;
    private com.toedter.calendar.JDateChooser date_start;
    private javax.swing.JLabel edate_label;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel iid_label;
    private javax.swing.JLabel main_label;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel sdate_label;
    // End of variables declaration//GEN-END:variables
}
