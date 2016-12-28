/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.controller;

import com.niit.business.Booking;
import com.niit.business.SecondaryBooking;
import com.niit.entity.BoxOffice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author MRuser
 */
@Controller
public class BookingController {
    // using the get request of the browser the following would be called
    @RequestMapping(value="/booking") 
    public String getBooking(ModelMap model) { 
        // passing the boxOffice object as model to the booking.jsp
        model.addAttribute("boxOffice", new BoxOffice());
        return "booking";
    } 
    
    @RequestMapping(value="/booking", method=RequestMethod.POST) 
    public String postBooking(@ModelAttribute("boxOffice")BoxOffice boxOffice, ModelMap model) { 
        // passing the boxOffice object as model to the booking.jsp
        System.out.println(boxOffice);
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/niit/business/business-config.xml");
        Booking booking = (Booking) context.getBean("bookingProxy");
        
        booking.book(boxOffice.getQuantity(), boxOffice.getMovie());
        
        model.addAttribute("status", SecondaryBooking.bookingStatus);
        return "success";
    }        
}
