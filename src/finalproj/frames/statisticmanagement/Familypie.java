package finalproj.frames.statisticmanagement;

import finalproj.arbitraryprograms.Dategenerator;
import finalproj.db.ConnectionManager;
import finalproj.db.DBmanager;
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

public class Familypie extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    PreparedStatement stmt = null;
    PreparedStatement stmt2 = null;
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

    public Familypie() {
        logger = Logger.getLogger(Familypie.class.getName());
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

        combo_customerid = new javax.swing.JComboBox();
        cid_label = new javax.swing.JLabel();
        end_panel = new javax.swing.JPanel();
        button_exit = new javax.swing.JButton();
        button_generate = new javax.swing.JButton();
        main_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Family Pie");
        setUndecorated(true);
        setResizable(false);

        combo_customerid.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N

        cid_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cid_label.setText("Customer Id:");

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/no.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        button_generate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_generate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/pie.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_generate)
                .addGap(58, 58, 58)
                .addComponent(button_exit)
                .addGap(52, 52, 52))
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_exit, button_generate});

        end_panelLayout.setVerticalGroup(
            end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(end_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(end_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_generate)
                    .addComponent(button_exit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        end_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_exit, button_generate});

        main_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        main_label.setText("Customer Based Choice Analyzing Pie Diagram");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(main_label)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(cid_label)
                            .addGap(30, 30, 30)
                            .addComponent(combo_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(main_label)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cid_label)
                    .addComponent(combo_customerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addComponent(end_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
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
        logger.info("Method call: generate");
        if (!(combo_customerid.getSelectedItem().toString().equals(""))) {

            cuid = combo_customerid.getSelectedItem().toString();

            logger.info("DB start");
            String sql = ""
                    + "SELECT * "
                    + "FROM   `individual` "
                    + "WHERE  `customer_idcustomer` =? ";
            try {
                stmt = conn.prepareStatement(sql);
                stmt.setString(1, cuid);
                rs = stmt.executeQuery();

                while (rs.next()) {
                    try {

                        String sql2 = ""
                                + "SELECT * "
                                + "FROM   `customerbasetag` "
                                + "WHERE  `individual_idindividual` =? ";


                        stmt2 = conn.prepareStatement(sql2);
                        stmt2.setString(1, rs.getString("idIndividual"));
                        rs2 = stmt2.executeQuery();

                        while (rs2.next()) {

                            technologyvalue += Double.parseDouble(rs2.getString("technology"));
                            entertainmentvalue += Double.parseDouble(rs2.getString("entertainment"));
                            soapvalue += Double.parseDouble(rs2.getString("soap"));
                            musicvalue += Double.parseDouble(rs2.getString("music"));
                            nativevalue += Double.parseDouble(rs2.getString("native"));
                            specialityvalue += Double.parseDouble(rs2.getString("speciality"));
                            sciencevalue += Double.parseDouble(rs2.getString("science"));



                        }

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error During Internal Query" + ex.getMessage());
                        logger.fatal("Fatal error", ex);
                    }


                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error During External Query" + ex.getMessage());
                logger.fatal("Fatal error", ex);
            }
            logger.info("DB end");
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

            JOptionPane.showMessageDialog(null, "Please Select an Customer");
            logger.warn("Customer not selected");
        }

    }//GEN-LAST:event_button_generateActionPerformed

    private void plotGraph() {
        logger.info("Method call: plotgraph");
        DefaultPieDataset p = new DefaultPieDataset();


        p.setValue("Technology \n " + "Value : " + technologyvalue + "\nPercentage : " + technologypercentage, new Double(technologyvalue));
        p.setValue("Entertainment \n " + "Value : " + entertainmentvalue + "\nPercentage : " + entertainmentpercentage, new Double(entertainmentvalue));
        p.setValue("Soap \n " + "Value : " + soapvalue + "\nPercentage : " + soappercentage, new Double(soapvalue));
        p.setValue("Music \n " + "Value : " + musicvalue + "\nPercentage : " + musicpercentage, new Double(musicvalue));
        p.setValue("Native \n " + "Value : " + nativevalue + "\nPercentage : " + nativepercentage, new Double(nativevalue));
        p.setValue("Speciality \n " + "Value : " + specialityvalue + "\nPercentage : " + specialityypercentage, new Double(specialityvalue));
        p.setValue("Science \n " + "Value : " + sciencevalue + "\nPercentage : " + sciencepercentage, new Double(sciencevalue));


        JFreeChart chart = ChartFactory.createPieChart("Customer Choice Evaluation for Cuid: " + cuid, p, false, true, true);
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

        ChartFrame f = new ChartFrame("Customer Choice Evaluation", chart);
        f.setVisible(true);
        f.setSize(800, 600);
        f.setLocationRelativeTo(null);







        try {
            logger.info("Method call: generatepath");
            /*NOTE: Getting path to the Jar file being executed*/
            CodeSource codeSource = DBmanager.class.getProtectionDomain().getCodeSource();
            File jarFile = new File(codeSource.getLocation().toURI().getPath());
            String jarDir = jarFile.getParentFile().getPath();


            /*NOTE: Creating Path Constraints for folder saving*/
            String folderPath = jarDir + "\\images";

            /*NOTE: Creating Folder if it does not exist*/
            File f1 = new File(folderPath);
            f1.mkdir();

            ChartRenderingInfo chartpng = new ChartRenderingInfo(new StandardEntityCollection());

            String savePath = jarDir + "\\images\\" + "Familypie_" + Dategenerator.getCurrentDatepath() + ".png";
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
                new Familypie().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_generate;
    private javax.swing.JLabel cid_label;
    private javax.swing.JComboBox combo_customerid;
    private javax.swing.JPanel end_panel;
    private javax.swing.JLabel main_label;
    // End of variables declaration//GEN-END:variables
}
