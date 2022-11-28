package com.serkan.crmv1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product_detail")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductDetail extends BaseEntity {
    @OneToOne(mappedBy = "productDetail")
    private Product product;
    private String name;
    private String description;
}
