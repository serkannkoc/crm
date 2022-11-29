package com.serkan.crmv1.repository;

import com.serkan.crmv1.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale,String> {
}
