package com.serkan.crmv1.dto;

import java.time.LocalDateTime;

public abstract class BaseDto {
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
}
