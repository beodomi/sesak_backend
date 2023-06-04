package com.seask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BusRoom {
    private String BusRoomId;
    private String BusRoomName;

    public static BusRoom create(String name)
    {
        BusRoom busRoom = new BusRoom();
        busRoom.BusRoomId = UUID.randomUUID().toString();
        busRoom.BusRoomName = name;
        return busRoom;
    }
}
