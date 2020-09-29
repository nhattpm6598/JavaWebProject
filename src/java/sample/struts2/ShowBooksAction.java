/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.struts2;

import java.util.List;
import sample.dao.ShowBookCateDAO;
import sample.dto.BookCateDTO;

/**
 *
 * @author potte
 */
public class ShowBooksAction {
    private final String SUCCESS = "success";
    private List<BookCateDTO> listBookCate;
    
    public ShowBooksAction() {
    }
    
    public String execute() throws Exception {
        ShowBookCateDAO dao = new ShowBookCateDAO();
        
        this.listBookCate = dao.showListBookCate();
        System.out.println(listBookCate.size());
        return SUCCESS;
    }

    /**
     * @return the listBookCate
     */
    public List<BookCateDTO> getListBookCate() {
        return listBookCate;
    }
    
}
