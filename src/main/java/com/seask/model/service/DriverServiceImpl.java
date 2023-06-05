package com.seask.model.service;

import com.seask.model.mapper.DriverMapper;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
public class DriverServiceImpl implements DriverService{
    private DriverMapper driverMapper;

    public DriverServiceImpl(DriverMapper driverMapper)
    {
        this.driverMapper = driverMapper;
    }
    @Override
    public List<Map<String, Object>> selectPassengerById(String bus_route_id, String veh_id, String destination_station) throws SQLException {
        return driverMapper.selectPassengerById(bus_route_id,veh_id,destination_station);
    }
}
