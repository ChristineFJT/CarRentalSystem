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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jingt
 */
public class Customer extends User {
    private String CusID;
    private String User_Type;

    public Customer() {
        super();
    }
    
    public Customer(int ID,String CusID,String Name,String IC_Number,String Contact_Num,String Email, String Password, String User_Type) throws FileNotFoundException {
        super(ID, Name, IC_Number, Contact_Num, Email, Password);
        this.CusID = CusID;
        this.User_Type = "customer";
    }

    public String getCusID() {
        return CusID;
    }

    public void setCusID(String CusID) {
        this.CusID = CusID;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String User_Type) {
        this.User_Type = User_Type;
    }
    
    @Override
    public String toString() {
        return ID + ";" + CusID + ";" + Name + ";" + IC_Number + ";" + Contact_Num + ";" + Email + ";" + Password + ';' + User_Type + ";";
    }
    
    //Validation for the Existence of IC Number in Customer.txt
    public static boolean isICExist(String IC_Number) {
        boolean flag = false;
        File file = new File("Customer.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        if (file.length() == 0) {
            flag = true;
        } else {
            try {
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while ((line = br.readLine()) != null) {
                    String[] rec = line.split(";");
                    if (!IC_Number.equals(rec[3])) {
                        flag = true;
                    } else {
                        flag = false;
                        break;
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return flag;
    }

    @Override
    public void Add() {
        ArrayList<Customer> customers = Customer.View();
        if (customers.isEmpty()) {
            this.ID = 1;
            String pref = "C";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.CusID = pref + res;
        } else {
            this.ID = customers.get((customers.size() - 1)).ID + 1;
            String pref = "C";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.CusID = pref + res;
        }
        customers.add(this);
        File cusInfo = new File("Customer.txt");
        if (!cusInfo.exists()) {
            try {
                cusInfo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        try {
            FileWriter fw = new FileWriter("Customer.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            //tfUserID.setText("" + customer.getUserID());
            pw.println(ID + ";" + CusID + ";" + Name + ";" + IC_Number + ";" + Contact_Num + ";"
                    + Email + ";" + Password + ";" + User_Type + ";");
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Customer> View() {
        ArrayList<Customer> CustomerList = new ArrayList<>();
        File cusInfo = new File("Customer.txt");
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(cusInfo));
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                Customer cus = new Customer(Integer.parseInt(recLine[0]), recLine[1], recLine[2], recLine[3], recLine[4], recLine[5], recLine[6], recLine[7]);
                CustomerList.add(cus);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CustomerList;
    }

    @Override
    public void Update() {
        ArrayList<Customer> customers = Customer.View();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).CusID.equals(CusID)) {
                customers.set(i, this);
            }
        }
        File file = new File("Customer.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < customers.size(); i++) {
                bw.write(customers.get(i) + "\n");
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Delete() {
        ArrayList<Customer> customers = Customer.View();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).CusID.equals(CusID)) {
                customers.remove(i);
            }
        }
        File file = new File("Customer.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < customers.size(); i++) {
                bw.write(customers.get(i) + "\n");
                System.out.println(i);
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
