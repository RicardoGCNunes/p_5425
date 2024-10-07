/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bdconnect;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ART
 */
public class DataBaseConnect {
    
    public int insert(String query, ArrayList<String> objects) {
        PreparedStatement statment = null;
        Connection con = null;
        int rowsAffected = 0;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_schedule_manager", "root", "");
            String sql = query;
            statment = con.prepareStatement(sql);
            
            for (String elem : objects) {
                // Try first to convert string to int
                try {
                    int number = Integer.parseInt(elem);
                    statment.setInt(objects.indexOf(elem) + 1, number);
                    continue;
                } catch (NumberFormatException e){}
                
                // try second to convert string to date
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(elem, formatter);
                    statment.setDate(objects.indexOf(elem) + 1, Date.valueOf(date));
                    continue;
                } catch (DateTimeParseException e){}
                
                statment.setString(objects.indexOf(elem) + 1, elem);
            }
            
            rowsAffected = statment.executeUpdate();
            
        } catch (SQLException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (statment != null) statment.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return rowsAffected;
    }
    
    public int delete(String query){
        PreparedStatement statment = null;
        Connection con = null;
        int rowsAffected = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_schedule_manager", "root", "");
            
            statment = con.prepareStatement(query);
            
            rowsAffected = statment.executeUpdate();
            
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (statment != null) statment.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
            }
            
        }
        return rowsAffected;
    }
    
    public int edit(String query, ArrayList<String> objects) {
        PreparedStatement statment = null;
        Connection con = null;
        int rowsAffected = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_schedule_manager", "root", "");
            
            statment = con.prepareStatement(query);
            for (String elem : objects) {
                // Try first to convert string to int
                try {
                    int number = Integer.parseInt(elem);
                    statment.setInt(objects.indexOf(elem) + 1, number);
                    continue;
                } catch (NumberFormatException e){}
                
                // try second to convert string to date
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(elem, formatter);
                    statment.setDate(objects.indexOf(elem) + 1, Date.valueOf(date));
                    continue;
                } catch (DateTimeParseException e){}
                
                statment.setString(objects.indexOf(elem) + 1, elem);
            }
            
            rowsAffected = statment.executeUpdate(); 
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } catch (NumberFormatException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (statment != null) statment.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
            }
            
        }
        return rowsAffected;
    }
    
    public ArrayList<ArrayList<String>> list(String query) {
        PreparedStatement statment = null;
        Connection con = null;
        ArrayList<ArrayList<String>> table = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/bd_schedule_manager", "root", "");
            statment = con.prepareStatement(query);
            ResultSet result = statment.executeQuery();
            
            ResultSetMetaData metaData = (ResultSetMetaData) result.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            while (result.next()) {
                ArrayList<String> row = new ArrayList<>();
                
                for (int i = 1; i <= columnCount; i++) {
                    row.add(result.getString(i));
                }
                table.add(row);
            }
        } catch (ClassNotFoundException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } catch (SQLException e) {
            Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                if (statment != null) statment.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                Logger.getLogger(DataBaseConnect.class.getName()).log(Level.SEVERE, null, e);
            }
            
        }
        return table;
    }
}
