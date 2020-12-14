package com.smarterwith.notification.controller;


import com.smarterwith.notification.model.Notification;
import com.smarterwith.notification.repository.NotificationRepository;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Api("/v1/api/notifications")
@RequestMapping("/v1/api")
public class NotificationController {

    private NotificationRepository notificationRepository;

    @GetMapping("/notifications")
    public List<Notification> getNotifications() {
        return notificationRepository.findAll();
    }

    @GetMapping("/notifications/health")
    public String health() {
        return "OK";
    }
}
