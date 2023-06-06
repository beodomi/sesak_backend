package com.seask.controller;

import com.seask.model.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusController {
    private PassengerService passengerService;

    @Autowired
    public BusController(PassengerService passengerService)
    {
        this.passengerService = passengerService;
    }

    @GetMapping("/{bus_route_id}")
    public ResponseEntity<?> selectPassenger(@PathVariable String bus_route_id)
    {

    }
}
