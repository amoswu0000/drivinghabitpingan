package com.service.drivinghabitpingan.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-26T00:26:04.387Z")

@RestSchema(schemaId = "drivinghabitpingan")
@RequestMapping(path = "/drivinghabitpingan", produces = MediaType.APPLICATION_JSON)
public class DrivinghabitpinganImpl {

    @Autowired
    private DrivinghabitpinganDelegate userDrivinghabitpinganDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDrivinghabitpinganDelegate.helloworld(name);
    }

}
