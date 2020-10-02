/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.dto;

import java.io.Serializable;

/**
 *
 * @author potte
 */
public class BookDTO implements Serializable{
    private int id;
    private String name, image, bookCateId, author, language, Des;

    public BookDTO() {
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the bookCateId
     */
    public String getBookCateId() {
        return bookCateId;
    }

    /**
     * @param bookCateId the bookCateId to set
     */
    public void setBookCateId(String bookCateId) {
        this.bookCateId = bookCateId;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the Des
     */
    public String getDes() {
        return Des;
    }

    /**
     * @param Des the Des to set
     */
    public void setDes(String Des) {
        this.Des = Des;
    }
    
    
}
