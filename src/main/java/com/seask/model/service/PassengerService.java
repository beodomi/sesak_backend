package com.seask.model.service;

import com.seask.dto.Passenger;
import com.seask.dto.Route;
import com.seask.dto.Station;

import java.sql.SQLException;
import java.util.List;

public interface PassengerService {
    public void insertBoardingPassenger(Passenger passenger) throws SQLException;
    public void deleteBoardingPassenger(String origin_station, String destination_station) throws SQLException;

    public void updateIsBoard(Passenger passenger) throws SQLException;
    public void updateIsHelp(Passenger passenger) throws SQLException;
    public List<Station> selectStationBySnm(String station_name) throws SQLException;

    public List<Route> selectRoutebyRoutenm(String route_name) throws SQLException;
}
