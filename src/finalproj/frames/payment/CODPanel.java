
package finalproj.frames.payment;


public class CODPanel extends javax.swing.JPanel {


    public CODPanel() {
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_label = new javax.swing.JLabel();
        info_label = new javax.swing.JLabel();

        main_label.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        main_label.setText("Cash On Delivery");

        info_label.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        info_label.setText("The Cash Has been Collected From the Home Location of Customer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(main_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addComponent(info_label)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_label)
                .addGap(57, 57, 57)
                .addComponent(info_label)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel info_label;
    private javax.swing.JLabel main_label;
    // End of variables declaration//GEN-END:variables
}
