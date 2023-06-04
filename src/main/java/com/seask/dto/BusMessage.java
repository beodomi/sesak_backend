package com.seask.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class BusMessage {
    public enum MessageType{
        ENTER, TALK, LEAVE
    }
    private MessageType type;
    private String BusId;
    private String sender;
    private String message;
}
