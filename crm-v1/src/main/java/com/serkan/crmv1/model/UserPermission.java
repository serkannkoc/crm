package com.serkan.crmv1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_permission")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class UserPermission extends BaseEntity{
    @OneToMany(mappedBy = "userPermission")
    private Set<User> users;
    @Enumerated(value = EnumType.STRING)
    private UserPermissionType type;
    @OneToMany(mappedBy = "userPermission")
    private Set<ProductUserPermission> productUserPermissions;
}
