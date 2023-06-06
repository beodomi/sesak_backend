package com.seask.controller;

import com.seask.model.service.DriverService;
import com.seask.model.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/driver")
public class BusController {
    private PassengerService passengerService;
    private DriverService driverService;

    @Autowired
    public BusController(PassengerService passengerService, DriverService driverService)
    {
        this.passengerService = passengerService;
        this.driverService = driverService;
    }

    @GetMapping("/{bus_route_id}/{veh_id}/{destination_station}")
    public ResponseEntity<?> selectPassenger(@PathVariable String bus_route_id, @PathVariable String veh_id, @PathVariable String destination_station) throws SQLException {
        List<Map<String,Object>> result = driverService.selectPassengerById(bus_route_id,veh_id,destination_station);

        return ResponseEntity.ok(result);
    }
}
