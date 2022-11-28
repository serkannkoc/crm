package com.serkan.crmv1.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.w3c.dom.stylesheets.LinkStyle;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "product_category")
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ProductCategory extends BaseEntity {
    @OneToMany(mappedBy = "productCategory")
    private Set<Product> products;
    private String name;
}
