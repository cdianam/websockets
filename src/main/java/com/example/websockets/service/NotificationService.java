package com.example.websockets.service;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final SimpMessagingTemplate simpMessagingTemplate;

    public void sendNotification(String message) {
        simpMessagingTemplate.convertAndSend("/queue/reply", message);
    }
}
