package com.seask.model.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DriverService {
    public List<Map<String,Object>> selectPassengerById(String bus_route_id, String veh_id, String destination_station) throws SQLException;
}
