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
import javax.swing.JOptionPane;

/**
 *
 * @author jingt
 */
public class Admin extends User{
    private String AdmID;
    private String User_Type;

    public Admin() {
        super();
    }

    public Admin(int ID, String AdmID, String Name, String IC_Number, String Contact_Num, String Email, String Password, String User_Type) throws FileNotFoundException {
        super(ID, Name, IC_Number, Contact_Num, Email, Password);
        this.AdmID = AdmID;
        this.User_Type = "admin";
    }

    public String getAdmID() {
        return AdmID;
    }

    public void setAdmID(String AdmID) {
        this.AdmID = AdmID;
    }

    public String getUser_Type() {
        return User_Type;
    }

    public void setUser_Type(String User_Type) {
        this.User_Type = User_Type;
    }

    @Override
    public String toString() {
        return ID + ";" + AdmID + ";" + Name + ";" + IC_Number + ";" + Contact_Num + ";" + Email + ";" + Password + ';' + User_Type + ";";
    }

    //Validation for the Existence of IC Number in Admin.txt
    public static boolean isICExist(String IC_Number) {
        boolean flag = false;
        File file = new File("Admin.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
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
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flag;
    }

    @Override
    public void Add() {
        ArrayList<Admin> admins = Admin.View();
        if (admins.isEmpty()) {
            this.ID = 1;
            String pref = "A";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.AdmID = pref + res;
        } else {
            this.ID = admins.get((admins.size() - 1)).ID + 1;
            String pref = "A";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.AdmID = pref + res;
        }
        admins.add(this);
        File cusInfo = new File("Admin.txt");
        if (!cusInfo.exists()) {
            try {
                cusInfo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        try {
            FileWriter fw = new FileWriter("Admin.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            //tfUserID.setText("" + customer.getUserID());
            pw.println(ID + ";" + AdmID + ";" + Name + ";" + IC_Number + ";" + Contact_Num + ";"
                    + Email + ";" + Password + ";" + User_Type + ";");
            JOptionPane.showMessageDialog(null, "Account Created Successfully!\nPlease Use "
                    + AdmID + " as Login UserID");
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Admin> View() {
        ArrayList<Admin> AdminList = new ArrayList<>();
        File admInfo = new File("Admin.txt");
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(admInfo));
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                Admin adm = new Admin(Integer.parseInt(recLine[0]), recLine[1], recLine[2], recLine[3], recLine[4], recLine[5], recLine[6], recLine[7]);
                AdminList.add(adm);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return AdminList;
    }

    @Override
    public void Update() {
        ArrayList<Admin> admins = Admin.View();
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).AdmID.equals(AdmID)) {
                admins.set(i, this);
            }
        }

        File file = new File("Admin.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < admins.size(); i++) {
                bw.write(admins.get(i) + "\n");
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void Delete() {
        ArrayList<Admin> admins = Admin.View();
        for (int i = 0; i < admins.size(); i++) {
            if (admins.get(i).AdmID.equals(AdmID)) {
                admins.remove(i);
            }
        }
        File file = new File("Admin.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < admins.size(); i++) {
                bw.write(admins.get(i) + "\n");
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
