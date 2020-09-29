/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import sample.db.DBconnection;

/**
 *
 * @author potte
 */
public class RegistrationDAO implements Serializable{
    
    
    
    //check Login
    String checkLoginSQL = "SELECT ROLE FROM DimAccount WHERE AccountName = ? AND Password = ? AND AccountStatus = 1";
    //
    public boolean checkLogin(String username, String password){
        boolean result = false;
        try{
            Connection con = DBconnection.makeConnection();
            
            String sql = checkLoginSQL;
            
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            
            ResultSet rs = stm.executeQuery();
            
            if(rs.next()){
                result = true;
            }
            
            rs.close();stm.close();con.close();
            
        }catch(SQLException ex){
            System.out.println("RegistrationDAO_checkLogin_SQLException: "+ex.getMessage());
        }catch(NamingException ex){
            System.out.println("RegistrationDAO_checkLogin_NamingException: "+ex.getMessage());
        }
        return result;
    }
    
}
