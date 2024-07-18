package org.example.emailservice_may2024.dtos;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MessageDto {
    private String to;
    private String from;
    private String subject;
    private String body;
}
