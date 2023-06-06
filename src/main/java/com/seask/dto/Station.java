package com.seask.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Station {
    String node_id;
    String ars_id;
    String station_name;
    double x;
    double y;
}
