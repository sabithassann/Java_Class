/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Design15Min extends javax.swing.JFrame {

    /**
     * Creates new form Design15Min
     */
    public Design15Min() {
        initComponents();
    }
    
    //calculate total price
    
    public float getTotalPrice(){
        float unitPrice=Float.parseFloat(txtUnitPrice.getText().trim());
        float quantity=Float.parseFloat(txtQuantity.getText().trim());
        
        float totalPrice=unitPrice*quantity;
        return totalPrice;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnPurchase = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        menu = new javax.swing.JTabbedPane();
        menuHome = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        menuSales = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtSid = new javax.swing.JTextField();
        txtProductName = new javax.swing.JTextField();
        txtUnitPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtTotalPrice = new javax.swing.JTextField();
        txtDiscount = new javax.swing.JTextField();
        txtActualPrice = new javax.swing.JTextField();
        txtCashRecevid = new javax.swing.JTextField();
        txtDueAmount = new javax.swing.JTextField();
        txtCustomerName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        menuPurchase = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Design form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 130));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setText("Home");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, -1));

        btnSales.setText("Sales");
        btnSales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalesMouseExited(evt);
            }
        });
        jPanel2.add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 90, -1));

        btnPurchase.setText("Purchase");
        btnPurchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPurchaseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPurchaseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPurchaseMouseExited(evt);
            }
        });
        btnPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPurchaseActionPerformed(evt);
            }
        });
        jPanel2.add(btnPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 90, -1));

        jButton4.setText("jButton4");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 90, -1));

        jButton5.setText("jButton5");
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 180, 400));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuHome.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(242, 236, 242));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home Menu");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 90));

        javax.swing.GroupLayout menuHomeLayout = new javax.swing.GroupLayout(menuHome);
        menuHome.setLayout(menuHomeLayout);
        menuHomeLayout.setHorizontalGroup(
            menuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuHomeLayout.setVerticalGroup(
            menuHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuHomeLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 312, Short.MAX_VALUE))
        );

        menu.addTab("tab1", menuHome);

        menuSales.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(254, 238, 238));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sales Menu");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 100));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("SID");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, -1));

        jLabel6.setText("Product Name");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel7.setText("Unit Price");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel8.setText("Quantity");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setText("Total Price");
        jPanel8.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel10.setText("Discount");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel14.setText("Cash Recevied");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 20));

        jLabel11.setText("Actual Price");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel12.setText("Due Amount");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        jLabel13.setText("Date");
        jPanel8.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 70, 20));

        jLabel15.setText("Customer Name");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));
        jPanel8.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));
        jPanel8.add(txtSid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 90, -1));
        jPanel8.add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 90, -1));

        txtUnitPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnitPriceFocusLost(evt);
            }
        });
        jPanel8.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 90, -1));

        txtQuantity.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQuantityFocusLost(evt);
            }
        });
        jPanel8.add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 90, -1));
        jPanel8.add(txtTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 90, -1));
        jPanel8.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 90, -1));
        jPanel8.add(txtActualPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 90, -1));
        jPanel8.add(txtCashRecevid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 120, -1));
        jPanel8.add(txtDueAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 120, -1));
        jPanel8.add(txtCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 120, -1));

        btnSubmit.setText("Submit");
        jPanel8.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        btnReset.setText("Reset");
        jPanel8.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, -1));

        javax.swing.GroupLayout menuSalesLayout = new javax.swing.GroupLayout(menuSales);
        menuSales.setLayout(menuSalesLayout);
        menuSalesLayout.setHorizontalGroup(
            menuSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSalesLayout.createSequentialGroup()
                .addGroup(menuSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuSalesLayout.setVerticalGroup(
            menuSalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuSalesLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menu.addTab("tab2", menuSales);

        menuPurchase.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(242, 245, 221));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Purchase Menu");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 100));

        javax.swing.GroupLayout menuPurchaseLayout = new javax.swing.GroupLayout(menuPurchase);
        menuPurchase.setLayout(menuPurchaseLayout);
        menuPurchaseLayout.setHorizontalGroup(
            menuPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPurchaseLayout.setVerticalGroup(
            menuPurchaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPurchaseLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 299, Short.MAX_VALUE))
        );

        menu.addTab("tab3", menuPurchase);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        menu.addTab("tab4", jPanel7);

        jPanel3.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 670, 430));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPurchaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPurchaseActionPerformed

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        // TODO add your handling code here:
        menu.setSelectedIndex(0);
    }//GEN-LAST:event_btnHomeMouseClicked

    private void btnSalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseClicked
        // TODO add your handling code here:
        menu.setSelectedIndex(1);
    }//GEN-LAST:event_btnSalesMouseClicked

    private void btnPurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseMouseClicked
        // TODO add your handling code here:
        menu.setSelectedIndex(2);
    }//GEN-LAST:event_btnPurchaseMouseClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:
        btnHome.setBackground(new Color(17,250,13));
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:
        btnHome.setBackground(new Color(0,50,13));
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnSalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseEntered
        // TODO add your handling code here:
        btnSales.setBackground(new Color(17,250,13));
        
    }//GEN-LAST:event_btnSalesMouseEntered

    private void btnSalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalesMouseExited
        // TODO add your handling code here:
         btnSales.setBackground(new Color(0,50,13));
    }//GEN-LAST:event_btnSalesMouseExited

    private void btnPurchaseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseMouseEntered
        // TODO add your handling code here:
        btnPurchase.setBackground(new Color(17,250,13));
    }//GEN-LAST:event_btnPurchaseMouseEntered

    private void btnPurchaseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPurchaseMouseExited
        // TODO add your handling code here:
        btnPurchase.setBackground(new Color(0,50,13));
    }//GEN-LAST:event_btnPurchaseMouseExited

    private void txtUnitPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnitPriceFocusLost
        // TODO add your handling code here:
        
        try {
            if(!txtUnitPrice.getText().trim().isEmpty()){
                
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Can not be Empty");
                txtUnitPrice.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, "An error Occur"+e.getMessage());
        }
    }//GEN-LAST:event_txtUnitPriceFocusLost

    private void txtQuantityFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQuantityFocusLost
        // TODO add your handling code here:
        try {
            if(txtUnitPrice.getText().trim().isEmpty()){
               txtUnitPrice.requestFocus();
                
                
            }
            else if(!txtQuantity.getText().trim().isEmpty()){
                txtTotalPrice.setText(getTotalPrice()+"");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Quantity Cannot Be Empty");
                txtQuantity.requestFocus();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Error"+e.getMessage());
        }
    }//GEN-LAST:event_txtQuantityFocusLost

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Design15Min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Design15Min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Design15Min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design15Min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Design15Min().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPurchase;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTabbedPane menu;
    private javax.swing.JPanel menuHome;
    private javax.swing.JPanel menuPurchase;
    private javax.swing.JPanel menuSales;
    private javax.swing.JTextField txtActualPrice;
    private javax.swing.JTextField txtCashRecevid;
    private javax.swing.JTextField txtCustomerName;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtDueAmount;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txtTotalPrice;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
