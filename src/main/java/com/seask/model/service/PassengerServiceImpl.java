package com.seask.model.service;

import com.seask.dto.Passenger;
import com.seask.dto.Route;
import com.seask.dto.Station;
import com.seask.model.mapper.PassengerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class PassengerServiceImpl implements PassengerService {

    private PassengerMapper passengerMapper;

    @Autowired
    public PassengerServiceImpl(PassengerMapper passengerMapper) {
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

    @Override
    public List<Station> selectStationBySnm(Station station) throws SQLException {
        List<Station> result = passengerMapper.selectStationBySnm(station);
        return result;
    }

    @Override
    public List<Route> selectRoutebyRoutenm(String route_name) throws SQLException {
        List<Route> result = passengerMapper.selectRoutebyRoutenm(route_name);
        return result;
    }

    @Override
    public String selectOrdByRidAndAid(String bus_route_id, String ars_id) throws SQLException {
        return passengerMapper.selectOrdByRidAndAid(bus_route_id, ars_id);
    }

    @Override
    public void updateDestination(Passenger station) throws SQLException {
        passengerMapper.updateDestination(station);
    }
}