package com.seask.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Passenger {
    String bus_route_id;
    String origin_station;
    String destination_station;
    boolean is_help;
    boolean is_board;
}
