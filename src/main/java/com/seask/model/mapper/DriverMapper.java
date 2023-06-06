package com.seask.model.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Mapper
public interface DriverMapper {
    public List<Map<String,Object>> selectPassengerById(String bus_route_id, String veh_id, String destination_station) throws SQLException;
}
