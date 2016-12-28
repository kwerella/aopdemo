/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.entity;

/**
 *
 * @author MRuser
 */
public class BoxOffice {
    
    private int quantity;
    private String movie;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "BoxOffice{" + "quantity=" + quantity + ", movie=" + movie + '}';
    }
        
}
