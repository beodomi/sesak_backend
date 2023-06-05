package com.seask.controller;

import com.seask.dto.BusMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final SimpMessageSendingOperations sendingOperations;

    @MessageMapping("/chat/message")
    public void enter(BusMessage message)
    {
        if(BusMessage.MessageType.ENTER.equals(message.getType()))
        {
            message.setMessage(message.getSender() + "버스 탑승 예정");
        }
        sendingOperations.convertAndSend("/topic/chat/room/" + message.getBusId(), message);
    }
}
