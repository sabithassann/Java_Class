/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.DbCon;

/**
 *
 * @author user
 */
public class DesignEmployee extends javax.swing.JFrame {

    /**
     * Creates new form DesignEmployee
     */
    
    DbCon con=new DbCon();
    PreparedStatement ps;
    String sql="";
    ResultSet rs;
    
    public DesignEmployee() {
        initComponents();
        employeeTable();
    }
    
    
    public void reset(){
        txtEid.setText(null);
        txtName.setText(null);
        txtReg.setText(null);
        txtSalary.setText(null);
    }
    
    
    
    String [] columnName={"Eid","Name","Registration","Salary"};
    public void employeeTable(){
        sql="select *from employee";
        
        DefaultTableModel model=new DefaultTableModel();
        model.setColumnIdentifiers(columnName);
        
        employeeTable.setModel(model);
        
        try {
            ps=con.getCon().prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next()){
                int eid=rs.getInt("eid");
                String name=rs.getString("name");
                String reg=rs.getString("reg");
                Double salary=rs.getDouble("salary");
                
                
                model.addRow(new Object[]{eid,name,reg,salary});
            }
            
            ps.close();
            con.getCon().close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DesignEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEid = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtReg = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 100));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("EID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Registration");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Salary");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));
        jPanel2.add(txtEid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 180, -1));
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 180, -1));
        jPanel2.add(txtReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 180, -1));
        jPanel2.add(txtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 180, -1));

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        jPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 330, 420));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 390));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 580, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        
        sql="insert into employee(eid,name,reg,salary) values(?,?,?,?)";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtEid.getText()));
            ps.setString(2, txtName.getText());
            ps.setString(3, txtReg.getText());
            ps.setDouble(4, Double.parseDouble(txtSalary.getText()));
            
            
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            JOptionPane.showMessageDialog(rootPane, "Data submitted");
            reset();
            employeeTable();
        } catch (SQLException ex) {
            Logger.getLogger(DesignEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
//        sql="update employee set name=?,reg=?,salary=? where eid=?";
//        
//        try {
//            ps=con.getCon().prepareStatement(sql);
//            ps.setInt(1, Integer.parseInt(txtEid.getText()));
//            ps.setString(2, txtName.getText());
//            ps.setString(3, txtReg.getText());
//            ps.setDouble(4, Double.parseDouble(txtSalary.getText()));
//            
//            
//            ps.executeUpdate();
//            ps.close();
//            con.getCon().close();
//            JOptionPane.showMessageDialog(rootPane, "Data Updated");
//            
//            reset();
//            employeeTable();
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(DesignEmployee.class.getName()).log(Level.SEVERE, null, ex);
//        }
         String sql = "update employee set name=?, reg=?, salary=? where eid=?";
    
       try {
        Connection connection = con.getCon(); // Assuming con.getCon() returns a valid Connection object
        
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, txtName.getText());
        ps.setString(2, txtReg.getText());
        ps.setDouble(3, Double.parseDouble(txtSalary.getText()));
        ps.setInt(4, Integer.parseInt(txtEid.getText()));
        
        int rowsUpdated = ps.executeUpdate();
        ps.close();
        
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(rootPane, "Data Updated");
            reset();
            employeeTable(); // Refresh the table data
        } else {
            JOptionPane.showMessageDialog(rootPane, "No records were updated.");
        }
        
        connection.close();
    } catch (SQLException ex) {
        ex.printStackTrace(); // Print the exception details for debugging
        JOptionPane.showMessageDialog(rootPane, "Error updating data: " + ex.getMessage());
    }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        // TODO add your handling code here:
        
        int rowIndex=employeeTable.getSelectedRow();
        
        String eid=employeeTable.getModel().getValueAt(rowIndex, 0).toString();
        String name=employeeTable.getModel().getValueAt(rowIndex, 1).toString();
        String reg=employeeTable.getModel().getValueAt(rowIndex, 2).toString();
        String salary=employeeTable.getModel().getValueAt(rowIndex, 3).toString();
        
        txtEid.setText(eid);
        txtName.setText(name);
        txtReg.setText(reg);
        txtSalary.setText(salary);
    }//GEN-LAST:event_employeeTableMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
        sql="delete from employee where eid=?";
        
        try {
            ps=con.getCon().prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(txtEid.getText()));
            ps.executeUpdate();
            ps.close();
            con.getCon().close();
            JOptionPane.showMessageDialog(rootPane, "Data Deleted");
            reset();
            employeeTable();
            
        } catch (SQLException ex) {
            Logger.getLogger(DesignEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(DesignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DesignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DesignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DesignEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable employeeTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEid;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtReg;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
