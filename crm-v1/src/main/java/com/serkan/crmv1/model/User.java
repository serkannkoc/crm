package com.serkan.crmv1.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Set;


@Entity
@Table(name = "user")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
    @OneToOne(mappedBy = "user")
    private UserInformation userInformation;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "user_permission_id")
    private UserPermission userPermission;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private Set<Sale> sales;
}
