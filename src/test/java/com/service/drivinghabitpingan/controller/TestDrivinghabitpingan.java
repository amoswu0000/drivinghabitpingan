package com.service.drivinghabitpingan.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDrivinghabitpingan {

        DrivinghabitpinganDelegate drivinghabitpinganDelegate = new DrivinghabitpinganDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = drivinghabitpinganDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}