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
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jingt
 */
public class Booking {
    
    private int ID;
    private String BookingID, CusID, CusName, CarID;
    private Date Start_Date;
    private String Collection_Time;
    private Date End_Date;
    private String Returned_Time, Status;
    private int Duration;
    private float TotalPrice;

    public Booking() {
    }

    public Booking(int ID, String BookingID, String CusID, String CusName,String CarID,Date Start_Date, String Collection_Time, Date End_Date, String Returned_Time, int Duration, String Status, float TotalPrice) {
        this.ID = ID;
        this.BookingID = BookingID;
        this.CusID = CusID;
        this.CusName = CusName;
        this.CarID = CarID;
        this.Start_Date = Start_Date;
        this.Collection_Time = Collection_Time;
        this.End_Date = End_Date;
        this.Returned_Time = Returned_Time;
        this.Status = Status;
        this.Duration = Duration;
        this.TotalPrice = TotalPrice;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String CusName) {
        this.CusName = CusName;
    }

    public String getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public Date getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(Date Start_Date) {
        this.Start_Date = Start_Date;
    }

    public String getCollection_Time() {
        return Collection_Time;
    }

    public void setCollection_Time(String Collection_Time) {
        this.Collection_Time = Collection_Time;
    }

    public Date getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(Date End_Date) {
        this.End_Date = End_Date;
    }

    public String getReturned_Time() {
        return Returned_Time;
    }

    public void setReturned_Time(String Returned_Time) {
        this.Returned_Time = Returned_Time;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
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
    
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        return ID + ";" + BookingID + ";" + CusID + ";" + CusName + ";" + CarID + ";" + sdf.format(Start_Date) + ";" + Collection_Time + ";" + sdf.format(End_Date) + ";" + Returned_Time + ";" + Duration + ';' + Status + ";" + TotalPrice + ";";
    }

    public void Add() {
        ArrayList<Booking> booking = Booking.View();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        if (booking.isEmpty()) {
            this.ID = 1;
            String pref = "B";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.BookingID = pref + res;
        } else {
            this.ID = booking.get((booking.size() - 1)).ID + 1;
            String pref = "B";
            String res = String.valueOf(ID).length() == 1 ? ("0000" + ID)
                    : String.valueOf(ID).length() == 2 ? ("000" + ID)
                    : String.valueOf(ID).length() == 3 ? ("00" + ID)
                    : String.valueOf(ID).length() == 4 ? ("0" + ID)
                    : String.valueOf(ID);
            this.BookingID = pref + res;
        }
        booking.add(this);
        File bookInfo = new File("tempBookings.txt");
        if (!bookInfo.exists()) {
            try {
                bookInfo.createNewFile();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
        try {
            FileWriter fw = new FileWriter("tempBookings.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(ID + ";" + BookingID + ";" + CusID + ";" + CusName + ";" + CarID + ";" + sdf.format(Start_Date) + ";"
                    + Collection_Time + ";" + sdf.format(End_Date) + ";" + Returned_Time + ";" + Duration + ";" + Status + ";" + TotalPrice);
            pw.close();
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<Booking> View() {
        ArrayList<Booking> BookingList = new ArrayList<>(0);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        File cusInfo = new File("Bookings.txt");
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(cusInfo));
            String line;
            while ((line = br.readLine()) != null) {
                String[] recLine = line.split(";");
                Booking booking = new Booking(Integer.parseInt(recLine[0]), recLine[1], recLine[2], recLine[3], recLine[4], sdf.parse(recLine[5]), recLine[6], sdf.parse(recLine[7]), recLine[8], Integer.parseInt(recLine[9]), recLine[10], Float.parseFloat(recLine[11]));
                BookingList.add(booking);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ParseException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return BookingList;
    }

    public void Delete() {
        ArrayList<Booking> bookings = Booking.View();
        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).BookingID.equals(BookingID)) {
                bookings.remove(i);
            }
        }

        File file = new File("Bookings.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < bookings.size(); i++) {
                bw.write(bookings.get(i) + "\n");
            }
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int calculateDuration(Date startdate, Date enddate) throws ParseException {
        startdate = this.getStart_Date();
        enddate = this.getEnd_Date();
        long diffInMillies = Math.abs(enddate.getTime() - startdate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        return (int) diff;
    }

    public static boolean DateValidation(Date StartDate, Date EndDate) {
        boolean flag = false;
        if (StartDate.before(EndDate)) {
            flag = true;
        } else if (StartDate.after(EndDate)) {
            JOptionPane.showMessageDialog(null, "Invalid Start Date\nStart Date should be earlier than End Date");
            flag = false;
        } else if (StartDate.equals(EndDate)) {
            JOptionPane.showMessageDialog(null, "Invalid Start Date\nStart Date should not be the same as End Date");
            flag = false;
        }
        return flag;
    }   
}
