package car_rental_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author jingt
 */
public class Cus_ChangePassword extends javax.swing.JFrame {

    static Customer customer;

    /**
     * Creates new form Cus_ChangePassword
     */
    public Cus_ChangePassword() {
        initComponents();
        this.setLocationRelativeTo(null);//Display windows at the centre of screen
    }
    
    public Cus_ChangePassword(String Name, String UserID) {
        initComponents();
        this.setLocationRelativeTo(null);//Display windows at the centre of screen
        lName.setText(Name);
        bUserID.setText(UserID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        ChangePassword = new javax.swing.JButton();
        pfNewPassword2 = new javax.swing.JPasswordField();
        pfNewPassword = new javax.swing.JPasswordField();
        PasswordValidation = new javax.swing.JLabel();
        pfOldPassword = new javax.swing.JPasswordField();
        lName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bBack = new javax.swing.JButton();
        bUserID = new javax.swing.JButton();
        ConfirmPasswordValidation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1128, 720));

        jPanel10.setBackground(new java.awt.Color(235, 232, 252));

        ChangePassword.setText("Change Password");
        ChangePassword.setFocusPainted(false);
        ChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangePasswordActionPerformed(evt);
            }
        });

        pfNewPassword2.setBackground(new java.awt.Color(242, 242, 242));
        pfNewPassword2.setBorder(javax.swing.BorderFactory.createTitledBorder("Confirm New Password"));

        pfNewPassword.setBackground(new java.awt.Color(242, 242, 242));
        pfNewPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter New Password"));

        PasswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        PasswordValidation.setText(" ");

        pfOldPassword.setBackground(new java.awt.Color(242, 242, 242));
        pfOldPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter Old Password"));

        lName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lName.setText(" ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Hi ");

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Change Password");

        bBack.setText("< Back");
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        bUserID.setText(" ");
        bUserID.setEnabled(false);

        ConfirmPasswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        ConfirmPasswordValidation.setText(" ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ChangePassword)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ConfirmPasswordValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pfNewPassword)
                                .addComponent(pfNewPassword2)
                                .addComponent(bUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PasswordValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pfOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(bBack))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bBack)
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(32, 32, 32)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(bUserID)
                .addGap(18, 18, 18)
                .addComponent(pfOldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PasswordValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(pfNewPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfirmPasswordValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ChangePassword)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangePasswordActionPerformed
        // TODO add your handling code here:
        Customer cusInfo = new Customer();
        String userid = bUserID.getText();
        String OldPassword = pfOldPassword.getText();
        String NewPassword = pfNewPassword.getText();
        String ConfirmNewPassword = pfNewPassword2.getText();

        File file = new File("Customer.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                if (userid.equals(recLine[1])) {
                    cusInfo.setID(Integer.parseInt(recLine[0]));
                    String CusID = recLine[1];
                    String Name = recLine[2];
                    String ICNum = recLine[3];
                    String ContactNum = recLine[4];
                    String Email = recLine[5];
                    String Password = recLine[6];
                    if (OldPassword.equals(Password)) {
                        PasswordValidation.setText("");
                        if (NewPassword.equals(ConfirmNewPassword)) {
                            ConfirmPasswordValidation.setText("");
                            cusInfo.setPassword(NewPassword);
                            customer = new Customer(cusInfo.getID(),CusID,Name,ICNum,
                                ContactNum,Email,
                                NewPassword,cusInfo.getUser_Type());
                            customer.Update();
                            JOptionPane.showMessageDialog(null, "Password Changed Successful");
                            this.setVisible(false);
                            new Cus_Profile(CusID, Name, ICNum, ContactNum, Email, NewPassword).setVisible(true);
                        } else {
                            ConfirmPasswordValidation.setText("Password does not match. Try again");
                        }
                    } else {
                        PasswordValidation.setText("Wrong password. Try again!");
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cus_ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cus_ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ChangePasswordActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        BufferedReader br = null;
        try {
            String UserID = bUserID.getText();
            File file = new File("Customer.txt");
            br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                if (UserID.equals(recLine[1])) {
                    String Name = recLine[2];
                    String ICNum = recLine[3];
                    String ContactNum = recLine[4];
                    String Email = recLine[5];
                    String Password = recLine[6];
                    this.setVisible(false);
                    new Cus_Profile(UserID, Name, ICNum, ContactNum, Email, Password).setVisible(true);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cus_ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cus_ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Cus_ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bBackActionPerformed

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
            java.util.logging.Logger.getLogger(Cus_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cus_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cus_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cus_ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cus_ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangePassword;
    private javax.swing.JLabel ConfirmPasswordValidation;
    private javax.swing.JLabel PasswordValidation;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bUserID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JLabel lName;
    private javax.swing.JPasswordField pfNewPassword;
    private javax.swing.JPasswordField pfNewPassword2;
    private javax.swing.JPasswordField pfOldPassword;
    // End of variables declaration//GEN-END:variables
}
