
package finalproj.frames.payment;


public class DCPanel extends javax.swing.JPanel {

    public String getCombo_dc_type() {
        return combo_dc_type.getSelectedItem().toString();
    }

    public String getTxt_dc_cvv() {
        return txt_dc_cvv.getText().toString();
    }

    public String getTxt_dc_date() {
        return txt_dc_date.getText().toString();
    }

    public String getTxt_dc_number() {
        return txt_dc_number.getText().toString();
    }

    public String getTxt_dc_owner() {
        return txt_dc_owner.getText().toString();
    }

    public String getTxt_dc_year() {
        return txt_dc_year.getText().toString();
    }


    public DCPanel() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_label = new javax.swing.JLabel();
        bank_label = new javax.swing.JLabel();
        combo_dc_type = new javax.swing.JComboBox();
        own_label = new javax.swing.JLabel();
        txt_dc_owner = new javax.swing.JTextField();
        cn_label = new javax.swing.JLabel();
        txt_dc_number = new javax.swing.JTextField();
        cvv_label = new javax.swing.JLabel();
        txt_dc_cvv = new javax.swing.JTextField();
        year_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        txt_dc_date = new javax.swing.JTextField();
        txt_dc_year = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(550, 250));

        main_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        main_label.setText("Debit Card");

        bank_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        bank_label.setText("Debit Card Bank:");

        combo_dc_type.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_dc_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Axis Bank", "Citibank", "HDFC Bank", "ICICI Bank", "State Bank of India" }));

        own_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        own_label.setText("Debit Card Owner:");

        txt_dc_owner.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cn_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cn_label.setText("Debit Card Number:");

        txt_dc_number.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        cvv_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cvv_label.setText("CVV Number:");

        txt_dc_cvv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        year_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        year_label.setText("Expiry Year:");

        date_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        date_label.setText("Expiry Date:");

        txt_dc_date.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_dc_year.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(main_label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bank_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(combo_dc_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(own_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_dc_owner))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cn_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_dc_number))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cvv_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_dc_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(year_label)
                                .addGap(18, 18, 18)
                                .addComponent(txt_dc_year, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(date_label)
                                .addGap(27, 27, 27)
                                .addComponent(txt_dc_date, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 85, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bank_label, cn_label, cvv_label, own_label});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_dc_type, txt_dc_cvv, txt_dc_number, txt_dc_owner});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bank_label)
                    .addComponent(combo_dc_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(own_label)
                    .addComponent(txt_dc_owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cn_label)
                    .addComponent(txt_dc_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cvv_label)
                    .addComponent(txt_dc_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(year_label)
                        .addComponent(txt_dc_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date_label)
                        .addComponent(txt_dc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_dc_type, txt_dc_cvv, txt_dc_date, txt_dc_number, txt_dc_owner, txt_dc_year});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bank_label, cn_label, cvv_label, date_label, own_label, year_label});

    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bank_label;
    private javax.swing.JLabel cn_label;
    private javax.swing.JComboBox combo_dc_type;
    private javax.swing.JLabel cvv_label;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel main_label;
    private javax.swing.JLabel own_label;
    private javax.swing.JTextField txt_dc_cvv;
    private javax.swing.JTextField txt_dc_date;
    private javax.swing.JTextField txt_dc_number;
    private javax.swing.JTextField txt_dc_owner;
    private javax.swing.JTextField txt_dc_year;
    private javax.swing.JLabel year_label;
    // End of variables declaration//GEN-END:variables
}
