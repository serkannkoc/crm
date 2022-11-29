package com.serkan.crmv1.dto;

import lombok.Data;

@Data
public class UserInformationDto extends BaseDto {
    private String fullName;
    private String address;
}
