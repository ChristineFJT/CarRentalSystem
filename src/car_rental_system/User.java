/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car_rental_system;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author jingt
 */
public abstract class User {
    protected int ID;
    protected String Name, IC_Number, Contact_Num, Email, Password;

    // Blank Constructor
    public User() {
    }

    // Constructor for Create New User
   public User(int ID, String Name, String IC_Number, String Contact_Num, String Email, String Password) {
        this.ID = ID;
        this.Name = Name;
        this.IC_Number = IC_Number;
        this.Contact_Num = Contact_Num;
        this.Email = Email;
        this.Password = Password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getIC_Number() {
        return IC_Number;
    }

    public void setIC_Number(String IC_Number) {
        this.IC_Number = IC_Number;
    }

    public String getContact_Num() {
        return Contact_Num;
    }

    public void setContact_Num(String Contact_Num) {
        this.Contact_Num = Contact_Num;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
   // Abstract Method for Adding, Updating, Deleting User
    public abstract void Add();
    public abstract void Update();
    public abstract void Delete();

    public static boolean isNameValid(String Name) {
        boolean flag = false;
        for (int i = 0; i < Name.length(); i++) {
            if (Character.isLetter(Name.charAt(i)) | Name.charAt(i) == ' ') {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isEmailValid(String Email) {
        boolean flag = false;
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < Email.length(); i++) {
            // Email can contain character, number, @ and .
            Matcher matcher = pattern.matcher(Email);
            if (matcher.matches() == true) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isICValid(String IC_Number) {
        boolean flag = false;
        for (int i = 0; i < IC_Number.length(); i++) {
            if (Character.isDigit(IC_Number.charAt(i))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isContactValid(String Contact_Num) {
        boolean flag = false;
        for (int i = 0; i < Contact_Num.length(); i++) {
            // Contact Number can only contain digit
            if (Character.isDigit(Contact_Num.charAt(i))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
}
