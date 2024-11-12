
import java.io.*;
import java.util.*;

/**
 *
 * @author KhooWennHonn(TP065779)
 */
public class Customer extends User{
    protected String Cus_Name;
    protected String Cus_ID;
    protected String Email;
    protected String Contact_Num;
    protected String Password;
    protected String IC_Num;
    protected String Gender;
    
    Customer(){
        this.Cus_Name = "User Undefined";
        this.Cus_ID = "CUS00000";
        this.Email = "defaultuser@mail.com";
        this.Contact_Num = "0";
        this.Password = "passwordUndefined";
        this.IC_Num = "0";
        this.Gender = "U";
    }

    public Customer(String Cus_ID, String Cus_Name, String Email, 
            String Contact_Num, String IC_Num, String Password, String Gender) {
        this.Cus_ID = Cus_ID;
        this.Cus_Name = Cus_Name;
        this.Email = Email;
        this.Contact_Num = Contact_Num;
        this.IC_Num = IC_Num;
        this.Password = Password;
        this.Gender = Gender;
    }

    Customer(String Cus_ID,String Password){
        this.Cus_ID = Cus_ID;
        this.Password = Password;
    }
    
    Customer(String Cus_ID){
        this.Cus_ID = Cus_ID;
    }
    
    public String getCus_Name() {
        return Cus_Name;
    }

    public void setCus_Name(String Cus_Name) {
        this.Cus_Name = Cus_Name;
    }

    public String getCus_ID() {
        return Cus_ID;
    }

    public void setCus_ID(String Cus_ID) {
        this.Cus_ID = Cus_ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContact_Num() {
        return Contact_Num;
    }

    public void setContact_Num(String Contact_Num) {
        this.Contact_Num = Contact_Num;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getIC_Num() {
        return IC_Num;
    }

    public void setIC_Num(String IC_Num) {
        this.IC_Num = IC_Num;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    @Override
    public void appendFile(){
        File cus = new File("customerList.txt");
        try{
            FileWriter cus_fw = new FileWriter(cus,true);
            BufferedWriter cus_bw = new BufferedWriter(cus_fw);
            PrintWriter cus_pw = new PrintWriter(cus_bw);
            String CustomerDetails = Cus_ID+";"+Cus_Name+";"+Email+";"+Contact_Num+";"+IC_Num+";"+Password+";"+Gender+"\n";
            cus_pw.write(CustomerDetails);
            cus_pw.close();
        } catch(IOException io){
            System.out.println("IO Exception error found");
        }
    }
}
