/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author potte
 */
public class DBconnection implements Serializable{
    
    public static Connection makeConnection() throws SQLException,NamingException{
        Connection con = null;
        
        Context ctx = new InitialContext();
        Context envCtx = (Context)ctx.lookup("java:comp/env");
        DataSource ds = (DataSource)envCtx.lookup("LibraryManagement");
        
        con = ds.getConnection();
        return con;
    }
    
}
