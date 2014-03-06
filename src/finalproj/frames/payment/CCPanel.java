
package finalproj.frames.payment;


public class CCPanel extends javax.swing.JPanel {

    public CCPanel() {
        initComponents();
    }
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_label = new javax.swing.JLabel();
        card_label = new javax.swing.JLabel();
        cn_label = new javax.swing.JLabel();
        cvv_label = new javax.swing.JLabel();
        year_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        own_label = new javax.swing.JLabel();
        txt_cc_number = new javax.swing.JTextField();
        txt_cc_owner = new javax.swing.JTextField();
        txt_cc_cvv = new javax.swing.JTextField();
        txt_cc_year = new javax.swing.JTextField();
        txt_cc_date = new javax.swing.JTextField();
        combo_cc_type = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(550, 250));

        main_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        main_label.setText("Credit Card");

        card_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        card_label.setText("Credit Card Type:");

        cn_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cn_label.setText("Credit Card Number:");

        cvv_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        cvv_label.setText("CVV Number:");

        year_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        year_label.setText("Expiry Year:");

        date_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        date_label.setText("Expiry Date:");

        own_label.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        own_label.setText("Credit Card Owner:");

        txt_cc_number.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_cc_owner.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_cc_cvv.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_cc_year.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        txt_cc_date.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        combo_cc_type.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        combo_cc_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "American Express", "Mastercard", "Visa" }));

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
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(card_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(combo_cc_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(own_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_cc_owner))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cn_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_cc_number))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cvv_label)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_cc_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(year_label, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_cc_year, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date_label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cc_date, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 92, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {card_label, cn_label, cvv_label, own_label});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {combo_cc_type, txt_cc_cvv, txt_cc_number, txt_cc_owner});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(card_label)
                    .addComponent(combo_cc_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(own_label)
                    .addComponent(txt_cc_owner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cn_label)
                    .addComponent(txt_cc_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cvv_label)
                    .addComponent(txt_cc_cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(year_label)
                    .addComponent(txt_cc_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_label)
                    .addComponent(txt_cc_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {card_label, cn_label, cvv_label, date_label, own_label, year_label});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {combo_cc_type, txt_cc_cvv, txt_cc_date, txt_cc_number, txt_cc_owner, txt_cc_year});

    }// </editor-fold>//GEN-END:initComponents

    
    
    public String getCombo_cc_type() {
        return combo_cc_type.getSelectedItem().toString();
    }

    public String getTxt_cc_cvv() {
        return txt_cc_cvv.getText().toString();
    }

    public String getTxt_cc_date() {
        return txt_cc_date.getText().toString();
    }

    public String getTxt_cc_number() {
        return txt_cc_number.getText().toString();
    }

    public String getTxt_cc_owner() {
        return txt_cc_owner.getText().toString();
    }

    public String getTxt_cc_year() {
        return txt_cc_year.getText().toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel card_label;
    private javax.swing.JLabel cn_label;
    private javax.swing.JComboBox combo_cc_type;
    private javax.swing.JLabel cvv_label;
    private javax.swing.JLabel date_label;
    private javax.swing.JLabel main_label;
    private javax.swing.JLabel own_label;
    private javax.swing.JTextField txt_cc_cvv;
    private javax.swing.JTextField txt_cc_date;
    private javax.swing.JTextField txt_cc_number;
    private javax.swing.JTextField txt_cc_owner;
    private javax.swing.JTextField txt_cc_year;
    private javax.swing.JLabel year_label;
    // End of variables declaration//GEN-END:variables
}
