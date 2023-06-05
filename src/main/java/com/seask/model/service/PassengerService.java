package com.seask.model.service;

import com.seask.dto.Passenger;

import java.sql.SQLException;

public interface PassengerService {
    public void insertBoardingPassenger(Passenger passenger) throws SQLException;
    public void deleteBoardingPassenger(String origin_station, String destination_station) throws SQLException;

    public void updateIsBoard(String origin_station, String destination_station) throws SQLException;
}
