/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental_system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jingt
 */
public class Transaction {
    
    private int ID;
    private String TransID, BookingID, CusID;
    private int Duration;
    private float TotalPrice;
    private String PaymentMethod;
    private Date TransDate;

    public Transaction() {
    }

    // Constructor for creating new transaction
    public Transaction(int ID, String TransID, String BookingID, String CusID, 
            int Duration, float TotalPrice, String PaymentMethod, Date TransDate) {
        this.ID = ID;
        this.TransID = TransID;
        this.BookingID = BookingID;
        this.CusID = CusID;
        this.Duration = Duration;
        this.TotalPrice = TotalPrice;
        this.PaymentMethod = PaymentMethod;
        this.TransDate = TransDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTransID() {
        return TransID;
    }

    public void setTransID(String TransID) {
        this.TransID = TransID;
    }

    public String getBookingID() {
        return BookingID;
    }

    public void setBookingID(String BookingID) {
        this.BookingID = BookingID;
    }

    public String getCusID() {
        return CusID;
    }

    public void setCusID(String CusID) {
        this.CusID = CusID;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int Duration) {
        this.Duration = Duration;
    }

    public float getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(float TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public Date getTransDate() {
        return TransDate;
    }

    public void setTransDate(Date TransDate) {
        this.TransDate = TransDate;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd    HH:mm:ss");
        return ID + ";" + TransID + ";" + BookingID + ";" + CusID + ";" + Duration + ";" + TotalPrice + ";" + PaymentMethod + ";" + sdf.format(TransDate) + ';';
    }

    public void Add() {
        ArrayList<Transaction> payment = Transaction.View();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd    HH:mm:ss");
        if (payment.isEmpty()) {
            this.ID = 1;
            String pref = "T";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.TransID = pref + res;
        } else {
            this.ID = payment.get((payment.size() - 1)).ID + 1;
            String pref = "T";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.TransID = pref + res;
        }
        payment.add(this);
        File bookInfo = new File("tempBookings.txt");
        if (!bookInfo.exists()) {
            try {
                bookInfo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        try {
            FileWriter fw = new FileWriter("Transaction.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(ID + ";" + TransID + ";" + BookingID + ";" + CusID + ";" + Duration + ";" + TotalPrice + ";" + PaymentMethod + ";" + sdf.format(TransDate) + ';');
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Transaction> View() {
        ArrayList<Transaction> PaymentList = new ArrayList<>(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd    HH:mm:ss");
        File cusInfo = new File("Transaction.txt");
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(cusInfo));
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                Transaction payment = new Transaction(Integer.parseInt(recLine[0]), recLine[1], recLine[2], recLine[3], Integer.parseInt(recLine[4]), Float.parseFloat(recLine[5]), recLine[6], sdf.parse(recLine[7]));
                PaymentList.add(payment);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return PaymentList;
    }

    public void Delete() {
        ArrayList<Transaction> transaction = Transaction.View();
        for (int i = 0; i < transaction.size(); i++) {
            if (transaction.get(i).BookingID.equals(BookingID)) {
                transaction.remove(i);
            }
        }
        File file = new File("Transaction.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < transaction.size(); i++) {
                bw.write(transaction.get(i) + "\n");
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Transaction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
