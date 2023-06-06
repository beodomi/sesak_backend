package com.seask.model.service;

import com.seask.dto.Passenger;
import com.seask.model.mapper.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.sql.SQLException;

@Service
public class PassengerServiceImpl implements PassengerService{

    private PassengerMapper passengerMapper;

    @Autowired
    public PassengerServiceImpl(PassengerMapper passengerMapper)
    {
        this.passengerMapper = passengerMapper;
    }

    @Override
    public void insertBoardingPassenger(Passenger passenger) throws SQLException {
        passengerMapper.insertBoardingPassenger(passenger);
    }

    @Override
    public void deleteBoardingPassenger(String origin_station, String destination_station) throws SQLException {
        passengerMapper.deleteBoardingPassenger(origin_station, destination_station);
    }

    @Override
    public void updateIsBoard(Passenger passenger) throws SQLException {
        passengerMapper.updateIsBoard(passenger);
    }

    @Override
    public void updateIsHelp(Passenger passenger) throws SQLException {
        passengerMapper.updateIsHelp(passenger);
    }

}