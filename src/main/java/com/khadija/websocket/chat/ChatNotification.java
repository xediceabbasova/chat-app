package com.khadija.websocket.chat;

import lombok.Builder;

@Builder
public record ChatNotification(
        String id,
        String senderId,
        String recipientId,
        String content
) {
}
