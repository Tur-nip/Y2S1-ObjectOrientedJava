import java.io.*;
/**
 *
 * @author KhooWennHonn(TP065779)
 */
public class BookingPayment extends Booking{
    protected String PaymentID;
    public String TotalPrice;
    protected String PaymentStatus;
    enum Status {
        PENDING,
        PAID
    }
    BookingPayment(){
        PaymentID = "PAY0000";
        PaymentStatus = (Status.PENDING).toString();
    }
    BookingPayment(String paymentID,String bookingID, String cusID, String carID, String bookingDate, String duration, 
            String priceperday, String totalPrice, String paymentStatus){
        super(bookingID,cusID,carID,bookingDate,duration,priceperday);
        this.PaymentID = paymentID;
        this.TotalPrice = totalPrice;
        this.PaymentStatus = paymentStatus;
    }

    public String getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    public String getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(String TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    // overloading
    public void setTotalPrice(){
        int price = Integer.parseInt(this.PricePerDay);
        int days = Integer.parseInt(this.Duration);
        int total = price * days;
        String totalP = String.valueOf(total);
        this.TotalPrice = totalP;
    }

    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String PaymentStatus) {
        this.PaymentStatus = PaymentStatus;
    }
    
    @Override
    public void appendToFile(){
     File payment = new File("paymentList.txt");
        try{
            FileWriter py_fw = new FileWriter(payment,true);
            BufferedWriter py_bw = new BufferedWriter(py_fw);
            PrintWriter py_pw = new PrintWriter(py_bw);
            String paymentDetails = PaymentID+";"+BookingID+";"+CusID+";"+CarID+";"+BookingDate+";"+
                    Duration+";"+PricePerDay+";"+TotalPrice+";"+PaymentStatus+"\n";
            py_pw.write(paymentDetails);
            py_pw.close();
        } catch(IOException io){
            System.out.println("IO Exception error found");
        }
    }
}
