/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author iroja
 */
public class Tables {

    public static void main(String[] args) {
        try {
                   
            Connection con = ConnectonProvider.getCon();
            Statement st = con.createStatement();
//            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
//            st.executeUpdate("insert into appuser(userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','09-12-2002','9861855961','admin@gmail.com','admin','admin','nepal')");
//            st.executeUpdate("CREATE TABLE medicines ("
//                    + "medicine_pk INT AUTO_INCREMENT PRIMARY KEY,"
//                    + "uniqueId VARCHAR(200),"
//                    + "name VARCHAR(200),"
//                    + "companyName VARCHAR(200),"
//                    + "quantity BIGINT,"
//                    + "price BIGINT)");
//            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
