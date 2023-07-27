package com.example.websockets.controller;

import com.example.websockets.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @MessageMapping("/notifyMessage")
    public void sendNotification(Message<String> message) {
        notificationService.sendNotification("hello websockets");
    }

}