
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yu Hann
 */
public class AdminClass extends User{
    protected String Admin_Name;
    protected String Admin_NRIC;
    protected String Contact_Num;
    protected String Email;
    protected String Admin_ID;
    
    AdminClass(){
        this.Admin_Name = "User Undefined";
        this.Admin_NRIC = "0";
        this.Contact_Num = "0";
        this.Email = "defaultadmin@mail.com";
        this.Admin_ID ="A00000";
    }


    public AdminClass(String Admin_Name, String Admin_NRIC, 
            String Contact_Num, String Email, String Admin_ID) {
        this.Admin_Name = Admin_Name;
        this.Admin_NRIC = Admin_NRIC;
        this.Contact_Num = Contact_Num;
        this.Email = Email;
        this.Admin_ID = Admin_ID;
    }  
    
    public String getAdmin_Name() {
        return Admin_Name;
    }

    public void setAdmin_Name(String Admin_Name) {
        this.Admin_Name = Admin_Name;
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

    public String getAdmin_NRIC() {
        return Admin_NRIC;
    }

    public void setIC_Num(String Admin_NRIC) {
        this.Admin_NRIC = Admin_NRIC;
    }

    public void setAdmin_ID(String Admin_ID) {
        this.Admin_ID = Admin_ID;
    }

    public String getAdmin_ID() {
        return Admin_ID;
    }
    
    @Override
    public void appendFile(){
        File cus = new File("AdminData.txt");
        try{
            FileWriter admin_fw = new FileWriter(cus,true);
            BufferedWriter admin_bw = new BufferedWriter(admin_fw);
            PrintWriter admin_pw = new PrintWriter(admin_bw);
            String AdminDetails = Admin_Name+";"+Admin_NRIC+";"+Contact_Num+";"+Email+";"+Admin_ID+"\n";
            admin_pw.write(AdminDetails);
            admin_pw.close();
        } catch(IOException io){
            System.out.println("IO Exception error found");
        }
    }
}
