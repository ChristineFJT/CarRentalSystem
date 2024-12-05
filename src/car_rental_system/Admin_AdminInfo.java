/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_rental_system;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jingt
 */

public class Admin_AdminInfo extends javax.swing.JFrame {

    static Admin admin;
    /**
     * Creates new form Admin_AdminInfo
     */
    public Admin_AdminInfo() {
        initComponents();
        this.setLocationRelativeTo(null);//Display windows at the centre of screen
    }

    public Admin_AdminInfo(String Name) {
        initComponents();
        lAdminName.setText(Name);
        this.setLocationRelativeTo(null);//Display windows at the centre of screen
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        UserIDlabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lAdminName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfAdminID = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfIC = new javax.swing.JTextField();
        tfContactNum = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        NameValidation = new javax.swing.JLabel();
        PasswordValidation = new javax.swing.JLabel();
        ICValidation = new javax.swing.JLabel();
        NumberValidation = new javax.swing.JLabel();
        EmailValidation = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bView = new javax.swing.JButton();
        bModifyUserInfo = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1128, 720));

        jPanel3.setBackground(new java.awt.Color(235, 232, 252));
        jPanel3.setPreferredSize(new java.awt.Dimension(1128, 700));

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Admin Info");

        UserIDlabel2.setText(" ");

        jLabel8.setText("Hi, Admin");

        lAdminName.setText(" ");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("IC Number");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Contact Number");

        jLabel10.setText("Email");

        jLabel11.setText("Password");

        tfAdminID.setEnabled(false);

        jLabel12.setText("Admin ID");

        jLabel13.setText("Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin ID", "Name", "IC Number", "Contact Number", "Email", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        NameValidation.setForeground(new java.awt.Color(255, 0, 0));
        NameValidation.setText(" ");

        PasswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        PasswordValidation.setText(" ");

        ICValidation.setForeground(new java.awt.Color(255, 0, 0));
        ICValidation.setText(" ");

        NumberValidation.setForeground(new java.awt.Color(255, 0, 0));
        NumberValidation.setText(" ");

        EmailValidation.setForeground(new java.awt.Color(255, 0, 0));
        EmailValidation.setText(" ");

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        bView.setText("Show All Records");
        bView.setFocusPainted(false);
        bView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewActionPerformed(evt);
            }
        });

        bModifyUserInfo.setText("Update");
        bModifyUserInfo.setFocusPainted(false);
        bModifyUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyUserInfoActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.setFocusPainted(false);
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bBack.setText("Back");
        bBack.setFocusPainted(false);
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfContactNum, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfIC, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NumberValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ICValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EmailValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PasswordValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(369, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(bView)
                                .addGap(18, 18, 18)
                                .addComponent(bModifyUserInfo)
                                .addGap(18, 18, 18)
                                .addComponent(bDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBack))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bAdd)
                                .addGap(32, 32, 32)
                                .addComponent(bClear))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                .addGap(644, 644, 644)
                                .addComponent(UserIDlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(UserIDlabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lAdminName)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tfAdminID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ICValidation))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumberValidation))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(EmailValidation))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(PasswordValidation)))
                    .addComponent(NameValidation))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdd)
                    .addComponent(bClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bModifyUserInfo)
                    .addComponent(bView)
                    .addComponent(bDelete)
                    .addComponent(bBack))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        tfAdminID.setText(model.getValueAt(i, 0).toString());
        tfName.setText(model.getValueAt(i, 1).toString());
        tfIC.setText(model.getValueAt(i, 2).toString());
        tfContactNum.setText(model.getValueAt(i, 3).toString());
        tfEmail.setText(model.getValueAt(i, 4).toString());
        tfPassword.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try {
            String name = this.tfName.getText().trim(),
            password = this.tfPassword.getText().trim(),
            ICNum = this.tfIC.getText().trim(),
            ContactNum = this.tfContactNum.getText().trim(),
            email = this.tfEmail.getText().trim();

            if (!name.isEmpty()) {
                if (Admin.isNameValid(name)) {
                    NameValidation.setText("");
                } else {
                    name = null;
                    NameValidation.setText("Invalid Name");
                }
            } else {
                name = null;
                NameValidation.setText("Enter Name");
            }

            if (!password.isEmpty()) {
                PasswordValidation.setText("");
            } else {
                password = null;
                PasswordValidation.setText("Enter Password");
            }

            if (!ICNum.isEmpty()) {
                if (Admin.isICValid(ICNum)) {
                    if (ICNum.length() == 12) {
                        if (Admin.isICExist(ICNum)) {
                            ICValidation.setText("");
                        } else {
                            ICNum = null;
                            ICValidation.setText("IC exists!");
                        }
                    } else {
                        ICNum = null;
                        ICValidation.setText("Invalid IC");
                    }

                } else {
                    ICNum = null;
                    ICValidation.setText("Enter IC without - or character!!");
                }
            } else {
                ICNum = null;
                ICValidation.setText("Enter IC Number without - ");
            }

            if (!ContactNum.isEmpty()) {
                if (ContactNum.length() == 10 || ContactNum.length() == 11) {
                    if (Admin.isContactValid(ContactNum)) {
                        NumberValidation.setText("");
                    } else {
                        ContactNum = null;
                        NumberValidation.setText("Enter Integer");
                    }
                } else {
                    ContactNum = null;
                    NumberValidation.setText("Enter 10 or 11 Integer Only");
                }
            } else {
                ContactNum = null;
                NumberValidation.setText("Enter Contact Number");
            }

            if (!email.isEmpty()) {
                if (Admin.isEmailValid(email)) {
                    EmailValidation.setText("");
                } else {
                    email = null;
                    EmailValidation.setText("Invalid Email");
                }
            } else {
                email = null;
                EmailValidation.setText("Enter Email");
            }

            if (name != null && password != null && ICNum != null && ContactNum != null && email != null) {
                new Admin(0, admin.getAdmID(), name, ICNum, ContactNum, email, password, admin.getUser_Type()).Add();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin_AdminInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        tfAdminID.setText("");
        tfName.setText("");
        tfIC.setText("");
        tfContactNum.setText("");
        tfEmail.setText("");
        tfPassword.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void bViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewActionPerformed
        // TODO add your handling code here:
        String filePath = "Admin.txt";
        File f = new File(filePath);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                String AdmID = recLine[1];
                String Name = recLine[2];
                String ICNum = recLine[3];
                String ContactNum = recLine[4];
                String Email = recLine[5];
                String Password = recLine[6];
                Object[] row = {AdmID, Name, ICNum, ContactNum, Email, Password};
                model.addRow(row);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin_AdminInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin_AdminInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bViewActionPerformed

    private void bModifyUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyUserInfoActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Admin admInfo = new Admin();
            String AdmID = tfAdminID.getText().trim();
            String Name = tfName.getText().trim();
            String ICNum = tfIC.getText().trim();
            String ContactNum = tfContactNum.getText().trim();
            String Email = tfEmail.getText().trim();
            String Password = tfPassword.getText().trim();
            File admfile = new File("Admin.txt");
            admInfo.setPassword(Password);
            BufferedReader bradmfile = new BufferedReader(new FileReader(admfile));
            String linerec;
            while ((linerec = bradmfile.readLine()) != null) {
                String[] recLine = linerec.split(";");
                if (AdmID.equals(recLine[1])) {
                    admInfo.setID(Integer.parseInt(recLine[0]));
                    admInfo.setIC_Number(recLine[3]);
                }
            }

            if (!Name.isEmpty()) {
                if (Customer.isNameValid(Name)) {
                    NameValidation.setText("");
                } else {
                    Name = null;
                    NameValidation.setText("Invalid Name");
                }
            } else {
                Name = null;
                NameValidation.setText("Enter Name");
            }

            if (!ICNum.isEmpty()) {
                if (Admin.isICValid(ICNum)) {
                    if (ICNum.length() == 12) {
                        if (ICNum.equals(admInfo.getIC_Number())) {
                            ICValidation.setText("");
                        } else {
                            if (Admin.isICExist(ICNum)) {
                                ICValidation.setText("");
                            } else {
                                ICNum = null;
                                ICValidation.setText("IC exists!");
                            }
                        }
                    } else {
                        ICNum = null;
                        ICValidation.setText("Invalid IC");
                    }

                } else {
                    ICNum = null;
                    ICValidation.setText("Enter IC without - or character!!");
                }
            } else {
                ICNum = null;
                ICValidation.setText("Enter IC Number without - ");
            }

            if (!ContactNum.isEmpty()) {
                if (ContactNum.length() == 10 || ContactNum.length() == 11) {
                    if (Customer.isContactValid(ContactNum)) {
                        NumberValidation.setText("");
                    } else {
                        ContactNum = null;
                        NumberValidation.setText("Enter Integer");
                    }
                } else {
                    ContactNum = null;
                    NumberValidation.setText("Enter 10 or 11 Integer Only");
                }
            } else {
                ContactNum = null;
                NumberValidation.setText("Enter Contact Number");
            }

            if (!Email.isEmpty()) {
                if (Customer.isEmailValid(Email)) {
                    EmailValidation.setText("");
                } else {
                    Email = null;
                    EmailValidation.setText("Invalid Email");
                }
            } else {
                Email = null;
                EmailValidation.setText("Enter Email");
            }

            if (!Password.isEmpty()) {
                PasswordValidation.setText("");
            } else {
                Password = null;
                PasswordValidation.setText("Enter Password");
            }

            if (Name != null && ICNum != null && ContactNum != null && Email != null && Password != null) {
                admin = new Admin(admInfo.getID(), AdmID, Name, ICNum, ContactNum, Email, admInfo.getPassword(), admInfo.getUser_Type());
                System.out.println(admin.toString());
                admin.Update();
                JOptionPane.showMessageDialog(null, "Update Successfully");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bModifyUserInfoActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        Admin admInfo = new Admin();
        String AdmID = tfAdminID.getText().trim();
        admInfo.setName(tfName.getText().trim());

        int showConfirmDialog = JOptionPane.showConfirmDialog(null, AdmID + " will be deleted"
            + "\nAre you sure to continue?", "Delete Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (showConfirmDialog == JOptionPane.YES_OPTION) {
            try {
                admin = new Admin(admInfo.getID(), AdmID, admInfo.getName(), admInfo.getIC_Number(), admInfo.getContact_Num(), admInfo.getEmail(), admInfo.getPassword(), admInfo.getUser_Type());
                admin.Delete();
                JOptionPane.showMessageDialog(null, "Admin Deleted Successful");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        // TODO add your handling code here:
        String Name = lAdminName.getText();
        this.dispose();
        new AdminMenu(Name).setVisible(true);
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
            java.util.logging.Logger.getLogger(Admin_AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_AdminInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_AdminInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailValidation;
    private javax.swing.JLabel ICValidation;
    private javax.swing.JLabel NameValidation;
    private javax.swing.JLabel NumberValidation;
    private javax.swing.JLabel PasswordValidation;
    private javax.swing.JLabel UserIDlabel2;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bModifyUserInfo;
    private javax.swing.JButton bView;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lAdminName;
    private javax.swing.JTextField tfAdminID;
    private javax.swing.JTextField tfContactNum;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIC;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}