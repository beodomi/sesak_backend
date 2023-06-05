package com.seask.controller;

import com.seask.dto.BusRoom;
import com.seask.model.service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/chat")
public class ChatRoomController {
    private final BusService busService;

    //채팅방 생성
    @GetMapping("/rooms")
    @ResponseBody
    public List<BusRoom> room()
    {
        return busService.findRoom();
    }

    //채팅방 삭제
    @PostMapping("/room")
    @ResponseBody
    public BusRoom createRoom(@RequestParam String name)
    {
        return busService.createRoom(name);
    }

    //특정 채팅방 조회
    @GetMapping("/room/{roomId}")
    @ResponseBody
    public BusRoom roomInfo(@PathVariable String roomId)
    {
        return busService.findById(roomId);
    }
}
