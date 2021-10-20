/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class koneksi { 
     private static Connection databasekoneksi;
     public static Connection koneksiDB() throws SQLException {
         if (databasekoneksi == null){
             try{
                 String DB = "jdbc:mysql//localhost:3360/satifah";
                         String user = "root";
                         String pass = " ";
                         
                 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                 databasekoneksi = (Connection) DriverManager.getConnection(DB,user,pass);
                 
                 }catch (Exception e){
                     JOptionPane.showMessageDialog(null, "Koneksi GAGAL");
                 }
             }return databasekoneksi;
     }
    }
     
    

