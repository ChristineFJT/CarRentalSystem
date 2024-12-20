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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jingt
 */
public class Admin_UserInfo extends javax.swing.JFrame {

    static Customer customer;

        
    /**
     * Creates new form Admin_UserInfo
     */
    public Admin_UserInfo() {
        initComponents();
        this.setLocationRelativeTo(null);//Display windows at the centre of screen
    }
    
    public Admin_UserInfo(String Name) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lAdminName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NameValidation = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        ICValidation = new javax.swing.JLabel();
        bModifyUserInfo = new javax.swing.JButton();
        NumberValidation = new javax.swing.JLabel();
        bClear = new javax.swing.JButton();
        EmailValidation = new javax.swing.JLabel();
        bView = new javax.swing.JButton();
        PasswordValidation = new javax.swing.JLabel();
        bDelete = new javax.swing.JButton();
        bCusMakeBooking = new javax.swing.JButton();
        bBack = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfUserID = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfIC = new javax.swing.JTextField();
        tfContactNum = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1128, 720));

        jPanel1.setBackground(new java.awt.Color(235, 232, 252));

        jLabel8.setText("Hi, Admin");

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel1.setText("User Info");

        NameValidation.setForeground(new java.awt.Color(255, 0, 0));
        NameValidation.setText(" ");

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        ICValidation.setForeground(new java.awt.Color(255, 0, 0));
        ICValidation.setText(" ");

        bModifyUserInfo.setText("Update");
        bModifyUserInfo.setFocusPainted(false);
        bModifyUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModifyUserInfoActionPerformed(evt);
            }
        });

        NumberValidation.setForeground(new java.awt.Color(255, 0, 0));
        NumberValidation.setText(" ");

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        EmailValidation.setForeground(new java.awt.Color(255, 0, 0));
        EmailValidation.setText(" ");

        bView.setText("Show All Records");
        bView.setFocusPainted(false);
        bView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewActionPerformed(evt);
            }
        });

        PasswordValidation.setForeground(new java.awt.Color(255, 0, 0));
        PasswordValidation.setText(" ");

        bDelete.setText("Delete");
        bDelete.setFocusPainted(false);
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bCusMakeBooking.setText("Make Booking");
        bCusMakeBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCusMakeBookingActionPerformed(evt);
            }
        });

        bBack.setText("Back");
        bBack.setFocusPainted(false);
        bBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBackActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("User ID");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Name");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("IC Number");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Contact Number");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Email");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password");

        tfUserID.setEnabled(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Name", "IC Number", "Contact Number", "Email", "Password"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(bView)
                .addGap(18, 18, 18)
                .addComponent(bModifyUserInfo)
                .addGap(18, 18, 18)
                .addComponent(bDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bBack)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUserID)
                                    .addComponent(tfName)
                                    .addComponent(tfIC, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(53, 53, 53)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfContactNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfPassword))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(419, 419, 419)
                                .addComponent(bAdd))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ICValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NumberValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PasswordValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bClear))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCusMakeBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(lAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAdd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bClear)
                    .addComponent(NameValidation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ICValidation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfContactNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberValidation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(EmailValidation))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(PasswordValidation)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCusMakeBooking))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bBack)
                    .addComponent(bModifyUserInfo)
                    .addComponent(bView)
                    .addComponent(bDelete))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        try {
            Customer cus = new Customer();
            String name = this.tfName.getText().trim(),
            password = this.tfPassword.getText().trim(),
            ICNum = this.tfIC.getText().trim(),
            ContactNum = this.tfContactNum.getText().trim(),
            email = this.tfEmail.getText().trim();
            cus.setName(name);
            cus.setPassword(password);
            cus.setIC_Number(ICNum);
            cus.setContact_Num(ContactNum);
            cus.setEmail(email);
            cus.setUser_Type("customer");

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
                if (Customer.isICValid(ICNum)) {
                    if (ICNum.length() == 12) {
                        if (Customer.isICExist(ICNum)) {
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
                new Customer(0, cus.getCusID(), name, ICNum, ContactNum, email, password, "customer").Add();
                JOptionPane.showMessageDialog(null, "Customer Account Created Successful");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bAddActionPerformed

    private void bModifyUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModifyUserInfoActionPerformed
        try {
            Customer cusInfo = new Customer();
            String CusID = tfUserID.getText().trim();
            String Name = tfName.getText().trim();
            String ICNum = tfIC.getText().trim();
            String ContactNum = tfContactNum.getText().trim();
            String Email = tfEmail.getText().trim();
            String Password = tfPassword.getText().trim();
            File cusfile = new File("Customer.txt");
            cusInfo.setPassword(Password);
            BufferedReader brcusfile = new BufferedReader(new FileReader(cusfile));
            String linerec;
            while ((linerec = brcusfile.readLine()) != null) {
                String[] recLine = linerec.split(";");
                if (CusID.equals(recLine[1])) {
                    cusInfo.setID(Integer.parseInt(recLine[0]));
                    cusInfo.setIC_Number(recLine[3]);
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
                if (Customer.isICValid(ICNum)) {
                    if (ICNum.length() == 12) {
                        if (ICNum.equals(cusInfo.getIC_Number())) {
                            ICValidation.setText("");
                        } else {
                            if (Customer.isICExist(ICNum)) {
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
            if (Name != null && ICNum != null && ContactNum != null && Email != null) {
                try {
                    customer = new Customer(cusInfo.getID(), CusID, Name, ICNum, ContactNum, Email, cusInfo.getPassword(), cusInfo.getUser_Type());
                    System.out.println(customer.toString());
                    customer.Update();
                    JOptionPane.showMessageDialog(null, "Update Successfully");
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bModifyUserInfoActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        tfUserID.setText("");
        tfName.setText("");
        tfIC.setText("");
        tfContactNum.setText("");
        tfEmail.setText("");
        tfPassword.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void bViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewActionPerformed
        String filePath = "Customer.txt";
        File f = new File(filePath);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                String CusID = recLine[1];
                String Name = recLine[2];
                String ICNum = recLine[3];
                String ContactNum = recLine[4];
                String Email = recLine[5];
                String Password = recLine[6];

                Object[] row = {CusID, Name, ICNum, ContactNum, Email, Password};
                model.addRow(row);
            }
        } catch (IOException x) {
            System.out.println(x);
        }
    }//GEN-LAST:event_bViewActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        Customer cusInfo = new Customer();
        String CusID = tfUserID.getText().trim();
        cusInfo.setName(tfName.getText().trim());

        int showConfirmDialog = JOptionPane.showConfirmDialog(null, "All Booked Car for Customer with " + CusID + " will also be deleted"
            + "\nAre you sure to continue?", "Delete Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (showConfirmDialog == JOptionPane.YES_OPTION) {
            try {
                ArrayList<Booking> bookings = Booking.View();
                for (int i = 0; i < bookings.size(); i++) {
                    if (CusID.equals(bookings.get(i).getCusID())) {
                        bookings.get(i).Delete();
                    }
                }
                customer = new Customer(cusInfo.getID(), CusID, cusInfo.getName(), cusInfo.getIC_Number(), cusInfo.getContact_Num(), cusInfo.getEmail(), cusInfo.getPassword(), cusInfo.getUser_Type());
                customer.Delete();
                JOptionPane.showMessageDialog(null, "Customer Deleted Successful");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Admin_UserInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bCusMakeBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCusMakeBookingActionPerformed
        String CusID = tfUserID.getText();
        String Name = tfName.getText();
        String Email = tfEmail.getText();
        String ContactNum = tfContactNum.getText();
        String AdminName = lAdminName.getText();
        this.setVisible(false);
        new Admin_CusMakeBooking(AdminName, CusID, Name, Email, ContactNum).setVisible(true);
    }//GEN-LAST:event_bCusMakeBookingActionPerformed

    private void bBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBackActionPerformed
        String Name = lAdminName.getText();
        this.dispose();
        new AdminMenu(Name).setVisible(true);
    }//GEN-LAST:event_bBackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        tfUserID.setText(model.getValueAt(i, 0).toString());
        tfName.setText(model.getValueAt(i, 1).toString());
        tfIC.setText(model.getValueAt(i, 2).toString());
        tfContactNum.setText(model.getValueAt(i, 3).toString());
        tfEmail.setText(model.getValueAt(i, 4).toString());
        tfPassword.setText(model.getValueAt(i, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(Admin_UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_UserInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_UserInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailValidation;
    private javax.swing.JLabel ICValidation;
    private javax.swing.JLabel NameValidation;
    private javax.swing.JLabel NumberValidation;
    private javax.swing.JLabel PasswordValidation;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bBack;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bCusMakeBooking;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bModifyUserInfo;
    private javax.swing.JButton bView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lAdminName;
    private javax.swing.JTextField tfContactNum;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfIC;
    private javax.swing.JTextField tfName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserID;
    // End of variables declaration//GEN-END:variables
}
