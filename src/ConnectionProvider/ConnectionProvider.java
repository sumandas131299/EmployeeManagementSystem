/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.*;
import java.util.*;
import javax.swing.*;


/**
 *
 * @author suman
 */
public class ConnectionProvider {
    
    public static Connection getCon()throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagementsystem","root","root123");
            return con;
        }
        catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,e.toString());
            return null;
        }
    }
}
