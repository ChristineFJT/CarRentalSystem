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
public class Car {
 
    private int ID;
    private String CarID, CarPlateNum;
    private int Year, Passenger_Capacity;
    private String Model, Colour, Type, Transmission;
    private float Price;
    private String Brand, Availability;

    public Car() {
    }

    public Car(int ID, String CarID, String CarPlateNum, int Year, int Passenger_Capacity, String Model, String Colour, String Type, String Transmission, String Brand, float Price, String Availability) throws FileNotFoundException {
        this.ID = ID;
        this.CarID = CarID;
        this.CarPlateNum = CarPlateNum;
        this.Year = Year;
        this.Passenger_Capacity = Passenger_Capacity;
        this.Model = Model;
        this.Colour = Colour;
        this.Type = Type;
        this.Transmission = Transmission;
        this.Price = Price;
        this.Brand = Brand;
        this.Availability = "Yes";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public String getCarPlateNum() {
        return CarPlateNum;
    }

    public void setCarPlateNum(String CarPlateNum) {
        this.CarPlateNum = CarPlateNum;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getPassenger_Capacity() {
        return Passenger_Capacity;
    }

    public void setPassenger_Capacity(int Passenger_Capacity) {
        this.Passenger_Capacity = Passenger_Capacity;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String Transmission) {
        this.Transmission = Transmission;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }
    
    @Override
    public String toString() {
        return ID + ";" + CarID + ";" + CarPlateNum + ";" + Year + ";" + Passenger_Capacity + ";" + Model + ";" + Colour + ";" + Type + ";" + Transmission + ";" + Brand + ";" + Price + ";" + Availability + ';';
    }
    
    //Validation for Car Plate Number
    public static boolean isCarPlateValid(String CarPlateNum) {
        boolean flag = false;
        for (int i = 0; i < CarPlateNum.length(); i++) {
            if (Character.isLetter(CarPlateNum.charAt(i)) | Character.isDigit(CarPlateNum.charAt(i))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
    
    //Validation for the Existence of Car plate Number in Car Info.txt
    public static boolean isCarPlateExist(String CarPlateNum) {
        boolean flag = false;
        File file = new File("Car Info.txt");
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
                if (!CarPlateNum.equals(rec[2])) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

    public void Add() {
        ArrayList<Car> car = Car.View();
        if (car.isEmpty()) {
            this.ID = 1;
            String pref = "V";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.CarID = pref + res;
        } else {
            this.ID = car.get((car.size() - 1)).ID + 1;
            String pref = "V";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.CarID = pref + res;
        }
        car.add(this);
        File carInfo = new File("Car Info.txt");
        if (!carInfo.exists()) {
            try {
                carInfo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        try {
            FileWriter fw = new FileWriter("Car Info.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.println(ID + ";" + CarID + ";" + CarPlateNum + ";" + Year + ";" + Passenger_Capacity + ";"
                    + Model + ";" + Colour + ";" + Type + ";" + Transmission + ";" + Brand + ";" + Price + ";" + Availability + ";");
            JOptionPane.showMessageDialog(null, "Car Added Successfully");
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Car> View() {
        ArrayList<Car> CarList = new ArrayList<>();
        File carInfo = new File("Car Info.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(carInfo));
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                Car car = new Car(Integer.parseInt(recLine[0]), recLine[1], recLine[2], Integer.parseInt(recLine[3]), Integer.parseInt(recLine[4]), recLine[5], recLine[6], recLine[7], recLine[8], recLine[9], Float.parseFloat(recLine[10]), recLine[11]);
                CarList.add(car);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }
        return CarList;
    }

    public void Update() {
        ArrayList<Car> cars = Car.View();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).CarID.equals(CarID)) {
                cars.set(i, this);
            }
        }

        File file = new File("Car Info.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < cars.size(); i++) {
                bw.write(cars.get(i) + "\n");
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Car.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Delete() {
        ArrayList<Car> cars = Car.View();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).CarID.equals(CarID)) {
                cars.remove(i);
            }
        }

        File file = new File("Car Info.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < cars.size(); i++) {
                bw.write(cars.get(i) + "\n");
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
