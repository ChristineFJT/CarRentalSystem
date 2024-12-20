/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package car_rental_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jingt
 */
public class Admin_CusMakePayment extends javax.swing.JFrame {

    static Transaction transaction;
    
    public Admin_CusMakePayment() {
        initComponents();
        this.setLocationRelativeTo(null);//Display windows at the centre of screen
    }
    /**
     * Creates new form Admin_CusMakePayment
     */
    public Admin_CusMakePayment(String AdmName, String BookingID, String UserID, String Name, String CarID, float TotalPrice,int Duration) {
        initComponents();
        this.setLocationRelativeTo(null);//Display windows at the centre of screen
        tfBookingID.setText(BookingID);
        tfUserID.setText(UserID);
        tfName.setText(Name);
        tfCarID.setText(CarID);
        tfTotalPrice.setText("" + TotalPrice);
        lAdminName.setText(AdmName);
        tfDuration.setText(""+Duration);
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
        tfCarID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbEWallet = new javax.swing.JRadioButton();
        tfTotalPrice = new javax.swing.JTextField();
        tfTransID = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        rbCreditDebit = new javax.swing.JRadioButton();
        tfName = new javax.swing.JTextField();
        tfBookingID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lAdminName = new javax.swing.JLabel();
        tfDuration = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ConfirmButton = new javax.swing.JButton();
        lMethodValidation = new javax.swing.JLabel();
        rbCash = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUserID = new javax.swing.JTextField();
        rbOnline = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1128, 720));

        jPanel3.setBackground(new java.awt.Color(235, 232, 252));
        jPanel3.setPreferredSize(new java.awt.Dimension(1128, 600));

        tfCarID.setEnabled(false);

        jLabel3.setText("Car ID");

        jLabel4.setText("Customer ID");

        rbEWallet.setText("E-Wallet");

        tfTotalPrice.setEnabled(false);

        tfTransID.setEnabled(false);

        CancelButton.setText("Cancel");
        CancelButton.setFocusPainted(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        rbCreditDebit.setText("Credit / Debit Card");

        tfName.setEnabled(false);

        tfBookingID.setEnabled(false);

        jLabel9.setText("Duration");

        lAdminName.setText(" ");

        tfDuration.setEnabled(false);

        jLabel7.setText("Customer Name");

        ConfirmButton.setText("Confirm");
        ConfirmButton.setFocusPainted(false);
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        lMethodValidation.setForeground(new java.awt.Color(255, 0, 0));
        lMethodValidation.setText(" ");

        rbCash.setText("Cash");

        jLabel5.setText("Total Price");

        jLabel8.setText("Transaction ID");

        jLabel2.setText("Booking ID");

        tfUserID.setEnabled(false);

        rbOnline.setText("Online Banking");

        jLabel6.setText("Payment Method");

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Payment Page");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCarID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTransID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(188, 188, 188))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(lAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lMethodValidation, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rbOnline)
                                    .addComponent(rbCreditDebit)
                                    .addComponent(rbEWallet)
                                    .addComponent(tfName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbCash))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ConfirmButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CancelButton)))))
                .addGap(290, 290, 290))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lAdminName)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfTransID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfBookingID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfCarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbCreditDebit)
                        .addComponent(ConfirmButton)
                        .addComponent(CancelButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbOnline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbEWallet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbCash)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lMethodValidation)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModifyCarStatus() throws FileNotFoundException, IOException {
        File file = new File("Car Info.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String CarID = tfCarID.getText();
        String[] rec;
        String AvailableOld, AvailableNew;
        Object[] allRec = br.lines().toArray();
        for (int i = 0; i < allRec.length; i++) {
            rec = allRec[i].toString().trim().split(";");
            if (CarID.equalsIgnoreCase(rec[1])) {
                AvailableOld = rec[11];
                AvailableNew = "No";
                rec[11] = AvailableNew;
                String newrec = "";
                for (int j = 0; j < rec.length; j++) {
                    newrec = newrec + rec[j] + ";";
                }
                allRec[i] = newrec;
            }
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < allRec.length; i++) {
            bw.write(allRec[i] + "\n");
        }
        bw.close();
        br.close();
    }

    private void MakePayment() throws FileNotFoundException {
        Transaction payment = new Transaction();
        String BookingID = tfBookingID.getText().trim();
        String CarID = tfCarID.getText().trim();
        String CusID = tfUserID.getText().trim();
        String CusName = tfName.getText().trim();
        int Duration = Integer.parseInt(tfDuration.getText().trim());
        float TotalPrice = Float.parseFloat(tfTotalPrice.getText().trim());
        Date transdate = new Date();

        payment.setBookingID(BookingID);
        payment.setCusID(CusID);
        payment.setDuration(Duration);
        payment.setTotalPrice(TotalPrice);
        payment.setTransDate(transdate);

        if (rbCreditDebit.isSelected() == true) {
            lMethodValidation.setText("");
            rbCreditDebit.setText("Credit/Debit Card");
            payment.setPaymentMethod(rbCreditDebit.getText());
        } else if (rbOnline.isSelected() == true) {
            lMethodValidation.setText("");
            rbOnline.setText("Online Banking");
            payment.setPaymentMethod(rbOnline.getText());
        } else if (rbEWallet.isSelected() == true) {
            lMethodValidation.setText("");
            rbEWallet.setText("E Wallet");
            payment.setPaymentMethod(rbEWallet.getText());
        } else if (rbCash.isSelected() == true) {
            lMethodValidation.setText("");
            rbCash.setText("Cash");
            payment.setPaymentMethod(rbCash.getText());
        } else {
            payment.setPaymentMethod(null);
            JOptionPane.showMessageDialog(null, "Choose one Method");
            lMethodValidation.setText("Please Choose One Method");
        }

        if (payment.getPaymentMethod() != null) {
            try {
                transaction = new Transaction(0, payment.getTransID(), payment.getBookingID(), payment.getCusID(), payment.getDuration(),payment.getTotalPrice(), payment.getPaymentMethod(), payment.getTransDate());
                transaction.Add();
                tfTransID.setText(transaction.getTransID());
                String TransID = tfTransID.getText();
                Date TransDate = transaction.getTransDate();
                String PaymentMethod = transaction.getPaymentMethod();

                JOptionPane.showMessageDialog(null, "Payment Successful");

                File tempbooking = new File("tempBookings.txt");
                // Append Booking from tempBookings.txt to Bookings.txt after Payment Successful
                FileReader fr = new FileReader(tempbooking);
                FileWriter fw2 = new FileWriter("Bookings.txt", true);
                String rec = "";
                int line;
                while ((line = fr.read()) != -1) {
                    rec += (char) line;
                }
                fw2.write(rec);
                tempbooking.delete();
                fw2.close();

                ModifyCarStatus();

                FileReader fr2 = new FileReader("Car Info.txt");
                BufferedReader br2 = new BufferedReader(fr2);
                String rec2;

                while ((rec2 = br2.readLine()) != null) {
                    String[] recLine2 = rec2.split(";");
                        if (CarID.equals(recLine2[1])) {
                            float RentPrice = Float.parseFloat(recLine2[10]);
                            String AdminName = lAdminName.getText();
                            int duration = Integer.parseInt(tfDuration.getText());
                            this.setVisible(false);
                            new Admin_CusPrintReceipt(AdminName, TransID, BookingID, CarID, CusID, CusName, TransDate, PaymentMethod, TotalPrice, RentPrice, duration).setVisible(true);
                        }
                    }
            } catch (IOException ex) {
                Logger.getLogger(Cus_MakePayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        String AdmID = lAdminName.getText();
        try {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure to cancel payment?", "Payment not completed yet",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if (result == JOptionPane.YES_OPTION) {
                BufferedReader br = new BufferedReader(new FileReader(new File("Admin.txt")));
                String line = br.readLine();
                while (line != null) {
                    String[] recLine = line.split(";");
                    if (AdmID.equals(recLine[1])) {
                        String AdmName = recLine[2];
                        this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Payment Unsuccessful");
                        new AdminMenu(AdmName).setVisible(true);
                        break;
                    }
                }
            } else {
                this.setVisible(true);
                MakePayment();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cus_MakePayment.class
                .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin_CusMakePayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        try {
            MakePayment();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cus_MakePayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ConfirmButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_CusMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_CusMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_CusMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_CusMakePayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_CusMakePayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lAdminName;
    private javax.swing.JLabel lMethodValidation;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JRadioButton rbCreditDebit;
    private javax.swing.JRadioButton rbEWallet;
    private javax.swing.JRadioButton rbOnline;
    private javax.swing.JTextField tfBookingID;
    private javax.swing.JTextField tfCarID;
    private javax.swing.JTextField tfDuration;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfTotalPrice;
    private javax.swing.JTextField tfTransID;
    private javax.swing.JTextField tfUserID;
    // End of variables declaration//GEN-END:variables
}
