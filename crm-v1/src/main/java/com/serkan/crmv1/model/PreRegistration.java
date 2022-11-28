package com.serkan.crmv1.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.time.LocalDateTime;

@Entity
@Table(name = "pre_registration")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PreRegistration extends BaseEntity {
    private String email;
    private String ip;
    private String hash;
    private LocalDateTime endDate;
}
