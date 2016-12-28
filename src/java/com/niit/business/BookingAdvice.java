/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niit.business;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author MRuser
 */
public class BookingAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    private SecondaryBooking secondaryBooking;
    
    public void setSecondaryBooking (SecondaryBooking secondaryBooking) {
        this.secondaryBooking = secondaryBooking;
    }
    
    @Override
    public void before(Method method, Object[] args, Object o) throws Throwable {
           secondaryBooking.checkSeatsAvailability(Integer.parseInt(args[0].toString()));
    }

    @Override
    public void afterReturning(Object o, Method method, Object[] args, Object o1) throws Throwable {
        if(secondaryBooking.status) {
            secondaryBooking.updateAvailableSeats(Integer.parseInt(args[0].toString()));
        }
    }
    
}
