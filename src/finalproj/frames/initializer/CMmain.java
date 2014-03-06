
package finalproj.frames.initializer;

import finalproj.db.ConnectionManager;
import finalproj.frames.customermanagement.Customerloginreset;
import finalproj.frames.customermanagement.Deletecustomer;
import finalproj.frames.customermanagement.Deletefamily;
import finalproj.frames.customermanagement.Familycustomer;
import finalproj.frames.customermanagement.FeedbackCustomer;
import finalproj.frames.customermanagement.Registercustomer;
import finalproj.frames.customermanagement.Registerupdate;
import finalproj.frames.customermanagement.Resetcustomer;
import finalproj.frames.customermanagement.Updatefamily;
import finalproj.frames.payment.Billgenerator;
import finalproj.frames.payment.Billresend;
import finalproj.frames.payment.PaymentManager;
import finalproj.frames.payment.Paymentresend;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;


public class CMmain extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement stmt = null;
    private static Logger logger;

    public CMmain() {
        logger = Logger.getLogger(CMmain.class.getName());
        logger.info("Information Authenticated");
        initComponents();
        this.setLocationRelativeTo(null);
        conn = ConnectionManager.getInstance().getConnection();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_panel = new javax.swing.JPanel();
        panel1 = new javax.swing.JPanel();
        button_deletefamily = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        button_delete = new javax.swing.JButton();
        button_addindividual = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        button_recover = new javax.swing.JButton();
        button_updatefamily = new javax.swing.JButton();
        button_update = new javax.swing.JButton();
        button_complaint = new javax.swing.JButton();
        button_staff_search = new javax.swing.JToggleButton();
        panel3 = new javax.swing.JPanel();
        button_bill = new javax.swing.JButton();
        button_payment = new javax.swing.JButton();
        button_resendbill = new javax.swing.JButton();
        button_resendpayment = new javax.swing.JButton();
        button_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Customer Management Main ");
        setUndecorated(true);
        setResizable(false);

        main_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Option", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N
        main_panel.setPreferredSize(new java.awt.Dimension(1024, 768));

        panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Addition/Removal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_deletefamily.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_deletefamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/user_group_delete.png"))); // NOI18N
        button_deletefamily.setText("Delete Family Member");
        button_deletefamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deletefamilyActionPerformed(evt);
            }
        });

        button_add.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/add.png"))); // NOI18N
        button_add.setText("Add New Customer");
        button_add.setToolTipText("Add New Customer");
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        button_delete.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/delete.png"))); // NOI18N
        button_delete.setText("Delete Customer");
        button_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_deleteActionPerformed(evt);
            }
        });

        button_addindividual.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_addindividual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/user_group_new.png"))); // NOI18N
        button_addindividual.setText("Add Family Member");
        button_addindividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addindividualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(button_add, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_addindividual, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_delete)
                    .addComponent(button_deletefamily, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_add, button_addindividual, button_delete, button_deletefamily});

        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(button_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(button_delete)
                .addGap(63, 63, 63)
                .addComponent(button_addindividual)
                .addGap(66, 66, 66)
                .addComponent(button_deletefamily)
                .addGap(27, 27, 27))
        );

        panel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_add, button_addindividual, button_delete, button_deletefamily});

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_recover.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_recover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/pass.png"))); // NOI18N
        button_recover.setText("Recover Account");
        button_recover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_recoverActionPerformed(evt);
            }
        });

        button_updatefamily.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_updatefamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/user_group_edit.png"))); // NOI18N
        button_updatefamily.setText("Update Family");
        button_updatefamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updatefamilyActionPerformed(evt);
            }
        });

        button_update.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/update.png"))); // NOI18N
        button_update.setText("Update Customer");
        button_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_updateActionPerformed(evt);
            }
        });

        button_complaint.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_complaint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/feed.png"))); // NOI18N
        button_complaint.setText("Complaints/Feedback");
        button_complaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_complaintActionPerformed(evt);
            }
        });

        button_staff_search.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_staff_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/find.png"))); // NOI18N
        button_staff_search.setText("Search Username");
        button_staff_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_staff_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_recover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_updatefamily, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(button_complaint, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(button_staff_search, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_complaint, button_recover, button_staff_search, button_update, button_updatefamily});

        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(button_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(button_recover)
                .addGap(26, 26, 26)
                .addComponent(button_staff_search)
                .addGap(31, 31, 31)
                .addComponent(button_updatefamily)
                .addGap(39, 39, 39)
                .addComponent(button_complaint)
                .addGap(26, 26, 26))
        );

        panel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_complaint, button_recover, button_staff_search, button_update, button_updatefamily});

        panel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transaction", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18))); // NOI18N

        button_bill.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/bill.png"))); // NOI18N
        button_bill.setText("Calculate Bill");
        button_bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_billActionPerformed(evt);
            }
        });

        button_payment.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_payment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/pay.png"))); // NOI18N
        button_payment.setText("Payment");
        button_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_paymentActionPerformed(evt);
            }
        });

        button_resendbill.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_resendbill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/sendbill.png"))); // NOI18N
        button_resendbill.setText("Resend Bill");
        button_resendbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resendbillActionPerformed(evt);
            }
        });

        button_resendpayment.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_resendpayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/sendpay.png"))); // NOI18N
        button_resendpayment.setText("Resend Payment");
        button_resendpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resendpaymentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button_resendpayment)
                    .addComponent(button_payment)
                    .addComponent(button_bill)
                    .addComponent(button_resendbill))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {button_bill, button_payment, button_resendbill, button_resendpayment});

        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(button_bill)
                .addGap(75, 75, 75)
                .addComponent(button_payment)
                .addGap(65, 65, 65)
                .addComponent(button_resendbill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(button_resendpayment)
                .addGap(31, 31, 31))
        );

        panel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {button_bill, button_payment});

        button_exit.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finalproj/frames/icons/exit.png"))); // NOI18N
        button_exit.setText("Exit");
        button_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_exit)
                .addGap(24, 24, 24))
        );

        main_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panel1, panel2});

        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(button_exit)
                .addGap(18, 18, 18)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        main_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panel1, panel2, panel3});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Registercustomer Class Initiated");
            new Registercustomer().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_addActionPerformed

    private void button_addindividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addindividualActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Familycustomer Class Initiated");
            new Familycustomer().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_addindividualActionPerformed

    private void button_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_exitActionPerformed
        try {
            logger.info("Exiting");
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            logger.info("Selector Class Initiated");
            new Selector().setVisible(true);
            this.dispose();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Exception generated" + ex.getMessage());
            logger.fatal("Fatal error", ex);
        }
    }//GEN-LAST:event_button_exitActionPerformed

    private void button_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deleteActionPerformed

        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Deletecustomer Class Initiated");
            new Deletecustomer().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_deleteActionPerformed

    private void button_deletefamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_deletefamilyActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Deletefamily Class Initiated");
            new Deletefamily().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_deletefamilyActionPerformed

    private void button_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updateActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Registerupdate Class Initiated");
            new Registerupdate().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_updateActionPerformed

    private void button_recoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_recoverActionPerformed

        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Resetcustomer Class Initiated");
            new Resetcustomer().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_recoverActionPerformed

    private void button_updatefamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_updatefamilyActionPerformed

        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Updatefamily Class Initiated");
            new Updatefamily().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_updatefamilyActionPerformed

    private void button_complaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_complaintActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Feedbackcustomer Class Initiated");
            new FeedbackCustomer().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_complaintActionPerformed

    private void button_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_paymentActionPerformed

        if (ConnectionManager.getLevel() <= 3) {
            logger.info("PaumentManager Class Initiated");
            new PaymentManager().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_paymentActionPerformed

    private void button_billActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_billActionPerformed

        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Billgenerator Class Initiated");
            new Billgenerator().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_billActionPerformed

    private void button_resendbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resendbillActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Billresend Class Initiated");
            new Billresend().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }




    }//GEN-LAST:event_button_resendbillActionPerformed

    private void button_resendpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resendpaymentActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Paymentresend Class Initiated");
            new Paymentresend().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }

    }//GEN-LAST:event_button_resendpaymentActionPerformed

    private void button_staff_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_staff_searchActionPerformed
        if (ConnectionManager.getLevel() <= 3) {
            logger.info("Staffloginreset Class Initiated");
            new Customerloginreset().setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Authorization Failure");
            logger.warn("Authentication Failure");
        }
    }//GEN-LAST:event_button_staff_searchActionPerformed


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
                new CMmain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_addindividual;
    private javax.swing.JButton button_bill;
    private javax.swing.JButton button_complaint;
    private javax.swing.JButton button_delete;
    private javax.swing.JButton button_deletefamily;
    private javax.swing.JButton button_exit;
    private javax.swing.JButton button_payment;
    private javax.swing.JButton button_recover;
    private javax.swing.JButton button_resendbill;
    private javax.swing.JButton button_resendpayment;
    private javax.swing.JToggleButton button_staff_search;
    private javax.swing.JButton button_update;
    private javax.swing.JButton button_updatefamily;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    // End of variables declaration//GEN-END:variables
}
