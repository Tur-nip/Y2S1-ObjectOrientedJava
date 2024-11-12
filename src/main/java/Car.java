import java.io.*;
import java.util.*;

/**
 *
 * @author Yu Hann
 */
public class Car implements Items{
    protected String PlateNum;
    public String CarID;
    public String Date_registered;
    public String Availability;
    public String Brand;
    public String Colour;
    public String Price;
    
    public Car(String carID,String plateNum,String brand, String colour, String price, String dateRegis, String avail){
        this.CarID = carID;
        this.PlateNum = plateNum;
        this.Brand = brand;
        this.Colour = colour;
        this.Price = price;
        this.Date_registered = dateRegis;
        this.Availability = avail;
    }
    public Car(){
        this.CarID = "CAR0000";
    }

    public String getPlateNum() {
        return PlateNum;
    }

    public void setPlateNum(String PlateNum) {
        this.PlateNum = PlateNum;
    }

    public String getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public String getDate_registered() {
        return Date_registered;
    }

    public void setDate_registered(String Date_registered) {
        this.Date_registered = Date_registered;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String Availability) {
        this.Availability = Availability;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String Price) {
        this.Price = Price;
    }
    
    @Override
    public void appendToFile(){
     File car = new File("carList.txt");
        try{
            FileWriter car_fw = new FileWriter(car,true);
            BufferedWriter car_bw = new BufferedWriter(car_fw);
            PrintWriter car_pw = new PrintWriter(car_bw);
            String carDetails = CarID+";"+PlateNum+";"+Brand+";"+Colour+";"+Price+";"+Date_registered+";"+Availability+"\n";
            car_pw.write(carDetails);
            car_pw.close();
        } catch(IOException io){
            System.out.println("IO Exception error found");
        }
    }
}
