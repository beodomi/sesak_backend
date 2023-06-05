package com.seask.model.mapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DriverMapper {
    public List<Map<String,Object>> selectPassengerById(String bus_route_id) throws SQLException;
}
