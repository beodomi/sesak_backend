package com.seask.controller;

import com.seask.dto.Passenger;
import com.seask.model.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@CrossOrigin
@RequestMapping("/pass")
public class PassengerController {
    private PassengerService passengerService;

    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping("") // 승차벨
    public ResponseEntity<?> insert(@RequestBody Passenger passenger) throws SQLException {
        passengerService.insertBoardingPassenger(passenger);
        return ResponseEntity.ok().build();
    }

    //하차벨
    @DeleteMapping("/{origin_station}/{destination_station}/delete")
    public ResponseEntity<?> delete(@PathVariable String origin_station, @PathVariable String destination_station) throws SQLException {
        passengerService.deleteBoardingPassenger(origin_station, destination_station);
        return ResponseEntity.ok().build();
    }

    //탑승 완료 버튼
    @PostMapping("/ride")
    public ResponseEntity<?> put(@RequestBody Passenger passenger) throws SQLException {
        passengerService.updateIsBoard(passenger);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/help")
    public ResponseEntity<?> updateHelp(@RequestBody Passenger passenger) throws SQLException
    {
        passengerService.updateIsHelp(passenger);
        return ResponseEntity.ok().build();
    }
}
