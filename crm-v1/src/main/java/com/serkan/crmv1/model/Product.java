package com.serkan.crmv1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Product extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "product_category_id")
    private ProductCategory productCategory;

    @OneToOne
    @JoinColumn(name = "product_detail_id")
    private ProductDetail productDetail;

    @OneToMany(mappedBy = "product")
    private Set<Sale> sales;

    @OneToMany(mappedBy = "product")
    private Set<ProductUserPermission> productUserPermissions;
}
