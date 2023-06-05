package com.seask.model.service;

import com.seask.dto.BusRoom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.*;

@Service
@RequiredArgsConstructor
public class BusService {
    private Map<String, BusRoom> busRooms;

    //의존관계 주입시 실행되는 코드
    @PostConstruct
    private void init() {
        busRooms = new LinkedHashMap<>();
    }

    //채팅방 불러오기
    public List<BusRoom> findRoom() {
        //채팅방 최근 생성순
        List<BusRoom> result = new ArrayList<>(busRooms.values());
        Collections.reverse(result);

        return result;
    }

    //채팅방 하나
    public BusRoom findById(String busRoomId) {
        return busRooms.get(busRoomId);
    }

    //방 생성
    public BusRoom createRoom(String name)
    {
        BusRoom busRoom = BusRoom.create(name);
        busRooms.put(busRoom.getBusRoomId(), busRoom);
        return busRoom;
    }
}
