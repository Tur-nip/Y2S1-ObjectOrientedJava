import java.io.*;
/**
 *
 * @author KhooWennHonn(TP065779)
 */
public class Booking implements Items{
    protected String BookingID;
    protected String CusID;
    public String CarID;
    protected String BookingDate;
    protected String Duration;
    protected String PricePerDay;
    
    Booking(String bookingID, String cusID, String carID, String bookingDate, String duration, String priceperday){
        this.BookingID = bookingID;
        this.CusID = cusID;
        this.CarID = carID;
        this.BookingDate = bookingDate;
        this.Duration = duration;
        this.PricePerDay = priceperday;
    }
    Booking (){
        this.BookingID = "BOK0000";
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

    public String getCarID() {
        return CarID;
    }

    public void setCarID(String CarID) {
        this.CarID = CarID;
    }

    public String getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(String BookingDate) {
        this.BookingDate = BookingDate;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getPricePerDay() {
        return PricePerDay;
    }

    public void setPricePerDay(String PricePerDay) {
        this.PricePerDay = PricePerDay;
    }
    
    
    @Override
    public void appendToFile(){
        // appends to file of bookingList.txt
        File booking = new File("bookingList.txt");
        try{
            FileWriter bk_fw = new FileWriter(booking,true);
            BufferedWriter bk_bw = new BufferedWriter(bk_fw);
            PrintWriter bk_pw = new PrintWriter(bk_bw);
            String bookingDetails = BookingID+";"+CusID+";"+CarID+";"+BookingDate+";"+Duration+";"+PricePerDay+"\n";
            bk_pw.write(bookingDetails);
            bk_pw.close();
        } catch(IOException io){
            System.out.println("IO Exception error found");
        }
    }
}
