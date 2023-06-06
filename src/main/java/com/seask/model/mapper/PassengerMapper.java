package com.seask.model.mapper;

import com.seask.dto.Passenger;
import com.seask.dto.Station;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;

@Mapper
public interface PassengerMapper {
    public void insertBoardingPassenger(Passenger passenger) throws SQLException;
    public void deleteBoardingPassenger(String origin_station, String destination_station) throws SQLException;
    public void updateIsBoard(Passenger passenger) throws SQLException;
    public void updateIsHelp(Passenger passenger) throws SQLException;

    //역 이름 검색
    public List<Station> selectStationBySnm(String station_name) throws SQLException;
    //노선
}
