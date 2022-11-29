package com.serkan.crmv1.repository;

import com.serkan.crmv1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
