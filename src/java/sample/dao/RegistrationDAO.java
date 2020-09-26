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
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author potte
 */
public class RegistrationDAO implements Serializable{
    
    public boolean checkLogin(String username, String password){
        try{
            Context ctx = new InitialContext();
            Context envCtx = (Context)ctx.lookup("java:comp/env");
            DataSource ds = (DataSource)envCtx.lookup("LibraryManagement");
            Connection con = ds.getConnection();
            
            String sql = "select AccountName, Role from DimAccount Where AccountName = ? and Password = ? and AccountStatus = 1";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, username);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            boolean result = rs.next();
            rs.close();
            stm.close();
            con.close();
            if(result){
                return true;
            }
        }catch(NamingException e){
            System.out.println("RegistrationDAO_CheckLogin_NamingException : "+ e.getMessage());
        }catch(SQLException e){
            System.out.println("RegistrationDAO_CheckLogin_SQLExceptions : "+ e.getMessage());
        }
        return false;
    }
}
