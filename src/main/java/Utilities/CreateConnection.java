/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import com.mycompany.exammanagement.AddDocuments;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author siddh
 */
public class CreateConnection {
    
    private final static String databaseNameString="test";
   private final String userString="admin@google.com";
   private final String userPasswordString="admin";
 
    public static Connection getInstance(){
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databaseNameString, "root", "admin");
            return con;
        } catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
