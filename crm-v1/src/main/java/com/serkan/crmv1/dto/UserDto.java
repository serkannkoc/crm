package com.serkan.crmv1.dto;

import com.serkan.crmv1.model.User;
import lombok.Data;

@Data
public class UserDto extends BaseDto{
    private UserInformationDto userInformationDto;
    private SaleDto saleDto;
    private UserPermissionDto userPermissionDto;
}
