/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhat.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import service.db.DBconnection;
import service.dto.BookCateDTO;

/**
 *
 * @author potte
 */
public class ShowBookCateDAO implements Serializable{
    
    //show book Category
    String showBookCateSQL = "SELECT CategoryBookCode, CategoryName FROM DimBookCategory";
    //
    public List<BookCateDTO> showListBookCate(){
        List<BookCateDTO> list = new ArrayList<>();
        BookCateDTO dto = null;
        System.out.println("showBookCate");
        try{
            Connection con = DBconnection.makeConnection();
            
            String sql = showBookCateSQL;
            
            PreparedStatement stm = con.prepareStatement(sql);
            
            ResultSet rs = stm.executeQuery();
            
            while(rs.next()){
                dto = new BookCateDTO();
                dto.setId(rs.getString("CategoryBookCode"));
                dto.setName(rs.getString("CategoryName"));
                list.add(dto);
            }
        
            rs.close();stm.close();con.close();
            
        }catch(NamingException ex){
            System.out.println("BookCategoryDAO_showListBookCate_NamingException: "+ex.getMessage());
        }catch(SQLException ex){
            System.out.println("BookCategoryDAO_showListBookCate_SQLException: "+ex.getMessage());
        }
        return list;
    }
}
