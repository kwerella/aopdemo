/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.business;

/**
 *
 * @author MRuser
 */
public class SecondaryBooking {
    
    private static int seatsAvailable = 100;
    public static String bookingStatus = "";
    public static boolean status;
    
    public boolean checkSeatsAvailability(int quantity) {        
        if(seatsAvailable > quantity) {
            bookingStatus += "Booked Tickets: " + quantity;
            status = true;
            return true;
        }
        else {
            bookingStatus += "Only Seats Available: " + seatsAvailable;
            status = false;
            return false;
        }                
    }
    
    public void updateAvailableSeats(int quantity) {
        seatsAvailable = seatsAvailable - quantity;        
        bookingStatus += "<br/>Remaining Seats: " + seatsAvailable;
    }
        
}
