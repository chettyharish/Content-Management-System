package finalproj.frames.statisticmanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.frames.initializer.STMMain;
import java.awt.Color;
import java.io.File;
import java.security.CodeSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartRenderingInfo;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.entity.StandardEntityCollection;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class Individualpie extends javax.swing.JFrame {

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
    private double sum;
    private double technologypercentage;
    private double entertainmentpercentage;
    private double soappercentage;
    private double musicpercentage;
    private double nativepercentage;
    private double specialityypercentage;
    private double sciencepercentage;
    private String cuid;
    private static Logger logger;

    public Individualpie() {
        logger = Logger.getLogger(Individualpie.class.getName());
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

        cid_label = new javax.swing.JLabel();
        iid_label = new javax.swing.JLabel();
        combo_customerid = new javax.swing.JComboBox();
        combo_individualid = new javax.swing.JComboBox();
        end_panel = new javax.swing.JPanel();
        button_exit = new javax.swing.JButton();
        button_generate = new javax.swing.JButton();
        main_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Individual Pie");
        setResizable(false);
        setUndecorated(true);

        cid_label.setFont(new java.awt.Font("Calibri", 0, 18));
        cid_label.setText("Customer Id:");

        iid_label.setFont(new java.awt.Font("Calibri", 0, 18));
        iid_label.setText("Individual Id:");

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

        combo_individualid.setFont(new java.awt.Font("Calibri", 1, 14));

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14));
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        button_generate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/pieindi.png"))); // NOI18N
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(button_exit)
                .addContainerGap())
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

        main_label.setFont(new java.awt.Font("Calibri", 1, 18));
        main_label.setText("Individual Based Choice Analyzing Pie Diagram");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(end_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(main_label)
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cid_label)
                    .addComponent(iid_label))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combo_customerid, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combo_individualid, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cid_label, iid_label});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_customerid, combo_individualid});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(main_label)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cid_label)
                    .addComponent(combo_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iid_label)
                    .addComponent(combo_individualid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cid_label, iid_label});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_customerid, combo_individualid});

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void button_generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_generateActionPerformed

        logger.info("Method call: generate");
        if (!(combo_customerid.getSelectedItem().toString().equals(""))) {
            if (!(combo_individualid.getSelectedItem().toString().equals(""))) {
                String sql = ""
                        + "SELECT * "
                        + "FROM   `customerbasetag` "
                        + "WHERE  `individual_idindividual` =? ";

                try {

                    stmt = conn.prepareStatement(sql);
                    stmt.setString(1, combo_individualid.getSelectedItem().toString());
                    rs = stmt.executeQuery();


                    while (rs.next()) {

                        technologyvalue += Double.parseDouble(rs.getString("technology"));
                        entertainmentvalue += Double.parseDouble(rs.getString("entertainment"));
                        soapvalue += Double.parseDouble(rs.getString("soap"));
                        musicvalue += Double.parseDouble(rs.getString("music"));
                        nativevalue += Double.parseDouble(rs.getString("native"));
                        specialityvalue += Double.parseDouble(rs.getString("speciality"));
                        sciencevalue += Double.parseDouble(rs.getString("science"));


                    }



                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error During Session Select" + ex.getMessage());
                    logger.fatal("Fatal error", ex);
                }


                /*Note: Calculations for percentage*/
                sum = technologyvalue + entertainmentvalue + soapvalue + musicvalue + nativevalue + specialityvalue + sciencevalue;
                technologypercentage = Math.round((technologyvalue / sum) * 100);
                entertainmentpercentage = Math.round((entertainmentvalue / sum) * 100);
                soappercentage = Math.round((soapvalue / sum) * 100);
                musicpercentage = Math.round((musicvalue / sum) * 100);
                nativepercentage = Math.round((nativevalue / sum) * 100);
                specialityypercentage = Math.round((specialityvalue / sum) * 100);
                sciencepercentage = Math.round((sciencevalue / sum) * 100);
                plotGraph();

            } else {

                JOptionPane.showMessageDialog(null, "Please Select an Individual");
                logger.error("Select an individual");
            }
        } else {

            JOptionPane.showMessageDialog(null, "Please Select an Customer");
            logger.error("Select an individual");
        }



    }//GEN-LAST:event_button_generateActionPerformed

    private void plotGraph() {
        logger.info("Method call: plotGraph");
        DefaultPieDataset p = new DefaultPieDataset();


        p.setValue("Technology \n " + "Value : " + technologyvalue + "\nPercentage : " + technologypercentage, new Double(technologyvalue));
        p.setValue("Entertainment \n " + "Value : " + entertainmentvalue + "\nPercentage : " + entertainmentpercentage, new Double(entertainmentvalue));
        p.setValue("Soap \n " + "Value : " + soapvalue + "\nPercentage : " + soappercentage, new Double(soapvalue));
        p.setValue("Music \n " + "Value : " + musicvalue + "\nPercentage : " + musicpercentage, new Double(musicvalue));
        p.setValue("Native \n " + "Value : " + nativevalue + "\nPercentage : " + nativepercentage, new Double(nativevalue));
        p.setValue("Speciality \n " + "Value : " + specialityvalue + "\nPercentage : " + specialityypercentage, new Double(specialityvalue));
        p.setValue("Science \n " + "Value : " + sciencevalue + "\nPercentage : " + sciencepercentage, new Double(sciencevalue));


        JFreeChart chart = ChartFactory.createPieChart("Individual Choice Evaluation for Cuid: " + cuid + " Id :" + combo_individualid.getSelectedItem().toString(), p, false, true, true);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setIgnoreNullValues(true);
        plot.setIgnoreZeroValues(true);

        /*NOTE: Setting RGB Colors of sections*/
        plot.setSectionPaint(1, new Color(97, 123, 45));
        plot.setSectionPaint(2, new Color(82, 59, 111));
        plot.setSectionPaint(3, new Color(33, 109, 130));
        plot.setSectionPaint(4, new Color(154, 82, 24));
        plot.setSectionPaint(5, new Color(150, 46, 44));
        plot.setSectionPaint(6, new Color(43, 87, 140));
        plot.setSectionPaint(7, new Color(132, 39, 37));

        ChartFrame f = new ChartFrame("Individual Choice Evaluation", chart);
        f.setVisible(true);
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);




        try {
            logger.info("Method call: pathgenerate");
            /*NOTE: Getting path to the Jar file being executed*/
            CodeSource codeSource = Individualpie.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();


            /*NOTE: Creating Path Constraints for folder saving*/
            String folderPath = jarDir + "\\images";

            /*NOTE: Creating Folder if it does not exist*/
            File f1 = new File(folderPath);
            f1.mkdir();

            ChartRenderingInfo chartpng = new ChartRenderingInfo(new StandardEntityCollection());

            String savePath = jarDir + "\\images\\" + "Individualpie_" + Dategenerator.getCurrentDatepath() + ".png";
            File f2 = new File(savePath);
            ChartUtilities.saveChartAsPNG(f2, chart, 800, 600, chartpng);




        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error at Generating png" + ex.getMessage());
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

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error after inserting " + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }

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
                new Individualpie().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_generate;
    private javax.swing.JLabel cid_label;
    private javax.swing.JComboBox combo_customerid;
    private javax.swing.JComboBox combo_individualid;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel iid_label;
    private javax.swing.JLabel main_label;
    // End of variables declaration//GEN-END:variables
}
