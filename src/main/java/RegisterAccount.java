/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Yu Hann
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class RegisterAccount extends javax.swing.JFrame {

    /**
     * Creates new form RegisterAccount
     */
    public RegisterAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NRIC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EmailAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ContactNumber = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to registration!");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setOpaque(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Enter Full Name Here");

        FullName.setToolTipText("");
        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Enter NRIC Here");

        NRIC.setToolTipText("");
        NRIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NRICActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Enter Contact Number Here");

        EmailAddress.setToolTipText("");
        EmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailAddressActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Enter Email Address Here");

        ContactNumber.setToolTipText("");
        ContactNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactNumberActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Click here to complete registration");

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jButton1.setText("Proceed");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmailAddress)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(244, 244, 244))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NRIC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FullName))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ContactNumber)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(358, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(358, 358, 358))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NRIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FullNameActionPerformed

    private void NRICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NRICActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NRICActionPerformed

    private void EmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailAddressActionPerformed

    private void ContactNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactNumberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AdminClass admin = new AdminClass();
        admin.setAdmin_Name(FullName.getText());
        String nric = NRIC.getText();
        String contactnumber = ContactNumber.getText();
        String email = EmailAddress.getText();
        try
        {
            FileWriter Writer = new FileWriter ("AdminData.txt",true);
            int firstAdminID = 1;
            int count = 0;
            try
            {
                File file = new File("AdminData.txt");
                Scanner sc = new Scanner(file);
                while(sc.hasNextLine()){
                    sc.nextLine();
                    count++;
                }
            }
            catch (Exception e) {
                e.getStackTrace();
            }
            if (count == 0){
                String adminID = "A0000"+firstAdminID;
                AdminClass newAdmin = new AdminClass(admin.getAdmin_Name(),nric,contactnumber,email,String.format("%s", adminID));
                newAdmin.appendFile();
                JOptionPane.showMessageDialog(null,"You have registered successfully!\n You're the first Admin!\n Your admin ID would be "+firstAdminID);
                setVisible(false);
                new Admin().setVisible(true);
            }else{
                if (count < 10){
                    int newAdminID=firstAdminID+count;
                    String adminID="A0000"+newAdminID;
                    AdminClass newAdmin = new AdminClass(admin.getAdmin_Name(),nric,contactnumber,email,adminID);
                    newAdmin.appendFile();
                    JOptionPane.showMessageDialog(null,"You have registered successfully! Your admin ID would be "+adminID);
                    setVisible(false);
                    new Admin().setVisible(true);
                }
                if (count >= 10 & count < 100){
                    int newAdminID=firstAdminID+count;
                    String adminID="A00"+newAdminID;
                    AdminClass newAdmin = new AdminClass(admin.getAdmin_Name(),nric,contactnumber,email,adminID);
                    newAdmin.appendFile();
                    JOptionPane.showMessageDialog(null,"You have registered successfully! Your admin ID would be "+adminID);
                    setVisible(false);
                    new Admin().setVisible(true);
                }
                if (count >= 100 & count < 1000){
                    int newAdminID=firstAdminID+count;
                    String adminID="A0"+newAdminID;
                    AdminClass newAdmin = new AdminClass(admin.getAdmin_Name(),nric,contactnumber,email,adminID);
                    newAdmin.appendFile();
                    JOptionPane.showMessageDialog(null,"You have registered successfully! Your admin ID would be "+adminID);
                    setVisible(false);
                    new Admin().setVisible(true);
                }
                
            }
        }
        catch(Exception E)
        {
            JOptionPane.showMessageDialog(null,"Registration Failed, Try Again!");
        }
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ContactNumber;
    private javax.swing.JTextField EmailAddress;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField NRIC;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}


